package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.items.PTMHeatGun;
import arthurbambou.paintingmod.items.PTMItemBase;
import arthurbambou.paintingmod.items.PTMPaintPot;
import arthurbambou.paintingmod.items.PTMPaintbrush;
import arthurbambou.paintingmod.items.PTMWaterVial;
import arthurbambou.paintingmod.items.tools.PTMToolPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class PTMItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_HAMMER = EnumHelper.addToolMaterial("material_hammer", 2, 400, 6.0F, 3.0F, 10);
	
	//Items
	//Paintbrush
	public static final Item NORMAL_PAINTBRUSH = new PTMPaintbrush("normal_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item BLACK_PAINTBRUSH = new PTMPaintbrush("black_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item RED_PAINTBRUSH = new PTMPaintbrush("red_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item GREEN_PAINTBRUSH = new PTMPaintbrush("green_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item BROWN_PAINTBRUSH = new PTMPaintbrush("brown_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item BLUE_PAINTBRUSH = new PTMPaintbrush("blue_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item PURPLE_PAINTBRUSH = new PTMPaintbrush("purple_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item CYAN_PAINTBRUSH = new PTMPaintbrush("cyan_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item LIGHT_GRAY_PAINTBRUSH = new PTMPaintbrush("light_gray_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item GRAY_PAINTBRUSH = new PTMPaintbrush("gray_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item PINK_PAINTBRUSH = new PTMPaintbrush("pink_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item LIME_PAINTBRUSH = new PTMPaintbrush("lime_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item YELLOW_PAINTBRUSH = new PTMPaintbrush("yellow_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item LIGHT_BLUE_PAINTBRUSH = new PTMPaintbrush("light_blue_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item MAGENTA_PAINTBRUSH = new PTMPaintbrush("magenta_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item ORANGE_PAINTBRUSH = new PTMPaintbrush("orange_paintbrush", PTMMain.PAINTING_MOD);
	public static final Item WHITE_PAINTBRUSH = new PTMPaintbrush("white_paintbrush", PTMMain.PAINTING_MOD);
	
	public static final Item HEAT_GUN = new PTMHeatGun("heat_gun", PTMMain.PAINTING_MOD);
	
	
	//Simple
	public static final Item EARTH_MORTAR = new PTMItemBase("earth_mortar", PTMMain.PAINTING_MOD);
	public static final Item WATER_VIAL = new PTMWaterVial("water_vial", 12, 64, PTMMain.PAINTING_MOD);
	public static final Item DOUBLE_WATER_VIAL = new PTMWaterVial("double_water_vial", 24, 32, PTMMain.PAINTING_MOD);
	
	//Paint pots
	public static final Item BLACK_POT = new PTMPaintPot("black_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item RED_POT = new PTMPaintPot("red_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item GREEN_POT = new PTMPaintPot("green_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item BROWN_POT = new PTMPaintPot("brown_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item BLUE_POT = new PTMPaintPot("blue_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item PURPLE_POT = new PTMPaintPot("purple_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item CYAN_POT = new PTMPaintPot("cyan_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item LIGHT_GRAY_POT = new PTMPaintPot("light_gray_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item GRAY_POT = new PTMPaintPot("gray_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item PINK_POT = new PTMPaintPot("pink_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item LIME_POT = new PTMPaintPot("lime_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item YELLOW_POT = new PTMPaintPot("yellow_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item LIGHT_BLUE_POT = new PTMPaintPot("light_blue_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item MAGENTA_POT = new PTMPaintPot("magenta_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item ORANGE_POT = new PTMPaintPot("orange_paint_pot", PTMMain.PAINTING_MOD);
	public static final Item WHITE_POT = new PTMPaintPot("white_paint_pot", PTMMain.PAINTING_MOD);
	
	
	//Tools
	public static final ItemPickaxe HAMMER = new PTMToolPickaxe("hammer", MATERIAL_HAMMER);
}
