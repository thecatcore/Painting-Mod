package arthurbambou.paintingmod.mainmod.items;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ItemBase extends Item {
    public ItemBase(Settings settings, String name) {
        super(settings);
        Registry.register(Registry.ITEM, PaintingMod.MODID + ":" + name, this);
    }
}
