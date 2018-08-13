package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.Main;
import arthurbambou.paintingmod.items.ItemBase;
import arthurbambou.paintingmod.items.PaintPot;
import arthurbambou.paintingmod.items.Paintbrush;
import arthurbambou.paintingmod.items.WaterVial;
import arthurbambou.paintingmod.items.tools.ToolPickaxe;
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
	//Paintbrush
	public static final Item NORMAL_PAINTBRUSH = new Paintbrush("normal_paintbrush", Main.PAINTING_MOD);
	public static final Item BLACK_PAINTBRUSH = new Paintbrush("black_paintbrush", Main.PAINTING_MOD);
	public static final Item RED_PAINTBRUSH = new Paintbrush("red_paintbrush", Main.PAINTING_MOD);
	public static final Item GREEN_PAINTBRUSH = new Paintbrush("green_paintbrush", Main.PAINTING_MOD);
	public static final Item BROWN_PAINTBRUSH = new Paintbrush("brown_paintbrush", Main.PAINTING_MOD);
	public static final Item BLUE_PAINTBRUSH = new Paintbrush("blue_paintbrush", Main.PAINTING_MOD);
	public static final Item PURPLE_PAINTBRUSH = new Paintbrush("purple_paintbrush", Main.PAINTING_MOD);
	public static final Item CYAN_PAINTBRUSH = new Paintbrush("cyan_paintbrush", Main.PAINTING_MOD);
	public static final Item LIGHT_GRAY_PAINTBRUSH = new Paintbrush("light_gray_paintbrush", Main.PAINTING_MOD);
	public static final Item GRAY_PAINTBRUSH = new Paintbrush("gray_paintbrush", Main.PAINTING_MOD);
	public static final Item PINK_PAINTBRUSH = new Paintbrush("pink_paintbrush", Main.PAINTING_MOD);
	public static final Item LIME_PAINTBRUSH = new Paintbrush("lime_paintbrush", Main.PAINTING_MOD);
	public static final Item YELLOW_PAINTBRUSH = new Paintbrush("yellow_paintbrush", Main.PAINTING_MOD);
	public static final Item LIGHT_BLUE_PAINTBRUSH = new Paintbrush("light_blue_paintbrush", Main.PAINTING_MOD);
	public static final Item MAGENTA_PAINTBRUSH = new Paintbrush("magenta_paintbrush", Main.PAINTING_MOD);
	public static final Item ORANGE_PAINTBRUSH = new Paintbrush("orange_paintbrush", Main.PAINTING_MOD);
	public static final Item WHITE_PAINTBRUSH = new Paintbrush("white_paintbrush", Main.PAINTING_MOD);
	
	
	//Simple
	public static final Item EARTH_MORTAR = new ItemBase("earth_mortar", Main.PAINTING_MOD);
	public static final Item WATER_VIAL = new WaterVial("water_vial", 12, 64, Main.PAINTING_MOD);
	public static final Item DOUBLE_WATER_VIAL = new WaterVial("double_water_vial", 24, 32, Main.PAINTING_MOD);
	
	//Paint pots
	public static final Item BLACK_POT = new PaintPot("black_paint_pot", Main.PAINTING_MOD);
	public static final Item RED_POT = new PaintPot("red_paint_pot", Main.PAINTING_MOD);
	public static final Item GREEN_POT = new PaintPot("green_paint_pot", Main.PAINTING_MOD);
	public static final Item BROWN_POT = new PaintPot("brown_paint_pot", Main.PAINTING_MOD);
	public static final Item BLUE_POT = new PaintPot("blue_paint_pot", Main.PAINTING_MOD);
	public static final Item PURPLE_POT = new PaintPot("purple_paint_pot", Main.PAINTING_MOD);
	public static final Item CYAN_POT = new PaintPot("cyan_paint_pot", Main.PAINTING_MOD);
	public static final Item LIGHT_GRAY_POT = new PaintPot("light_gray_paint_pot", Main.PAINTING_MOD);
	public static final Item GRAY_POT = new PaintPot("gray_paint_pot", Main.PAINTING_MOD);
	public static final Item PINK_POT = new PaintPot("pink_paint_pot", Main.PAINTING_MOD);
	public static final Item LIME_POT = new PaintPot("lime_paint_pot", Main.PAINTING_MOD);
	public static final Item YELLOW_POT = new PaintPot("yellow_paint_pot", Main.PAINTING_MOD);
	public static final Item LIGHT_BLUE_POT = new PaintPot("light_blue_paint_pot", Main.PAINTING_MOD);
	public static final Item MAGENTA_POT = new PaintPot("magenta_paint_pot", Main.PAINTING_MOD);
	public static final Item ORANGE_POT = new PaintPot("orange_paint_pot", Main.PAINTING_MOD);
	public static final Item WHITE_POT = new PaintPot("white_paint_pot", Main.PAINTING_MOD);
	
	
	//Tools
	public static final ItemPickaxe HAMMER = new ToolPickaxe("hammer", MATERIAL_HAMMER);
}
