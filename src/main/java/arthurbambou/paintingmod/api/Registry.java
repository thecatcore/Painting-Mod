package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final List<ColoredBlock> COMMON_BLOCKS = new ArrayList<ColoredBlock>() {};

    public static List<ColoredBlock> getCommonBlocks() {
        return COMMON_BLOCKS;
    }

    public static void registerCommonBlocks(ColoredBlock coloredBlock) {
        COMMON_BLOCKS.add(coloredBlock);
        System.out.println("[PaintingMod API] registered colored block : " + coloredBlock.getModid() + ":" +coloredBlock.getName());
    }
}
