package fr.arthurbambou.paintingmod.api;

import fr.arthurbambou.paintingmod.PaintingMod;

import java.util.ArrayList;
import java.util.List;

public class PRegistry<V extends ColoredObject> {
    private static final List<ColoredObject> COLORED_OBJECTS = new ArrayList<>();
    private static final List<Class<? extends ColoredObject>> COLORED_TYPE = new ArrayList<>();
    private static final List<Class<? extends ColoredFunction>> COLORED_FUNCTIONS = new ArrayList<>();
    public static final PRegistry INSTANCE = new PRegistry();

    public static List<ColoredObject> getColoredObjects() {
        return COLORED_OBJECTS;
    }

    public static void register(ColoredObject coloredObject) {
        if (!COLORED_OBJECTS.contains(coloredObject)) {
            COLORED_OBJECTS.add(coloredObject);
            if (!COLORED_TYPE.contains(coloredObject.getClass())) {
                COLORED_TYPE.add(coloredObject.getClass());
            }
        } else {
            PaintingMod.LOGGER.warn("You registered a colored object twice : " + coloredObject.toString());
        }
    }

    public static List<Class<? extends ColoredObject>> getColoredType() {
        return COLORED_TYPE;
    }

    public List<V> getListof(Class<V> thclass) {
        ArrayList<V> list = new ArrayList<>();
        for (ColoredObject coloredObject : COLORED_OBJECTS) {
            if (coloredObject.getClass() == thclass) {
                list.add((V)coloredObject);
            }
        }
        return list;
    }

    public static List<Class<? extends ColoredFunction>> getColoredFunctions() {
        return COLORED_FUNCTIONS;
    }

    public static void registerFunction(Class<? extends ColoredFunction> colored_function) {
        if (!COLORED_FUNCTIONS.contains(colored_function)) {
            COLORED_FUNCTIONS.add(colored_function);
        }
    }
}
