package arthurbambou.paintingmod.mainmod.registery;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.items.Hammer;
import arthurbambou.paintingmod.mainmod.items.HeatGun;
import arthurbambou.paintingmod.mainmod.items.ItemBase;
import arthurbambou.paintingmod.mainmod.items.Paintbrush;
import net.minecraft.item.Item;

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
    public static Item BLACK_PAINTBRUSH;
    public static Item RED_PAINTBRUSH;
    public static Item GREEN_PAINTBRUSH;
    public static Item BROWN_PAINTBRUSH;
    public static Item BLUE_PAINTBRUSH;
    public static Item PURPLE_PAINTBRUSH;
    public static Item CYAN_PAINTBRUSH;
    public static Item LIGHT_GRAY_PAINTBRUSH;
    public static Item GRAY_PAINTBRUSH;
    public static Item PINK_PAINTBRUSH;
    public static Item LIME_PAINTBRUSH;
    public static Item YELLOW_PAINTBRUSH;
    public static Item LIGHT_BLUE_PAINTBRUSH;
    public static Item MAGENTA_PAINTBRUSH;
    public static Item ORANGE_PAINTBRUSH;
    public static Item WHITE_PAINTBRUSH;
    public static Item HEAT_GUN;

    public static void init() {
        EARTH_MORTAR = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS), "earth_mortar");

        BLACK_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "black_paint_pot");
        RED_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "red_paint_pot");
        GREEN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "green_paint_pot");
        BROWN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "brown_paint_pot");
        BLUE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "blue_paint_pot");
        PURPLE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "purple_paint_pot");
        CYAN_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "cyan_paint_pot");
        LIGHT_GRAY_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "light_gray_paint_pot");
        GRAY_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "gray_paint_pot");
        PINK_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "pink_paint_pot");
        LIME_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "lime_paint_pot");
        YELLOW_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "yellow_paint_pot");
        LIGHT_BLUE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "light_blue_paint_pot");
        MAGENTA_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "magenta_paint_pot");
        ORANGE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "orange_paint_pot");
        WHITE_PAINT_POT = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(5).durability(5), "white_paint_pot");

        HAMMER = new Hammer(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durabilityIfNotSet(100).durability(100), "hammer");

        WATER_VIALS = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(64).durability(12).durabilityIfNotSet(12), "water_vial");
        DOUBLE_WATER_VIALS = new ItemBase(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(32).durability(24).durabilityIfNotSet(24), "double_water_vial");

        NORMAL_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "normal_paintbrush");

        BLACK_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "black_paintbrush");
        RED_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "red_paintbrush");
        GREEN_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "green_paintbrush");
        BROWN_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "brown_paintbrush");
        BLUE_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "blue_paintbrush");
        PURPLE_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "purple_paintbrush");
        CYAN_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "cyan_paintbrush");
        LIGHT_GRAY_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "light_gray_paintbrush");
        GRAY_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "gray_paintbrush");
        PINK_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "pink_paintbrush");
        LIME_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "lime_paintbrush");
        YELLOW_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "yellow_paintbrush");
        LIGHT_BLUE_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "light_blue_paintbrush");
        MAGENTA_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "magenta_paintbrush");
        ORANGE_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "orange_paintbrush");
        WHITE_PAINTBRUSH = new Paintbrush(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1), "white_paintbrush");

        HEAT_GUN = new HeatGun(new Item.Settings().itemGroup(PaintingMod.MOD_ITEMS).stackSize(1).durability(PaintingMod.config.general.heatGunDurability));
    }
}
