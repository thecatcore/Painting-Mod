package arthurbambou.paintingmod.mainmod;

import arthurbambou.paintingmod.compat.PaintingModCompat;
import arthurbambou.paintingmod.mainmod.api.Registry;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import arthurbambou.paintingmod.mainmod.registery.ModVillagers;
import arthurbambou.paintingmod.mainmod.utils.ConfigHandler;
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
	public static final ItemGroup MOD_WALLS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_walls"), () -> new ItemStack(ModBlocks.END_STONE_BRICK_WALL.cyan));
	public static final ItemGroup MOD_FENCE_GATES = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_fence_gates"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE_GATE.cyan));
    public static final ItemGroup MOD_FENCE = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_fence"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE.cyan));
	public static final ItemGroup MOD_PRESSURE_PLATES = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_pressure_plates"), () -> new ItemStack(ModBlocks.OAK_PLANK_PRESSURE_PLATE.cyan));
	public static final ItemGroup MOD_BUTTONS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_buttons"), () -> new ItemStack(ModBlocks.OAK_PLANK_BUTTON.cyan));

	public static final ItemGroup ADDON_BLOCKS = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_blocks"), () -> new ItemStack(ModBlocks.STONE.red));
	public static final ItemGroup ADDON_STAIRS = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_stairs"), () -> new ItemStack(ModBlocks.PURPUR_STAIRS.red));
	public static final ItemGroup ADDON_SLABS = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_slabs"), () -> new ItemStack(ModBlocks.STONE_BRICK_SLAB.red));
	public static final ItemGroup ADDON_WALLS = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_walls"), () -> new ItemStack(ModBlocks.END_STONE_BRICK_WALL.red));
	public static final ItemGroup ADDON_FENCE_GATES = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_fence_gates"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE_GATE.red));
    public static final ItemGroup ADDON_FENCE = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_fence"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE.red));
    public static final ItemGroup ADDON_PRESSURE_PLATES = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_pressure_plates"), () -> new ItemStack(ModBlocks.OAK_PLANK_PRESSURE_PLATE.red));
	public static final ItemGroup ADDON_BUTTONS = FabricItemGroupBuilder.build(new Identifier("paintingmod:addon_buttons"), () -> new ItemStack(ModBlocks.OAK_PLANK_BUTTON.red));

	public static ConfigHandler.InstanceConfig config;

	@Override
	public void onInitialize() {
		config = ConfigHandler.init();
		ModBlocks.init();
		ModItems.init();
		ModVillagers.init();
		PaintingModCompat.init();
        Registry.finishRegister();
	}
}
