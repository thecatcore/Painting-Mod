package com.arthurbambou.myfirstminecraftmod.items;

import com.arthurbambou.myfirstminecraftmod.Main;
import com.arthurbambou.myfirstminecraftmod.init.ModItems;
import com.arthurbambou.myfirstminecraftmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
