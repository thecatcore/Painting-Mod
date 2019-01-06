package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.*;
import arthurbambou.paintingmod.blocks.ColoredBlockMetaSlime;
import arthurbambou.paintingmod.blocks.PTMColoredWallBase;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMEnumPaintbrush;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMIMetaName;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWall;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMPaintbrushVariant extends PTMItemVariantTemplate2 implements PTMIHasModel, PTMIMetaName {
    public PTMPaintbrushVariant(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setMaxStackSize(1);
        PTMItems.ITEMS_META.add(this);
    }

    @Override
    public void registerModels() {
        for (PTMEnumPaintbrush color: PTMEnumPaintbrush.values()) {
            PTMMain.proxy.registerVariantRenderer(this, color.getDyeDamage(), color.getDyeColorName() + "_" + this.getRegistryName().toString().substring(12), "inventory");
        }
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return PTMEnumPaintbrush.byDyeDamage(stack.getMetadata()).getName();
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        for (ColoredBlockMeta block : AddPaintbrush.getSimplecoloredblockmeta()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        for (ColoredBlockMetaSlime block : AddPaintbrush.getColoredBlockMetaSlimes()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        for (ColoredFallingBlockMeta block : AddPaintbrush.getSIMPLECOLOREDFALLINGBLOCKMETA()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        for (ColoredStairs coloredStairs : AddPaintbrush.getColoredStairsMetaList()) {
            newstairstopaint(player,worldIn,pos,coloredStairs);
        }
        for (ColoredFence coloredFence : AddPaintbrush.getColoredFenceList()) {
            newfencetopaint(player,worldIn,pos,coloredFence);
        }
        for (ColoredWall coloredWall : AddPaintbrush.getColoredWallList()) {
            newwalltopaint(player,worldIn,pos,coloredWall);
        }
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    private void newwalltopaint(EntityPlayer player, World world, BlockPos pos, ColoredWall coloredStairs) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (world.getBlockState(pos).getBlock() == coloredStairs.replace && world.getBlockState(pos).getBlock().getMetaFromState(world.getBlockState(pos)) == coloredStairs.meta) {
                IBlockState blockState = world.getBlockState(pos);
                if (player.getHeldItemMainhand().getMetadata() == 1) {
                    world.setBlockState(pos, coloredStairs.black.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 2) {
                    world.setBlockState(pos, coloredStairs.red.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 3) {
                    world.setBlockState(pos, coloredStairs.green.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 4) {
                    world.setBlockState(pos, coloredStairs.brown.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 5) {
                    world.setBlockState(pos, coloredStairs.blue.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 6) {
                    world.setBlockState(pos, coloredStairs.purple.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 7) {
                    world.setBlockState(pos, coloredStairs.cyan.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 8) {
                    world.setBlockState(pos, coloredStairs.lightgray.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 9) {
                    world.setBlockState(pos, coloredStairs.gray.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 10) {
                    world.setBlockState(pos, coloredStairs.pink.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 11) {
                    world.setBlockState(pos, coloredStairs.lime.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 12) {
                    world.setBlockState(pos, coloredStairs.yellow.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 13) {
                    world.setBlockState(pos, coloredStairs.lightblue.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 14) {
                    world.setBlockState(pos, coloredStairs.magenta.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 15) {
                    world.setBlockState(pos, coloredStairs.orange.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 16) {
                    world.setBlockState(pos, coloredStairs.white.getBlockState().getBaseState()
                            .withProperty(PTMColoredWallBase.NORTH, blockState.getValue(BlockWall.NORTH))
                            .withProperty(PTMColoredWallBase.EAST, blockState.getValue(BlockWall.EAST))
                            .withProperty(PTMColoredWallBase.SOUTH, blockState.getValue(BlockWall.SOUTH))
                            .withProperty(PTMColoredWallBase.WEST, blockState.getValue(BlockWall.WEST))
                            .withProperty(PTMColoredWallBase.UP, blockState.getValue(BlockWall.UP)));
                }
            }
        }
    }

    private void newstairstopaint(EntityPlayer player, World world, BlockPos pos, ColoredStairs coloredStairs) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (world.getBlockState(pos).getBlock() == coloredStairs.replace) {
                IBlockState blockState = world.getBlockState(pos);
                if (player.getHeldItemMainhand().getMetadata() == 1) {
                    world.setBlockState(pos, coloredStairs.black.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 2) {
                    world.setBlockState(pos, coloredStairs.red.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 3) {
                    world.setBlockState(pos, coloredStairs.green.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 4) {
                    world.setBlockState(pos, coloredStairs.brown.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 5) {
                    world.setBlockState(pos, coloredStairs.blue.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 6) {
                    world.setBlockState(pos, coloredStairs.purple.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 7) {
                    world.setBlockState(pos, coloredStairs.cyan.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 8) {
                    world.setBlockState(pos, coloredStairs.lightgray.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 9) {
                    world.setBlockState(pos, coloredStairs.gray.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 10) {
                    world.setBlockState(pos, coloredStairs.pink.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 11) {
                    world.setBlockState(pos, coloredStairs.lime.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 12) {
                    world.setBlockState(pos, coloredStairs.yellow.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 13) {
                    world.setBlockState(pos, coloredStairs.lightblue.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 14) {
                    world.setBlockState(pos, coloredStairs.magenta.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 15) {
                    world.setBlockState(pos, coloredStairs.orange.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 16) {
                    world.setBlockState(pos, coloredStairs.white.getBlockState().getBaseState()
                            .withProperty(BlockStairs.FACING, blockState.getValue(BlockStairs.FACING))
                            .withProperty(BlockStairs.HALF, blockState.getValue(BlockStairs.HALF))
                            .withProperty(BlockStairs.SHAPE, blockState.getValue(BlockStairs.SHAPE)));
                }
            }
        }
    }

    private void newfencetopaint(EntityPlayer player, World world, BlockPos pos, ColoredFence coloredStairs) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (world.getBlockState(pos).getBlock() == coloredStairs.replace) {
                IBlockState blockState = world.getBlockState(pos);
                if (player.getHeldItemMainhand().getMetadata() == 1) {
                    world.setBlockState(pos, coloredStairs.black.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 2) {
                    world.setBlockState(pos, coloredStairs.red.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 3) {
                    world.setBlockState(pos, coloredStairs.green.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 4) {
                    world.setBlockState(pos, coloredStairs.brown.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 5) {
                    world.setBlockState(pos, coloredStairs.blue.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 6) {
                    world.setBlockState(pos, coloredStairs.purple.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 7) {
                    world.setBlockState(pos, coloredStairs.cyan.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 8) {
                    world.setBlockState(pos, coloredStairs.lightgray.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 9) {
                    world.setBlockState(pos, coloredStairs.gray.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 10) {
                    world.setBlockState(pos, coloredStairs.pink.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 11) {
                    world.setBlockState(pos, coloredStairs.lime.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 12) {
                    world.setBlockState(pos, coloredStairs.yellow.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 13) {
                    world.setBlockState(pos, coloredStairs.lightblue.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 14) {
                    world.setBlockState(pos, coloredStairs.magenta.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 15) {
                    world.setBlockState(pos, coloredStairs.orange.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
                if (player.getHeldItemMainhand().getMetadata() == 16) {
                    world.setBlockState(pos, coloredStairs.white.getBlockState().getBaseState()
                            .withProperty(BlockFence.NORTH, blockState.getValue(BlockFence.NORTH))
                            .withProperty(BlockFence.EAST, blockState.getValue(BlockFence.EAST))
                            .withProperty(BlockFence.SOUTH, blockState.getValue(BlockFence.SOUTH))
                            .withProperty(BlockFence.WEST, blockState.getValue(BlockFence.WEST)));
                }
            }
        }
    }

    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMeta block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMetaSlime block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredFallingBlockMeta block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
}
