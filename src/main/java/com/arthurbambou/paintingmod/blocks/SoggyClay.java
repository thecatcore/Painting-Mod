package com.arthurbambou.paintingmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SoggyClay extends BlockBase
{

	public SoggyClay(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.SAND);
		setHardness(0.6F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
