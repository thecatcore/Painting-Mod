package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredWoodButtonBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredWoodButton extends ColoredButton {
    public ColoredWoodButton(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredWoodButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredWoodButtonBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredWoodButtonBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredWoodButtonBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredWoodButtonBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredWoodButtonBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredWoodButtonBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredWoodButtonBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredWoodButtonBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredWoodButtonBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredWoodButtonBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredWoodButtonBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredWoodButtonBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredWoodButtonBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredWoodButtonBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredWoodButtonBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredWoodButtonBlock("white_" + this.name, this.settings, this.modid);
        Registry.registerColoredButton(this);
    }
}
