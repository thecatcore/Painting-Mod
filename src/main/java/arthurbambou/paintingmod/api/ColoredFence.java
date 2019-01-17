package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredFenceBlock;
import arthurbambou.paintingmod.blocks.ColoredWallBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.WallBlock;

public class ColoredFence {
    public FenceBlock black;
    public FenceBlock red;
    public FenceBlock green;
    public FenceBlock brown;
    public FenceBlock blue;
    public FenceBlock purple;
    public FenceBlock cyan;
    public FenceBlock lightgray;
    public FenceBlock gray;
    public FenceBlock pink;
    public FenceBlock lime;
    public FenceBlock yellow;
    public FenceBlock lightblue;
    public FenceBlock magenta;
    public FenceBlock orange;
    public FenceBlock white;
    private Block.Settings settings;
    public Block replace;
    private String name;
    public String modID;

    public ColoredFence(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = PaintingMod.MODID;
        ModBlocks.COLORED_FENCES.add(this);
    }

    public ColoredFence(String name, Block replace, String modID) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = modID;
    }

    public void createBlocks() {
        this.black = new ColoredFenceBlock("black_" + this.name, this.settings, this.modID);
        this.red = new ColoredFenceBlock("red_" + this.name, this.settings, this.modID);
        this.green = new ColoredFenceBlock("green_" + this.name, this.settings, this.modID);
        this.brown = new ColoredFenceBlock("brown_" + this.name, this.settings, this.modID);
        this.blue = new ColoredFenceBlock("blue_" + this.name, this.settings, this.modID);
        this.purple = new ColoredFenceBlock("purple_" + this.name, this.settings, this.modID);
        this.cyan = new ColoredFenceBlock("cyan_" + this.name, this.settings, this.modID);
        this.lightgray = new ColoredFenceBlock("light_gray_" + this.name, this.settings, this.modID);
        this.gray = new ColoredFenceBlock("gray_" + this.name, this.settings, this.modID);
        this.pink = new ColoredFenceBlock("pink_" + this.name, this.settings, this.modID);
        this.lime = new ColoredFenceBlock("lime_" + this.name, this.settings, this.modID);
        this.yellow = new ColoredFenceBlock("yellow_" + this.name, this.settings, this.modID);
        this.lightblue = new ColoredFenceBlock("light_blue_" + this.name, this.settings, this.modID);
        this.magenta = new ColoredFenceBlock("magenta_" + this.name, this.settings, this.modID);
        this.orange = new ColoredFenceBlock("orange_" + this.name, this.settings, this.modID);
        this.white = new ColoredFenceBlock("white_" + this.name, this.settings, this.modID);
        Registry.registerColoredFence(this);
    }

    public String getName() {
        return name;
    }
}
