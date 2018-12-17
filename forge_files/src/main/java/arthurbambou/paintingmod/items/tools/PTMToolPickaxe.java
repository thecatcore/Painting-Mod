package arthurbambou.paintingmod.items.tools;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.item.ItemPickaxe;

public class PTMToolPickaxe extends ItemPickaxe implements PTMIHasModel {
	
	public PTMToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setTranslationKey(PTMReference.MOD_ID + "." + name);
		setRegistryName(name);
		setCreativeTab(PTMMain.PAINTING_MOD_ITEMS);
		
		PTMItems.ITEMS_ID.add(this);
		PTMItems.ITEMS_META.add(this);
	}

	@Override
	public void registerModels()
	{
		PTMMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
