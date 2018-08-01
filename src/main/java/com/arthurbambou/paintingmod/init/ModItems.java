package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.items.ItemBase;
import com.arthurbambou.paintingmod.items.PaintPot;
import com.arthurbambou.paintingmod.items.Paintbrush;
import com.arthurbambou.paintingmod.items.PaintbrushColored;
import com.arthurbambou.paintingmod.items.WaterVial;
import com.arthurbambou.paintingmod.items.tools.ToolPickaxe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_HAMMER = EnumHelper.addToolMaterial("material_hammer", 2, 400, 6.0F, 3.0F, 10);
	
	//Items
	public static final Item PAINTBRUSH = new Paintbrush("paintbrush", CreativeTabs.MATERIALS);
	public static final Item PAINTBRUSH_COLORED = new PaintbrushColored("paintbrush_colored", CreativeTabs.MATERIALS);
	
	public static final Item EARTH_MORTAR = new ItemBase("earth_mortar", CreativeTabs.MATERIALS);
	
	public static final Item WATER_VIAL = new WaterVial("water_vial", 12, 64, CreativeTabs.MATERIALS);
	public static final Item DOUBLE_WATER_VIAL = new WaterVial("double_water_vial", 24, 32, CreativeTabs.MATERIALS);
	
	public static final Item BLACK_POT = new PaintPot("black_paint_pot", Main.PAINT_POT);
	public static final Item RED_POT = new PaintPot("red_paint_pot", Main.PAINT_POT);
	public static final Item GREEN_POT = new PaintPot("green_paint_pot", Main.PAINT_POT);
	public static final Item BROWN_POT = new PaintPot("brown_paint_pot", Main.PAINT_POT);
	public static final Item BLUE_POT = new PaintPot("blue_paint_pot", Main.PAINT_POT);
	public static final Item PURPLE_POT = new PaintPot("purple_paint_pot", Main.PAINT_POT);
	public static final Item CYAN_POT = new PaintPot("cyan_paint_pot", Main.PAINT_POT);
	public static final Item LIGHT_GRAY_POT = new PaintPot("light_gray_paint_pot", Main.PAINT_POT);
	public static final Item GRAY_POT = new PaintPot("gray_paint_pot", Main.PAINT_POT);
	public static final Item PINK_POT = new PaintPot("pink_paint_pot", Main.PAINT_POT);
	public static final Item LIME_POT = new PaintPot("lime_paint_pot", Main.PAINT_POT);
	public static final Item YELLOW_POT = new PaintPot("yellow_paint_pot", Main.PAINT_POT);
	public static final Item LIGHT_BLUE_POT = new PaintPot("light_blue_paint_pot", Main.PAINT_POT);
	public static final Item MAGENTA_POT = new PaintPot("magenta_paint_pot", Main.PAINT_POT);
	public static final Item ORANGE_POT = new PaintPot("orange_paint_pot", Main.PAINT_POT);
	public static final Item WHITE_POT = new PaintPot("white_paint_pot", Main.PAINT_POT);
	
	
	//Tools
	public static final ItemPickaxe HAMMER = new ToolPickaxe("hammer", MATERIAL_HAMMER);
}
