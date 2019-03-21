package arthurbambou.paintingmod.compat.config;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.utils.ConfigHandler;
import me.shedaniel.cloth.gui.ClothConfigScreen;
import me.shedaniel.cloth.gui.entries.BooleanListEntry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Screen;
import net.minecraft.client.resource.language.I18n;

import java.lang.reflect.Method;

public class ConfigCompat {

    public static void init() {
        try {
            Class<?> clazz = Class.forName("io.github.prospector.modmenu.api.ModMenuApi");
            Method method = clazz.getMethod("addConfigOverride", String.class, Runnable.class);
            method.invoke(null, "paintingmod", (Runnable) () -> openScreen(MinecraftClient.getInstance().currentScreen));
        } catch (Exception e) {
            System.out.println("[PaintingMod] an error has occured when try to etablish compat with ModMenu : " + e);
        }
    }

    public static void openScreen(Screen parent) {
        ClothConfigScreen.Builder builder = new ClothConfigScreen.Builder(parent, I18n.translate("text.paintingmod.config.title"), null);
        builder.addCategory(I18n.translate("text.paintingmod.config.compat"))
                .addOption(new BooleanListEntry("text.paintingmod.config.fabriblock_compat",
                        PaintingMod.config.fabriBlocksCompat, bool -> PaintingMod.config.fabriBlocksCompat = bool));

        builder.setOnSave(savedConfig -> ConfigHandler.saveConfig());
        MinecraftClient.getInstance().openScreen(builder.build());
    }
}
