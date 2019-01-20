package arthurbambou.paintingmod.mainmod.api;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.blocks.ColoredBlockBlock;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredBlock extends ColoredObject {

    public ColoredBlock(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredBlock(String name, Block replace, String modid) {
        super(name, replace, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredBlockBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredBlockBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredBlockBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredBlockBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredBlockBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredBlockBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredBlockBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredBlockBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredBlockBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredBlockBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredBlockBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredBlockBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredBlockBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredBlockBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredBlockBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredBlockBlock("white_" + this.name, this.settings, this.modid);
        Registry.registerCommonBlocks(this);
    }
}
