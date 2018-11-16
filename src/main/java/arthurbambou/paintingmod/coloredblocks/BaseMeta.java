package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.PTMColoredBlocks;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BaseMeta extends ColoredBlock {

	public BaseMeta(String name, Material material, SoundType soundtype, float hardness, float resistance,
			String harvesttool, int harvestlevel, Block replace, boolean metab, int meta) {
		super(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel, replace, metab, meta);
		registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		PTMBlocks.COLORED_BLOCKS_ID.add(this);
	}

	public void registerBlocks (String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel) {
		
		this.black = new PTMColoredBlocks("black_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.red = new PTMColoredBlocks("red_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.green = new PTMColoredBlocks("green_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.brown = new PTMColoredBlocks("brown_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.blue = new PTMColoredBlocks("blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.purple = new PTMColoredBlocks("purple_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.cyan = new PTMColoredBlocks("cyan_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lightgray = new PTMColoredBlocks("light_gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.gray = new PTMColoredBlocks("gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.pink = new PTMColoredBlocks("pink_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lime = new PTMColoredBlocks("lime_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.yellow = new PTMColoredBlocks("yellow_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lightblue = new PTMColoredBlocks("light_blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.magenta = new PTMColoredBlocks("magenta_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.orange = new PTMColoredBlocks("orange_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.white = new PTMColoredBlocks("white_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		
	}
}
