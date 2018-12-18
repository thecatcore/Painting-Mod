package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {
    public static Item EARTH_MORTAR;
    public static Item BLACK_PAINT_POT;
    public static Item RED_PAINT_POT;
    public static Item GREEN_PAINT_POT;
    public static Item BROWN_PAINT_POT;
    public static Item BLUE_PAINT_POT;
    public static Item PURPLE_PAINT_POT;
    public static Item CYAN_PAINT_POT;
    public static Item LIGHT_GRAY_PAINT_POT;
    public static Item GRAY_PAINT_POT;
    public static Item PINK_PAINT_POT;
    public static Item LIME_PAINT_POT;
    public static Item YELLOW_PAINT_POT;
    public static Item LIGHT_BLUE_PAINT_POT;
    public static Item MAGENTA_PAINT_POT;
    public static Item ORANGE_PAINT_POT;
    public static Item WHITE_PAINT_POT;
    public static Item HAMMER;
    public static Item WATER_VIALS;
    public static Item DOUBLE_WATER_VIALS;
    public static Item NORMAL_PAINTBRUSH;
    public static Item HEAT_GUN;

    public static void init() {
        EARTH_MORTAR = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS), "earth_mortar");

        BLACK_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "black_paint_pot");
        RED_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "red_paint_pot");
        GREEN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "green_paint_pot");
        BROWN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "brown_paint_pot");
        BLUE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "blue_paint_pot");
        PURPLE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "purple_paint_pot");
        CYAN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "cyan_paint_pot");
        LIGHT_GRAY_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "light_gray_paint_pot");
        GRAY_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "gray_paint_pot");
        PINK_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "pink_paint_pot");
        LIME_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "lime_paint_pot");
        YELLOW_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "yellow_paint_pot");
        LIGHT_BLUE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "light_blue_paint_pot");
        MAGENTA_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "magenta_paint_pot");
        ORANGE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "orange_paint_pot");
        WHITE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(1).durabilityIfNotSet(5).durability(5), "white_paint_pot");

        HAMMER = new ItemBase(new Item.Settings().itemGroup(ItemGroup.TOOLS).stackSize(1).durabilityIfNotSet(100).durability(100), "hammer");

        WATER_VIALS = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(64).durability(12).durabilityIfNotSet(12), "water_vial");
        DOUBLE_WATER_VIALS = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS).stackSize(32).durability(24).durabilityIfNotSet(24), "double_water_vial");

        HEAT_GUN = new ItemBase(new Item.Settings().itemGroup(ItemGroup.TOOLS).stackSize(1).durabilityIfNotSet(100).durability(100), "heat_gun");
    }
}
