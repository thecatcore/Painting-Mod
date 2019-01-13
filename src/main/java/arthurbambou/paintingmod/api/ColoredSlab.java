package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredSlabBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;

public class ColoredSlab {
    public SlabBlock black;
    public SlabBlock red;
    public SlabBlock green;
    public SlabBlock brown;
    public SlabBlock blue;
    public SlabBlock purple;
    public SlabBlock cyan;
    public SlabBlock lightgray;
    public SlabBlock gray;
    public SlabBlock pink;
    public SlabBlock lime;
    public SlabBlock yellow;
    public SlabBlock lightblue;
    public SlabBlock magenta;
    public SlabBlock orange;
    public SlabBlock white;
    private Block.Settings settings;
    public Block replace;
    private String name;
    public String modID;

    public ColoredSlab(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = PaintingMod.MODID;
        ModBlocks.COLORED_SLABS.add(this);
    }

    public void createBlocks() {
        this.black = new ColoredSlabBlock("black_" + this.name, this.settings, this.modID);
        this.red = new ColoredSlabBlock("red_" + this.name, this.settings, this.modID);
        this.green = new ColoredSlabBlock("green_" + this.name, this.settings, this.modID);
        this.brown = new ColoredSlabBlock("brown_" + this.name, this.settings, this.modID);
        this.blue = new ColoredSlabBlock("blue_" + this.name, this.settings, this.modID);
        this.purple = new ColoredSlabBlock("purple_" + this.name, this.settings, this.modID);
        this.cyan = new ColoredSlabBlock("cyan_" + this.name, this.settings, this.modID);
        this.lightgray = new ColoredSlabBlock("light_gray_" + this.name, this.settings, this.modID);
        this.gray = new ColoredSlabBlock("gray_" + this.name, this.settings, this.modID);
        this.pink = new ColoredSlabBlock("pink_" + this.name, this.settings, this.modID);
        this.lime = new ColoredSlabBlock("lime_" + this.name, this.settings, this.modID);
        this.yellow = new ColoredSlabBlock("yellow_" + this.name, this.settings, this.modID);
        this.lightblue = new ColoredSlabBlock("light_blue_" + this.name, this.settings, this.modID);
        this.magenta = new ColoredSlabBlock("magenta_" + this.name, this.settings, this.modID);
        this.orange = new ColoredSlabBlock("orange_" + this.name, this.settings, this.modID);
        this.white = new ColoredSlabBlock("white_" + this.name, this.settings, this.modID);
        Registry.registerColoredSlab(this);
    }

    public String getName() {
        return name;
    }
}
