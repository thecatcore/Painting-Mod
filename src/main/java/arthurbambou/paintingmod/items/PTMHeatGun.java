package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.ColoredFallingBlockMeta;
import arthurbambou.paintingmod.blocks.ColoredBlockMetaSlime;
import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMHeatGun extends PTMItemBase {

	public PTMHeatGun(String name, CreativeTabs tab) {
		super(name, tab);
		setMaxDamage(100);
		setMaxStackSize(1);
		PTMItems.ITEMS_META.add(this);
	}
	
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		for (ColoredBlock coloredblock: AddPaintbrush.getSIMPLECOLOREDBLOCKS()) {
			heatgun(player, worldIn, pos, coloredblock.replace, coloredblock);
		}
		for (ColoredBlockMeta coloredBlockMeta : AddPaintbrush.getSimplecoloredblockmeta()) {
		    heatgunmeta(player,worldIn,pos,coloredBlockMeta);
        }
        for (ColoredFallingBlockMeta blockMeta : AddPaintbrush.getSIMPLECOLOREDFALLINGBLOCKMETA()) {
        	heatgunmeta(player,worldIn,pos,blockMeta);
		}
		for (ColoredBlockMetaSlime blockMetaSlime : AddPaintbrush.getColoredBlockMetaSlimes()) {
			heatgunmeta(player,worldIn,pos,blockMetaSlime);
		}
		return EnumActionResult.SUCCESS;
	}

	private void heatgunmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMeta coloredBlockMeta) {
		if (worldIn.getBlockState(pos).getBlock() == coloredBlockMeta) {
			if (coloredBlockMeta.getReplacemeta() == -1) {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getDefaultState());
			} else {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getStateFromMeta(coloredBlockMeta.getReplacemeta()));
			}
		}
	}

	private void heatgunmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredFallingBlockMeta coloredBlockMeta) {
		if (worldIn.getBlockState(pos).getBlock() == coloredBlockMeta) {
			if (coloredBlockMeta.getReplacemeta() == -1) {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getDefaultState());
			} else {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getStateFromMeta(coloredBlockMeta.getReplacemeta()));
			}
		}
	}

	private void heatgunmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMetaSlime coloredBlockMeta) {
		if (worldIn.getBlockState(pos).getBlock() == coloredBlockMeta) {
			if (coloredBlockMeta.getReplacemeta() == -1) {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getDefaultState());
			} else {
				worldIn.setBlockState(pos, coloredBlockMeta.getReplace().getStateFromMeta(coloredBlockMeta.getReplacemeta()));
			}
		}
	}

    private void heatgun(EntityPlayer player, World worldIn, BlockPos pos, Block replace, ColoredBlock coloredblock) {
		if (worldIn.getBlockState(pos).getBlock() == coloredblock.black ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.blue ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.brown ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.cyan ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.gray ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.green ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.lightblue ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.lightgray ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.lime ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.magenta ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.orange ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.pink ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.purple ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.red ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.white ||
				worldIn.getBlockState(pos).getBlock() == coloredblock.yellow) {
				if (coloredblock.metab) {
					worldIn.setBlockState(pos, replace.getStateFromMeta(coloredblock.meta));
				} else {
					worldIn.setBlockState(pos, replace.getDefaultState());
				}
		}
	}


}
