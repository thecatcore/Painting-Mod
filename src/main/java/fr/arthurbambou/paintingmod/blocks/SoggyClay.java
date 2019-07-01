package fr.arthurbambou.paintingmod.blocks;

import fr.arthurbambou.paintingmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FallingBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.LootContext;

import java.util.ArrayList;
import java.util.List;

public class SoggyClay extends FallingBlock {
    public SoggyClay() {
        super(Block.Properties.from(Blocks.SAND));
        setRegistryName("soggy_clay");
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        super.getDrops(state, builder);
        List<ItemStack> list = new ArrayList<>();
        list.add(new ItemStack(ModItems.EARTH_MORTAR));
        return list;
    }
}
