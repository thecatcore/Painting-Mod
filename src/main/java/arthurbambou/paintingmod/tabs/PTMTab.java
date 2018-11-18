package arthurbambou.paintingmod.tabs;

import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PTMTab extends CreativeTabs
{
	public PTMTab(String label) {
		super(label);
	}

	@Override
	public ItemStack createIcon() {
		if (    PTMReference.getMinecraftVersion() == "[1.13]"
                ||
                PTMReference.getMinecraftVersion() == "[1.13.1]"
                ||
                PTMReference.getMinecraftVersion() == "[1.13.2]") {
		    return new ItemStack(PTMItems.NORMAL_PAINTBRUSH);
		} else {
		    return new ItemStack(PTMItems.PAINTBRUSHES);
		}
	}
}
