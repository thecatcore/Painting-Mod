package arthurbambou.paintingmod.mainmod.coloredblocks;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import arthurbambou.paintingmod.mainmod.blocks.ColoredWeightedPressurePlateBlock;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredWeightedPressurePlate extends ColoredPressurePlate {
    private int weight;

    public ColoredWeightedPressurePlate(String name, Block replace, int weight) {
        super(name, replace, PaintingMod.MODID);
        this.weight = weight;
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredWeightedPressurePlateBlock("black_" + this.name, this.weight, this.settings, this.modid);
        this.red = new ColoredWeightedPressurePlateBlock("red_" + this.name, this.weight,this.settings, this.modid);
        this.green = new ColoredWeightedPressurePlateBlock("green_" + this.name, this.weight,this.settings, this.modid);
        this.brown = new ColoredWeightedPressurePlateBlock("brown_" + this.name, this.weight,this.settings, this.modid);
        this.blue = new ColoredWeightedPressurePlateBlock("blue_" + this.name, this.weight,this.settings, this.modid);
        this.purple = new ColoredWeightedPressurePlateBlock("purple_" + this.name, this.weight,this.settings, this.modid);
        this.cyan = new ColoredWeightedPressurePlateBlock("cyan_" + this.name, this.weight,this.settings, this.modid);
        this.lightgray = new ColoredWeightedPressurePlateBlock("light_gray_" + this.name, this.weight,this.settings, this.modid);
        this.gray = new ColoredWeightedPressurePlateBlock("gray_" + this.name, this.weight,this.settings, this.modid);
        this.pink = new ColoredWeightedPressurePlateBlock("pink_" + this.name, this.weight,this.settings, this.modid);
        this.lime = new ColoredWeightedPressurePlateBlock("lime_" + this.name, this.weight,this.settings, this.modid);
        this.yellow = new ColoredWeightedPressurePlateBlock("yellow_" + this.name, this.weight,this.settings, this.modid);
        this.lightblue = new ColoredWeightedPressurePlateBlock("light_blue_" + this.name, this.weight,this.settings, this.modid);
        this.magenta = new ColoredWeightedPressurePlateBlock("magenta_" + this.name, this.weight,this.settings, this.modid);
        this.orange = new ColoredWeightedPressurePlateBlock("orange_" + this.name, this.weight,this.settings, this.modid);
        this.white = new ColoredWeightedPressurePlateBlock("white_" + this.name, this.weight,this.settings, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
