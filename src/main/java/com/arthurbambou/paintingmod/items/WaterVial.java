package com.arthurbambou.paintingmod.items;

public class WaterVial extends ItemBase {
	public WaterVial(String name, int damage, int stack, CreativeTabs materials) {
		super(name, materials);
		
		setMaxDamage(damage);
		setMaxStackSize(stack);
	}
}
