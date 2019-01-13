package arthurbambou.paintingmod;

import arthurbambou.paintingmod.registery.ModBlocks;
import arthurbambou.paintingmod.registery.ModItems;
import arthurbambou.paintingmod.registery.ModVillagers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PaintingMod implements ModInitializer {
	public static final String MODID = "paintingmod";

	public static final ItemGroup MOD_BLOCKS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_blocks"), () -> new ItemStack(ModBlocks.SOGGY_CLAY));
	public static final ItemGroup MOD_ITEMS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_items"), () -> new ItemStack(ModItems.NORMAL_PAINTBRUSH));
	public static final ItemGroup MOD_STAIRS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_stairs"), () -> new ItemStack(ModBlocks.PURPUR_STAIRS.cyan));
	public static final ItemGroup MOD_SLABS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_slabs"), () -> new ItemStack(ModBlocks.STONE_BRICK_SLAB.cyan));

	@Override
	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();
		ModVillagers.init();
	}
}
