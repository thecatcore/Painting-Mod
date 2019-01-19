package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final List<ColoredObject> COLORED_OBJECTS = new ArrayList<ColoredObject>();
    private static final List<ColoredBlock> COMMON_BLOCKS = new ArrayList<ColoredBlock>() {};
    private static final List<ColoredStairs> COLORED_STAIRS_LIST = new ArrayList<ColoredStairs>();
    private static final List<ColoredSlab> COLORED_SLAB_LIST = new ArrayList<ColoredSlab>();
    private static final List<ColoredWall> COLORED_WALL_LIST = new ArrayList<ColoredWall>();
    private static final List<ColoredFenceGate> COLORED_FENCE_GATE_LIST = new ArrayList<ColoredFenceGate>();
    private static final List<ColoredFence> COLORED_FENCE_LIST = new ArrayList<ColoredFence>();
    private static final List<ColoredPressurePlate> COLORED_PRESSURE_PLATE_LIST = new ArrayList<ColoredPressurePlate>();
    private static final List<ColoredButton> COLORED_BUTTON_LIST = new ArrayList<ColoredButton>();

    public static List<ColoredObject> getColoredObjectList() {
        return COLORED_OBJECTS;
    }

    public static List<ColoredBlock> getCommonBlocks() {
        return COMMON_BLOCKS;
    }

    public static List<ColoredStairs> getColoredStairsList() {
        return COLORED_STAIRS_LIST;
    }

    public static List<ColoredSlab> getColoredSlabList() {
        return COLORED_SLAB_LIST;
    }

    public static List<ColoredWall> getColoredWallList() {
        return COLORED_WALL_LIST;
    }

    public static List<ColoredFenceGate> getColoredFenceGateList() {
        return COLORED_FENCE_GATE_LIST;
    }

    public static List<ColoredFence> getColoredFenceList() {
        return COLORED_FENCE_LIST;
    }

    public static List<ColoredPressurePlate> getColoredPressurePlateList() {
        return COLORED_PRESSURE_PLATE_LIST;
    }

    public static List<ColoredButton> getColoredButtonList() {
        return COLORED_BUTTON_LIST;
    }

    public static void registerCommonBlocks(ColoredBlock coloredBlock) {
        String modID = coloredBlock.black.getDropTableId().getNamespace();
        COMMON_BLOCKS.add(coloredBlock);
//        System.out.println("[PaintingMod API] registered colored block : " + modID + ":" +coloredBlock.getName());
    }

    public static void registerColoredStairs(ColoredStairs coloredStairs) {
        String modID = coloredStairs.black.getDropTableId().getNamespace();
        COLORED_STAIRS_LIST.add(coloredStairs);
//        System.out.println("[PaintingMod API] registered colored stairs : " + modID + ":" + coloredStairs.getName());
    }

    public static void registerColoredSlab(ColoredSlab coloredSlab) {
        String modID = coloredSlab.black.getDropTableId().getNamespace();
        COLORED_SLAB_LIST.add(coloredSlab);
//        System.out.println("[PaintingMod API] registered colored slab : " + modID + ":" + coloredSlab.getName());
    }

    public static void registerColoredWall(ColoredWall coloredWall) {
        String modID = coloredWall.black.getDropTableId().getNamespace();
        COLORED_WALL_LIST.add(coloredWall);
//        System.out.println("[PaintingMod API] registered colored wall : " + modID + ":" + coloredWall.getName());
    }

    public static void registerColoredFenceGate(ColoredFenceGate coloredWall) {
        String modID = coloredWall.black.getDropTableId().getNamespace();
        COLORED_FENCE_GATE_LIST.add(coloredWall);
//        System.out.println("[PaintingMod API] registered colored fence gate : " + modID + ":" + coloredWall.getName());
    }

    public static void registerColoredFence(ColoredFence coloredFence) {
        String modID = coloredFence.black.getDropTableId().getNamespace();
        COLORED_FENCE_LIST.add(coloredFence);
//        System.out.println("[PaintingMod API] registered colored fence : " + modID + ":" + coloredFence.getName());
    }

    public static void registerColoredPressurePlate(ColoredPressurePlate coloredFence) {
        COLORED_PRESSURE_PLATE_LIST.add(coloredFence);
//        System.out.println("[PaintingMod API] registered colored pressure plate : " + coloredFence.getRegisteryName());
    }

    public static void registerColoredButton(ColoredButton coloredFence) {
        COLORED_BUTTON_LIST.add(coloredFence);
//        System.out.println("[PaintingMod API] registered colored pressure plate : " + coloredFence.getRegisteryName());
    }

    public static void finishRegister() {
        COLORED_OBJECTS.addAll(COMMON_BLOCKS);
        COLORED_OBJECTS.addAll(COLORED_STAIRS_LIST);
        COLORED_OBJECTS.addAll(COLORED_SLAB_LIST);
        COLORED_OBJECTS.addAll(COLORED_WALL_LIST);
        COLORED_OBJECTS.addAll(COLORED_FENCE_GATE_LIST);
        COLORED_OBJECTS.addAll(COLORED_FENCE_LIST);
        COLORED_OBJECTS.addAll(COLORED_PRESSURE_PLATE_LIST);
        COLORED_OBJECTS.addAll(COLORED_BUTTON_LIST);

        System.out.println("[PaintingMod API] \n        " + COLORED_OBJECTS.size() + " Colored Objects Registered : \n        "
                + COMMON_BLOCKS.size() + " Colored Blocks \n        "
                + COLORED_STAIRS_LIST.size() + " Colored Stairs \n        "
                + COLORED_SLAB_LIST.size() + " Colored Slabs \n        "
                + COLORED_WALL_LIST.size() + " Colored Walls \n        "
                + COLORED_FENCE_GATE_LIST.size() + " Colored Fence Gates \n        "
                + COLORED_FENCE_LIST.size() + " Colored Fences \n        "
                + COLORED_PRESSURE_PLATE_LIST.size() + " Colored Pressure Plates \n        "
                + COLORED_BUTTON_LIST.size() + " Colored Buttons");
    }
}
