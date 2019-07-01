package fr.arthurbambou.paintingmod.blocks.coloreds;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class NormalStairs extends StairsBlock {
    public NormalStairs(String name, BlockState p_i48321_1_, Properties p_i48321_2_) {
        super(p_i48321_1_, p_i48321_2_);
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
