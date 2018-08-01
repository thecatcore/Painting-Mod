package com.arthurbambou.paintingmod.items;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class PaintbrushColored extends ItemBase
{
	String dname = "";
	public PaintbrushColored(String name, CreativeTabs materials) {
		super(name, materials);
		setHasSubtypes(true);
		setMaxDamage(0);
		setMaxStackSize(1);
		dname = name;
	}

	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
        	int a = 0;
        	for(a = 0; a <= 15; a++) {
            items.add(new ItemStack(this, 1, a));
        	}
        }
    }
	
	public String getUnlocalizedName(ItemStack stack) {
		int metadata = stack.getMetadata();
		
		return super.getUnlocalizedName() + "." + EnumDyeColor.byDyeDamage(metadata);
	}

}
