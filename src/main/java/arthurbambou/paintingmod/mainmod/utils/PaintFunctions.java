package arthurbambou.paintingmod.mainmod.utils;

import arthurbambou.paintingmod.mainmod.api.*;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PaintFunctions {

    public static void newbloctopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                ColoredBlock coloredblock) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredblock.replace) {
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.black.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.red.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.green.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.brown.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.blue.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.purple.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.cyan.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.lightgray.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.gray.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.pink.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.lime.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.yellow.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.lightblue.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.magenta.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.orange.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredblock.white.getDefaultState());
                    usedpaintbrush(player);
                }
            }
        }

    }

    public static void newstairstopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                        ColoredStairs coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565))
                            .with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572))
                            .with(StairsBlock.FACING, blockState.get(StairsBlock.FACING))
                            .with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newslabtopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                      ColoredSlab coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(SlabBlock.field_11501, blockState.get(SlabBlock.field_11501))
                            .with(SlabBlock.field_11502, blockState.get(SlabBlock.field_11502)));
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newwalltopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                      ColoredWall coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(WallBlock.field_11717, blockState.get(WallBlock.field_11717))
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newfencegatetopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                           ColoredFenceGate coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(FenceGateBlock.field_11026, blockState.get(FenceGateBlock.field_11026))
                            .with(FenceGateBlock.field_11021, blockState.get(FenceGateBlock.field_11021))
                            .with(FenceGateBlock.field_11024, blockState.get(FenceGateBlock.field_11024)));
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newfencetopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                       ColoredFence coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(HorizontalConnectedBlock.EAST, blockState.get(HorizontalConnectedBlock.EAST))
                            .with(HorizontalConnectedBlock.NORTH, blockState.get(HorizontalConnectedBlock.NORTH))
                            .with(HorizontalConnectedBlock.SOUTH, blockState.get(HorizontalConnectedBlock.SOUTH))
                            .with(HorizontalConnectedBlock.WATERLOGGED, blockState.get(HorizontalConnectedBlock.WATERLOGGED))
                            .with(HorizontalConnectedBlock.WEST, blockState.get(HorizontalConnectedBlock.WEST)));
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newpressureplatetopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                       ColoredPressurePlate coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
            }
        }
    }

    public static void newbuttontopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                       ColoredButton coloredStairs) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredStairs.replace) {
                BlockState blockState = worldIn.getBlockState(pos);
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState()
                            .with(HorizontalFacingBlock.FACING, blockState.get(HorizontalFacingBlock.FACING))
                            .with(WallMountedBlock.FACE, blockState.get(WallMountedBlock.FACE))
                            .with(AbstractButtonBlock.POWERED, false));
                    usedpaintbrush(player);
                }
            }
        }
    }

    private static void usedpaintbrush (PlayerEntity player) {
        if (!player.isCreative()) {
            player.getStackInHand(Hand.MAIN).setAmount(0);
            player.inventory.insertStack(new ItemStack(ModItems.NORMAL_PAINTBRUSH));
        }
    }
}
