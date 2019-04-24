package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredWallBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredWall extends ColoredObject {

    public ColoredWall(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredWall(String name, Block replace, String modID) {
        super(name,replace,modID);
    }
    public ColoredWall(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredWallBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredWallBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredWallBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredWallBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredWallBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredWallBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredWallBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredWallBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredWallBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredWallBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredWallBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredWallBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredWallBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredWallBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredWallBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredWallBlock("white_" + this.name, this.settings, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
