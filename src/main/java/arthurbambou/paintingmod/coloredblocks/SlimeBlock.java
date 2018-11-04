package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.blocks.PTMCSlimeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SlimeBlock extends ColoredBlock {

    public SlimeBlock(String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel, Block replace, boolean metab) {
        super(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel, replace, metab);
        registerBlocks(name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        AddPaintbrush.registerSimpleBlock(this);
    }

    public void registerBlocks (String name, Material material, SoundType soundtype, float hardness, float resistance, String harvesttool, int harvestlevel) {

        this.black = new PTMCSlimeBlock("black_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.red = new PTMCSlimeBlock("red_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.green = new PTMCSlimeBlock("green_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.brown = new PTMCSlimeBlock("brown_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.blue = new PTMCSlimeBlock("blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.purple = new PTMCSlimeBlock("purple_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.cyan = new PTMCSlimeBlock("cyan_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightgray = new PTMCSlimeBlock("light_gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.gray = new PTMCSlimeBlock("gray_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.pink = new PTMCSlimeBlock("pink_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lime = new PTMCSlimeBlock("lime_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.yellow = new PTMCSlimeBlock("yellow_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.lightblue = new PTMCSlimeBlock("light_blue_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.magenta = new PTMCSlimeBlock("magenta_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.orange = new PTMCSlimeBlock("orange_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);
        this.white = new PTMCSlimeBlock("white_" + name, material, soundtype, hardness, resistance, harvesttool, harvestlevel);

    }
}
