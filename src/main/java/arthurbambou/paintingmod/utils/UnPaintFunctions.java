package arthurbambou.paintingmod.utils;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredStairs;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnPaintFunctions {

    public static void unpaintblock(World worldIn, BlockPos pos, ColoredBlock coloredblock, ItemStack itemStack) {
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

            worldIn.setBlockState(pos, coloredblock.replace.getDefaultState());
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintstairs(World worldIn, BlockPos pos, ColoredStairs coloredStairs, ItemStack itemStack) {
        if (worldIn.getBlockState(pos).getBlock() == coloredStairs.black ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.blue ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.brown ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.cyan ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.gray ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.green ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.lightblue ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.lightgray ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.lime ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.magenta ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.orange ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.pink ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.purple ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.red ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.white ||
                worldIn.getBlockState(pos).getBlock() == coloredStairs.yellow) {

            BlockState blockState = worldIn.getBlockState(pos);
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState().with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }
}
