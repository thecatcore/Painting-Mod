package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PTMWaterVial extends PTMItemBase {
	public PTMWaterVial(String name, int damage, int stack, CreativeTabs materials) {
		super(name, materials);
		
		setMaxDamage(damage);
		setMaxStackSize(stack);
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
