package arthurbambou.paintingmod.items.tools;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import net.minecraft.item.ItemPickaxe;

public class PTMToolPickaxe extends ItemPickaxe implements PTMIHasModel {
	
	public PTMToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(PTMMain.PAINTING_MOD);
		
		PTMItems.ITEMS_ID.add(this);
		PTMItems.ITEMS_META.add(this);
	}

	@Override
	public void registerModels()
	{
		PTMMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
