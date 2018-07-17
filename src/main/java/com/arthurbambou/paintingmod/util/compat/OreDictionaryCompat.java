package com.arthurbambou.paintingmod.util.compat;

import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	
	public static void registerOres() {
		
		OreDictionary.registerOre("bottlewater", new ItemStack(ModItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE));
	}
}
