package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PaintingMod;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.Item;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredSlabBlock extends SlabBlock {
    public ColoredSlabBlock(String name ,Settings block$Settings_1) {
        super(block$Settings_1);
        Registry.BLOCK.register(new Identifier(PaintingMod.MODID, name), this);
        Registry.ITEM.register(new Identifier(PaintingMod.MODID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_STAIRS)));
    }
}
