package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.items.ItemBase;
import com.arthurbambou.paintingmod.items.Paintbrush;

import net.minecraft.item.Item;

public class ModItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item PAINTBRUSH = new Paintbrush("paintbrush");
	public static final Item EARTH_MORTAR = new ItemBase("earth_mortar");
}
