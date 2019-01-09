package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredStairs;
import arthurbambou.paintingmod.blocks.PTMColoredStairsBase;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;

public class BaseStairs extends ColoredStairs {
    public BaseStairs(String name, Block replace) {
        super(name, replace);
        register();
        PTMBlocks.COLORED_STAIRS_META_LIST.add(this);
    }

    public void register() {
        this.black = new PTMColoredStairsBase("black_" + this.name, this.replace);
        this.red = new PTMColoredStairsBase("red_" + this.name, this.replace);
        this.green = new PTMColoredStairsBase("green_" + this.name, this.replace);
        this.brown = new PTMColoredStairsBase("brown_" + this.name, this.replace);
        this.blue = new PTMColoredStairsBase("blue_" + this.name, this.replace);
        this.purple = new PTMColoredStairsBase("purple_" + this.name, this.replace);
        this.cyan = new PTMColoredStairsBase("cyan_" + this.name, this.replace);
        this.lightgray = new PTMColoredStairsBase("light_gray_" + this.name, this.replace);
        this.gray = new PTMColoredStairsBase("gray_" + this.name, this.replace);
        this.pink = new PTMColoredStairsBase("pink_" + this.name, this.replace);
        this.lime = new PTMColoredStairsBase("lime_" + this.name, this.replace);
        this.yellow = new PTMColoredStairsBase("yellow_" + this.name, this.replace);
        this.lightblue = new PTMColoredStairsBase("light_blue_" + this.name, this.replace);
        this.magenta = new PTMColoredStairsBase("magenta_" + this.name, this.replace);
        this.orange = new PTMColoredStairsBase("orange_" + this.name, this.replace);
        this.white = new PTMColoredStairsBase("white_" + this.name, this.replace);
    }
}
