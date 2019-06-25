package fr.arthurbambou.paintingmod.mainmod.blocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.loot.context.LootContext;

import java.util.ArrayList;
import java.util.List;

public class ColoredWeightedPressurePlateBlock extends WeightedPressurePlateBlock {
    public ColoredWeightedPressurePlateBlock(String name, int int_1, Settings block$Settings_1, String modID) {
        super(int_1, block$Settings_1);
        Registry.register(Registry.BLOCK, new Identifier(modID, name), this);
        Registry.register(Registry.ITEM, new Identifier(modID, name), new BlockItem(this, new Item.Settings().group(PaintingMod.MOD_PRESSURE_PLATES)));
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState blockState_1, LootContext.Builder lootContext$Builder_1) {
        List<ItemStack> list = new ArrayList<ItemStack>();
        list.add(new ItemStack(this));
        return list;
    }
}
