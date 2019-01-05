package arthurbambou.paintingmod.utils;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredStairs;
import arthurbambou.paintingmod.registery.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Property;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Collection;

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
                    worldIn.setBlockState(pos, coloredStairs.black.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.red.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.green.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.brown.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.blue.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.purple.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.cyan.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightgray.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.gray.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.pink.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lime.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.yellow.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.lightblue.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.magenta.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.orange.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
                    worldIn.setBlockState(pos, coloredStairs.white.getStateFactory().getDefaultState().with(StairsBlock.field_11565, blockState.get(StairsBlock.field_11565)).with(StairsBlock.field_11572, blockState.get(StairsBlock.field_11572)).with(StairsBlock.FACING, blockState.get(StairsBlock.FACING)).with(StairsBlock.field_11573, blockState.get(StairsBlock.field_11573)));
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
