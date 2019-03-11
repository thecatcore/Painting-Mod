package arthurbambou.paintingmod.compat.fabricblocks;

import arthurbambou.paintingmod.mainmod.api.ColoredBlock;
import arthurbambou.paintingmod.mainmod.api.ColoredSlab;
import arthurbambou.paintingmod.mainmod.api.ColoredStairs;
import arthurbambou.paintingmod.mainmod.api.ColoredWall;
import com.yanis48.fabriblocks.FabriBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static ColoredBlock SCUTE_BLOCK;
    public static ColoredBlock BAMBOO_BLOCK;
    public static ColoredBlock SNOW_BRICKS;

    public static ColoredStairs SNOW_BRICK_STAIRS;

    public static ColoredSlab SNOW_BRICK_SLAB;

    public static ColoredWall SNOW_BRICK_WALL;
    public static ColoredWall STONE_WALL;
    public static ColoredWall SMOOTH_STONE_WALL;
    public static ColoredWall SMOOTH_SANDSTONE_WALL;
    public static ColoredWall SMOOTH_RED_SANDSTONE_WALL;
    public static ColoredWall POLISHED_GRANITE_WALL;
    public static ColoredWall POLISHED_DIORITE_WALL;
    public static ColoredWall POLISHED_ANDESITE_WALL;
    public static ColoredWall QUARTZ_WALL;
    public static ColoredWall PRISMARINE_BRICK_WALL;
    public static ColoredWall DARK_PRISMARINE_WALL;
    public static ColoredWall PURPUR_WALL;

    public static void init() {
//        SCUTE_BLOCK = new ColoredBlock("scute_block", com.yanis48.fabriblocks.init.ModBlocks.SCUTE_BLOCK, FabriBlocks.MOD_ID);
//        BAMBOO_BLOCK = new ColoredBlock("bamboo_block", com.yanis48.fabriblocks.init.ModBlocks.BAMBOO_BLOCK, FabriBlocks.MOD_ID);
//        SNOW_BRICKS = new ColoredBlock("snow_brick", com.yanis48.fabriblocks.init.ModBlocks.SNOW_BRICKS, FabriBlocks.MOD_ID);

//        SNOW_BRICK_STAIRS = new ColoredStairs("snow_brick_stairs", com.yanis48.fabriblocks.init.ModBlocks.SNOW_BRICK_STAIRS, FabriBlocks.MOD_ID);
//
//        SNOW_BRICK_SLAB = new ColoredSlab("snow_brick_slab", com.yanis48.fabriblocks.init.ModBlocks.SNOW_BRICK_SLAB, FabriBlocks.MOD_ID);
//
//        SNOW_BRICK_WALL = new ColoredWall("snow_brick_wall", com.yanis48.fabriblocks.init.ModBlocks.SNOW_BRICK_WALL, FabriBlocks.MOD_ID);
        STONE_WALL = new ColoredWall("stone_wall", com.yanis48.fabriblocks.init.ModBlocks.STONE_WALL, FabriBlocks.MOD_ID);
//        SMOOTH_STONE_WALL = new ColoredWall("smooth_stone_wall", com.yanis48.fabriblocks.init.ModBlocks.SMOOTH_STONE_WALL, FabriBlocks.MOD_ID);
//        SMOOTH_SANDSTONE_WALL = new ColoredWall("smooth_sandstone_wall", com.yanis48.fabriblocks.init.ModBlocks.SMOOTH_SANDSTONE_WALL, FabriBlocks.MOD_ID);
//        SMOOTH_RED_SANDSTONE_WALL = new ColoredWall("smooth_red_sandstone_wall", com.yanis48.fabriblocks.init.ModBlocks.SMOOTH_RED_SANDSTONE_WALL, FabriBlocks.MOD_ID);
        POLISHED_GRANITE_WALL = new ColoredWall("polished_granite_wall", com.yanis48.fabriblocks.init.ModBlocks.POLISHED_GRANITE_WALL, FabriBlocks.MOD_ID);
        POLISHED_DIORITE_WALL = new ColoredWall("polished_diorite_wall", com.yanis48.fabriblocks.init.ModBlocks.POLISHED_DIORITE_WALL, FabriBlocks.MOD_ID);
        POLISHED_ANDESITE_WALL = new ColoredWall("polished_andesite_wall", com.yanis48.fabriblocks.init.ModBlocks.POLISHED_ANDESITE_WALL, FabriBlocks.MOD_ID);
//        QUARTZ_WALL = new ColoredWall("quartz_wall", com.yanis48.fabriblocks.init.ModBlocks.QUARTZ_WALL, FabriBlocks.MOD_ID);
        PRISMARINE_BRICK_WALL = new ColoredWall("prismarine_brick_wall", com.yanis48.fabriblocks.init.ModBlocks.PRISMARINE_BRICK_WALL, FabriBlocks.MOD_ID);
        DARK_PRISMARINE_WALL = new ColoredWall("dark_prismarine_wall", com.yanis48.fabriblocks.init.ModBlocks.DARK_PRISMARINE_WALL, FabriBlocks.MOD_ID);
        PURPUR_WALL = new ColoredWall("purpur_wall", com.yanis48.fabriblocks.init.ModBlocks.PURPUR_WALL, FabriBlocks.MOD_ID);

//        SCUTE_BLOCK.createBlocks();
//        BAMBOO_BLOCK.createBlocks();
//        SNOW_BRICKS.createBlocks();
//        SNOW_BRICK_STAIRS.createBlocks();
//        SNOW_BRICK_SLAB.createBlocks();
//        SNOW_BRICK_WALL.createBlocks();
        STONE_WALL.createBlocks();
//        SMOOTH_STONE_WALL.createBlocks();
//        SMOOTH_SANDSTONE_WALL.createBlocks();
//        SMOOTH_RED_SANDSTONE_WALL.createBlocks();
        POLISHED_GRANITE_WALL.createBlocks();
        POLISHED_DIORITE_WALL.createBlocks();
        POLISHED_ANDESITE_WALL.createBlocks();
//        QUARTZ_WALL.createBlocks();
        PRISMARINE_BRICK_WALL.createBlocks();
        DARK_PRISMARINE_WALL.createBlocks();
        PURPUR_WALL.createBlocks();
    }

    private static Block getID(String id) {
        return Registry.BLOCK.get(new Identifier(FabriBlocks.MOD_ID,id));
    }
}
