package com.arthurbambou.paintingmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WaterVial extends ItemBase {
	public WaterVial(String name, int damage, int stack, CreativeTabs materials) {
		super(name, materials);
		
		setMaxDamage(damage);
		setMaxStackSize(stack);
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
