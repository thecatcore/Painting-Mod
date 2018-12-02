package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.ColoredFallingBlockMeta;
import arthurbambou.paintingmod.blocks.*;
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
	public static final List<ColoredFallingBlockMeta> COLORED_FALLING_BLOCK_METAS = new ArrayList<ColoredFallingBlockMeta>();
	
	public static final Block SOGGY_CLAY = new PTMSoggyClay("soggy_clay", Material.IRON, PTMMain.PAINTING_MOD_BLOCKS);

	public static final ColoredBlockMeta STONE_META = new PTMColoredBlockMetaBase("stone", Material.ROCK,SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, 0);
	public static final ColoredBlockMeta GRANITE_META = new PTMColoredBlockMetaBase("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1,Blocks.STONE,  1);
	public static final ColoredBlockMeta POLISHED_GRANITE_META = new PTMColoredBlockMetaBase("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE,  2);
	public static final ColoredBlockMeta DIORITE_META = new PTMColoredBlockMetaBase("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE, 3);
	public static final ColoredBlockMeta POLISHED_DIORITE_META = new PTMColoredBlockMetaBase("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE,  4);
	public static final ColoredBlockMeta ANDESITE_META = new PTMColoredBlockMetaBase("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE,  5);
	public static final ColoredBlockMeta POLISHED_ANDESITE_META = new PTMColoredBlockMetaBase("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONE,  6);
	public static final ColoredBlockMeta DIRT_META = new PTMColoredBlockMetaBase("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT,  0);
	public static final ColoredBlockMeta COARSE_DIRT_META = new PTMColoredBlockMetaBase("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT,  1);
	public static final ColoredBlockMeta COBBLESTONE_META = new PTMColoredBlockMetaBase("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.COBBLESTONE);
	public static final ColoredBlockMeta PLANK_META = new PTMColoredBlockMetaBase("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0, Blocks.PLANKS);
	public static final ColoredFallingBlockMeta SAND_META = new PTMColoredFallingBlockMeta("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0, Blocks.SAND);
	public static final ColoredFallingBlockMeta GRAVEL_META = new PTMColoredFallingBlockMeta("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0, Blocks.GRAVEL);
	public static final ColoredBlockMeta SPONGE_META = new PTMColoredBlockMetaBase("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE,  0);
	public static final ColoredBlockMeta WET_SPONGE_META = new PTMColoredBlockMetaBase("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE,  1);
	public static final ColoredBlockMeta LAPIS_LAZULI_BLOCK_META = new PTMColoredBlockMetaBase("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2, Blocks.LAPIS_BLOCK);
	// public static final ColoredBlock SANDSTONE_META = new PTMColoredBlockMetaBase("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.SANDSTONE, 0);
	public static final ColoredBlockMeta GOLD_BLOCK_META = new PTMColoredBlockMetaBase("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3, Blocks.GOLD_BLOCK);
	public static final ColoredBlockMeta IRON_BLOCK_META = new PTMColoredBlockMetaBase("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2, Blocks.IRON_BLOCK);
	public static final ColoredBlockMeta BRICK_META = new PTMColoredBlockMetaBase("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.BRICK_BLOCK);
	public static final ColoredBlockMeta MOSS_STONE_META = new PTMColoredBlockMetaBase("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.MOSSY_COBBLESTONE);
	public static final ColoredBlockMeta OBSIDIAN_META = new PTMColoredBlockMetaBase("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 3, Blocks.OBSIDIAN);
	public static final ColoredBlockMeta DIAMOND_BLOCK_META = new PTMColoredBlockMetaBase("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3, Blocks.DIAMOND_BLOCK);
	public static final ColoredBlockMeta ICE_META = new PTMColoredBlockMetaBase("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0, Blocks.ICE);
	public static final ColoredBlockMeta SNOW_BLOCK_META = new PTMColoredBlockMetaBase("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1, Blocks.SNOW);
	public static final ColoredBlockMeta CLAY_BLOCK_META = new PTMColoredBlockMetaBase("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 3.0F, "shovel", 0, Blocks.CLAY);
	public static final ColoredBlockMeta NETHERRACK_META = new PTMColoredBlockMetaBase("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1, Blocks.NETHERRACK);
	public static final ColoredBlockMeta SOUL_SAND_META = new PTMColoredBlockMetaSoulSand("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0, Blocks.SOUL_SAND);
	public static final ColoredBlockMeta GLOWSTONE_META = new PTMColoredBlockMetaBase("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0, Blocks.GLOWSTONE);
	public static final ColoredBlockMeta STONE_BRICK_META = new PTMColoredBlockMetaBase("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK,  0);
	public static final ColoredBlockMeta CRACKED_STONE_BRICK_META = new PTMColoredBlockMetaBase("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK,  2);
	public static final ColoredBlockMeta MOSSY_STONE_BRICK_META = new PTMColoredBlockMetaBase("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK,  1);
	public static final ColoredBlockMeta CHISELED_STONE_BRICK_META = new PTMColoredBlockMetaBase("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK,  3);
	public static final ColoredBlockMeta NETHER_BRICK_META = new PTMColoredBlockMetaBase("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.NETHER_BRICK);
	public static final ColoredBlockMeta END_STONE_META = new PTMColoredBlockMetaBase("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1, Blocks.END_STONE);
	public static final ColoredBlockMeta EMERALD_BLOCK_META = new PTMColoredBlockMetaBase("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3, Blocks.EMERALD_BLOCK);
	//	public static final ColoredBlockMeta QUARTZ_BLOCK_META = new PTMColoredBlockMetaBase("quartz_block", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.QUARTZ_BLOCK, true, 0);
	public static final ColoredBlockMeta PRISMARINE_META = new PTMColoredBlockMetaBase("prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE,  0);
	public static final ColoredBlockMeta PRISMARINE_BRICK_META = new PTMColoredBlockMetaBase("prismarine_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, 1);
	public static final ColoredBlockMeta DARK_PRISMARINE_META = new PTMColoredBlockMetaBase("dark_prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE,  2);
	public static final ColoredBlockMeta SEA_LANTERN_META = new PTMColoredBlockMetaBase("sea_lantern", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "null", 0, Blocks.SEA_LANTERN);
	public static final ColoredBlockMeta COAL_BLOCK_META = new PTMColoredBlockMetaBase("coal_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 1, Blocks.COAL_BLOCK);
	public static final ColoredBlockMeta PACKET_ICE_META = new PTMColoredBlockMetaBase("packet_ice", Material.GLASS, SoundType.GLASS, 0.5F, 2.5F, "pickaxe", 1, Blocks.FROSTED_ICE);
	public static final ColoredBlockMeta PURPUR_BLOCK_META = new PTMColoredBlockMetaBase("purpur_block", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PURPUR_BLOCK,  0);
	public static final ColoredBlockMeta END_STONE_BRICK_META = new PTMColoredBlockMetaBase("end_stone_brick", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.END_BRICKS);
	public static final ColoredBlockMeta MAGMA_BLOCK_META = new PTMColoredBlockMetaBase("magma_block", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "pickaxe", 1, Blocks.MAGMA);
	public static final ColoredBlockMeta NETHER_WART_BLOCK_META = new PTMColoredBlockMetaBase("nether_wart_block", Material.GLASS, SoundType.GLASS, 1.0F, 5.0F, "null", 0, Blocks.NETHER_WART_BLOCK);
	public static final ColoredBlockMeta SPRUCE_LEAVES_META = new PTMColoredBlockMetaBase("spruce_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES,  1);
	public static final ColoredBlockMeta JUNGLE_LEAVES_META = new PTMColoredBlockMetaBase("jungle_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES,  3);
	public static final ColoredBlockMetaSlime SLIME_BLOCK_META = new PTMColoredBlockMetaSlime("slime_block", Material.SPONGE, SoundType.SLIME, 0.0F, 0.0F, "null", 0, Blocks.SLIME_BLOCK);



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
	public static final ColoredBlock SAND = new Sand("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0, Blocks.SAND, false);
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
