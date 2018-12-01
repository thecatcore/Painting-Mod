package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PTMItemBase extends Item implements PTMIHasModel{
	
	public PTMItemBase(String name, CreativeTabs tab)
	{
		setUnlocalizedName(PTMReference.MOD_ID + "." + name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		PTMItems.ITEMS_ID.add(this);
	}

	@Override
	public void registerModels()
	{
		PTMMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
