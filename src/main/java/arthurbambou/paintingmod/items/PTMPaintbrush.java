package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMPaintbrush extends PTMItemBase {

	public PTMPaintbrush(String string, CreativeTabs materials) {
		super(string, materials);
		setMaxDamage(0);
		setMaxStackSize(1);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		for (ColoredBlock coloredblock: AddPaintbrush.getSIMPLECOLOREDBLOCKS()) {
			//PTMMain.logger.info("Tested Block : " + coloredblock.name + " /origin : " + coloredblock.replace.getRegistryName() + " /pointé : " + worldIn.getBlockState(pos).getBlock().getRegistryName());
			newbloctopaint(player, worldIn, pos, coloredblock.replace, coloredblock);
		}

		for (ColoredBlock coloredBlock: AddPaintbrush.getCOMPLEXCOLOREDBLOCKS()) {

		}
		
		for (Block block : AddPaintbrush.getSimplecoloredblockmeta()) {
			newbloctopaintmeta(player,worldIn,pos,block);
		}
//		newbloctopaint(player, worldIn, pos, Blocks.SANDSTONE, PTMBlocks.BLACK_CHISELED_SANDSTONE, PTMBlocks.RED_CHISELED_SANDSTONE, PTMBlocks.GREEN_CHISELED_SANDSTONE, PTMBlocks.BROWN_CHISELED_SANDSTONE, PTMBlocks.BLUE_CHISELED_SANDSTONE, PTMBlocks.PURPLE_CHISELED_SANDSTONE, PTMBlocks.CYAN_CHISELED_SANDSTONE, PTMBlocks.LIGHT_GRAY_CHISELED_SANDSTONE, PTMBlocks.GRAY_CHISELED_SANDSTONE, PTMBlocks.PINK_CHISELED_SANDSTONE, PTMBlocks.LIME_CHISELED_SANDSTONE, PTMBlocks.YELLOW_CHISELED_SANDSTONE, PTMBlocks.LIGHT_BLUE_CHISELED_SANDSTONE, PTMBlocks.MAGENTA_CHISELED_SANDSTONE, PTMBlocks.ORANGE_CHISELED_SANDSTONE, PTMBlocks.WHITE_CHISELED_SANDSTONE, 1);
//		newbloctopaint(player, worldIn, pos, Blocks.SANDSTONE, PTMBlocks.BLACK_SMOOTH_SANDSTONE, PTMBlocks.RED_SMOOTH_SANDSTONE, PTMBlocks.GREEN_SMOOTH_SANDSTONE, PTMBlocks.BROWN_SMOOTH_SANDSTONE, PTMBlocks.BLUE_SMOOTH_SANDSTONE, PTMBlocks.PURPLE_SMOOTH_SANDSTONE, PTMBlocks.CYAN_SMOOTH_SANDSTONE, PTMBlocks.LIGHT_GRAY_SMOOTH_SANDSTONE, PTMBlocks.GRAY_SMOOTH_SANDSTONE, PTMBlocks.PINK_SMOOTH_SANDSTONE, PTMBlocks.LIME_SMOOTH_SANDSTONE, PTMBlocks.YELLOW_SMOOTH_SANDSTONE, PTMBlocks.LIGHT_BLUE_SMOOTH_SANDSTONE, PTMBlocks.MAGENTA_SMOOTH_SANDSTONE, PTMBlocks.ORANGE_SMOOTH_SANDSTONE, PTMBlocks.WHITE_SMOOTH_SANDSTONE, 2);
		return EnumActionResult.SUCCESS;
	}

	private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, Block block) {
	}

	public void newbloctopaint(EntityPlayer player, World worldIn, BlockPos pos,
			Block topaint, ColoredBlock coloredblock) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.NORMAL_PAINTBRUSH) {
			
		} else {
			if (coloredblock.metab) {
				if (worldIn.getBlockState(pos).getBlock() == topaint && worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == coloredblock.meta) {
					black(player, worldIn, pos, coloredblock.black);
					red(player, worldIn, pos, coloredblock.red);
					green(player, worldIn, pos, coloredblock.green);
					brown(player, worldIn, pos, coloredblock.brown);
					blue(player, worldIn, pos, coloredblock.blue);
					purple(player, worldIn, pos, coloredblock.purple);
					cyan(player, worldIn, pos, coloredblock.cyan);
					lightGray(player, worldIn, pos, coloredblock.lightgray);
					gray(player, worldIn, pos, coloredblock.gray);
					pink(player, worldIn, pos, coloredblock.pink);
					lime(player, worldIn, pos, coloredblock.lime);
					yellow(player, worldIn, pos, coloredblock.yellow);
					lightBlue(player, worldIn, pos, coloredblock.lightblue);
					magenta(player, worldIn, pos, coloredblock.magenta);
					orange(player, worldIn, pos, coloredblock.orange);
					white(player, worldIn, pos, coloredblock.white);
				}
			} else {
				if (worldIn.getBlockState(pos).getBlock() == topaint) {
					black(player, worldIn, pos, coloredblock.black);
					red(player, worldIn, pos, coloredblock.red);
					green(player, worldIn, pos, coloredblock.green);
					brown(player, worldIn, pos, coloredblock.brown);
					blue(player, worldIn, pos, coloredblock.blue);
					purple(player, worldIn, pos, coloredblock.purple);
					cyan(player, worldIn, pos, coloredblock.cyan);
					lightGray(player, worldIn, pos, coloredblock.lightgray);
					gray(player, worldIn, pos, coloredblock.gray);
					pink(player, worldIn, pos, coloredblock.pink);
					lime(player, worldIn, pos, coloredblock.lime);
					yellow(player, worldIn, pos, coloredblock.yellow);
					lightBlue(player, worldIn, pos, coloredblock.lightblue);
					magenta(player, worldIn, pos, coloredblock.magenta);
					orange(player, worldIn, pos, coloredblock.orange);
					white(player, worldIn, pos, coloredblock.white);
				}
			}
		}
		
	}
	
	public void usedpaintbrush (EntityPlayer player) {
		player.getHeldItemMainhand().shrink(1);
		player.inventory.addItemStackToInventory(new ItemStack(PTMItems.NORMAL_PAINTBRUSH));
	}
	
	public void black (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BLACK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void red (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.RED_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void green (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.GREEN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void brown (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BROWN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void blue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void purple (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.PURPLE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void cyan (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.CYAN_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightGray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIGHT_GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void gray (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.GRAY_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void pink (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.PINK_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lime (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIME_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void yellow (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.YELLOW_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void lightBlue (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.LIGHT_BLUE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void magenta (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.MAGENTA_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void orange (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.ORANGE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
	
	public void white (EntityPlayer player, World worldIn, BlockPos pos, Block item) {
		if (player.getHeldItemMainhand().getItem() == PTMItems.WHITE_PAINTBRUSH) {
			worldIn.setBlockState(pos, item.getDefaultState());
			usedpaintbrush(player);
		}
	}
}
