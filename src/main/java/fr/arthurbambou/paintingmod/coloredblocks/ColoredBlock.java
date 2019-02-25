package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import fr.arthurbambou.paintingmod.registry.ModBlocks;
import net.minecraft.block.Block;

public class ColoredBlock extends ColoredObject {
    public ColoredBlock(Block replace) {
        super(replace, PaintingMod.MODID);
        ModBlocks.COLORED_OBJECTS.add(this);
    }

    @Override
    public void createBlocks() {
        this.black = new NormalBlock("black_" + this.name, this.settings);
        this.red = new NormalBlock("red_" + this.name, this.settings);
        this.green = new NormalBlock("green_" + this.name, this.settings);
        this.brown = new NormalBlock("brown_" + this.name, this.settings);
        this.blue = new NormalBlock("blue_" + this.name, this.settings);
        this.purple = new NormalBlock("purple_" + this.name, this.settings);
        this.cyan = new NormalBlock("cyan_" + this.name, this.settings);
        this.lightgray = new NormalBlock("light_gray_" + this.name, this.settings);
        this.gray = new NormalBlock("gray_" + this.name, this.settings);
        this.pink = new NormalBlock("pink_" + this.name, this.settings);
        this.lime = new NormalBlock("lime_" + this.name, this.settings);
        this.yellow = new NormalBlock("yellow_" + this.name, this.settings);
        this.lightblue = new NormalBlock("light_blue_" + this.name, this.settings);
        this.magenta = new NormalBlock("magenta_" + this.name, this.settings);
        this.orange = new NormalBlock("orange_" + this.name, this.settings);
        this.white = new NormalBlock("white_" + this.name, this.settings);
    }
}
