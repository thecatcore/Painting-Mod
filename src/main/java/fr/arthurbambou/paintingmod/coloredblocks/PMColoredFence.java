package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredBlock;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredFence;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalBlock;
import fr.arthurbambou.paintingmod.blocks.coloreds.NormalFence;
import net.minecraft.block.Block;

public class PMColoredFence extends ColoredFence {
    public PMColoredFence(Block replace) {
        super(replace, PaintingMod.MODID);
    }

    public PMColoredFence(Block replace, String name) {
        super(replace, PaintingMod.MODID, name);
    }

    @Override
    public void createBlocks() {
        this.black = new NormalFence("black_" + getName(), this.settings);
        this.red = new NormalFence("red_" + getName(), this.settings);
        this.green = new NormalFence("green_" + getName(), this.settings);
        this.brown = new NormalFence("brown_" + getName(), this.settings);
        this.blue = new NormalFence("blue_" + getName(), this.settings);
        this.purple = new NormalFence("purple_" + getName(), this.settings);
        this.cyan = new NormalFence("cyan_" + getName(), this.settings);
        this.lightgray = new NormalFence("light_gray_" + getName(), this.settings);
        this.gray = new NormalFence("gray_" + getName(), this.settings);
        this.pink = new NormalFence("pink_" + getName(), this.settings);
        this.lime = new NormalFence("lime_" + getName(), this.settings);
        this.yellow = new NormalFence("yellow_" + getName(), this.settings);
        this.lightblue = new NormalFence("light_blue_" + getName(), this.settings);
        this.magenta = new NormalFence("magenta_" + getName(), this.settings);
        this.orange = new NormalFence("orange_" + getName(), this.settings);
        this.white = new NormalFence("white_" + getName(), this.settings);
    }
}
