package fr.arthurbambou.paintingmod.coloredfunctions;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredFunction;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.items.Paintbrush;
import fr.arthurbambou.paintingmod.registry.ModItems;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFourWay;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ColoredFence extends ColoredFunction {
    public ColoredFence() {
        super(new ResourceLocation(PaintingMod.MODID, "fence"));
    }

    @Override
    public void paint(ColoredObject coloredObject, ItemUseContext context, Paintbrush paintbrush) {
        World worldIn = context.getWorld();
        BlockPos pos = context.getPos();
        EntityPlayer player = context.getPlayer();
        ArrayList<Paintbrush> paintbrushes = ModItems.PAINTBRUSHES;
        if (paintbrush == paintbrushes.get(0)) return;
        if (coloredObject instanceof fr.arthurbambou.paintingmod.api.coloredblocks.ColoredFence &&
                worldIn.getBlockState(pos).getBlock() == coloredObject.replace) {
                IBlockState blockState = worldIn.getBlockState(pos);
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(1)) {
                    worldIn.setBlockState(pos, coloredObject.black.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(2)) {
                    worldIn.setBlockState(pos, coloredObject.red.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(3)) {
                    worldIn.setBlockState(pos, coloredObject.green.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(4)) {
                    worldIn.setBlockState(pos, coloredObject.brown.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(5)) {
                    worldIn.setBlockState(pos, coloredObject.blue.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(6)) {
                    worldIn.setBlockState(pos, coloredObject.purple.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(7)) {
                    worldIn.setBlockState(pos, coloredObject.cyan.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(8)) {
                    worldIn.setBlockState(pos, coloredObject.lightgray.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(9)) {
                    worldIn.setBlockState(pos, coloredObject.gray.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(10)) {
                    worldIn.setBlockState(pos, coloredObject.pink.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(11)) {
                    worldIn.setBlockState(pos, coloredObject.lime.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(12)) {
                    worldIn.setBlockState(pos, coloredObject.yellow.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(13)) {
                    worldIn.setBlockState(pos, coloredObject.lightblue.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(14)) {
                    worldIn.setBlockState(pos, coloredObject.magenta.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(15)) {
                    worldIn.setBlockState(pos, coloredObject.orange.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
                if (player.getHeldItemMainhand().getItem() == paintbrushes.get(16)) {
                    worldIn.setBlockState(pos, coloredObject.white.getDefaultState()
                            .with(BlockFence.NORTH, blockState.get(BlockFence.NORTH))
                            .with(BlockFence.EAST, blockState.get(BlockFence.EAST))
                            .with(BlockFence.SOUTH, blockState.get(BlockFence.SOUTH))
                            .with(BlockFence.WEST, blockState.get(BlockFence.WEST))
                            .with(BlockFence.WATERLOGGED, blockState.get(BlockFence.WATERLOGGED)));
                    usedpaintbrush(player);
                }
        } else {
            return;
        }
    }

    @Override
    public void unPaint(ColoredObject coloredObject, ItemUseContext context) {
        World worldIn = context.getWorld();
        BlockPos pos = context.getPos();
        EntityPlayer player = context.getPlayer();
        if (coloredObject instanceof fr.arthurbambou.paintingmod.api.coloredblocks.ColoredFence &&
                worldIn.getBlockState(pos).getBlock() == coloredObject.black ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.blue ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.brown ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.cyan ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.gray ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.green ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.lightblue ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.lightgray ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.lime ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.magenta ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.orange ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.pink ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.purple ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.red ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.white ||
                worldIn.getBlockState(pos).getBlock() == coloredObject.yellow) {
            IBlockState blockState = worldIn.getBlockState(pos);
            BlockFence blockFence = (BlockFence) coloredObject.replace;

            worldIn.setBlockState(pos, blockFence.getStateForPlacement(new BlockItemUseContext(context)));
            usedHeatGun(player);
        }
    }
}
