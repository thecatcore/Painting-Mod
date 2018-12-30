package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.SoggyClay;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.fabricmc.fabric.tags.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<ColoredBlock> COLORED_BLOCKS = new ArrayList<ColoredBlock>();

    public static Block SOGGY_CLAY;

    public static ColoredBlock STONE;
    public static ColoredBlock GRANITE;
    public static ColoredBlock POLISHED_GRANITE;
    public static ColoredBlock DIORITE;
    public static ColoredBlock POLISHED_DIORITE;
    public static ColoredBlock ANDESITE;
    public static ColoredBlock POLISHED_ANDESITE;
    public static ColoredBlock DIRT;
    public static ColoredBlock COARSE_DIRT;
    public static ColoredBlock COBBLESTONE;
    public static ColoredBlock PLANK;
    public static ColoredBlock SAND;
    public static ColoredBlock GRAVEL;
    public static ColoredBlock SPONGE;
    public static ColoredBlock WET_SPONGE;
    public static ColoredBlock LAPIS_LAZULI_BLOCK;
    public static ColoredBlock SANDSTONE;
    public static ColoredBlock GOLD_BLOCK;
    public static ColoredBlock IRON_BLOCK;
    public static ColoredBlock BRICK;
    public static ColoredBlock MOSS_STONE;
    public static ColoredBlock OBSIDIAN;
    public static ColoredBlock DIAMOND_BLOCK;
    public static ColoredBlock ICE;
    public static ColoredBlock SNOW_BLOCK;
    public static ColoredBlock CLAY_BLOCK;
    public static ColoredBlock NETHERRACK;
    public static ColoredBlock SOUL_SAND;
    public static ColoredBlock GLOWSTONE;
    public static ColoredBlock STONE_BRICK;
    public static ColoredBlock CRACKED_STONE_BRICK;
    public static ColoredBlock MOSSY_STONE_BRICK;
    public static ColoredBlock CHISELED_STONE_BRICK;
    public static ColoredBlock NETHER_BRICK;
    public static ColoredBlock END_STONE;
    public static ColoredBlock EMERALD_BLOCK;
    public static ColoredBlock QUARTZ_BLOCK;
    public static ColoredBlock PRISMARINE;
    public static ColoredBlock PRISMARINE_BRICK;
    public static ColoredBlock DARK_PRISMARINE;
    public static ColoredBlock SEA_LANTERN;
    public static ColoredBlock COAL_BLOCK;
    public static ColoredBlock PACKET_ICE;
    public static ColoredBlock PURPUR_BLOCK;
    public static ColoredBlock END_STONE_BRICK;
    public static ColoredBlock MAGMA_BLOCK;
    public static ColoredBlock NETHER_WART_BLOCK;
    public static ColoredBlock SPRUCE_LEAVES;
    public static ColoredBlock JUNGLE_LEAVES;
    public static ColoredBlock SLIME_BLOCK;

    public static void init() {
        SOGGY_CLAY = new SoggyClay(FabricBlockSettings.of(Material.SAND).sounds(BlockSoundGroup.SAND).build(), "soggy_clay");

        STONE = new ColoredBlock("stone", Blocks.STONE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        GRANITE = new ColoredBlock("granite", Blocks.GRANITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        POLISHED_GRANITE = new ColoredBlock("polished_granite", Blocks.POLISHED_GRANITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        DIORITE = new ColoredBlock("diorite", Blocks.DIORITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        POLISHED_DIORITE = new ColoredBlock("polished_diorite", Blocks.POLISHED_DIORITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        ANDESITE = new ColoredBlock("andesite", Blocks.ANDESITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        POLISHED_ANDESITE = new ColoredBlock("polished_andesite", Blocks.POLISHED_ANDESITE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        DIRT = new ColoredBlock("dirt", Blocks.DIRT).setMaterial(Material.EARTH).setBlockSoundGroup(BlockSoundGroup.GRAVEL).setHardness(0.5F).setResistance(2.5F);
//        public static final ColoredBlock DIRT = new BaseMeta("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 0);
//        public static final ColoredBlock COARSE_DIRT = new BaseMeta("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0, Blocks.DIRT, true, 1);
//        public static final ColoredBlock COBBLESTONE = new Base("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.COBBLESTONE, false);
//        public static final ColoredBlock PLANK = new Base("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0, Blocks.PLANKS, false);
//        public static final ColoredBlock SAND = new Base("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0, Blocks.SAND, false);
//        public static final ColoredBlock GRAVEL = new Gravel("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0, Blocks.GRAVEL, false);
//        public static final ColoredBlock SPONGE = new BaseMeta("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 0);
//        public static final ColoredBlock WET_SPONGE = new BaseMeta("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0, Blocks.SPONGE, true, 1);
//        public static final ColoredBlock LAPIS_LAZULI_BLOCK = new Base("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2, Blocks.LAPIS_BLOCK, false);
//        // public static final ColoredBlock SANDSTONE = new ColoredBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.SANDSTONE, true, 0);
//        public static final ColoredBlock GOLD_BLOCK = new Base("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3, Blocks.GOLD_BLOCK, false);
//        public static final ColoredBlock IRON_BLOCK = new Base("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2, Blocks.IRON_BLOCK, false);
//        public static final ColoredBlock BRICK = new Base("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.BRICK_BLOCK, false);
//        public static final ColoredBlock MOSS_STONE = new Base("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1, Blocks.MOSSY_COBBLESTONE, false);
//        public static final ColoredBlock OBSIDIAN = new Base("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 3, Blocks.OBSIDIAN, false);
//        public static final ColoredBlock DIAMOND_BLOCK = new Base("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3, Blocks.DIAMOND_BLOCK, false);
//        public static final ColoredBlock ICE = new Base("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0, Blocks.ICE, false);
//        public static final ColoredBlock SNOW_BLOCK = new Base("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1, Blocks.SNOW, false);
//        public static final ColoredBlock CLAY_BLOCK = new Base("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 3.0F, "shovel", 0, Blocks.CLAY, false);
//        public static final ColoredBlock NETHERRACK = new Base("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1, Blocks.NETHERRACK, false);
//        public static final ColoredBlock SOUL_SAND = new SoulSand("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0, Blocks.SOUL_SAND, false);
//        public static final ColoredBlock GLOWSTONE = new Base("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0, Blocks.GLOWSTONE, false);
//        public static final ColoredBlock STONE_BRICK = new BaseMeta("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 0);
//        public static final ColoredBlock CRACKED_STONE_BRICK = new BaseMeta("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 2);
//        public static final ColoredBlock MOSSY_STONE_BRICK = new BaseMeta("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 1);
//        public static final ColoredBlock CHISELED_STONE_BRICK = new BaseMeta("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.STONEBRICK, true, 3);
//        public static final ColoredBlock NETHER_BRICK = new Base("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1, Blocks.NETHER_BRICK, false);
//        public static final ColoredBlock END_STONE = new Base("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1, Blocks.END_STONE, false);
//        public static final ColoredBlock EMERALD_BLOCK = new Base("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3, Blocks.EMERALD_BLOCK, false);
////	public static final ColoredBlock QUARTZ_BLOCK= new BaseMeta("quartz_block", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.QUARTZ_BLOCK, true, 0);
//        public static final ColoredBlock PRISMARINE= new BaseMeta("prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 0);
//        public static final ColoredBlock PRISMARINE_BRICK= new BaseMeta("prismarine_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 1);
//        public static final ColoredBlock DARK_PRISMARINE= new BaseMeta("dark_prismarine", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PRISMARINE, true, 2);
//        public static final ColoredBlock SEA_LANTERN = new Base("sea_lantern", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "null", 0, Blocks.SEA_LANTERN, false);
//        public static final ColoredBlock COAL_BLOCK = new Base("coal_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 1, Blocks.COAL_BLOCK, false);
//        public static final ColoredBlock PACKET_ICE = new Base("packet_ice", Material.GLASS, SoundType.GLASS, 0.5F, 2.5F, "pickaxe", 1, Blocks.FROSTED_ICE, false);
//        public static final ColoredBlock PURPUR_BLOCK = new BaseMeta("purpur_block", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1, Blocks.PURPUR_BLOCK, true, 0);
//        public static final ColoredBlock END_STONE_BRICK = new Base("end_stone_brick", Material.ROCK, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1, Blocks.END_BRICKS, false);
//        public static final ColoredBlock MAGMA_BLOCK = new Base("magma_block", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "pickaxe", 1, Blocks.MAGMA, false);
//        public static final ColoredBlock NETHER_WART_BLOCK = new Base("nether_wart_block", Material.GLASS, SoundType.GLASS, 1.0F, 5.0F, "null", 0, Blocks.NETHER_WART_BLOCK, false);
//        public static final ColoredBlock SPRUCE_LEAVES = new BaseMeta("spruce_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 1);
//        public static final ColoredBlock JUNGLE_LEAVES = new BaseMeta("jungle_leaves", Material.LEAVES, SoundType.PLANT, 0.2F, 1.0F, "shears", 0, Blocks.LEAVES, true, 3);
//        public static final ColoredBlock SLIME_BLOCK = new SlimeBlock("slime_block", Material.SPONGE, SoundType.SLIME, 0.0F, 0.0F, "null", 0, Blocks.SLIME_BLOCK, false);

        for (ColoredBlock coloredBlock : COLORED_BLOCKS) {
            coloredBlock.createBlocks();
        }
    }
}
