package com.arthurbambou.paintingmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WaterVial extends ItemBase {
	int stack = 1;
	public WaterVial(String name, int damage, int stack, CreativeTabs materials) {
		super(name, materials);
		
		setMaxDamage(damage);
		setMaxStackSize(stack);
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack){
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(this, 1, 1);
    }
}
