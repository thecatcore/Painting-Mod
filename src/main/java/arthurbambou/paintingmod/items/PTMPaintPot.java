package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PTMPaintPot extends PTMItemBase
{

	public PTMPaintPot(String name, CreativeTabs tab) {
		super(name, tab);
		
		setMaxDamage(5);
		setMaxStackSize(1);
		setNoRepair();
		PTMItems.ITEMS_META.add(this);
	}
	
	@Override
    public boolean hasContainerItem(ItemStack stack){
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
    	int dam = itemStack.getItemDamage() + 1;
        return new ItemStack(this, 1, dam);
    }

}
