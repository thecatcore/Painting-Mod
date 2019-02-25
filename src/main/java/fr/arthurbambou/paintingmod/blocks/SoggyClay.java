package fr.arthurbambou.paintingmod.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SoggyClay extends BlockFalling {
    public SoggyClay() {
        super(Properties.from(Blocks.SAND));
        setRegistryName("soggy_clay");
    }

    @Override
    public boolean onBlockActivated(IBlockState p_196250_1_, World p_196250_2_, BlockPos p_196250_3_, EntityPlayer p_196250_4_, EnumHand p_196250_5_, EnumFacing p_196250_6_, float p_196250_7_, float p_196250_8_, float p_196250_9_) {
        return super.onBlockActivated(p_196250_1_, p_196250_2_, p_196250_3_, p_196250_4_, p_196250_5_, p_196250_6_, p_196250_7_, p_196250_8_, p_196250_9_);
    }
}
