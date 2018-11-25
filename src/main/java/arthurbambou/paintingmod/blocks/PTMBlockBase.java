package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMBlockBase extends Block implements PTMIHasModel
{

	public PTMBlockBase(String name, Material material, CreativeTabs tab)
	{
		super(material);
		setCreativeTab(tab);
		setTranslationKey(PTMReference.MOD_ID + "." + name);
	    setRegistryName(name);
		PTMBlocks.BLOCKS_ID.add(this);
		PTMItems.ITEMS_ID.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		PTMBlocks.BLOCKS_META.add(this);
		PTMItems.ITEMS_META.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
