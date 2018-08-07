package com.arthurbambou.paintingmod.items;

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
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_GRANITE, 
				ModBlocks.RED_GRANITE, ModBlocks.GREEN_GRANITE, ModBlocks.BROWN_GRANITE, ModBlocks.BLUE_GRANITE,
				ModBlocks.PURPLE_GRANITE, ModBlocks.CYAN_GRANITE, ModBlocks.LIGHT_GRAY_GRANITE, ModBlocks.GRAY_GRANITE, 
				ModBlocks.PINK_GRANITE, ModBlocks.LIME_GRANITE, ModBlocks.YELLOW_GRANITE, ModBlocks.LIGHT_BLUE_GRANITE,
				ModBlocks.MAGENTA_GRANITE, ModBlocks.ORANGE_GRANITE, ModBlocks.WHITE_GRANITE, 1);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_POLISHED_GRANITE, 
				ModBlocks.RED_POLISHED_GRANITE, ModBlocks.GREEN_POLISHED_GRANITE, ModBlocks.BROWN_POLISHED_GRANITE, ModBlocks.BLUE_POLISHED_GRANITE,
				ModBlocks.PURPLE_POLISHED_GRANITE, ModBlocks.CYAN_POLISHED_GRANITE, ModBlocks.LIGHT_GRAY_POLISHED_GRANITE, ModBlocks.GRAY_POLISHED_GRANITE, 
				ModBlocks.PINK_POLISHED_GRANITE, ModBlocks.LIME_POLISHED_GRANITE, ModBlocks.YELLOW_POLISHED_GRANITE, ModBlocks.LIGHT_BLUE_POLISHED_GRANITE,
				ModBlocks.MAGENTA_POLISHED_GRANITE, ModBlocks.ORANGE_POLISHED_GRANITE, ModBlocks.WHITE_POLISHED_GRANITE, 2);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_DIORITE, ModBlocks.RED_DIORITE, ModBlocks.GREEN_DIORITE, ModBlocks.BROWN_DIORITE, ModBlocks.BLUE_DIORITE, ModBlocks.PURPLE_DIORITE, ModBlocks.CYAN_DIORITE, ModBlocks.LIGHT_GRAY_DIORITE, ModBlocks.GRAY_DIORITE, ModBlocks.PINK_DIORITE, ModBlocks.LIME_DIORITE, ModBlocks.YELLOW_DIORITE, ModBlocks.LIGHT_BLUE_DIORITE, ModBlocks.MAGENTA_DIORITE, ModBlocks.ORANGE_DIORITE, ModBlocks.WHITE_DIORITE, 3);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_POLISHED_DIORITE, ModBlocks.RED_POLISHED_DIORITE, ModBlocks.GREEN_POLISHED_DIORITE, ModBlocks.BROWN_POLISHED_DIORITE, ModBlocks.BLUE_POLISHED_DIORITE, ModBlocks.PURPLE_POLISHED_DIORITE, ModBlocks.CYAN_POLISHED_DIORITE, ModBlocks.LIGHT_GRAY_POLISHED_DIORITE, ModBlocks.GRAY_POLISHED_DIORITE, ModBlocks.PINK_POLISHED_DIORITE, ModBlocks.LIME_POLISHED_DIORITE, ModBlocks.YELLOW_POLISHED_DIORITE, ModBlocks.LIGHT_BLUE_POLISHED_DIORITE, ModBlocks.MAGENTA_POLISHED_DIORITE, ModBlocks.ORANGE_POLISHED_DIORITE, ModBlocks.WHITE_POLISHED_DIORITE, 4);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_ANDESITE, ModBlocks.RED_ANDESITE, ModBlocks.GREEN_ANDESITE, ModBlocks.BROWN_ANDESITE, ModBlocks.BLUE_ANDESITE, ModBlocks.PURPLE_ANDESITE, ModBlocks.CYAN_ANDESITE, ModBlocks.LIGHT_GRAY_ANDESITE, ModBlocks.GRAY_ANDESITE, ModBlocks.PINK_ANDESITE, ModBlocks.LIME_ANDESITE, ModBlocks.YELLOW_ANDESITE, ModBlocks.LIGHT_BLUE_ANDESITE, ModBlocks.MAGENTA_ANDESITE, ModBlocks.ORANGE_ANDESITE, ModBlocks.WHITE_ANDESITE, 5);
		newbloctopaint(player, worldIn, pos, Blocks.STONE, ModBlocks.BLACK_POLISHED_ANDESITE, ModBlocks.RED_POLISHED_ANDESITE, ModBlocks.GREEN_POLISHED_ANDESITE, ModBlocks.BROWN_POLISHED_ANDESITE, ModBlocks.BLUE_POLISHED_ANDESITE, ModBlocks.PURPLE_POLISHED_ANDESITE, ModBlocks.CYAN_POLISHED_ANDESITE, ModBlocks.LIGHT_GRAY_POLISHED_ANDESITE, ModBlocks.GRAY_POLISHED_ANDESITE, ModBlocks.PINK_POLISHED_ANDESITE, ModBlocks.LIME_POLISHED_ANDESITE, ModBlocks.YELLOW_POLISHED_ANDESITE, ModBlocks.LIGHT_BLUE_POLISHED_ANDESITE, ModBlocks.MAGENTA_POLISHED_ANDESITE, ModBlocks.ORANGE_POLISHED_ANDESITE, ModBlocks.WHITE_POLISHED_ANDESITE, 6);
		newbloctopaint(player, worldIn, pos, Blocks.DIRT, ModBlocks.BLACK_DIRT, ModBlocks.RED_DIRT, ModBlocks.GREEN_DIRT, ModBlocks.BROWN_DIRT, ModBlocks.BLUE_DIRT, ModBlocks.PURPLE_DIRT, ModBlocks.CYAN_DIRT, ModBlocks.LIGHT_GRAY_DIRT, ModBlocks.GRAY_DIRT, ModBlocks.PINK_DIRT, ModBlocks.LIME_DIRT, ModBlocks.YELLOW_DIRT, ModBlocks.LIGHT_BLUE_DIRT, ModBlocks.MAGENTA_DIRT, ModBlocks.ORANGE_DIRT, ModBlocks.WHITE_DIRT, 0);
		newbloctopaint(player, worldIn, pos, Blocks.DIRT, ModBlocks.BLACK_COARSE_DIRT, ModBlocks.RED_COARSE_DIRT, ModBlocks.GREEN_COARSE_DIRT, ModBlocks.BROWN_COARSE_DIRT, ModBlocks.BLUE_COARSE_DIRT, ModBlocks.PURPLE_COARSE_DIRT, ModBlocks.CYAN_COARSE_DIRT, ModBlocks.LIGHT_GRAY_COARSE_DIRT, ModBlocks.GRAY_COARSE_DIRT, ModBlocks.PINK_COARSE_DIRT, ModBlocks.LIME_COARSE_DIRT, ModBlocks.YELLOW_COARSE_DIRT, ModBlocks.LIGHT_BLUE_COARSE_DIRT, ModBlocks.MAGENTA_COARSE_DIRT, ModBlocks.ORANGE_COARSE_DIRT, ModBlocks.WHITE_COARSE_DIRT, 1);
		newbloctopaint(player, worldIn, pos, Blocks.COBBLESTONE, ModBlocks.BLACK_COBBLESTONE, ModBlocks.RED_COBBLESTONE, ModBlocks.GREEN_COBBLESTONE, ModBlocks.BROWN_COBBLESTONE, ModBlocks.BLUE_COBBLESTONE, ModBlocks.PURPLE_COBBLESTONE, ModBlocks.CYAN_COBBLESTONE, ModBlocks.LIGHT_GRAY_COBBLESTONE, ModBlocks.GRAY_COBBLESTONE, ModBlocks.PINK_COBBLESTONE, ModBlocks.LIME_COBBLESTONE, ModBlocks.YELLOW_COBBLESTONE, ModBlocks.LIGHT_BLUE_COBBLESTONE, ModBlocks.MAGENTA_COBBLESTONE, ModBlocks.ORANGE_COBBLESTONE, ModBlocks.WHITE_COBBLESTONE);
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
