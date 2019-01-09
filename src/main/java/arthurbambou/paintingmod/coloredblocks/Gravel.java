package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.PTMCGravel;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Gravel extends ColoredBlock {
    public Gravel(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab) {
        super(name, hardness, resistance,  replace);
        registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        PTMBlocks.COLORED_BLOCKS.add(this);
    }

    public void registerBlocks (String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel) {

        this.black = new PTMCGravel("black_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.red = new PTMCGravel("red_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.green = new PTMCGravel("green_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.brown = new PTMCGravel("brown_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.blue = new PTMCGravel("blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.purple = new PTMCGravel("purple_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.cyan = new PTMCGravel("cyan_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightgray = new PTMCGravel("light_gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.gray = new PTMCGravel("gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.pink = new PTMCGravel("pink_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lime = new PTMCGravel("lime_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.yellow = new PTMCGravel("yellow_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightblue = new PTMCGravel("light_blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.magenta = new PTMCGravel("magenta_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.orange = new PTMCGravel("orange_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.white = new PTMCGravel("white_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);

    }
}
