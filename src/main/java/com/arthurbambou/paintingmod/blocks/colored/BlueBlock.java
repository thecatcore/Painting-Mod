package com.arthurbambou.paintingmod.blocks.colored;

import java.util.Random;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.blocks.BlockBase;
import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlueBlock extends BlockBase
{

	public BlueBlock(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super(material, Main.PAINTING_MOD);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
		setRegistryName("blue_" + name);
	}
	
	@Override
	public Block setUnlocalizedName(String name) {
		// TODO Auto-generated method stub
		return this.setUnlocalizedName("blue_" + name);
	}
}
