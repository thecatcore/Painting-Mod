package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredStairsBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class ColoredStairs extends ColoredObject {
    private BlockState blockState;

    public ColoredStairs(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        this.blockState = replace.getDefaultState();
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredStairs(String name, Block replace, String modid) {
        super(name,replace,modid);
        this.blockState = replace.getDefaultState();
    }

    public ColoredStairs(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredStairsBlock("black_" + this.name, this.settings, this.blockState, this.modid);
        this.red = new ColoredStairsBlock("red_" + this.name, this.settings, this.blockState, this.modid);
        this.green = new ColoredStairsBlock("green_" + this.name, this.settings, this.blockState, this.modid);
        this.brown = new ColoredStairsBlock("brown_" + this.name, this.settings, this.blockState, this.modid);
        this.blue = new ColoredStairsBlock("blue_" + this.name, this.settings, this.blockState, this.modid);
        this.purple = new ColoredStairsBlock("purple_" + this.name, this.settings, this.blockState, this.modid);
        this.cyan = new ColoredStairsBlock("cyan_" + this.name, this.settings, this.blockState, this.modid);
        this.lightgray = new ColoredStairsBlock("light_gray_" + this.name, this.settings, this.blockState, this.modid);
        this.gray = new ColoredStairsBlock("gray_" + this.name, this.settings, this.blockState, this.modid);
        this.pink = new ColoredStairsBlock("pink_" + this.name, this.settings, this.blockState, this.modid);
        this.lime = new ColoredStairsBlock("lime_" + this.name, this.settings, this.blockState, this.modid);
        this.yellow = new ColoredStairsBlock("yellow_" + this.name, this.settings, this.blockState, this.modid);
        this.lightblue = new ColoredStairsBlock("light_blue_" + this.name, this.settings, this.blockState, this.modid);
        this.magenta = new ColoredStairsBlock("magenta_" + this.name, this.settings, this.blockState, this.modid);
        this.orange = new ColoredStairsBlock("orange_" + this.name, this.settings, this.blockState, this.modid);
        this.white = new ColoredStairsBlock("white_" + this.name, this.settings, this.blockState, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
