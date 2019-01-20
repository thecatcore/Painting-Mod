package arthurbambou.paintingmod.compat;

import arthurbambou.paintingmod.compat.fabricblocks.ModBlocks;
import arthurbambou.paintingmod.mainmod.PaintingMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.loader.Loader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaintingModCompat {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod/Compat");

    public static void init() {
        if (Loader.getInstance().isModLoaded("fabriblocks") && PaintingMod.config.fabriBlocksCompat) {
            LOGGER.info("[PaintingMod/Compat] FabriBlocks detected, loading compat");
            ModBlocks.init();
        }
    }
}
