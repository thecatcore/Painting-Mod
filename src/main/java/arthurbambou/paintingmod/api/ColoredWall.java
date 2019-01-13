package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredWallBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;

public class ColoredWall {
    public WallBlock black;
    public WallBlock red;
    public WallBlock green;
    public WallBlock brown;
    public WallBlock blue;
    public WallBlock purple;
    public WallBlock cyan;
    public WallBlock lightgray;
    public WallBlock gray;
    public WallBlock pink;
    public WallBlock lime;
    public WallBlock yellow;
    public WallBlock lightblue;
    public WallBlock magenta;
    public WallBlock orange;
    public WallBlock white;
    private Block.Settings settings;
    public Block replace;
    private String name;
    public String modID;

    public ColoredWall(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = PaintingMod.MODID;
        ModBlocks.COLORED_WALLS.add(this);
    }

    public ColoredWall(String name, Block replace, String modID) {
        this.name = name;
        this.replace = replace;
        this.settings = FabricBlockSettings.copy(this.replace).build();
        this.modID = modID;
    }

    public void createBlocks() {
        this.black = new ColoredWallBlock("black_" + this.name, this.settings, this.modID);
        this.red = new ColoredWallBlock("red_" + this.name, this.settings, this.modID);
        this.green = new ColoredWallBlock("green_" + this.name, this.settings, this.modID);
        this.brown = new ColoredWallBlock("brown_" + this.name, this.settings, this.modID);
        this.blue = new ColoredWallBlock("blue_" + this.name, this.settings, this.modID);
        this.purple = new ColoredWallBlock("purple_" + this.name, this.settings, this.modID);
        this.cyan = new ColoredWallBlock("cyan_" + this.name, this.settings, this.modID);
        this.lightgray = new ColoredWallBlock("light_gray_" + this.name, this.settings, this.modID);
        this.gray = new ColoredWallBlock("gray_" + this.name, this.settings, this.modID);
        this.pink = new ColoredWallBlock("pink_" + this.name, this.settings, this.modID);
        this.lime = new ColoredWallBlock("lime_" + this.name, this.settings, this.modID);
        this.yellow = new ColoredWallBlock("yellow_" + this.name, this.settings, this.modID);
        this.lightblue = new ColoredWallBlock("light_blue_" + this.name, this.settings, this.modID);
        this.magenta = new ColoredWallBlock("magenta_" + this.name, this.settings, this.modID);
        this.orange = new ColoredWallBlock("orange_" + this.name, this.settings, this.modID);
        this.white = new ColoredWallBlock("white_" + this.name, this.settings, this.modID);
        Registry.registerColoredWall(this);
    }

    public String getName() {
        return name;
    }
}
