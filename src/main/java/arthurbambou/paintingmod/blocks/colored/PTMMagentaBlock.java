package arthurbambou.paintingmod.blocks.colored;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.blocks.PTMBlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PTMMagentaBlock extends PTMBlockBase
{

	public PTMMagentaBlock(String name, Material material, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel)
	{
		super("magenta_" + name, material, PTMMain.PAINTING_MOD);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(harvestTool, harvestLevel);
	}
}