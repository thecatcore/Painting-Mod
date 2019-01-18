package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredFenceBlock;
import arthurbambou.paintingmod.blocks.ColoredWallBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.WallBlock;

public class ColoredFence extends ColoredObject{

    public ColoredFence(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredFence(String name, Block replace, String modID) {
        super(name,replace,modID);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredFenceBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredFenceBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredFenceBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredFenceBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredFenceBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredFenceBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredFenceBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredFenceBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredFenceBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredFenceBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredFenceBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredFenceBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredFenceBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredFenceBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredFenceBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredFenceBlock("white_" + this.name, this.settings, this.modid);
        Registry.registerColoredFence(this);
    }
}
