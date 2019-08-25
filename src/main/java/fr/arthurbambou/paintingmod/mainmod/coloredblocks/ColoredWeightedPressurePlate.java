package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredWeightedPressurePlateBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ColoredWeightedPressurePlate extends ColoredPressurePlate {
    private int weight;

    public ColoredWeightedPressurePlate(String name, Block replace, int weight) {
        super(name, replace, PaintingMod.MODID);
        this.weight = weight;
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredWeightedPressurePlate(String name, Block.Settings settings , Identifier replaceName, int weight, String modid) {
        super(name, settings, replaceName, modid);
        this.weight = weight;
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredWeightedPressurePlateBlock(this, Color.BLACK, this.weight);
        this.red = new ColoredWeightedPressurePlateBlock(this, Color.RED, this.weight);
        this.green = new ColoredWeightedPressurePlateBlock(this, Color.GREEN, this.weight);
        this.brown = new ColoredWeightedPressurePlateBlock(this, Color.BROWN, this.weight);
        this.blue = new ColoredWeightedPressurePlateBlock(this, Color.BLUE, this.weight);
        this.purple = new ColoredWeightedPressurePlateBlock(this, Color.PURPLE, this.weight);
        this.cyan = new ColoredWeightedPressurePlateBlock(this, Color.CYAN, this.weight);
        this.lightgray = new ColoredWeightedPressurePlateBlock(this, Color.LIGHT_GRAY, this.weight);
        this.gray = new ColoredWeightedPressurePlateBlock(this, Color.GRAY, this.weight);
        this.pink = new ColoredWeightedPressurePlateBlock(this, Color.PINK, this.weight);
        this.lime = new ColoredWeightedPressurePlateBlock(this, Color.LIME, this.weight);
        this.yellow = new ColoredWeightedPressurePlateBlock(this, Color.YELLOW, this.weight);
        this.lightblue = new ColoredWeightedPressurePlateBlock(this, Color.LIGHT_BLUE, this.weight);
        this.magenta = new ColoredWeightedPressurePlateBlock(this, Color.MAGENTA, this.weight);
        this.orange = new ColoredWeightedPressurePlateBlock(this, Color.ORANGE, this.weight);
        this.white = new ColoredWeightedPressurePlateBlock(this, Color.WHITE, this.weight);
        PaintingModRegistry.registerColoredObject(this);
    }
}
