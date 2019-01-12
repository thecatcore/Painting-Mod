package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final List<ColoredBlock> COMMON_BLOCKS = new ArrayList<ColoredBlock>() {};
    private static final List<ColoredStairs> COLORED_STAIRS_LIST = new ArrayList<ColoredStairs>();
    private static final List<ColoredSlab> COLORED_SLAB_LIST = new ArrayList<ColoredSlab>();

    public static List<ColoredBlock> getCommonBlocks() {
        return COMMON_BLOCKS;
    }

    public static List<ColoredStairs> getColoredStairsList() {
        return COLORED_STAIRS_LIST;
    }

    public static List<ColoredSlab> getColoredSlabList() {
        return COLORED_SLAB_LIST;
    }

    public static void registerCommonBlocks(ColoredBlock coloredBlock) {
        String modID = coloredBlock.black.getDropTableId().getNamespace();
        COMMON_BLOCKS.add(coloredBlock);
        System.out.println("[PaintingMod API] registered colored block : " + modID + ":" +coloredBlock.getName());
    }

    public static void registerColoredStairs(ColoredStairs coloredStairs) {
        String modID = coloredStairs.black.getDropTableId().getNamespace();
        COLORED_STAIRS_LIST.add(coloredStairs);
        System.out.println("[PaintingMod API] registered colored stairs : " + modID + ":" + coloredStairs.getName());
    }

    public static void registerColoredSlab(ColoredSlab coloredSlab) {
        String modID = coloredSlab.black.getDropTableId().getNamespace();
        COLORED_SLAB_LIST.add(coloredSlab);
        System.out.println("[PaintingMod API] registered colored slab : " + modID + ":" + coloredSlab.getName());
    }
}
