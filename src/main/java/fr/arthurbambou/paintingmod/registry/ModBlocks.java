package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredBlock;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredSlab;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredStairs;
import fr.arthurbambou.paintingmod.blocks.SoggyClay;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalSlab;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalStairs;
import fr.arthurbambou.paintingmod.coloredblocks.PMColoredBlock;
import fr.arthurbambou.paintingmod.coloredblocks.PMColoredSlab;
import fr.arthurbambou.paintingmod.coloredblocks.PMColoredStairs;
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
    public static ColoredBlock GRASS_BLOCK;
    public static ColoredBlock DIRT;
    public static ColoredBlock COARSE_DIRT;
    public static ColoredBlock PODZOL;
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
    public static ColoredObject OAK_LOG;
    public static ColoredObject SPRUCE_LOG;
    public static ColoredObject BIRCH_LOG;
    public static ColoredObject JUNGLE_LOG;
    public static ColoredObject ACACIA_LOG;
    public static ColoredObject DARK_OAK_LOG;
    public static ColoredObject STRIPPED_OAK_LOG;
    public static ColoredObject STRIPPED_SPRUCE_LOG;
    public static ColoredObject STRIPPED_BIRCH_LOG;
    public static ColoredObject STRIPPED_JUNGLE_LOG;
    public static ColoredObject STRIPPED_ACACIA_LOG;
    public static ColoredObject STRIPPED_DARK_OAK_LOG;
    public static ColoredBlock OAK_WOOD;
    public static ColoredBlock SPRUCE_WOOD;
    public static ColoredBlock BIRCH_WOOD;
    public static ColoredBlock JUNGLE_WOOD;
    public static ColoredBlock ACACIA_WOOD;
    public static ColoredBlock DARK_OAK_WOOD;
    public static ColoredBlock STRIPPED_OAK_WOOD;
    public static ColoredBlock STRIPPED_SPRUCE_WOOD;
    public static ColoredBlock STRIPPED_BIRCH_WOOD;
    public static ColoredBlock STRIPPED_JUNGLE_WOOD;
    public static ColoredBlock STRIPPED_ACACIA_WOOD;
    public static ColoredBlock STRIPPED_DARK_OAK_WOOD;
    public static ColoredBlock OAK_LEAVES;
    public static ColoredBlock SPRUCE_LEAVES;
    public static ColoredBlock BIRCH_LEAVES;
    public static ColoredBlock JUNGLE_LEAVES;
    public static ColoredBlock ACACIA_LEAVES;
    public static ColoredBlock DARK_OAK_LEAVES;
    public static ColoredBlock SPONGE;
    public static ColoredBlock WET_SPONGE;
    public static ColoredBlock LAPIS_LAZULI_BLOCK;
    public static ColoredBlock SANDSTONE;
    public static ColoredBlock CHISELED_SANDSTONE;
    public static ColoredBlock CUT_SANDSTONE;
    public static ColoredBlock GOLD_BLOCK;
    public static ColoredBlock IRON_BLOCK;
    public static ColoredBlock BRICK;
    public static ColoredBlock BOOKSHELF;
    public static ColoredBlock MOSS_STONE;
    public static ColoredBlock OBSIDIAN;
    public static ColoredStairs OAK_STAIRS;
    public static ColoredBlock DIAMOND_BLOCK;
    public static ColoredStairs COBBLESTONE_STAIRS;
    public static ColoredBlock ICE;
    public static ColoredBlock SNOW_BLOCK;
    public static ColoredBlock CLAY_BLOCK;
    public static ColoredBlock NETHERRACK;
    public static ColoredBlock SOUL_SAND;
    public static ColoredBlock GLOWSTONE;
    public static ColoredBlock STONE_BRICK;
    public static ColoredBlock MOSSY_STONE_BRICK;
    public static ColoredBlock CRACKED_STONE_BRICK;
    public static ColoredBlock CHISELED_STONE_BRICK;
    public static ColoredStairs BRICK_STAIRS;
    public static ColoredStairs STONE_BRICK_STAIRS;
    public static ColoredBlock NETHER_BRICK;
    public static ColoredStairs NETHER_BRICK_STAIRS;
    public static ColoredBlock END_STONE;
    public static ColoredStairs SANDSTONE_STAIRS;
    public static ColoredBlock EMERALD_BLOCK;
    public static ColoredStairs SPRUCE_STAIRS;
    public static ColoredStairs BIRCH_STAIRS;
    public static ColoredStairs JUNGLE_STAIRS;
    public static ColoredBlock QUARTZ_BLOCK;
    public static ColoredBlock CHISELED_QUARTZ_BLOCK;
    public static ColoredObject QUARTZ_PILLAR;
    public static ColoredStairs QUARTZ_STAIRS;
    public static ColoredStairs ACACIA_STAIRS;
    public static ColoredStairs DARK_OAK_STAIRS;
    public static ColoredBlock SLIME_BLOCK;
    public static ColoredBlock PRISMARINE;
    public static ColoredBlock PRISMARINE_BRICK;
    public static ColoredBlock DARK_PRISMARINE;
    public static ColoredStairs PRISMARINE_STAIRS;
    public static ColoredStairs PRISMARINE_BRICK_STAIRS;
    public static ColoredStairs DARK_PRISMARINE_STAIRS;
    public static ColoredSlab PRISMARINE_SLAB;
    public static ColoredSlab PRISMARINE_BRICK_SLAB;
    public static ColoredSlab DARK_PRISMARINE_SLAB;
    public static ColoredBlock SEA_LANTERN;
    public static ColoredObject HAY_BLOCK;
    public static ColoredBlock COAL_BLOCK;
    public static ColoredBlock PACKET_ICE;
    public static ColoredBlock RED_SANDSTONE;
    public static ColoredBlock RED_CHISELED_SANDSTONE;
    public static ColoredBlock RED_CUT_SANDSTONE;
    public static ColoredStairs RED_SANDSTONE_STAIRS;
    public static ColoredSlab OAK_SLAB;
    public static ColoredSlab SPRUCE_SLAB;
    public static ColoredSlab BIRCH_SLAB;
    public static ColoredSlab JUNGLE_SLAB;
    public static ColoredSlab ACACIA_SLAB;
    public static ColoredSlab DARK_OAK_SLAB;
    public static ColoredSlab STONE_SLAB;
    public static ColoredSlab SANDSTONE_SLAB;
    public static ColoredSlab PETRIFIED_OAK_SLAB;
    public static ColoredSlab COBBLESTONE_SLAB;
    public static ColoredSlab BRICK_SLAB;
    public static ColoredSlab STONE_BRICK_SLAB;
    public static ColoredSlab NETHER_BRICK_SLAB;
    public static ColoredSlab QUARTZ_SLAB;
    public static ColoredSlab RED_SANDSTONE_SLAB;
    public static ColoredSlab PURPUR_SLAB;
    public static ColoredBlock SMOOTH_QUARTZ;
    public static ColoredBlock SMOOTH_RED_SANDSTONE;
    public static ColoredBlock SMOOTH_SANDSTONE;
    public static ColoredBlock SMOOTH_STONE;
    public static ColoredObject END_ROD;
    public static ColoredBlock PURPUR_BLOCK;
    public static ColoredObject PUPUR_PILLAR;
    public static ColoredStairs PURPUR_STAIRS;
    public static ColoredBlock END_STONE_BRICK;
    public static ColoredBlock MAGMA_BLOCK;
    public static ColoredBlock NETHER_WART_BLOCK;
    public static ColoredBlock RED_NETHER_BRICK;
    public static ColoredObject BONE_BLOCK;
    public static ColoredObject DRIED_KELP_BLOCK;
    public static ColoredBlock BLUE_ICE;

    public ModBlocks() {
        soggy_clay = new SoggyClay();

        STONE = new PMColoredBlock(Blocks.STONE);
        GRANITE = new PMColoredBlock(Blocks.GRANITE);
        POLISHED_GRANITE = new PMColoredBlock(Blocks.POLISHED_GRANITE);
        DIORITE = new PMColoredBlock(Blocks.DIORITE);
        POLISHED_DIORITE = new PMColoredBlock(Blocks.POLISHED_DIORITE);
        ANDESITE = new PMColoredBlock(Blocks.ANDESITE);
        POLISHED_ANDESITE = new PMColoredBlock(Blocks.POLISHED_ANDESITE);
//        GRASS_BLOCK = new PMColoredBlock(Blocks.GRASS_BLOCK);
        DIRT = new PMColoredBlock(Blocks.DIRT);
        COARSE_DIRT = new PMColoredBlock(Blocks.COARSE_DIRT);
//        PODZOL = new PMColoredBlock(Blocks.PODZOL);
        COBBLESTONE = new PMColoredBlock(Blocks.COBBLESTONE);
        OAK_PLANK = new PMColoredBlock(Blocks.OAK_PLANKS,"oak_plank");
        SPRUCE_PLANK = new PMColoredBlock(Blocks.SPRUCE_PLANKS,"spruce_plank");
        BIRCH_PLANK = new PMColoredBlock(Blocks.BIRCH_PLANKS, "birch_plank");
        JUNGLE_PLANK = new PMColoredBlock(Blocks.JUNGLE_PLANKS, "jungle_plank");
        ACACIA_PLANK = new PMColoredBlock(Blocks.ACACIA_PLANKS,"acacia_plank");
        DARK_OAK_PLANK = new PMColoredBlock(Blocks.DARK_OAK_PLANKS,"dark_oak_plank");
        SAND = new PMColoredBlock(Blocks.SAND);
        RED_SAND = new PMColoredBlock(Blocks.RED_SAND);
        GRAVEL = new PMColoredBlock(Blocks.GRAVEL);
//        OAK_LOG = new PMColoredBlock(Blocks.OAK_LOG);
//        SPRUCE_LOG = new PMColoredBlock(Blocks.SPRUCE_LOG);
//        BIRCH_LOG = new PMColoredBlock(Blocks.BIRCH_LOG);
//        JUNGLE_LOG = new PMColoredBlock(Blocks.JUNGLE_LOG);
//        ACACIA_LOG = new PMColoredBlock(Blocks.ACACIA_LOG);
//        DARK_OAK_LOG = new PMColoredBlock(Blocks.DARK_OAK_LOG);
//        STRIPPED_OAK_LOG = new PMColoredBlock(Blocks.STRIPPED_OAK_LOG);
//        STRIPPED_SPRUCE_LOG = new PMColoredBlock(Blocks.STRIPPED_SPRUCE_LOG);
//        STRIPPED_BIRCH_LOG = new PMColoredBlock(Blocks.STRIPPED_BIRCH_LOG);
//        STRIPPED_JUNGLE_LOG = new PMColoredBlock(Blocks.STRIPPED_JUNGLE_LOG);
//        STRIPPED_ACACIA_LOG = new PMColoredBlock(Blocks.STRIPPED_ACACIA_LOG);
//        STRIPPED_DARK_OAK_LOG = new PMColoredBlock(Blocks.STRIPPED_DARK_OAK_LOG);
//        OAK_WOOD = new PMColoredBlock(Blocks.OAK_WOOD);
//        SPRUCE_WOOD = new PMColoredBlock(Blocks.SPRUCE_WOOD);
//        BIRCH_WOOD = new PMColoredBlock(Blocks.BIRCH_WOOD);
//        JUNGLE_WOOD = new PMColoredBlock(Blocks.JUNGLE_WOOD);
//        ACACIA_WOOD = new PMColoredBlock(Blocks.ACACIA_WOOD);
//        DARK_OAK_WOOD = new PMColoredBlock(Blocks.DARK_OAK_WOOD);
//        STRIPPED_OAK_WOOD = new PMColoredBlock(Blocks.STRIPPED_OAK_WOOD);
//        STRIPPED_SPRUCE_WOOD = new PMColoredBlock(Blocks.STRIPPED_SPRUCE_WOOD);
//        STRIPPED_BIRCH_WOOD = new PMColoredBlock(Blocks.STRIPPED_BIRCH_WOOD);
//        STRIPPED_JUNGLE_WOOD = new PMColoredBlock(Blocks.STRIPPED_JUNGLE_WOOD);
//        STRIPPED_ACACIA_WOOD = new PMColoredBlock(Blocks.STRIPPED_ACACIA_WOOD);
//        STRIPPED_DARK_OAK_WOOD = new PMColoredBlock(Blocks.STRIPPED_DARK_OAK_WOOD);
//        OAK_LEAVES = new PMColoredBlock(Blocks.OAK_LEAVES);
        SPRUCE_LEAVES = new PMColoredBlock(Blocks.SPRUCE_LEAVES);
//        BIRCH_LEAVES = new PMColoredBlock(Blocks.BIRCH_LEAVES);
        JUNGLE_LEAVES = new PMColoredBlock(Blocks.JUNGLE_LEAVES);
//        ACACIA_LEAVES = new PMColoredBlock(Blocks.ACACIA_LEAVES);
//        DARK_OAK_LEAVES = new PMColoredBlock(Blocks.DARK_OAK_LEAVES);
        SPONGE = new PMColoredBlock(Blocks.SPONGE);
        WET_SPONGE = new PMColoredBlock(Blocks.WET_SPONGE);
        LAPIS_LAZULI_BLOCK = new PMColoredBlock(Blocks.LAPIS_BLOCK,"lapis_lazuli_block");
//        SANDSTONE = new PMColoredBlock(Blocks.SANDSTONE);
//        CHISELED_SANDSTONE = new PMColoredBlock(Blocks.CHISELED_SANDSTONE);
//        CUT_SANDSTONE = new PMColoredBlock(Blocks.CUT_SANDSTONE);
        GOLD_BLOCK = new PMColoredBlock(Blocks.GOLD_BLOCK);
        IRON_BLOCK = new PMColoredBlock(Blocks.IRON_BLOCK);
        BRICK = new PMColoredBlock(Blocks.BRICKS,"brick");
//        BOOKSHELF = new PMColoredBlock(Blocks.BOOKSHELF);
        MOSS_STONE = new PMColoredBlock(Blocks.MOSSY_COBBLESTONE,"moss_stone");
        OBSIDIAN = new PMColoredBlock(Blocks.OBSIDIAN);
        OAK_STAIRS = new PMColoredStairs(Blocks.OAK_STAIRS, "oak_plank_stairs");
        DIAMOND_BLOCK = new PMColoredBlock(Blocks.DIAMOND_BLOCK);
        COBBLESTONE_STAIRS = new PMColoredStairs(Blocks.COBBLESTONE_STAIRS);
        ICE = new PMColoredBlock(Blocks.ICE);
        SNOW_BLOCK = new PMColoredBlock(Blocks.SNOW_BLOCK);
        CLAY_BLOCK = new PMColoredBlock(Blocks.CLAY, "clay_block");
        NETHERRACK = new PMColoredBlock(Blocks.NETHERRACK);
        SOUL_SAND = new PMColoredBlock(Blocks.SOUL_SAND);
        GLOWSTONE = new PMColoredBlock(Blocks.GLOWSTONE);
        STONE_BRICK = new PMColoredBlock(Blocks.STONE_BRICKS,"stone_brick");
        MOSSY_STONE_BRICK = new PMColoredBlock(Blocks.MOSSY_STONE_BRICKS,"mossy_stone_brick");
        CRACKED_STONE_BRICK = new PMColoredBlock(Blocks.CRACKED_STONE_BRICKS,"cracked_stone_brick");
        CHISELED_STONE_BRICK = new PMColoredBlock(Blocks.CHISELED_STONE_BRICKS,"chiseled_stone_brick");
        BRICK_STAIRS = new PMColoredStairs(Blocks.BRICK_STAIRS);
        STONE_BRICK_STAIRS = new PMColoredStairs(Blocks.STONE_BRICK_STAIRS);
        NETHER_BRICK = new PMColoredBlock(Blocks.NETHER_BRICKS,"nether_brick");
        NETHER_BRICK_STAIRS = new PMColoredStairs(Blocks.NETHER_BRICK_STAIRS);
        END_STONE = new PMColoredBlock(Blocks.END_STONE);
//        SANDSTONE_STAIRS = new PMColoredStairs(Blocks.SANDSTONE_STAIRS);
        EMERALD_BLOCK = new PMColoredBlock(Blocks.EMERALD_BLOCK);
        SPRUCE_STAIRS = new PMColoredStairs(Blocks.SPRUCE_STAIRS, "spruce_plank_stairs");
        BIRCH_STAIRS = new PMColoredStairs(Blocks.BIRCH_STAIRS, "birch_plank_stairs");
        JUNGLE_STAIRS = new PMColoredStairs(Blocks.JUNGLE_STAIRS, "jungle_plank_stairs");
//        QUARTZ_BLOCK = new PMColoredBlock(Blocks.QUARTZ_BLOCK);
//        CHISELED_QUARTZ_BLOCK = new PMColoredBlock(Blocks.CHISELED_QUARTZ_BLOCK);
//        QUARTZ_PILLAR = new PMColoredBlock(Blocks.QUARTZ_PILLAR);
//        QUARTZ_STAIRS = new PMColoredStairs(Blocks.QUARTZ_STAIRS);
        ACACIA_STAIRS = new PMColoredStairs(Blocks.ACACIA_STAIRS, "acacia_plank_stairs");
        DARK_OAK_STAIRS = new PMColoredStairs(Blocks.DARK_OAK_STAIRS, "dark_oak_plank_stairs");
        SLIME_BLOCK = new PMColoredBlock(Blocks.SLIME_BLOCK);
        PRISMARINE = new PMColoredBlock(Blocks.PRISMARINE);
        PRISMARINE_BRICK = new PMColoredBlock(Blocks.PRISMARINE_BRICKS,"prismarine_brick");
        DARK_PRISMARINE = new PMColoredBlock(Blocks.DARK_PRISMARINE);
        PRISMARINE_STAIRS = new PMColoredStairs(Blocks.PRISMARINE_STAIRS);
        PRISMARINE_BRICK_STAIRS = new PMColoredStairs(Blocks.PRISMARINE_BRICK_STAIRS);
        DARK_PRISMARINE_STAIRS = new PMColoredStairs(Blocks.DARK_PRISMARINE_STAIRS);
        PRISMARINE_SLAB = new PMColoredSlab(Blocks.PRISMARINE_SLAB);
        PRISMARINE_BRICK_SLAB = new PMColoredSlab(Blocks.PRISMARINE_BRICK_SLAB);
        DARK_PRISMARINE_SLAB = new PMColoredSlab(Blocks.DARK_PRISMARINE_SLAB);
        SEA_LANTERN = new PMColoredBlock(Blocks.SEA_LANTERN);
//        HAY_BLOCK = new PMColoredBlock(Blocks.HAY_BLOCK);
        COAL_BLOCK = new PMColoredBlock(Blocks.COAL_BLOCK);
        PACKET_ICE = new PMColoredBlock(Blocks.PACKED_ICE, "packet_ice");
//        RED_SANDSTONE = new PMColoredBlock(Blocks.RED_SANDSTONE);
//        RED_CHISELED_SANDSTONE = new PMColoredBlock(Blocks.CHISELED_RED_SANDSTONE);
//        RED_CUT_SANDSTONE = new PMColoredBlock(Blocks.CUT_RED_SANDSTONE);
//        RED_SANDSTONE_STAIRS = new PMColoredStairs(Blocks.RED_SANDSTONE_STAIRS);
        OAK_SLAB = new PMColoredSlab(Blocks.OAK_SLAB, "oak_plank_slab");
        SPRUCE_SLAB = new PMColoredSlab(Blocks.SPRUCE_SLAB, "spruce_plank_slab");
        BIRCH_SLAB = new PMColoredSlab(Blocks.BIRCH_SLAB, "birch_plank_slab");
        JUNGLE_SLAB = new PMColoredSlab(Blocks.JUNGLE_SLAB, "jungle_plank_slab");
        ACACIA_SLAB = new PMColoredSlab(Blocks.ACACIA_SLAB, "acacia_plank_slab");
        DARK_OAK_SLAB = new PMColoredSlab(Blocks.DARK_OAK_SLAB, "dark_oak_plank_slab");
//        STONE_SLAB = new PMColoredSlab(Blocks.STONE_SLAB);
//        SANDSTONE_SLAB = new PMColoredSlab(Blocks.SANDSTONE_SLAB);
//        PETRIFIED_OAK_SLAB = new PMColoredSlab(Blocks.PETRIFIED_OAK_SLAB);
        COBBLESTONE_SLAB = new PMColoredSlab(Blocks.COBBLESTONE_SLAB);
        BRICK_SLAB = new PMColoredSlab(Blocks.BRICK_SLAB);
        STONE_BRICK_SLAB = new PMColoredSlab(Blocks.STONE_BRICK_SLAB);
        NETHER_BRICK_SLAB = new PMColoredSlab(Blocks.NETHER_BRICK_SLAB);
//        QUARTZ_SLAB = new PMColoredSlab(Blocks.QUARTZ_SLAB);
//        RED_SANDSTONE_SLAB = new PMColoredSlab(Blocks.RED_SANDSTONE_SLAB);
        PURPUR_SLAB = new PMColoredSlab(Blocks.PURPUR_SLAB);
//        SMOOTH_QUARTZ = new PMColoredBlock(Blocks.SMOOTH_QUARTZ);
//        SMOOTH_RED_SANDSTONE = new PMColoredBlock(Blocks.SMOOTH_RED_SANDSTONE);
//        SMOOTH_SANDSTONE = new PMColoredBlock(Blocks.SMOOTH_SANDSTONE);
//        SMOOTH_STONE = new PMColoredBlock(Blocks.SMOOTH_STONE);
//        END_ROD = new PMColoredBlock(Blocks.END_ROD);
        PURPUR_BLOCK = new PMColoredBlock(Blocks.PURPUR_BLOCK,"purpur_block");
//        PUPUR_PILLAR = new PMColoredBlock(Blocks.PURPUR_PILLAR);
        PURPUR_STAIRS = new PMColoredStairs(Blocks.PURPUR_STAIRS);
        END_STONE_BRICK = new PMColoredBlock(Blocks.END_STONE_BRICKS,"end_stone_brick");
        MAGMA_BLOCK = new PMColoredBlock(Blocks.MAGMA_BLOCK);
        NETHER_WART_BLOCK = new PMColoredBlock(Blocks.NETHER_WART_BLOCK);
        RED_NETHER_BRICK = new PMColoredBlock(Blocks.RED_NETHER_BRICKS,"red_nether_brick");
//        BONE_BLOCK = new PMColoredBlock(Blocks.BONE_BLOCK);
//        DRIED_KELP_BLOCK = new PMColoredBlock(Blocks.DRIED_KELP_BLOCK);
//        BLUE_ICE = new PMColoredBlock(Blocks.BLUE_ICE);

        ColoredObject[] array = new ColoredObject[] {
                STONE, GRANITE, POLISHED_GRANITE, DIORITE, POLISHED_DIORITE, ANDESITE, POLISHED_ANDESITE,
//                GRASS_BLOCK,
                DIRT, COARSE_DIRT,
//                PODZOL,
                COBBLESTONE,
                OAK_PLANK, SPRUCE_PLANK, BIRCH_PLANK, JUNGLE_PLANK, ACACIA_PLANK, DARK_OAK_PLANK,
                SAND, RED_SAND, GRAVEL,
//                OAK_LOG, SPRUCE_LOG, BIRCH_LOG, JUNGLE_LOG, ACACIA_LOG, DARK_OAK_LOG,
//                STRIPPED_OAK_LOG, STRIPPED_SPRUCE_LOG, STRIPPED_BIRCH_LOG, STRIPPED_JUNGLE_LOG, STRIPPED_ACACIA_LOG, STRIPPED_DARK_OAK_LOG,
//                OAK_WOOD, SPRUCE_WOOD, BIRCH_WOOD, JUNGLE_WOOD, ACACIA_WOOD, DARK_OAK_WOOD,
//                STRIPPED_OAK_WOOD, STRIPPED_SPRUCE_WOOD, STRIPPED_BIRCH_WOOD, STRIPPED_JUNGLE_WOOD, STRIPPED_ACACIA_WOOD, STRIPPED_DARK_OAK_WOOD,
//                OAK_LEAVES,
                SPRUCE_LEAVES,
//                BIRCH_LEAVES,
                JUNGLE_LEAVES,
//                ACACIA_LEAVES, DARK_OAK_LEAVES,
                SPONGE, WET_SPONGE, LAPIS_LAZULI_BLOCK,
//                SANDSTONE, CHISELED_SANDSTONE, CUT_SANDSTONE,
                GOLD_BLOCK, IRON_BLOCK, BRICK,
//                BOOKSHELF,
                MOSS_STONE, OBSIDIAN, OAK_STAIRS, DIAMOND_BLOCK, COBBLESTONE_STAIRS, ICE,
                SNOW_BLOCK, CLAY_BLOCK, NETHERRACK, SOUL_SAND, GLOWSTONE,
                STONE_BRICK, MOSSY_STONE_BRICK, CRACKED_STONE_BRICK, CHISELED_STONE_BRICK,
                BRICK_STAIRS, STONE_BRICK_STAIRS, NETHER_BRICK, NETHER_BRICK_STAIRS, END_STONE,
//                SANDSTONE_STAIRS,
                EMERALD_BLOCK, SPRUCE_STAIRS, BIRCH_STAIRS, JUNGLE_STAIRS,
//                QUARTZ_BLOCK, CHISELED_QUARTZ_BLOCK, QUARTZ_PILLAR, QUARTZ_STAIRS,
                ACACIA_STAIRS, DARK_OAK_STAIRS, SLIME_BLOCK,
                PRISMARINE, PRISMARINE_BRICK,DARK_PRISMARINE,
                PRISMARINE_STAIRS, PRISMARINE_BRICK_STAIRS, DARK_PRISMARINE_STAIRS,
                PRISMARINE_SLAB, PRISMARINE_BRICK_SLAB, DARK_PRISMARINE_SLAB,
                SEA_LANTERN,
//                HAY_BLOCK,
                COAL_BLOCK, PACKET_ICE,
//                RED_SANDSTONE, RED_CHISELED_SANDSTONE, RED_CUT_SANDSTONE, RED_SANDSTONE_STAIRS,
                OAK_SLAB, SPRUCE_SLAB, BIRCH_SLAB, JUNGLE_SLAB, ACACIA_SLAB, DARK_OAK_SLAB,
//                STONE_SLAB, SANDSTONE_SLAB, PETRIFIED_OAK_SLAB,
                COBBLESTONE_SLAB, BRICK_SLAB, STONE_BRICK_SLAB, NETHER_BRICK_SLAB,
//                QUARTZ_SLAB, RED_SANDSTONE_SLAB,
                PURPUR_SLAB,
//                SMOOTH_QUARTZ, SMOOTH_RED_SANDSTONE, SMOOTH_SANDSTONE, SMOOTH_STONE,
//                END_ROD,
                PURPUR_BLOCK,
//                PUPUR_PILLAR,
                PURPUR_STAIRS, END_STONE_BRICK, MAGMA_BLOCK, NETHER_WART_BLOCK, RED_NETHER_BRICK,
//                BONE_BLOCK, DRIED_KELP_BLOCK, BLUE_ICE
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
                } else if (block instanceof NormalStairs) {
                    event.getRegistry().register(new ItemBlock(block, new Item.Properties().group(PaintingMod.MOD_STAIRS)).setRegistryName(block.getRegistryName()));
                } else if (block instanceof NormalSlab) {
                    event.getRegistry().register(new ItemBlock(block, new Item.Properties().group(PaintingMod.MOD_SLABS)).setRegistryName(block.getRegistryName()));
                }
            }
        }
    }
}
