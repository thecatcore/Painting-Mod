package fr.arthurbambou.paintingmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class SoggyClay extends FallingBlock {
    public SoggyClay() {
        super(Block.Properties.from(Blocks.SAND));
        setRegistryName("soggy_clay");
    }
}
