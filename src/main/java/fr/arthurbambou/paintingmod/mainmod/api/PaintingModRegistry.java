package fr.arthurbambou.paintingmod.mainmod.api;

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
    private static final Map<Identifier, Class> COLORED_OBJECT_TYPE = new HashMap<>();

    public static Map<Identifier,ColoredObject> getColoredObjectList() {
        return COLORED_OBJECTS;
    }

    public static Map<Identifier, ColoredFunction> getColoredFunctionsList() {
        return COLORED_FUNCTIONS;
    }

    public static Map<Identifier, Class> getColoredObjectTypeList() {
        return COLORED_OBJECT_TYPE;
    }

    public static void registerColoredObject(ColoredObject coloredBlock) {
        COLORED_OBJECTS.put(coloredBlock.getRegisteryName(),coloredBlock);
    }

    public static void registerColoredFunction(ColoredFunction coloredBlock) {
        COLORED_FUNCTIONS.put(coloredBlock.getIdentifier(),coloredBlock);
    }

    public static void registerColoredObjectType(Identifier identifier, Class clas) {
        COLORED_OBJECT_TYPE.put(identifier, clas);
    }

    public static void finishRegister() {
        LOGGER.info("PaintingMod Registered " + COLORED_OBJECTS.size() + " Colored Objects either " + (COLORED_OBJECTS.size()*16) + " Blocks");
        for (ColoredFunction coloredFunction : COLORED_FUNCTIONS.values()) {
            List<ColoredObject> list = new ArrayList<>();
            String className = coloredFunction.getColoredObjectType().getName();
            for (ColoredObject coloredObject : COLORED_OBJECTS.values()) {
                if (coloredFunction.isFromType(coloredObject)) {
                    list.add(coloredObject);
                }
            }
            if (list.isEmpty()) {
                LOGGER.info("PaintingMod Registered " + 0 + " " + className);
            } else {
                LOGGER.info("PaintingMod Registered " + list.size() + " " + className);
            }
        }
    }
}
