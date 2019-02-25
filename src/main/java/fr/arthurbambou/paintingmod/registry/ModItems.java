package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;

@ObjectHolder(PaintingMod.MODID)
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
    public static Item WATER_VIALS;
    public static Item DOUBLE_WATER_VIALS;
    public static ArrayList<Paintbrush> PAINTBRUSHES;
    public static Item HEAT_GUN;

    public ModItems() {
        EARTH_MORTAR = new EarthMortar();

        BLACK_PAINT_POT = new PaintPot("black_paint_pot");
        RED_PAINT_POT = new PaintPot("red_paint_pot");
        GREEN_PAINT_POT = new PaintPot("green_paint_pot");
        BROWN_PAINT_POT = new PaintPot("brown_paint_pot");
        BLUE_PAINT_POT = new PaintPot("blue_paint_pot");
        PURPLE_PAINT_POT = new PaintPot("purple_paint_pot");
        CYAN_PAINT_POT = new PaintPot("cyan_paint_pot");
        LIGHT_GRAY_PAINT_POT = new PaintPot("light_gray_paint_pot");
        GRAY_PAINT_POT = new PaintPot("gray_paint_pot");
        PINK_PAINT_POT = new PaintPot("pink_paint_pot");
        LIME_PAINT_POT = new PaintPot("lime_paint_pot");
        YELLOW_PAINT_POT = new PaintPot("yellow_paint_pot");
        LIGHT_BLUE_PAINT_POT = new PaintPot("light_blue_paint_pot");
        MAGENTA_PAINT_POT = new PaintPot("magenta_paint_pot");
        ORANGE_PAINT_POT = new PaintPot("orange_paint_pot");
        WHITE_PAINT_POT = new PaintPot("white_paint_pot");

        WATER_VIALS = new ItemBase(new Item.Properties().maxStackSize(64).defaultMaxDamage(12));
        WATER_VIALS.setRegistryName("water_vial");
        DOUBLE_WATER_VIALS = new ItemBase(new Item.Properties().maxStackSize(32).defaultMaxDamage(24));
        DOUBLE_WATER_VIALS.setRegistryName("double_water_vial");

        ArrayList<Paintbrush> list = new ArrayList<>();
        for (Paintbrush.Type type : Paintbrush.Type.values()) {
            list.add(new Paintbrush(type.getName()));
        }
        PAINTBRUSHES = list;

        HEAT_GUN = new HeatGun(new Item.Properties().maxStackSize(1).defaultMaxDamage(100));
    }

    public void onItemRegister(final RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(EARTH_MORTAR);

        registry.register(BLACK_PAINT_POT);
        registry.register(RED_PAINT_POT);
        registry.register(GREEN_PAINT_POT);
        registry.register(BROWN_PAINT_POT);
        registry.register(BLUE_PAINT_POT);
        registry.register(PURPLE_PAINT_POT);
        registry.register(CYAN_PAINT_POT);
        registry.register(LIGHT_GRAY_PAINT_POT);
        registry.register(GRAY_PAINT_POT);
        registry.register(PINK_PAINT_POT);
        registry.register(LIME_PAINT_POT);
        registry.register(YELLOW_PAINT_POT);
        registry.register(LIGHT_BLUE_PAINT_POT);
        registry.register(MAGENTA_PAINT_POT);
        registry.register(ORANGE_PAINT_POT);
        registry.register(WHITE_PAINT_POT);

        registry.register(WATER_VIALS);
        registry.register(DOUBLE_WATER_VIALS);

        for (Paintbrush paintbrush : PAINTBRUSHES) {
            registry.register(paintbrush);
        }

        registry.register(HEAT_GUN);
    }
}
