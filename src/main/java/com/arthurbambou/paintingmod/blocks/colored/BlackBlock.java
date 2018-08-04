package com.arthurbambou.paintingmod.blocks.colored;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.blocks.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlackBlock extends BlockBase
{

	public BlackBlock(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super("black_" + name, material, Main.PAINTING_MOD);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
	}
}
