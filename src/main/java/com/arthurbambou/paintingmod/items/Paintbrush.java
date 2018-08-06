package com.arthurbambou.paintingmod.items;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.init.ModBlocks;
import com.arthurbambou.paintingmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Paintbrush extends ItemBase {

	public Paintbrush(String string, CreativeTabs materials) {
		super(string, materials);
		setMaxDamage(0);
		setMaxStackSize(1);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		newbloctopaint(player, worldIn, pos, Blocks.PLANKS, ModBlocks.BLACK_PLANK, 
				ModBlocks.RED_PLANK, ModBlocks.GREEN_PLANK, ModBlocks.BROWN_PLANK, ModBlocks.BLUE_PLANK,
				ModBlocks.PURPLE_PLANK, ModBlocks.CYAN_PLANK, ModBlocks.LIGHT_GRAY_PLANK, ModBlocks.GRAY_PLANK, 
				ModBlocks.PINK_PLANK, ModBlocks.LIME_PLANK, ModBlocks.YELLOW_PLANK, ModBlocks.LIGHT_BLUE_PLANK,
				ModBlocks.MAGENTA_PLANK, ModBlocks.ORANGE_PLANK, ModBlocks.WHITE_PLANK);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_STONE, 
				ModBlocks.RED_STONE, ModBlocks.GREEN_STONE, ModBlocks.BROWN_STONE, ModBlocks.BLUE_STONE,
				ModBlocks.PURPLE_STONE, ModBlocks.CYAN_STONE, ModBlocks.LIGHT_GRAY_STONE, ModBlocks.GRAY_STONE, 
				ModBlocks.PINK_STONE, ModBlocks.LIME_STONE, ModBlocks.YELLOW_STONE, ModBlocks.LIGHT_BLUE_STONE,
				ModBlocks.MAGENTA_STONE, ModBlocks.ORANGE_STONE, ModBlocks.WHITE_STONE, 0);
		return EnumActionResult.SUCCESS;
	}
	
	public void newbloctopaint(EntityPlayer player, World worldIn, BlockPos pos,
			Block topaint, Block black, Block red, Block green, Block brown, Block blue,
			Block purple, Block cyan, Block lightgray, Block gray, Block pink,
			Block lime, Block yellow, Block lightblue, Block magenta, Block orange, Block white) {
		if (player.getHeldItemMainhand().getItem() == ModItems.NORMAL_PAINTBRUSH) {
			
		} else {
		if (worldIn.getBlockState(pos).getBlock() == topaint) {
			black(player, worldIn, pos, black);
			red(player, worldIn, pos, red);
			green(player, worldIn, pos, green);
			brown(player, worldIn, pos, brown);
			blue(player, worldIn, pos, blue);
			purple(player, worldIn, pos, purple);
			cyan(player, worldIn, pos, cyan);
			lightGray(player, worldIn, pos, lightgray);
			gray(player, worldIn, pos, gray);
			pink(player, worldIn, pos, pink);
			lime(player, worldIn, pos, lime);
			yellow(player, worldIn, pos, yellow);
			lightBlue(player, worldIn, pos, lightblue);
			magenta(player, worldIn, pos, magenta);
			orange(player, worldIn, pos, orange);
			white(player, worldIn, pos, white);
		}
		}
		
	}
	
	public void newbloctopaint(EntityPlayer player, World worldIn, BlockPos pos,
			Block topaint, Block black, Block red, Block green, Block brown, Block blue,
			Block purple, Block cyan, Block lightgray, Block gray, Block pink,
			Block lime, Block yellow, Block lightblue, Block magenta, Block orange, Block white, int meta) {
		if (player.getHeldItemMainhand().getItem() == ModItems.NORMAL_PAINTBRUSH) {
			
		} else {
		if (worldIn.getBlockState(pos).getBlock() == topaint && worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == meta) {
			black(player, worldIn, pos, black);
			red(player, worldIn, pos, red);
			green(player, worldIn, pos, green);
			brown(player, worldIn, pos, brown);
			blue(player, worldIn, pos, blue);
			purple(player, worldIn, pos, purple);
			cyan(player, worldIn, pos, cyan);
			lightGray(player, worldIn, pos, lightgray);
			gray(player, worldIn, pos, gray);
			pink(player, worldIn, pos, pink);
			lime(player, worldIn, pos, lime);
			yellow(player, worldIn, pos, yellow);
			lightBlue(player, worldIn, pos, lightblue);
			magenta(player, worldIn, pos, magenta);
			orange(player, worldIn, pos, orange);
			white(player, worldIn, pos, white);
		}
		}
	}
	
	public void usedpaintbrush (EntityPlayer player) {
		player.getHeldItemMainhand().shrink(1);
		player.inventory.addItemStackToInventory(new ItemStack(ModItems.NORMAL_PAINTBRUSH));
	}
	
	public void black (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.BLACK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void red (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.RED_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void green (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.GREEN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void brown (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.BROWN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void blue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void purple (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.PURPLE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void cyan (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.CYAN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightGray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void gray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void pink (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.PINK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lime (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.LIME_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void yellow (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.YELLOW_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightBlue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void magenta (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.MAGENTA_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void orange (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.ORANGE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void white (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == ModItems.WHITE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
}
