package com.arthurbambou.paintingmod.tabs;

import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PaintPotTab extends CreativeTabs
{
	public PaintPotTab(String label) {
		super(label);
		//this.setBackgroundImageName("tutorial.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.NORMAL_PAINTBRUSH);
	}
}
