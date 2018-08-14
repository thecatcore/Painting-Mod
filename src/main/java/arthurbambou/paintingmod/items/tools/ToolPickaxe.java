package arthurbambou.paintingmod.items.tools;

import arthurbambou.paintingmod.Main;
import arthurbambou.paintingmod.init.ModItems;
import arthurbambou.paintingmod.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {
	
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.PAINTING_MOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
