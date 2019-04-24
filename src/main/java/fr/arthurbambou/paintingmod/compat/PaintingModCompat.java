package fr.arthurbambou.paintingmod.compat;

import fr.arthurbambou.paintingmod.compat.fabricblocks.ModBlocks;
import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaintingModCompat {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod/Compat");

    public static void init() {
        if (FabricLoader.getInstance().isModLoaded("fabriblocks") && PaintingMod.config.compat.fabriBlocksCompat) {
//            LOGGER.info("[PaintingMod/Compat] FabriBlocks detected, loading compat");
//            ModBlocks.init();
        }
    }
}
