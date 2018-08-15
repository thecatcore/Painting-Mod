package arthurbambou.paintingmod.tabs;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PTM extends CreativeTabs
{
	public PTM(String label) {
		super(label);
		//this.setBackgroundImageName("tutorial.png");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(PTMItems.NORMAL_PAINTBRUSH);
	}
}
