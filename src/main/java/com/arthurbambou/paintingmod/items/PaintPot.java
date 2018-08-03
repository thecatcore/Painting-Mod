package com.arthurbambou.paintingmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PaintPot extends ItemBase
{

	public PaintPot(String name, CreativeTabs tab) {
		super(name, tab);
		
		setMaxDamage(5);
		setMaxStackSize(1);
		setNoRepair();
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack){
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
    	int dam = itemStack.getItemDamage() + 1;
        return new ItemStack(this, 1, dam);
    }

}
