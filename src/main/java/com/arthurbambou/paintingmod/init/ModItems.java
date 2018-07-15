package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.items.ItemBase;
import com.arthurbambou.paintingmod.items.Paintbrush;
import com.arthurbambou.paintingmod.items.WaterVial;
import com.arthurbambou.paintingmod.items.tools.ToolPickaxe;

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
	public static final Item PAINTBRUSH = new Paintbrush("paintbrush");
	public static final Item EARTH_MORTAR = new ItemBase("earth_mortar");
	public static final Item WATER_VIAL = new WaterVial("water_vial", 12, 64);
	
	//Tools
	public static final ItemPickaxe HAMMER = new ToolPickaxe("hammer", MATERIAL_HAMMER);
}
