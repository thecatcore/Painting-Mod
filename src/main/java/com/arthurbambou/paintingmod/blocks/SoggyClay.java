package com.arthurbambou.paintingmod.blocks;

import java.util.Random;

import com.arthurbambou.paintingmod.init.ModBlocks;
import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

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
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.EARTH_MORTAR;
    }

    @Override
    public int quantityDropped(Random random){
    	int amount = 0;
    	amount = 2 + random.nextInt(2);
        return amount; 
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random){
        if(fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune)){
            int i = random.nextInt(fortune + 2) - 1;

            if(i < 1){
                i = 1;
            }
            return this.quantityDropped(random) * (i);
        } else {
            return this.quantityDropped(random);
        }
    }

}
