package arthurbambou.paintingmod.tabs;

import arthurbambou.paintingmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PaintPotTab extends CreativeTabs
{
	public PaintPotTab(String label) {
		super(label);
		//this.setBackgroundImageName("tutorial.png");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItems.NORMAL_PAINTBRUSH);
	}
}
