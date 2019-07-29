package fr.arthurbambou.paintingmod.mainmod.blocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.items.ColoredItemBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.loot.context.LootContext;

import java.util.ArrayList;
import java.util.List;

public class ColoredWoodButtonBlock extends WoodButtonBlock implements ColoredBlock {

    private ColoredObject coloredObject;
    private ColoredObject.Color color;

    public ColoredWoodButtonBlock(ColoredObject coloredObject, ColoredObject.Color color) {
        super(coloredObject.settings);
        this.color = color;
        this.coloredObject = coloredObject;
        Registry.register(Registry.BLOCK, new Identifier(coloredObject.modid, color.name().toLowerCase() + "_" + coloredObject.name), this);
        Registry.register(Registry.ITEM, new Identifier(coloredObject.modid, color.name().toLowerCase() + "_" + coloredObject.name), new ColoredItemBlock(this, new Item.Settings().group(PaintingMod.MOD_BUTTONS)));
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState blockState_1, LootContext.Builder lootContext$Builder_1) {
        List<ItemStack> list = new ArrayList<ItemStack>();
        list.add(new ItemStack(this));
        return list;
    }

    @Override
    public ColoredObject getColoredObject() {
        return this.coloredObject;
    }

    @Override
    public ColoredObject.Color getColor() {
        return this.color;
    }
}
