package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredFenceGateBlock;
import arthurbambou.paintingmod.blocks.ColoredSlabBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SlabBlock;

public class ColoredFenceGate {
    public FenceGateBlock black;
    public FenceGateBlock red;
    public FenceGateBlock green;
    public FenceGateBlock brown;
    public FenceGateBlock blue;
    public FenceGateBlock purple;
    public FenceGateBlock cyan;
    public FenceGateBlock lightgray;
    public FenceGateBlock gray;
    public FenceGateBlock pink;
    public FenceGateBlock lime;
    public FenceGateBlock yellow;
    public FenceGateBlock lightblue;
    public FenceGateBlock magenta;
    public FenceGateBlock orange;
    public FenceGateBlock white;
    private Block.Settings settings;
    public Block replace;
    private String name;
    public String modID;

    public ColoredFenceGate(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = PaintingMod.MODID;
        ModBlocks.COLORED_FENCE_GATES.add(this);
    }

    public void createBlocks() {
        this.black = new ColoredFenceGateBlock("black_" + this.name, this.settings, this.modID);
        this.red = new ColoredFenceGateBlock("red_" + this.name, this.settings, this.modID);
        this.green = new ColoredFenceGateBlock("green_" + this.name, this.settings, this.modID);
        this.brown = new ColoredFenceGateBlock("brown_" + this.name, this.settings, this.modID);
        this.blue = new ColoredFenceGateBlock("blue_" + this.name, this.settings, this.modID);
        this.purple = new ColoredFenceGateBlock("purple_" + this.name, this.settings, this.modID);
        this.cyan = new ColoredFenceGateBlock("cyan_" + this.name, this.settings, this.modID);
        this.lightgray = new ColoredFenceGateBlock("light_gray_" + this.name, this.settings, this.modID);
        this.gray = new ColoredFenceGateBlock("gray_" + this.name, this.settings, this.modID);
        this.pink = new ColoredFenceGateBlock("pink_" + this.name, this.settings, this.modID);
        this.lime = new ColoredFenceGateBlock("lime_" + this.name, this.settings, this.modID);
        this.yellow = new ColoredFenceGateBlock("yellow_" + this.name, this.settings, this.modID);
        this.lightblue = new ColoredFenceGateBlock("light_blue_" + this.name, this.settings, this.modID);
        this.magenta = new ColoredFenceGateBlock("magenta_" + this.name, this.settings, this.modID);
        this.orange = new ColoredFenceGateBlock("orange_" + this.name, this.settings, this.modID);
        this.white = new ColoredFenceGateBlock("white_" + this.name, this.settings, this.modID);
        Registry.registerColoredFenceGate(this);
    }

    public String getName() {
        return name;
    }
}
