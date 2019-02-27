package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredBlock;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredSlab;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalSlab;
import net.minecraft.block.Block;

public class PMColoredSlab extends ColoredSlab {
    public PMColoredSlab(Block replace) {
        super(replace, PaintingMod.MODID);
    }

    public PMColoredSlab(Block replace, String name) {
        super(replace, PaintingMod.MODID, name);
    }

    @Override
    public void createBlocks() {
        this.black = new NormalSlab("black_" + getName(), this.settings);
        this.red = new NormalSlab("red_" + getName(), this.settings);
        this.green = new NormalSlab("green_" + getName(), this.settings);
        this.brown = new NormalSlab("brown_" + getName(), this.settings);
        this.blue = new NormalSlab("blue_" + getName(), this.settings);
        this.purple = new NormalSlab("purple_" + getName(), this.settings);
        this.cyan = new NormalSlab("cyan_" + getName(), this.settings);
        this.lightgray = new NormalSlab("light_gray_" + getName(), this.settings);
        this.gray = new NormalSlab("gray_" + getName(), this.settings);
        this.pink = new NormalSlab("pink_" + getName(), this.settings);
        this.lime = new NormalSlab("lime_" + getName(), this.settings);
        this.yellow = new NormalSlab("yellow_" + getName(), this.settings);
        this.lightblue = new NormalSlab("light_blue_" + getName(), this.settings);
        this.magenta = new NormalSlab("magenta_" + getName(), this.settings);
        this.orange = new NormalSlab("orange_" + getName(), this.settings);
        this.white = new NormalSlab("white_" + getName(), this.settings);
    }
}
