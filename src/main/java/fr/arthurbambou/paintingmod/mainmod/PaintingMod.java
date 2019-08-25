package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.coloredblocks.*;
import fr.arthurbambou.paintingmod.mainmod.registery.*;
import fr.arthurbambou.paintingmod.mainmod.utils.ConfigHandler;
import fr.arthurbambou.paintingmod.mainmod.utils.config.Config;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks.COLORED_BLOCKS;

public class PaintingMod implements ModInitializer {
	public static final String MODID = "paintingmod";

	public static final ItemGroup MOD_ITEMS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_items"), () -> new ItemStack(ModItems.NORMAL_PAINTBRUSH));
	public static final ItemGroup MOD_BLOCKS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_blocks"), () -> new ItemStack(ModBlocks.SOGGY_CLAY));
	public static final ItemGroup MOD_STAIRS = null; //FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_stairs"), () -> new ItemStack(ModBlocks.OAK_PLANKS_STAIRS.cyan));
	public static final ItemGroup MOD_SLABS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_slabs"), () -> new ItemStack(ModBlocks.OAK_PLANK_SLAB.cyan));
	public static final ItemGroup MOD_WALLS = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_walls"), () -> new ItemStack(ModBlocks.COBBLESTONE_WALL.cyan));
	public static final ItemGroup MOD_FENCE_GATES = null;// FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_fence_gates"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE_GATE.cyan));
  	public static final ItemGroup MOD_FENCE = null;//FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_fence"), () -> new ItemStack(ModBlocks.OAK_PLANK_FENCE.cyan));
	public static final ItemGroup MOD_PRESSURE_PLATES = FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_pressure_plates"), () -> new ItemStack(ModBlocks.OAK_PLANK_PRESSURE_PLATE.cyan));
	public static final ItemGroup MOD_BUTTONS = null;// FabricItemGroupBuilder.build(new Identifier("paintingmod:mod_buttons"), () -> new ItemStack(ModBlocks.OAK_PLANK_BUTTON.cyan));

	public static Config config;

	@Override
	public void onInitialize() {
		config = ConfigHandler.init();
		registerColoredObjectTypeIds();
		ColoredPackRegistry.init();
		ModBlocks.init();
		ModItems.init();
		ModVillagers.init();
		ModColoredFunctions.init();
        PaintingModRegistry.finishRegister();
		Artifice.registerData(new Identifier(MODID, "datapack"), serverResourcePackBuilder -> {
			serverResourcePackBuilder.addBlockTag(new Identifier("fences"), tagBuilder -> {
				tagBuilder.replace(false);
				for (ColoredObject coloredObject : COLORED_BLOCKS) {
					if (coloredObject instanceof ColoredFence) {
						for (Block block : coloredObject.getArrayList()) {
							tagBuilder.value(Registry.BLOCK.getId(block));
						}
					}
				}
			});
			serverResourcePackBuilder.addBlockTag(new Identifier("walls"), tagBuilder -> {
				tagBuilder.replace(false);
				for (ColoredObject coloredObject : COLORED_BLOCKS) {
					if (coloredObject instanceof ColoredWall) {
						for (Block block : coloredObject.getArrayList()) {
							tagBuilder.value(Registry.BLOCK.getId(block));
						}
					}
				}
			});
		});
	}

	private void registerColoredObjectTypeIds() {
		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "block"), ColoredBlock.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "fence"), ColoredFence.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "fence_gate"), ColoredFenceGate.class);
		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "pressure_plate"), ColoredPressurePlate.class);
		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "slab"), ColoredSlab.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "stairs"), ColoredStairs.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "stone_button"), ColoredStoneButton.class);
		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "wall"), ColoredWall.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "weighted_pressure_plate"), ColoredWeightedPressurePlate.class);
//		PaintingModRegistry.registerColoredObjectType(new Identifier(MODID, "wood_button"), ColoredWoodButton.class);
	}
}
