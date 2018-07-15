package com.arthurbambou.paintingmod.items;

public class WaterVial extends ItemBase {
	
	public WaterVial(String name, int damage, int stack) {
		super(name);
		
		setMaxDamage(damage);
		setMaxStackSize(stack);
	}
}
