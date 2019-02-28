package fr.arthurbambou.paintingmod.coloredfunctions;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredFunction;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.items.Paintbrush;
import fr.arthurbambou.paintingmod.registry.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ColoredPressurePlate extends ColoredFunction {
    public ColoredPressurePlate() {
        super(new ResourceLocation(PaintingMod.MODID, "pressure_plates"));
    }

    @Override
    public void paint(ColoredObject coloredObject, World worldIn, BlockPos pos, EntityPlayer player, Paintbrush paintbrush) {
        ArrayList<Paintbrush> paintbrushes = ModItems.PAINTBRUSHES;
        if (paintbrush == paintbrushes.get(0)) return;
        if (coloredObject instanceof fr.arthurbambou.paintingmod.api.coloredblocks.ColoredPressurePlate
                && worldIn.getBlockState(pos).getBlock() == coloredObject.replace) {
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(1)) {
                worldIn.setBlockState(pos, coloredObject.black.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(2)) {
                worldIn.setBlockState(pos, coloredObject.red.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(3)) {
                worldIn.setBlockState(pos, coloredObject.green.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(4)) {
                worldIn.setBlockState(pos, coloredObject.brown.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(5)) {
                worldIn.setBlockState(pos, coloredObject.blue.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(6)) {
                worldIn.setBlockState(pos, coloredObject.purple.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(7)) {
                worldIn.setBlockState(pos, coloredObject.cyan.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(8)) {
                worldIn.setBlockState(pos, coloredObject.lightgray.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(9)) {
                worldIn.setBlockState(pos, coloredObject.gray.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(10)) {
                worldIn.setBlockState(pos, coloredObject.pink.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(11)) {
                worldIn.setBlockState(pos, coloredObject.lime.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(12)) {
                worldIn.setBlockState(pos, coloredObject.yellow.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(13)) {
                worldIn.setBlockState(pos, coloredObject.lightblue.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(14)) {
                worldIn.setBlockState(pos, coloredObject.magenta.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(15)) {
                worldIn.setBlockState(pos, coloredObject.orange.getDefaultState());
                usedpaintbrush(player);
            }
            if (player.getHeldItemMainhand().getItem() == paintbrushes.get(16)) {
                worldIn.setBlockState(pos, coloredObject.white.getDefaultState());
                usedpaintbrush(player);
            }
        } else {
            return;
        }
    }

    @Override
    public void unPaint(ColoredObject coloredObject, World worldIn, BlockPos pos, EntityPlayer player) {
        if (coloredObject instanceof fr.arthurbambou.paintingmod.api.coloredblocks.ColoredPressurePlate &&
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

            worldIn.setBlockState(pos, coloredObject.replace.getDefaultState());
            usedHeatGun(player);
        }
    }
}
