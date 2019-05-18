package fr.arthurbambou.paintingmod.mainmod.utils.config;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.utils.ConfigHandler;

import io.github.prospector.modmenu.api.ModMenuApi;

import me.shedaniel.cloth.gui.ClothConfigScreen;
import me.shedaniel.cloth.gui.entries.BooleanListEntry;
import me.shedaniel.cloth.gui.entries.IntegerListEntry;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resource.language.I18n;

import java.util.Optional;
import java.util.function.Supplier;

public class ConfigScreen implements ModMenuApi {

    public static Screen openScreen(Screen parent) {
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
        return builder.build();
    }

    @Override
    public String getModId() {
        return PaintingMod.MODID;
    }

    @Override
    public Optional<Supplier<Screen>> getConfigScreen(Screen screen) {
        return Optional.of(() -> {
            return this.openScreen(screen);
        });
    }
}
