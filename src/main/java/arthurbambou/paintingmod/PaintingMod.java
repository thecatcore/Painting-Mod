package arthurbambou.paintingmod;

import arthurbambou.paintingmod.registery.ModItems;
import arthurbambou.paintingmod.registery.ModTabs;
import net.fabricmc.api.ModInitializer;

public class PaintingMod implements ModInitializer {
	public static final String MODID = "paintingmod";

	@Override
	public void onInitialize() {
		ModItems.init();
		ModTabs.init();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

//		System.out.println("Hello Fabric world!");
	}
}
