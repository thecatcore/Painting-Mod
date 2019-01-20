package arthurbambou.paintingmod.mainmod.blocks;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.Item;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredPressurePlateBlock extends PressurePlateBlock {
    public ColoredPressurePlateBlock(String name, Type pressurePlateBlock$Type_1, Settings block$Settings_1, String modID) {
        super(pressurePlateBlock$Type_1, block$Settings_1);
        Registry.BLOCK.register(new Identifier(modID, name), this);
        if (modID == PaintingMod.MODID) {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_PRESSURE_PLATES)));
        } else {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.ADDON_PRESSURE_PLATES)));
        }
    }
}
