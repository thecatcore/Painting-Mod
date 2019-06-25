package fr.arthurbambou.paintingmod.mainmod.registery;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.items.Hammer;
import fr.arthurbambou.paintingmod.mainmod.items.HeatGun;
import fr.arthurbambou.paintingmod.mainmod.items.ItemBase;
import fr.arthurbambou.paintingmod.mainmod.items.Paintbrush;
import net.minecraft.item.Item;

import java.util.ArrayList;

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
    public static ArrayList<Paintbrush> PAINTBRUSHES = new ArrayList<>();
    public static Item HEAT_GUN;

    public static void init() {
        EARTH_MORTAR = new ItemBase(new Item.Settings().group(PaintingMod.MOD_ITEMS), "earth_mortar");

        Item.Settings settings = new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(1).maxDamage(5);

        BLACK_PAINT_POT = new ItemBase(settings, "black_paint_pot");
        RED_PAINT_POT = new ItemBase(settings, "red_paint_pot");
        GREEN_PAINT_POT = new ItemBase(settings, "green_paint_pot");
        BROWN_PAINT_POT = new ItemBase(settings, "brown_paint_pot");
        BLUE_PAINT_POT = new ItemBase(settings, "blue_paint_pot");
        PURPLE_PAINT_POT = new ItemBase(settings, "purple_paint_pot");
        CYAN_PAINT_POT = new ItemBase(settings, "cyan_paint_pot");
        LIGHT_GRAY_PAINT_POT = new ItemBase(settings, "light_gray_paint_pot");
        GRAY_PAINT_POT = new ItemBase(settings, "gray_paint_pot");
        PINK_PAINT_POT = new ItemBase(settings, "pink_paint_pot");
        LIME_PAINT_POT = new ItemBase(settings, "lime_paint_pot");
        YELLOW_PAINT_POT = new ItemBase(settings, "yellow_paint_pot");
        LIGHT_BLUE_PAINT_POT = new ItemBase(settings, "light_blue_paint_pot");
        MAGENTA_PAINT_POT = new ItemBase(settings, "magenta_paint_pot");
        ORANGE_PAINT_POT = new ItemBase(settings, "orange_paint_pot");
        WHITE_PAINT_POT = new ItemBase(settings, "white_paint_pot");

        HAMMER = new Hammer(new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(1).maxDamage(100), "hammer");

        WATER_VIALS = new ItemBase(new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(64).maxDamage(12), "water_vial");
        DOUBLE_WATER_VIALS = new ItemBase(new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(32).maxDamage(24), "double_water_vial");

        Item.Settings brush_settings = new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(1);

        NORMAL_PAINTBRUSH = new Paintbrush(brush_settings, "normal_paintbrush");

        BLACK_PAINTBRUSH = new Paintbrush(brush_settings, "black_paintbrush");
        RED_PAINTBRUSH = new Paintbrush(brush_settings, "red_paintbrush");
        GREEN_PAINTBRUSH = new Paintbrush(brush_settings, "green_paintbrush");
        BROWN_PAINTBRUSH = new Paintbrush(brush_settings, "brown_paintbrush");
        BLUE_PAINTBRUSH = new Paintbrush(brush_settings, "blue_paintbrush");
        PURPLE_PAINTBRUSH = new Paintbrush(brush_settings, "purple_paintbrush");
        CYAN_PAINTBRUSH = new Paintbrush(brush_settings, "cyan_paintbrush");
        LIGHT_GRAY_PAINTBRUSH = new Paintbrush(brush_settings, "light_gray_paintbrush");
        GRAY_PAINTBRUSH = new Paintbrush(brush_settings, "gray_paintbrush");
        PINK_PAINTBRUSH = new Paintbrush(brush_settings, "pink_paintbrush");
        LIME_PAINTBRUSH = new Paintbrush(brush_settings, "lime_paintbrush");
        YELLOW_PAINTBRUSH = new Paintbrush(brush_settings, "yellow_paintbrush");
        LIGHT_BLUE_PAINTBRUSH = new Paintbrush(brush_settings, "light_blue_paintbrush");
        MAGENTA_PAINTBRUSH = new Paintbrush(brush_settings, "magenta_paintbrush");
        ORANGE_PAINTBRUSH = new Paintbrush(brush_settings, "orange_paintbrush");
        WHITE_PAINTBRUSH = new Paintbrush(brush_settings, "white_paintbrush");

        HEAT_GUN = new HeatGun(new Item.Settings().group(PaintingMod.MOD_ITEMS).maxCount(1).maxDamage(PaintingMod.config.general.heatGunDurability));
    }
}
