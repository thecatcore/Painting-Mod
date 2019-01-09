package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredFenceGate;
import arthurbambou.paintingmod.blocks.PTMColoredFenceGateBase;
import arthurbambou.paintingmod.init.PTMBlocks;
import net.minecraft.block.Block;

public class BaseFenceGate extends ColoredFenceGate {

    public BaseFenceGate(String name, Block replace) {
        super(name, replace);
        register();
        PTMBlocks.COLORED_FENCE_GATE_LIST.add(this);
    }

    private void register() {
        this.black = new PTMColoredFenceGateBase("black_" + this.name, this.material);
        this.red = new PTMColoredFenceGateBase("red_" + this.name, this.material);
        this.green = new PTMColoredFenceGateBase("green_" + this.name, this.material);
        this.brown = new PTMColoredFenceGateBase("brown_" + this.name, this.material);
        this.blue = new PTMColoredFenceGateBase("blue_" + this.name, this.material);
        this.purple = new PTMColoredFenceGateBase("purple_" + this.name, this.material);
        this.cyan = new PTMColoredFenceGateBase("cyan_" + this.name, this.material);
        this.lightgray = new PTMColoredFenceGateBase("light_gray_" + this.name, this.material);
        this.gray = new PTMColoredFenceGateBase("gray_" + this.name, this.material);
        this.pink = new PTMColoredFenceGateBase("pink_" + this.name, this.material);
        this.lime = new PTMColoredFenceGateBase("lime_" + this.name, this.material);
        this.yellow = new PTMColoredFenceGateBase("yellow_" + this.name, this.material);
        this.lightblue = new PTMColoredFenceGateBase("light_blue_" + this.name, this.material);
        this.magenta = new PTMColoredFenceGateBase("magenta_" + this.name, this.material);
        this.orange = new PTMColoredFenceGateBase("orange_" + this.name, this.material);
        this.white = new PTMColoredFenceGateBase("white_" + this.name, this.material);
    }
}
