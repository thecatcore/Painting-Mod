package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PTMItemBase extends Item implements PTMIHasModel{
	
	public PTMItemBase(String name, CreativeTabs tab)
	{
		setTranslationKey(name);
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
