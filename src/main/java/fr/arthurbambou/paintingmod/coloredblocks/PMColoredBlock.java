package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredBlock;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import net.minecraft.block.Block;

public class PMColoredBlock extends ColoredBlock {
    public PMColoredBlock(Block replace) {
        super(replace, PaintingMod.MODID);
    }

    public PMColoredBlock(Block replace, String name) {
        super(replace, PaintingMod.MODID, name);
    }

    @Override
    public void createBlocks() {
        this.black = new NormalBlock("black_" + getName(), this.settings);
        this.red = new NormalBlock("red_" + getName(), this.settings);
        this.green = new NormalBlock("green_" + getName(), this.settings);
        this.brown = new NormalBlock("brown_" + getName(), this.settings);
        this.blue = new NormalBlock("blue_" + getName(), this.settings);
        this.purple = new NormalBlock("purple_" + getName(), this.settings);
        this.cyan = new NormalBlock("cyan_" + getName(), this.settings);
        this.lightgray = new NormalBlock("light_gray_" + getName(), this.settings);
        this.gray = new NormalBlock("gray_" + getName(), this.settings);
        this.pink = new NormalBlock("pink_" + getName(), this.settings);
        this.lime = new NormalBlock("lime_" + getName(), this.settings);
        this.yellow = new NormalBlock("yellow_" + getName(), this.settings);
        this.lightblue = new NormalBlock("light_blue_" + getName(), this.settings);
        this.magenta = new NormalBlock("magenta_" + getName(), this.settings);
        this.orange = new NormalBlock("orange_" + getName(), this.settings);
        this.white = new NormalBlock("white_" + getName(), this.settings);
    }
}
