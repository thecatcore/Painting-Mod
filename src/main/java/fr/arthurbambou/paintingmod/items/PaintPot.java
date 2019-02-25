package fr.arthurbambou.paintingmod.items;

import fr.arthurbambou.paintingmod.PaintingMod;
import net.minecraft.item.Item;

public class PaintPot extends ItemBase {
    public PaintPot(String name) {
        super(new Item.Properties().maxStackSize(1).defaultMaxDamage(5));
        setRegistryName(name);
    }
}
