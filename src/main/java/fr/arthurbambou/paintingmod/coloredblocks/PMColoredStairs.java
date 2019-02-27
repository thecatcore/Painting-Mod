package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredStairs;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalStairs;
import net.minecraft.block.Block;

public class PMColoredStairs extends ColoredStairs {
    public PMColoredStairs(Block replace) {
        super(replace, PaintingMod.MODID);
    }

    public PMColoredStairs(Block replace, String name) {
        super(replace, PaintingMod.MODID, name);
    }

    @Override
    public void createBlocks() {
        this.black = new NormalStairs("black_" + getName(), this.replace.getDefaultState(), this.settings);
        this.red = new NormalStairs("red_" + getName(), this.replace.getDefaultState(), this.settings);
        this.green = new NormalStairs("green_" + getName(), this.replace.getDefaultState(), this.settings);
        this.brown = new NormalStairs("brown_" + getName(), this.replace.getDefaultState(), this.settings);
        this.blue = new NormalStairs("blue_" + getName(), this.replace.getDefaultState(), this.settings);
        this.purple = new NormalStairs("purple_" + getName(), this.replace.getDefaultState(), this.settings);
        this.cyan = new NormalStairs("cyan_" + getName(), this.replace.getDefaultState(), this.settings);
        this.lightgray = new NormalStairs("light_gray_" + getName(), this.replace.getDefaultState(), this.settings);
        this.gray = new NormalStairs("gray_" + getName(), this.replace.getDefaultState(), this.settings);
        this.pink = new NormalStairs("pink_" + getName(), this.replace.getDefaultState(), this.settings);
        this.lime = new NormalStairs("lime_" + getName(), this.replace.getDefaultState(), this.settings);
        this.yellow = new NormalStairs("yellow_" + getName(), this.replace.getDefaultState(), this.settings);
        this.lightblue = new NormalStairs("light_blue_" + getName(), this.replace.getDefaultState(), this.settings);
        this.magenta = new NormalStairs("magenta_" + getName(), this.replace.getDefaultState(), this.settings);
        this.orange = new NormalStairs("orange_" + getName(), this.replace.getDefaultState(), this.settings);
        this.white = new NormalStairs("white_" + getName(), this.replace.getDefaultState(), this.settings);
    }
}
