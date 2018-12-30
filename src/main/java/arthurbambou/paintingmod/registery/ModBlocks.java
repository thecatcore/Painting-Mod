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
        for (ColoredBlock coloredBlock : COLORED_BLOCKS) {
            coloredBlock.createBlocks();
        }
    }
}
