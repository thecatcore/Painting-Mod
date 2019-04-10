package fr.arthurbambou.paintingmod.mainmod.utils.config;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.utils.ConfigHandler;
import me.shedaniel.cloth.gui.ClothConfigScreen;
import me.shedaniel.cloth.gui.entries.BooleanListEntry;
import me.shedaniel.cloth.gui.entries.IntegerListEntry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Screen;
import net.minecraft.client.resource.language.I18n;

import java.lang.reflect.Method;

public class ConfigScreen {

    public static void init() {
        if (FabricLoader.getInstance().isModLoaded("modmenu")) {
            try {
                Class<?> clazz = Class.forName("io.github.prospector.modmenu.api.ModMenuApi");
                Method method = clazz.getMethod("addConfigOverride", String.class, Runnable.class);
                method.invoke(null, "paintingmod", (Runnable) () -> openScreen(MinecraftClient.getInstance().currentScreen));
            } catch (Exception e) {
                System.out.println("[PaintingMod] an error has occured when try to etablish compat with ModMenu : " + e);
            }
        }
    }

    public static void openScreen(Screen parent) {
        ClothConfigScreen.Builder builder = new ClothConfigScreen.Builder(parent, I18n.translate("text.paintingmod.config.title"), null);
        builder.addCategory(I18n.translate("text.paintingmod.config.general"))
                .addOption(new IntegerListEntry("text.paintingmod.config.general.heatgundurability", PaintingMod.config.general.heatGunDurability,
                        "text.cloth.reset_value", () -> 100, integer -> PaintingMod.config.general.heatGunDurability = integer))
                .addOption(new IntegerListEntry("text.paintingmod.config.general.soggyclaydropnumber", PaintingMod.config.general.soggyClayDropNumber,
                "text.cloth.reset_value", () -> 4, integer -> PaintingMod.config.general.soggyClayDropNumber = integer));
        builder.addCategory(I18n.translate("text.paintingmod.config.compat"))
                .addOption(new BooleanListEntry("text.paintingmod.config.compat.fabriblocks",
                        PaintingMod.config.compat.fabriBlocksCompat, "text.cloth.reset_value", () -> false ,
                        bool -> PaintingMod.config.compat.fabriBlocksCompat = bool));

        builder.setOnSave(savedConfig -> ConfigHandler.saveConfig());
        MinecraftClient.getInstance().openScreen(builder.build());
    }
}
