package fr.arthurbambou.paintingmod.blocks.coloreds;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class NormalSlab extends SlabBlock {
    public NormalSlab(String name,Properties p_i48331_1_) {
        super(p_i48331_1_);
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
