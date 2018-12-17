package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.creativetab.CreativeTabs;

public class PTMEarthMortar extends PTMItemBase {
    public PTMEarthMortar(String name, CreativeTabs tab) {
        super(name, tab);
        PTMItems.ITEMS_META.add(this);
    }
}
