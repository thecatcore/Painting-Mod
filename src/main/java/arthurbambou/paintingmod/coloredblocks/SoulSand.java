package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.PTMCSoulSand;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SoulSand extends ColoredBlock {

	public SoulSand(String name, Material material, SoundType soundtype, float hardness, float resistance,
			String harvesttool, int harvestlevel, Block replace, boolean metab) {
		super(name,  hardness, resistance,  replace);
		registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		PTMBlocks.COLORED_BLOCKS.add(this);
	}
	
	public void registerBlocks(String name, Material material, SoundType soundtype, float hardness, float resistance,
			String harvesttool, int harvestlevel) {
		this.black = new PTMCSoulSand("black_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.red = new PTMCSoulSand("red_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.green = new PTMCSoulSand("green_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.brown = new PTMCSoulSand("brown_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.blue = new PTMCSoulSand("blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.purple = new PTMCSoulSand("purple_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.cyan = new PTMCSoulSand("cyan_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lightgray = new PTMCSoulSand("light_gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.gray = new PTMCSoulSand("gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.pink = new PTMCSoulSand("pink_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lime = new PTMCSoulSand("lime_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.yellow = new PTMCSoulSand("yellow_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.lightblue = new PTMCSoulSand("light_blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.magenta = new PTMCSoulSand("magenta_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.orange = new PTMCSoulSand("orange_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
		this.white = new PTMCSoulSand("white_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
	}

	
}
