package fr.arthurbambou.paintingmod.blocks.coloreds;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class NormalStairs extends BlockStairs {
    public NormalStairs(String name, IBlockState p_i48321_1_, Properties p_i48321_2_) {
        super(p_i48321_1_, p_i48321_2_);
        setRegistryName(name);
    }
}
