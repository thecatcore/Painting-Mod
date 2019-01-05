package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredStairsBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class ColoredStairs {
    public StairsBlock black;
    public StairsBlock red;
    public StairsBlock green;
    public StairsBlock brown;
    public StairsBlock blue;
    public StairsBlock purple;
    public StairsBlock cyan;
    public StairsBlock lightgray;
    public StairsBlock gray;
    public StairsBlock pink;
    public StairsBlock lime;
    public StairsBlock yellow;
    public StairsBlock lightblue;
    public StairsBlock magenta;
    public StairsBlock orange;
    public StairsBlock white;
    private Block.Settings settings;
    private String modid;
    private BlockState blockState;
    public Block replace;
    private String name;

    public ColoredStairs(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.blockState = replace.getDefaultState();
        this.modid = PaintingMod.MODID;
        ModBlocks.COLORED_STAIRS.add(this);
    }

    public ColoredStairs(String name, Block replace, String modid) {
        this.name = name;
        this.replace = replace;
        this.modid = modid;
        this.blockState = replace.getDefaultState();
    }

    public void createBlocks() {
        copySettings(this.replace);
        this.black = new ColoredStairsBlock("black_" + this.name, this.settings, this.blockState);
        this.red = new ColoredStairsBlock("red_" + this.name, this.settings, this.blockState);
        this.green = new ColoredStairsBlock("green_" + this.name, this.settings, this.blockState);
        this.brown = new ColoredStairsBlock("brown_" + this.name, this.settings, this.blockState);
        this.blue = new ColoredStairsBlock("blue_" + this.name, this.settings, this.blockState);
        this.purple = new ColoredStairsBlock("purple_" + this.name, this.settings, this.blockState);
        this.cyan = new ColoredStairsBlock("cyan_" + this.name, this.settings, this.blockState);
        this.lightgray = new ColoredStairsBlock("light_gray_" + this.name, this.settings, this.blockState);
        this.gray = new ColoredStairsBlock("gray_" + this.name, this.settings, this.blockState);
        this.pink = new ColoredStairsBlock("pink_" + this.name, this.settings, this.blockState);
        this.lime = new ColoredStairsBlock("lime_" + this.name, this.settings, this.blockState);
        this.yellow = new ColoredStairsBlock("yellow_" + this.name, this.settings, this.blockState);
        this.lightblue = new ColoredStairsBlock("light_blue_" + this.name, this.settings, this.blockState);
        this.magenta = new ColoredStairsBlock("magenta_" + this.name, this.settings, this.blockState);
        this.orange = new ColoredStairsBlock("orange_" + this.name, this.settings, this.blockState);
        this.white = new ColoredStairsBlock("white_" + this.name, this.settings, this.blockState);
        Registry.registerColoredStairs(this);
    }

    public String getModid() {
        return modid;
    }

    public String getName() {
        return name;
    }

    public void copySettings(Block block) {
        this.settings = FabricBlockSettings.copy(block).build();
    }
}
