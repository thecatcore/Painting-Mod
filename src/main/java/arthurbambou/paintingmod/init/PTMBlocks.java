package arthurbambou.paintingmod.init;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.blocks.PTMColoredBlockMetaBase;
import arthurbambou.paintingmod.blocks.PTMSoggyClay;
import arthurbambou.paintingmod.coloredblocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class PTMBlocks {
	
	public static final List<Block> BLOCKS_ID = new ArrayList<Block>();
	public static final List<ColoredBlock> COLORED_BLOCKS = new ArrayList<ColoredBlock>();
	public static final List<Block> BLOCKS_META = new ArrayList<Block>();
	public static final List<ColoredBlockMeta> COLORED_BLOCKS_META = new ArrayList<ColoredBlockMeta>();
	
	public static final Block SOGGY_CLAY = new PTMSoggyClay("soggy_clay", Material.IRON, PTMMain.PAINTING_MOD);

	public static final ColoredBlockMeta STONE_META = new PTMColoredBlockMetaBase("stone", Material.ROCK,SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, 0);
	public static final ColoredBlock STONE = new BaseMeta("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 0);
	public static final ColoredBlock GRANITE = new BaseMeta("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1,Blocks.STONE, true, 1);
	public static final ColoredBlock POLISHED_GRANITE = new BaseMeta("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 2);
	public static final ColoredBlock DIORITE = new BaseMeta("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 3);
	public static final ColoredBlock POLISHED_DIORITE = new BaseMeta("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 4);
	public static final ColoredBlock ANDESITE = new BaseMeta("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 5);
	public static final ColoredBlock POLISHED_ANDESITE = new BaseMeta("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, true, 6);
	public static final ColoredBlock DIRT = new BaseMeta("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 0);
	public static final ColoredBlock COARSE_DIRT = new BaseMeta("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 1);
	public static final ColoredBlock COBBLESTONE = new Base("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.COBBLESTONE, false);
	public static final ColoredBlock PLANK = new Base("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0, Blocks.PLANKS, false);
	public static final ColoredBlock SAND = new Base("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0, Blocks.SAND, false);
	public static final ColoredBlock GRAVEL = new Gravel("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0, Blocks.GRAVEL, false);
	public static final ColoredBlock SPONGE = new BaseMeta("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 0);
	public static final ColoredBlock WET_SPONGE = new BaseMeta("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 1);
	public static final ColoredBlock LAPIS_LAZULI_BLOCK = new Base("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2, Blocks.LAPIS_BLOCK, false);
	// public static final ColoredBlock SANDSTONE = new ColoredBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.SANDSTONE, true, 0);
	public static final ColoredBlock GOLD_BLOCK = new Base("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3, Blocks.GOLD_BLOCK, false);
	public static final ColoredBlock IRON_BLOCK = new Base("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2, Blocks.IRON_BLOCK, false);
	public static final ColoredBlock BRICK = new Base("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.BRICK_BLOCK, false);
	public static final ColoredBlock MOSS_STONE = new Base("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.MOSSY_COBBLESTONE, false);
	public static final ColoredBlock OBSIDIAN = new Base("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 3, Blocks.OBSIDIAN, false);
	public static final ColoredBlock DIAMOND_BLOCK = new Base("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3, Blocks.DIAMOND_BLOCK, false);
	public static final ColoredBlock ICE = new Base("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0, Blocks.ICE, false);
	public static final ColoredBlock SNOW_BLOCK = new Base("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1, Blocks.SNOW, false);
	public static final ColoredBlock CLAY_BLOCK = new Base("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 3.0F, "shovel", 0, Blocks.CLAY, false);
	public static final ColoredBlock NETHERRACK = new Base("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1, Blocks.NETHERRACK, false);
	public static final ColoredBlock SOUL_SAND = new SoulSand("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0, Blocks.SOUL_SAND, false);
	public static final ColoredBlock GLOWSTONE = new Base("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0, Blocks.GLOWSTONE, false);
	public static final ColoredBlock STONE_BRICK = new BaseMeta("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 0);
	public static final ColoredBlock CRACKED_STONE_BRICK = new BaseMeta("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 2);
	public static final ColoredBlock MOSSY_STONE_BRICK = new BaseMeta("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 1);
	public static final ColoredBlock CHISELED_STONE_BRICK = new BaseMeta("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 3);
	public static final ColoredBlock NETHER_BRICK = new Base("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.NETHER_BRICK, false);
	public static final ColoredBlock END_STONE = new Base("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1, Blocks.END_STONE, false);
	public static final ColoredBlock EMERALD_BLOCK = new Base("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3, Blocks.EMERALD_BLOCK, false);
//	public static final ColoredBlock QUARTZ_BLOCK= new BaseMeta("quartz_block", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.QUARTZ_BLOCK, true, 0);
	public static final ColoredBlock PRISMARINE= new BaseMeta("prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 0);
	public static final ColoredBlock PRISMARINE_BRICK= new BaseMeta("prismarine_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 1);
	public static final ColoredBlock DARK_PRISMARINE= new BaseMeta("dark_prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 2);
	public static final ColoredBlock SEA_LANTERN = new Base("sea_lantern", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "null", 0, Blocks.SEA_LANTERN, false);
	public static final ColoredBlock COAL_BLOCK = new Base("coal_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 1, Blocks.COAL_BLOCK, false);
	public static final ColoredBlock PACKET_ICE = new Base("packet_ice", Material.GLASS, SoundType.GLASS, 0.5F, 2.5F, "pickaxe", 1, Blocks.FROSTED_ICE, false);
	public static final ColoredBlock PURPUR_BLOCK = new BaseMeta("purpur_block", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PURPUR_BLOCK, true, 0);
	public static final ColoredBlock END_STONE_BRICK = new Base("end_stone_brick", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.END_BRICKS, false);
	public static final ColoredBlock MAGMA_BLOCK = new Base("magma_block", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "pickaxe", 1, Blocks.MAGMA, false);
	public static final ColoredBlock NETHER_WART_BLOCK = new Base("nether_wart_block", Material.GLASS, SoundType.GLASS, 1.0F, 5.0F, "null", 0, Blocks.NETHER_WART_BLOCK, false);
	public static final ColoredBlock SPRUCE_LEAVES = new BaseMeta("spruce_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 1);
	public static final ColoredBlock JUNGLE_LEAVES = new BaseMeta("jungle_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 3);
	public static final ColoredBlock SLIME_BLOCK = new SlimeBlock("slime_block", Material.SPONGE, SoundType.SLIME, 0.0F, 0.0F, "null", 0, Blocks.SLIME_BLOCK, false);

//	//Chiseled Sandstone
//	public static final Block BLACK_CHISELED_SANDSTONE= new PTMBlackBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_CHISELED_SANDSTONE= new PTMRedBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_CHISELED_SANDSTONE= new PTMGreenBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_CHISELED_SANDSTONE= new PTMBrownBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_CHISELED_SANDSTONE= new PTMBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_CHISELED_SANDSTONE= new PTMPurpleBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_CHISELED_SANDSTONE= new PTMCyanBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_CHISELED_SANDSTONE= new PTMLightGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_CHISELED_SANDSTONE= new PTMGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_CHISELED_SANDSTONE= new PTMPinkBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_CHISELED_SANDSTONE= new PTMLimeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_CHISELED_SANDSTONE= new PTMYellowBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_CHISELED_SANDSTONE= new PTMLightBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_CHISELED_SANDSTONE= new PTMMagentaBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_CHISELED_SANDSTONE= new PTMOrangeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_CHISELED_SANDSTONE= new PTMWhiteBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//
//	//Smooth Sandstone
//	public static final Block BLACK_SMOOTH_SANDSTONE= new PTMBlackBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_SMOOTH_SANDSTONE= new PTMRedBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_SMOOTH_SANDSTONE= new PTMGreenBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_SMOOTH_SANDSTONE= new PTMBrownBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_SMOOTH_SANDSTONE= new PTMBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_SMOOTH_SANDSTONE= new PTMPurpleBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_SMOOTH_SANDSTONE= new PTMCyanBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE= new PTMLightGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_SMOOTH_SANDSTONE= new PTMGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_SMOOTH_SANDSTONE= new PTMPinkBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_SMOOTH_SANDSTONE= new PTMLimeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_SMOOTH_SANDSTONE= new PTMYellowBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE= new PTMLightBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_SMOOTH_SANDSTONE= new PTMMagentaBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_SMOOTH_SANDSTONE= new PTMOrangeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_SMOOTH_SANDSTONE= new PTMWhiteBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);


}
