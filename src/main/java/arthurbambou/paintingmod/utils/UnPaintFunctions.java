package arthurbambou.paintingmod.utils;

import arthurbambou.paintingmod.api.*;
import net.minecraft.block.*;
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
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                    .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                    .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                    .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573))
                    .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintslab(World worldIn, BlockPos pos, ColoredSlab coloredStairs, ItemStack itemStack) {
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
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                    .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                    .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintwall(World worldIn, BlockPos pos, ColoredWall coloredStairs, ItemStack itemStack) {
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
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                    .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                    .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                    .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                    .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                    .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                    .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintfencegate(World worldIn, BlockPos pos, ColoredFenceGate coloredStairs, ItemStack itemStack) {
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
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                    .with(HorizontalFacingBlock.field_11177, blockState.get(HorizontalFacingBlock.field_11177))
                    .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                    .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                    .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintfence(World worldIn, BlockPos pos, ColoredFence coloredStairs, ItemStack itemStack) {
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
            worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                    .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                    .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                    .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                    .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                    .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
            itemStack.setDamage(itemStack.getDamage());
        }
    }

    public static void unpaintpressureplate(World worldIn, BlockPos pos, ColoredPressurePlate coloredStairs, ItemStack itemStack) {
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
            if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                        .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
            } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                        .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
            }
            itemStack.setDamage(itemStack.getDamage());
        }
    }
}
