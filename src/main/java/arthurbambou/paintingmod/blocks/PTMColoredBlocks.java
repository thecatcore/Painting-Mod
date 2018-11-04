package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMColoredBlocks extends Block implements PTMIHasModel{
	
	public PTMColoredBlocks(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super(material);
		setCreativeTab(PTMMain.PAINTING_MOD);
		setUnlocalizedName(name);
	    setRegistryName(name);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
		PTMBlocks.BLOCKS.add(this);
		PTMItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
