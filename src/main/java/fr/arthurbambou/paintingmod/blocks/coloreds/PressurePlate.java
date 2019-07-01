package fr.arthurbambou.paintingmod.blocks.coloreds;

import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;

public class PressurePlate extends PressurePlateBlock {
    public PressurePlate(String name, Block.Properties p_i48348_2_, PressurePlateBlock.Sensitivity p_i48348_1_) {
        super(p_i48348_1_, p_i48348_2_);
        setRegistryName(name);
    }
}
