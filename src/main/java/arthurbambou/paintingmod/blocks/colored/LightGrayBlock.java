package arthurbambou.paintingmod.blocks.colored;

import arthurbambou.paintingmod.Main;
import arthurbambou.paintingmod.blocks.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LightGrayBlock extends BlockBase
{

	public LightGrayBlock(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super("light_gray_" + name, material, Main.PAINTING_MOD);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
	}
}
