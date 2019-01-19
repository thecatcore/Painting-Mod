package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PaintingMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemBase extends Item {
    public ItemBase(Settings settings, String name) {
        super(settings);
        Registry.register(Registry.ITEM, PaintingMod.MODID + ":" + name, this);
    }
}
