package arthurbambou.paintingmod.mainmod.coloredfunctions;

import arthurbambou.paintingmod.mainmod.api.ColoredFunction;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.coloredblocks.ColoredFence;
import arthurbambou.paintingmod.mainmod.coloredblocks.ColoredPressurePlate;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalConnectedBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PressurePlatesFunction extends ColoredFunction {
    public PressurePlatesFunction(Identifier identifier) {
        super(identifier);
    }

    @Override
    public void paint(ItemUsageContext var1, ColoredObject coloredObject) {
        BlockPos pos = var1.getBlockPos();
        World worldIn = var1.getWorld();
        PlayerEntity player = var1.getPlayer();
        BlockState blockState = worldIn.getBlockState(pos);
        if (coloredObject instanceof ColoredPressurePlate
                && worldIn.getBlockState(pos).getBlock() == coloredObject.replace) {
            for (int a = 0; a < coloredObject.getArrayList().size(); a++) {
                if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PAINTBRUSHES.get(a + 1)) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredObject.getArrayList().get(a).getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredObject.getArrayList().get(a).getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    usedpaintbrush(player);
                }
            }
        }
    }

    @Override
    public void unPaint(ItemUsageContext var1, ColoredObject coloredObject) {
        BlockPos pos = var1.getBlockPos();
        World worldIn = var1.getWorld();
        PlayerEntity player = var1.getPlayer();
        BlockState blockState = worldIn.getBlockState(pos);
        if (coloredObject instanceof ColoredPressurePlate) {
            for (int b = 0; b < coloredObject.getArrayList().size(); b++) {
                if (worldIn.getBlockState(pos).getBlock() == coloredObject.getArrayList().get(b)) {
                    if (worldIn.getBlockState(pos).getBlock() instanceof PressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredObject.replace.getStateFactory().getDefaultState()
                                .with(PressurePlateBlock.POWERED, blockState.get(PressurePlateBlock.POWERED)));
                    } else if (worldIn.getBlockState(pos).getBlock() instanceof WeightedPressurePlateBlock) {
                        worldIn.setBlockState(pos, coloredObject.replace.getStateFactory().getDefaultState()
                                .with(WeightedPressurePlateBlock.POWER, blockState.get(WeightedPressurePlateBlock.POWER)));
                    }
                    heatgun(player.getStackInHand(Hand.MAIN));
                }
            }
        }
    }
}
