package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final List<ColoredBlock> COMMON_BLOCKS = new ArrayList<ColoredBlock>() {};
    private static final List<ColoredStairs> COLORED_STAIRS_LIST = new ArrayList<ColoredStairs>();

    public static List<ColoredBlock> getCommonBlocks() {
        return COMMON_BLOCKS;
    }

    public static List<ColoredStairs> getColoredStairsList() {
        return COLORED_STAIRS_LIST;
    }

    public static void registerCommonBlocks(ColoredBlock coloredBlock) {
        COMMON_BLOCKS.add(coloredBlock);
        System.out.println("[PaintingMod API] registered colored block : " + coloredBlock.getModid() + ":" +coloredBlock.getName());
    }

    public static void registerColoredStairs(ColoredStairs coloredStairs) {
        COLORED_STAIRS_LIST.add(coloredStairs);
        System.out.println("[PaintingMod API] registered colored stairs : " + coloredStairs.getModid() + ":" + coloredStairs.getName());
    }
}
