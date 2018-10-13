package arthurbambou.paintingmod.blocks.colored;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.blocks.PTMBlockBase;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMPinkBlock extends Block implements PTMIHasModel
{

	public PTMPinkBlock(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super(material);
		setCreativeTab(PTMMain.PAINTING_MOD);
		setTranslationKey("pink_" + name); 
	    setRegistryName("pink_" + name);
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
