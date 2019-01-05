package arthurbambou.paintingmod.utils;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredStairs;
import arthurbambou.paintingmod.registery.ModItems;
import net.minecraft.block.BlockState;
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
                System.out.println(blockState.toString());
                Collection<Property<?>> propertyCollection = blockState.getProperties();

                for (Object object : propertyCollection.toArray()) {
                    System.out.println(object.toString());
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.black.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.red.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.green.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.brown.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.blue.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.purple.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.cyan.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.lightgray.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.gray.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.pink.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.lime.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.yellow.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.lightblue.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.magenta.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.orange.getDefaultState());
                    usedpaintbrush(player);
                }
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
//                    worldIn.setBlockState(pos, coloredStairs.white.getDefaultState());
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
