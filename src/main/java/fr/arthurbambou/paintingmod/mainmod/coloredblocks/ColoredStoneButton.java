package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredStoneButtonBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredStoneButton extends ColoredButton {
    public ColoredStoneButton(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredStoneButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredStoneButtonBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredStoneButtonBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredStoneButtonBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredStoneButtonBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredStoneButtonBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredStoneButtonBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredStoneButtonBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredStoneButtonBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredStoneButtonBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredStoneButtonBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredStoneButtonBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredStoneButtonBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredStoneButtonBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredStoneButtonBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredStoneButtonBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredStoneButtonBlock("white_" + this.name, this.settings, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
