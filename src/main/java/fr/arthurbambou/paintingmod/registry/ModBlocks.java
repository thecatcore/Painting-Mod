package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.api.ColoredObjectRegistry;
import fr.arthurbambou.paintingmod.blocks.SoggyClay;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import fr.arthurbambou.paintingmod.coloredblocks.ColoredBlock;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = PaintingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
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

//    1.14 Only
//    public static ColoredBlock STRIPPED_OAK_WOOD;
//    public static ColoredBlock STRIPPED_SPRUCE_WOOD;
//    public static ColoredBlock STRIPPED_BIRCH_WOOD;
//    public static ColoredBlock STRIPPED_JUNGLE_WOOD;
//    public static ColoredBlock STRIPPED_ACACIA_WOOD;
//    public static ColoredBlock STRIPPED_DARK_OAK_WOOD;
//    public static ColoredBlock OAK_WOOD;
//    public static ColoredBlock SPRUCE_WOOD;
//    public static ColoredBlock BIRCH_WOOD;
//    public static ColoredBlock JUNGLE_WOOD;
//    public static ColoredBlock ACACIA_WOOD;
//    public static ColoredBlock DARK_OAK_WOOD;

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

    public ModBlocks() {
        soggy_clay = new SoggyClay();

        STONE = new ColoredBlock(Blocks.STONE);
        GRANITE = new ColoredBlock(Blocks.GRANITE);
        POLISHED_GRANITE = new ColoredBlock(Blocks.POLISHED_GRANITE);
        DIORITE = new ColoredBlock(Blocks.DIORITE);
        POLISHED_DIORITE = new ColoredBlock(Blocks.POLISHED_DIORITE);
        ANDESITE = new ColoredBlock(Blocks.ANDESITE);
        POLISHED_ANDESITE = new ColoredBlock(Blocks.POLISHED_ANDESITE);
        DIRT = new ColoredBlock(Blocks.DIRT);
        COARSE_DIRT = new ColoredBlock(Blocks.COARSE_DIRT);
        COBBLESTONE = new ColoredBlock(Blocks.COBBLESTONE);
        OAK_PLANK = new ColoredBlock(Blocks.OAK_PLANKS,"oak_plank");
        SPRUCE_PLANK = new ColoredBlock(Blocks.SPRUCE_PLANKS,"spruce_plank");
        BIRCH_PLANK = new ColoredBlock(Blocks.BIRCH_PLANKS, "birch_plank");
        JUNGLE_PLANK = new ColoredBlock(Blocks.JUNGLE_PLANKS, "jungle_plank");
        ACACIA_PLANK = new ColoredBlock(Blocks.ACACIA_PLANKS,"acacia_plank");
        DARK_OAK_PLANK = new ColoredBlock(Blocks.DARK_OAK_PLANKS,"dark_oak_plank");
        SAND = new ColoredBlock(Blocks.SAND);
        RED_SAND = new ColoredBlock(Blocks.RED_SAND);
        GRAVEL = new ColoredBlock(Blocks.GRAVEL);

        SPONGE = new ColoredBlock(Blocks.SPONGE);
        WET_SPONGE = new ColoredBlock(Blocks.WET_SPONGE);
        LAPIS_LAZULI_BLOCK = new ColoredBlock(Blocks.LAPIS_BLOCK,"lapis_lazuli_block");
//        SANDSTONE = new ColoredBlock(Blocks.SANDSTONE);
//        RED_SANDSTONE = new ColoredBlock(Blocks.RED_SANDSTONE);
        GOLD_BLOCK = new ColoredBlock(Blocks.GOLD_BLOCK);
        IRON_BLOCK = new ColoredBlock(Blocks.IRON_BLOCK);
//        SMOOTH_QUARTZ = new ColoredBlock(Blocks.SMOOTH_QUARTZ);
//        SMOOTH_RED_SANDSTONE = new ColoredBlock(Blocks.SMOOTH_RED_SANDSTONE);
//        SMOOTH_SANDSTONE = new ColoredBlock(Blocks.SMOOTH_SANDSTONE);
//        SMOOTH_STONE = new ColoredBlock(Blocks.SMOOTH_STONE);
        BRICK = new ColoredBlock(Blocks.BRICKS,"brick");
        MOSS_STONE = new ColoredBlock(Blocks.MOSSY_COBBLESTONE,"moss_stone");
        OBSIDIAN = new ColoredBlock(Blocks.OBSIDIAN);
        DIAMOND_BLOCK = new ColoredBlock(Blocks.DIAMOND_BLOCK);
        ICE = new ColoredBlock(Blocks.ICE);
        SNOW_BLOCK = new ColoredBlock(Blocks.SNOW_BLOCK);
        CLAY_BLOCK = new ColoredBlock(Blocks.CLAY, "clay_block");
        NETHERRACK = new ColoredBlock(Blocks.NETHERRACK);
        SOUL_SAND = new ColoredBlock(Blocks.SOUL_SAND);
        GLOWSTONE = new ColoredBlock(Blocks.GLOWSTONE);
        STONE_BRICK = new ColoredBlock(Blocks.STONE_BRICKS,"stone_brick");
        CRACKED_STONE_BRICK = new ColoredBlock(Blocks.CRACKED_STONE_BRICKS,"cracked_stone_brick");
        MOSSY_STONE_BRICK = new ColoredBlock(Blocks.MOSSY_STONE_BRICKS,"mossy_stone_brick");
        CHISELED_STONE_BRICK = new ColoredBlock(Blocks.CHISELED_STONE_BRICKS,"chiseled_stone_brick");
        NETHER_BRICK = new ColoredBlock(Blocks.NETHER_BRICKS,"nether_brick");
        END_STONE = new ColoredBlock(Blocks.END_STONE);
        EMERALD_BLOCK = new ColoredBlock(Blocks.EMERALD_BLOCK);
//        QUARTZ_BLOCK = new ColoredBlock(Blocks.QUARTZ_BLOCK);
        PRISMARINE = new ColoredBlock(Blocks.PRISMARINE);
        PRISMARINE_BRICK = new ColoredBlock(Blocks.PRISMARINE_BRICKS,"prismarine_brick");
        DARK_PRISMARINE = new ColoredBlock(Blocks.DARK_PRISMARINE);
        SEA_LANTERN = new ColoredBlock(Blocks.SEA_LANTERN);
        COAL_BLOCK = new ColoredBlock(Blocks.COAL_BLOCK);
        PACKET_ICE = new ColoredBlock(Blocks.PACKED_ICE, "packet_ice");
        PURPUR_BLOCK = new ColoredBlock(Blocks.PURPUR_BLOCK,"purpur_block");
        END_STONE_BRICK = new ColoredBlock(Blocks.END_STONE_BRICKS,"end_stone_brick");
        MAGMA_BLOCK = new ColoredBlock(Blocks.MAGMA_BLOCK);
        NETHER_WART_BLOCK = new ColoredBlock(Blocks.NETHER_WART_BLOCK);
        RED_NETHER_BRICK = new ColoredBlock(Blocks.RED_NETHER_BRICKS,"red_nether_brick");
//        OAK_LEAVES = new ColoredBlock(Blocks.OAK_LEAVES);
        SPRUCE_LEAVES = new ColoredBlock(Blocks.SPRUCE_LEAVES);
//        BIRCH_LEAVES = new ColoredBlock(Blocks.BIRCH_LEAVES);
        JUNGLE_LEAVES = new ColoredBlock(Blocks.JUNGLE_LEAVES);
//        ACACIA_LEAVES = new ColoredBlock(Blocks.ACACIA_LEAVES);
//        DARK_OAK_LEAVES = new ColoredBlock(Blocks.DARK_OAK_LEAVES);
        SLIME_BLOCK = new ColoredBlock(Blocks.SLIME_BLOCK);

        ColoredBlock[] array = new ColoredBlock[] {
                STONE, GRANITE, POLISHED_GRANITE, DIORITE, POLISHED_DIORITE, ANDESITE, POLISHED_ANDESITE,
                DIRT, COARSE_DIRT, COBBLESTONE,
                OAK_PLANK, SPRUCE_PLANK, BIRCH_PLANK, JUNGLE_PLANK, ACACIA_PLANK, DARK_OAK_PLANK,
                SAND, RED_SAND, GRAVEL, SPONGE, WET_SPONGE,
                LAPIS_LAZULI_BLOCK, GOLD_BLOCK, IRON_BLOCK, BRICK, MOSS_STONE,
                OBSIDIAN, DIAMOND_BLOCK, ICE, SNOW_BLOCK, CLAY_BLOCK, NETHERRACK,
                SOUL_SAND, GLOWSTONE,
                STONE_BRICK, CRACKED_STONE_BRICK, MOSSY_STONE_BRICK, CHISELED_STONE_BRICK, NETHER_BRICK,
                END_STONE, EMERALD_BLOCK,
                PRISMARINE, PRISMARINE_BRICK, DARK_PRISMARINE, SEA_LANTERN,
                COAL_BLOCK, PACKET_ICE,
                PURPUR_BLOCK, END_STONE_BRICK, MAGMA_BLOCK, NETHER_WART_BLOCK, RED_NETHER_BRICK,
                SPRUCE_LEAVES, JUNGLE_LEAVES,
                SLIME_BLOCK
        };

        COLORED_OBJECTS.addAll(Arrays.asList(array));

        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            coloredObject.createBlocks();
        }
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerColoredObjects(RegistryEvent.Register<ColoredObject> event) {
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            event.getRegistry().register(coloredObject);
            PaintingMod.LOGGER.info("Registred Colored Object : " + coloredObject.getRegistryName());
        }
    }

    public void onBlockRegister(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(soggy_clay);
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            event.getRegistry().registerAll(coloredObject.getBlockArray());
        }
    }

    public void onItemRegister(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(soggy_clay, new Item.Properties().group(PaintingMod.MOD_BLOCKS)).setRegistryName(soggy_clay.getRegistryName()));
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            for (Block block : coloredObject.getBlockArray()) {
                if (block instanceof NormalBlock) {
                    event.getRegistry().register(new ItemBlock(block, new Item.Properties().group(PaintingMod.MOD_BLOCKS)).setRegistryName(block.getRegistryName()));
                }
            }
        }
    }
}
