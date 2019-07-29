package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredWallBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

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
        this.black = new ColoredWallBlock(this, Color.BLACK);
        this.red = new ColoredWallBlock(this, Color.RED);
        this.green = new ColoredWallBlock(this, Color.GREEN);
        this.brown = new ColoredWallBlock(this, Color.BROWN);
        this.blue = new ColoredWallBlock(this, Color.BLUE);
        this.purple = new ColoredWallBlock(this, Color.PURPLE);
        this.cyan = new ColoredWallBlock(this, Color.CYAN);
        this.lightgray = new ColoredWallBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredWallBlock(this, Color.GRAY);
        this.pink = new ColoredWallBlock(this, Color.PINK);
        this.lime = new ColoredWallBlock(this, Color.LIME);
        this.yellow = new ColoredWallBlock(this, Color.YELLOW);
        this.lightblue = new ColoredWallBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredWallBlock(this, Color.MAGENTA);
        this.orange = new ColoredWallBlock(this, Color.ORANGE);
        this.white = new ColoredWallBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }

    @Override
    public Identifier[] getTextureIds() {
        return new Identifier[0];
    }
}
