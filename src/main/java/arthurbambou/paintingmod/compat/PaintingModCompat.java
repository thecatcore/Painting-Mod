package arthurbambou.paintingmod.compat;

import arthurbambou.paintingmod.compat.fabricblocks.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.loader.Loader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PaintingModCompat implements ModInitializer {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod/Compat");
    @Override
    public void onInitialize() {
        if (Loader.getInstance().isModLoaded("fabriblocks")) {
            LOGGER.info("FabriBlocks detected, loading compat");
            ModBlocks.init();
        }
    }
}
