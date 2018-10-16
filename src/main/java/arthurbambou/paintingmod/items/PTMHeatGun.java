package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
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
	}
	
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		for (ColoredBlock coloredblock: AddPaintbrush.COLOREDBLOCKS) {
			heatgun(player, worldIn, pos, coloredblock.replace, coloredblock);
		}
		return EnumActionResult.SUCCESS;
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
