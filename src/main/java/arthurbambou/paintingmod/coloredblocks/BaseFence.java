package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredFence;
import arthurbambou.paintingmod.blocks.PTMColoredFenceBase;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;

public class BaseFence extends ColoredFence {
    public BaseFence(String name, Block replace) {
        super(name, replace);
        register();
        PTMBlocks.COLORED_FENCE_LIST.add(this);
    }

    private void register() {
        this.black = new PTMColoredFenceBase("black_" + this.name, this.material, this.mapColor);
        this.red = new PTMColoredFenceBase("red_" + this.name, this.material, this.mapColor);
        this.green = new PTMColoredFenceBase("green_" + this.name, this.material, this.mapColor);
        this.brown = new PTMColoredFenceBase("brown_" + this.name, this.material, this.mapColor);
        this.blue = new PTMColoredFenceBase("blue_" + this.name, this.material, this.mapColor);
        this.purple = new PTMColoredFenceBase("purple_" + this.name, this.material, this.mapColor);
        this.cyan = new PTMColoredFenceBase("cyan_" + this.name, this.material, this.mapColor);
        this.lightgray = new PTMColoredFenceBase("light_gray_" + this.name, this.material, this.mapColor);
        this.gray = new PTMColoredFenceBase("gray_" + this.name, this.material, this.mapColor);
        this.pink = new PTMColoredFenceBase("pink_" + this.name, this.material, this.mapColor);
        this.lime = new PTMColoredFenceBase("lime_" + this.name, this.material, this.mapColor);
        this.yellow = new PTMColoredFenceBase("yellow_" + this.name, this.material, this.mapColor);
        this.lightblue = new PTMColoredFenceBase("light_blue_" + this.name, this.material, this.mapColor);
        this.magenta = new PTMColoredFenceBase("magenta_" + this.name, this.material, this.mapColor);
        this.orange = new PTMColoredFenceBase("orange_" + this.name, this.material, this.mapColor);
        this.white = new PTMColoredFenceBase("white_" + this.name, this.material, this.mapColor);
    }
}
