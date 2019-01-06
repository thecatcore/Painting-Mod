package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredWall;
import arthurbambou.paintingmod.blocks.PTMColoredWallBase;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;

public class BaseWall extends ColoredWall {
    public BaseWall(String name, Block replace) {
        super(name, replace);
        register();
        PTMBlocks.COLORED_WALL_LIST.add(this);
    }

    public BaseWall(String name, Block replace, int meta) {
        super(name, replace, meta);
        register();
        PTMBlocks.COLORED_WALL_LIST.add(this);
    }

    public void register() {
        this.black = new PTMColoredWallBase("black_" + this.name, this.replace);
        this.red = new PTMColoredWallBase("red_" + this.name, this.replace);
        this.green = new PTMColoredWallBase("green_" + this.name, this.replace);
        this.brown = new PTMColoredWallBase("brown_" + this.name, this.replace);
        this.blue = new PTMColoredWallBase("blue_" + this.name, this.replace);
        this.purple = new PTMColoredWallBase("purple_" + this.name, this.replace);
        this.cyan = new PTMColoredWallBase("cyan_" + this.name, this.replace);
        this.lightgray = new PTMColoredWallBase("light_gray_" + this.name, this.replace);
        this.gray = new PTMColoredWallBase("gray_" + this.name, this.replace);
        this.pink = new PTMColoredWallBase("pink_" + this.name, this.replace);
        this.lime = new PTMColoredWallBase("lime_" + this.name, this.replace);
        this.yellow = new PTMColoredWallBase("yellow_" + this.name, this.replace);
        this.lightblue = new PTMColoredWallBase("light_blue_" + this.name, this.replace);
        this.magenta = new PTMColoredWallBase("magenta_" + this.name, this.replace);
        this.orange = new PTMColoredWallBase("orange_" + this.name, this.replace);
        this.white = new PTMColoredWallBase("white_" + this.name, this.replace);
    }
}
