package fr.arthurbambou.paintingmod.mainmod.utils.config;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.utils.ConfigHandler;

// import io.github.prospector.modmenu.api.ModMenuApi;

// import me.shedaniel.clothconfig2.api.ConfigBuilder;
// import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
// import me.shedaniel.clothconfig2.gui.entries.BooleanListEntry;
// import me.shedaniel.clothconfig2.gui.entries.IntegerListEntry;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resource.language.I18n;

import java.util.Optional;
import java.util.function.Supplier;

public class ConfigScreen {

    // public static Screen openScreen(Screen parent) {
    //     ConfigBuilder builder = ConfigBuilder.create().setParentScreen(parent).setTitle(I18n.translate("text.paintingmod.config.title"));
    //     builder.getOrCreateCategory(I18n.translate("text.paintingmod.config.general"))
    //             .addEntry(new IntegerListEntry("text.paintingmod.config.general.heatgundurability", PaintingMod.config.general.heatGunDurability,
    //                     "text.cloth.reset_value", () -> 100, integer -> PaintingMod.config.general.heatGunDurability = integer))
    //             .addEntry(new IntegerListEntry("text.paintingmod.config.general.soggyclaydropnumber", PaintingMod.config.general.soggyClayDropNumber,
    //             "text.cloth.reset_value", () -> 4, integer -> PaintingMod.config.general.soggyClayDropNumber = integer));
    //     builder.getOrCreateCategory(I18n.translate("text.paintingmod.config.compat"))
    //             .addEntry(new BooleanListEntry("text.paintingmod.config.compat.fabriblocks",
    //                     PaintingMod.config.compat.fabriBlocksCompat, "text.cloth.reset_value", () -> false ,
    //                     bool -> PaintingMod.config.compat.fabriBlocksCompat = bool));

    //     builder.setSavingRunnable(() -> {
    //         ConfigHandler.saveConfig();
    //     });
    //     return builder.build();
    // }



    // @Override
    // public String getModId() {
    //     return PaintingMod.MODID;
    // }

    // @Override
    // public Optional<Supplier<Screen>> getConfigScreen(Screen screen) {
    //     return Optional.of(() -> {
    //         return this.openScreen(screen);
    //     });
    // }
}
