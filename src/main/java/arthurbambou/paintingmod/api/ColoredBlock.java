package arthurbambou.paintingmod.api;

import javax.annotation.Nullable;

import arthurbambou.paintingmod.blocks.PTMColoredBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ColoredBlock {
	public String name;
	public Material material;
	public SoundType soundtype;
	public float hardness;
	public float resistance;
	public String harvesttool;
	public int harvestlevel;
	public Block black;
	public Block red;
	public Block green;
	public Block brown;
	public Block blue;
	public Block purple;
	public Block cyan;
	public Block lightgray;
	public Block gray;
	public Block pink;
	public Block lime;
	public Block yellow;
	public Block lightblue;
	public Block magenta;
	public Block orange;
	public Block white;
	public Block replace;
	public boolean metab;
	public int meta;
	public ColoredBlock(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab, @Nullable int meta) {
		this(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel, replace, metab);
		this.meta = meta;
		if (name == "soul_sand") {} else {
			AddPaintbrush.COLOREDBLOCKS.add(this);
		}
	}
	public ColoredBlock(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab) {
		this.name = name;
		this.material = material;
		this.soundtype = soundtype;
		this.hardness = hardness;
		this.resistance = resistance;
		this.harvesttool = harvesttool;
		this.harvestlevel = harvestlevel;
		this.replace = replace;
		this.metab = metab;
		if (name == "soul_sand") {} else {
			registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
			AddPaintbrush.COLOREDBLOCKS.add(this);
		}
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
