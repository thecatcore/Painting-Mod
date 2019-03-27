package arthurbambou.paintingmod.mainmod.utils;

import arthurbambou.paintingmod.mainmod.api.*;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UnPaintFunctions {

    private static void heatgun(ItemStack itemStack) {
        System.out.println(itemStack.getDamage() + "=" + itemStack.getDurability());
        itemStack.setDamage(itemStack.getDamage() + 1);
        System.out.println(itemStack.getDamage() + "=" + itemStack.getDurability());
        if (itemStack.getDamage() >= itemStack.getDurability() + 1) {
            itemStack.setAmount(0);
        }
    }

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
            heatgun(itemStack);
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
                    .with(StairsBlock.WATERLOGGED, blockState.get(StairsBlock.WATERLOGGED))
                    .with(StairsBlock.HALF, blockState.get(StairsBlock.HALF))
                    .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                    .with(StairsBlock.SHAPE, blockState.get(StairsBlock.SHAPE)));
            heatgun(itemStack);
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
                    .with(SlabBlock.TYPE, blockState.get(SlabBlock.TYPE))
                    .with(SlabBlock.WATERLOGGED, blockState.get(SlabBlock.WATERLOGGED)));
            heatgun(itemStack);
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
                    .with(WallBlock.UP, blockState.get(WallBlock.UP))
                    .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                    .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                    .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                    .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                    .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
            heatgun(itemStack);
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
                    .with(FenceGateBlock.OPEN, blockState.get(FenceGateBlock.OPEN))
                    .with(FenceGateBlock.POWERED, blockState.get(FenceGateBlock.POWERED))
                    .with(FenceGateBlock.IN_WALL, blockState.get(FenceGateBlock.IN_WALL)));
            heatgun(itemStack);
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
            heatgun(itemStack);
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
                worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                        .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
            } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                worldIn.setBlockState(pos, coloredStairs.replace.getStateFactory().getDefaultState()
                        .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
            }
            heatgun(itemStack);
        }
    }

    public static void unpaintbutton(World worldIn, BlockPos pos, ColoredButton coloredStairs, ItemStack itemStack) {
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
                    .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                    .with(AbstractButtonBlock.POWERED, false));
            heatgun(itemStack);
        }
    }
}
