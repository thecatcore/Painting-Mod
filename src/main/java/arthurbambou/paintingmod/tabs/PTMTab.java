package arthurbambou.paintingmod.tabs;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PTMTab extends CreativeTabs
{
	public PTMTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return PTMItems.NORMAL_PAINTBRUSH;
	}
}
