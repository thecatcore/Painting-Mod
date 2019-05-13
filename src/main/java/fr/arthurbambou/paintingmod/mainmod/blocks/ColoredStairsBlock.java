package fr.arthurbambou.paintingmod.mainmod.blocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredStairsBlock extends StairsBlock {
    public ColoredStairsBlock(String name, Settings block$Settings_1, BlockState blockState_1, String modID) {
        super(blockState_1, block$Settings_1);
        Registry.register(Registry.BLOCK, new Identifier(modID, name), this);
        if (modID == PaintingMod.MODID) {
            Registry.register(Registry.ITEM, new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_STAIRS)));
        } else {
            Registry.register(Registry.ITEM, new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.ADDON_STAIRS)));
        }
    }
}