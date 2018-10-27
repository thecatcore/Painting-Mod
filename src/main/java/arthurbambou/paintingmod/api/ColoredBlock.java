package arthurbambou.paintingmod.api;

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
    /**
     *
     */
	public boolean metab;
	public int meta;

    /**
     * @param name
     * @param material
     * @param soundtype
     * @param hardness
     * @param resistance
     * @param harvesttool
     * @param harvestlevel
     * @param replace
     * @param metab
     * @param meta
     */
	public ColoredBlock(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab, int meta) {
		this(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel, replace, metab);
		this.meta = meta;
	}

    /**
     * @param name
     * @param material
     * @param soundtype
     * @param hardness
     * @param resistance
     * @param harvesttool
     * @param harvestlevel
     * @param replace
     * @param metab
     */
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

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param soundtype
     */
    public void setSoundtype(SoundType soundtype) {
        this.soundtype = soundtype;
    }

    /**
     * @param hardness
     */
    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    /**
     * @param material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @param harvesttool
     * @param harvestlevel
     */
    public void setHarvest(String harvesttool, int harvestlevel) {
        this.harvesttool = harvesttool;
        this.harvestlevel = harvestlevel;
    }

    /**
     * @param blocktoreplace
     * @param hasmeta
     */
    public void setBlockToReplace(Block blocktoreplace, boolean hasmeta) {
		this.replace = blocktoreplace;
		this.metab = hasmeta;
	}

    /**
     * @param blocktoreplace
     * @param hasmeta
     * @param meta
     */
	public void setBlockToReplace(Block blocktoreplace, boolean hasmeta, int meta) {
		this.replace = blocktoreplace;
		this.metab = hasmeta;
		this.meta = meta;
	}
}
