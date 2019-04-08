package arthurbambou.paintingmod.mainmod.api;

import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaintingModRegistry {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod/API");
    private static final Map<Identifier,ColoredObject> COLORED_OBJECTS = new HashMap<Identifier,ColoredObject>();
    private static final Map<Identifier,ColoredFunction> COLORED_FUNCTIONS = new HashMap<Identifier,ColoredFunction>();

    public static Map<Identifier,ColoredObject> getColoredObjectList() {
        return COLORED_OBJECTS;
    }

    public static Map<Identifier, ColoredFunction> getColoredFunctionsList() {
        return COLORED_FUNCTIONS;
    }

    public static void registerColoredObject(ColoredObject coloredBlock) {
        COLORED_OBJECTS.put(coloredBlock.getRegisteryName(),coloredBlock);
    }

    public static void registerColoredFunction(ColoredFunction coloredBlock) {
        COLORED_FUNCTIONS.put(coloredBlock.getIdentifier(),coloredBlock);
    }

    public static void finishRegister() {
//        COLORED_OBJECTS.addAll(COMMON_BLOCKS);
//        COLORED_OBJECTS.addAll(COLORED_STAIRS_LIST);
//        COLORED_OBJECTS.addAll(COLORED_SLAB_LIST);
//        COLORED_OBJECTS.addAll(COLORED_WALL_LIST);
//        COLORED_OBJECTS.addAll(COLORED_FENCE_GATE_LIST);
//        COLORED_OBJECTS.addAll(COLORED_FENCE_LIST);
//        COLORED_OBJECTS.addAll(COLORED_PRESSURE_PLATE_LIST);
//        COLORED_OBJECTS.addAll(COLORED_BUTTON_LIST);
//
//        LOGGER.info("\n        " + COLORED_OBJECTS.size() + " Colored Objects Registered : \n        "
//                + COMMON_BLOCKS.size() + " Colored Blocks \n        "
//                + COLORED_STAIRS_LIST.size() + " Colored Stairs \n        "
//                + COLORED_SLAB_LIST.size() + " Colored Slabs \n        "
//                + COLORED_WALL_LIST.size() + " Colored Walls \n        "
//                + COLORED_FENCE_GATE_LIST.size() + " Colored Fence Gates \n        "
//                + COLORED_FENCE_LIST.size() + " Colored Fences \n        "
//                + COLORED_PRESSURE_PLATE_LIST.size() + " Colored Pressure Plates \n        "
//                + COLORED_BUTTON_LIST.size() + " Colored Buttons");
    }
}
