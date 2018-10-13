package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.blocks.colored.*;
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
	public ColoredBlock(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel) {
		this.name = name;
		this.material = material;
		this.soundtype = soundtype;
		this.hardness = hardness;
		this.resistance = resistance;
		this.harvesttool = harvesttool;
		this.harvestlevel = harvestlevel;
		this.black = new PTMBlackBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.red = new PTMRedBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.green = new PTMGreenBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.brown = new PTMBrownBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.blue = new PTMBlueBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.purple = new PTMPurpleBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.cyan = new PTMCyanBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.lightgray = new PTMLightGrayBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.gray = new PTMGrayBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.pink = new PTMPinkBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.lime = new PTMLimeBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.yellow = new PTMYellowBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.lightblue = new PTMLightBlueBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.magenta = new PTMMagentaBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.orange = new PTMOrangeBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);
		this.white = new PTMWhiteBlock(this.name, this.material, this.soundtype, this.hardness, this.resistance, this.harvesttool, this.harvestlevel);

	}
}
