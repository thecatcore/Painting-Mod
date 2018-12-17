package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {
    public static Item EARTH_MORTAR;

    public static void init() {
        EARTH_MORTAR = new ItemBase(new Item.Settings().itemGroup(ItemGroup.MATERIALS), "earth_mortar");
    }
}
