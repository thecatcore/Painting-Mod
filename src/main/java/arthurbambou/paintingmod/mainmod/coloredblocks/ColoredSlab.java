package arthurbambou.paintingmod.mainmod.coloredblocks;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import arthurbambou.paintingmod.mainmod.blocks.ColoredSlabBlock;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredSlab extends ColoredObject {

    public ColoredSlab(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredSlab(String name, Block replace, String modid) {
        super(name,replace,modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredSlabBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredSlabBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredSlabBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredSlabBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredSlabBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredSlabBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredSlabBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredSlabBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredSlabBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredSlabBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredSlabBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredSlabBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredSlabBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredSlabBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredSlabBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredSlabBlock("white_" + this.name, this.settings, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
