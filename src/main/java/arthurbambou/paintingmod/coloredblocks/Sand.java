package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.PTMCSand;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Sand extends ColoredBlock {
    public Sand(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab) {
        super(name,  hardness, resistance,  replace);
        registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        PTMBlocks.COLORED_BLOCKS.add(this);
    }

    public void registerBlocks (String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel) {

        this.black = new PTMCSand("black_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.red = new PTMCSand("red_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.green = new PTMCSand("green_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.brown = new PTMCSand("brown_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.blue = new PTMCSand("blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.purple = new PTMCSand("purple_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.cyan = new PTMCSand("cyan_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightgray = new PTMCSand("light_gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.gray = new PTMCSand("gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.pink = new PTMCSand("pink_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lime = new PTMCSand("lime_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.yellow = new PTMCSand("yellow_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightblue = new PTMCSand("light_blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.magenta = new PTMCSand("magenta_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.orange = new PTMCSand("orange_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.white = new PTMCSand("white_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);

    }
}
