package com.arthurbambou.paintingmod.items.tools;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.init.ModItems;
import com.arthurbambou.paintingmod.util.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.PAINTING_MOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
