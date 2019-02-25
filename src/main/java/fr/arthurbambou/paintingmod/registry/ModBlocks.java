package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.api.PRegistry;
import fr.arthurbambou.paintingmod.blocks.SoggyClay;
import fr.arthurbambou.paintingmod.coloredblocks.ColoredBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<ColoredObject> COLORED_OBJECTS = new ArrayList<>();

    public static Block soggy_clay;

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
    public static ColoredBlock OAK_PLANK;
    public static ColoredBlock SPRUCE_PLANK;
    public static ColoredBlock BIRCH_PLANK;
    public static ColoredBlock JUNGLE_PLANK;
    public static ColoredBlock ACACIA_PLANK;
    public static ColoredBlock DARK_OAK_PLANK;
    public static ColoredBlock SAND;
    public static ColoredBlock RED_SAND;
    public static ColoredBlock GRAVEL;
    public static ColoredBlock STRIPPED_OAK_WOOD;
    public static ColoredBlock STRIPPED_SPRUCE_WOOD;
    public static ColoredBlock STRIPPED_BIRCH_WOOD;
    public static ColoredBlock STRIPPED_JUNGLE_WOOD;
    public static ColoredBlock STRIPPED_ACACIA_WOOD;
    public static ColoredBlock STRIPPED_DARK_OAK_WOOD;
    public static ColoredBlock OAK_WOOD;
    public static ColoredBlock SPRUCE_WOOD;
    public static ColoredBlock BIRCH_WOOD;
    public static ColoredBlock JUNGLE_WOOD;
    public static ColoredBlock ACACIA_WOOD;
    public static ColoredBlock DARK_OAK_WOOD;
    public static ColoredBlock SPONGE;
    public static ColoredBlock WET_SPONGE;
    public static ColoredBlock LAPIS_LAZULI_BLOCK;
    public static ColoredBlock SANDSTONE;
    public static ColoredBlock RED_SANDSTONE;
    public static ColoredBlock GOLD_BLOCK;
    public static ColoredBlock IRON_BLOCK;
    public static ColoredBlock SMOOTH_QUARTZ;
    public static ColoredBlock SMOOTH_RED_SANDSTONE;
    public static ColoredBlock SMOOTH_SANDSTONE;
    public static ColoredBlock SMOOTH_STONE;
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
    public static ColoredBlock RED_NETHER_BRICK;
    public static ColoredBlock OAK_LEAVES;
    public static ColoredBlock SPRUCE_LEAVES;
    public static ColoredBlock BIRCH_LEAVES;
    public static ColoredBlock JUNGLE_LEAVES;
    public static ColoredBlock ACACIA_LEAVES;
    public static ColoredBlock DARK_OAK_LEAVES;
    public static ColoredBlock SLIME_BLOCK;
    public static ColoredBlock DEAD_TUBE_CORAL_BLOCK;
    public static ColoredBlock DEAD_BRAIN_CORAL_BLOCK;
    public static ColoredBlock DEAD_BUBBLE_CORAL_BLOCK;
    public static ColoredBlock DEAD_FIRE_CORAL_BLOCK;
    public static ColoredBlock DEAD_HORN_CORAL_BLOCK;

    public ModBlocks() {
        soggy_clay = new SoggyClay();

        STONE = new ColoredBlock(Blocks.STONE);
        GRANITE = new ColoredBlock(Blocks.GRANITE);
        POLISHED_GRANITE = new ColoredBlock(Blocks.POLISHED_GRANITE);
        DIORITE = new ColoredBlock(Blocks.DIORITE);
        POLISHED_DIORITE = new ColoredBlock(Blocks.POLISHED_DIORITE);

        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            coloredObject.createBlocks();
            PRegistry.register(coloredObject);
        }
    }

    public void onBlockRegister(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(soggy_clay);
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            event.getRegistry().registerAll(coloredObject.getBlockArray());
        }
    }

    public void onItemRegister(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(soggy_clay, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(soggy_clay.getRegistryName()));
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            for (Block block : coloredObject.getBlockArray()) {
                event.getRegistry().register(new ItemBlock(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
