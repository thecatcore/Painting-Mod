package arthurbambou.paintingmod.compat;

import arthurbambou.paintingmod.compat.config.ConfigCompat;
import arthurbambou.paintingmod.compat.fabricblocks.ModBlocks;
import arthurbambou.paintingmod.mainmod.PaintingMod;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaintingModCompat {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod/Compat");

    public static void init() {
        if (FabricLoader.getInstance().isModLoaded("fabriblocks") && PaintingMod.config.fabriBlocksCompat) {
            LOGGER.info("[PaintingMod/Compat] FabriBlocks detected, loading compat");
//            ModBlocks.init();
        }

        if (FabricLoader.getInstance().isModLoaded("cloth") && FabricLoader.getInstance().isModLoaded("modmenu")) {
            ConfigCompat.init();
        }
    }
}
