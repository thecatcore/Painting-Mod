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
	}
}
