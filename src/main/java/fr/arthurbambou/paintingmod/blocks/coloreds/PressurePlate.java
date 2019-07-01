package fr.arthurbambou.paintingmod.blocks.coloreds;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class PressurePlate extends PressurePlateBlock {
    public PressurePlate(String name, Block.Properties p_i48348_2_, PressurePlateBlock.Sensitivity p_i48348_1_) {
        super(p_i48348_1_, p_i48348_2_);
        setRegistryName(name);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        super.getDrops(state, builder);
        List<ItemStack> list = new ArrayList<>();
        list.add(new ItemStack(this));
        return list;
    }
}
