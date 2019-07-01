package fr.arthurbambou.paintingmod.blocks.coloreds;


import net.minecraft.block.BlockState;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class PressurePlateWeighted extends WeightedPressurePlateBlock {
    public PressurePlateWeighted(String name, Properties p_i48295_2_, int p_i48295_1_) {
        super(p_i48295_1_, p_i48295_2_);
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
