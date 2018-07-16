package com.arthurbambou.paintingmod.items;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;

public class Paintbrush extends ItemBase
{

	public Paintbrush(String name, CreativeTabs materials) {
		super(name, materials);
		
		setMaxDamage(100);
		setMaxStackSize(1);
		setNoRepair();
	}

}
