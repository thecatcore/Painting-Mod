package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredSlabBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredSlab extends ColoredObject {

    public ColoredSlab(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredSlab(String name, Block replace, String modid) {
        super(name,replace,modid);
    }
    public ColoredSlab(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredSlabBlock(this, Color.BLACK);
        this.red = new ColoredSlabBlock(this, Color.RED);
        this.green = new ColoredSlabBlock(this, Color.GREEN);
        this.brown = new ColoredSlabBlock(this, Color.BROWN);
        this.blue = new ColoredSlabBlock(this, Color.BLUE);
        this.purple = new ColoredSlabBlock(this, Color.PURPLE);
        this.cyan = new ColoredSlabBlock(this, Color.CYAN);
        this.lightgray = new ColoredSlabBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredSlabBlock(this, Color.GRAY);
        this.pink = new ColoredSlabBlock(this, Color.PINK);
        this.lime = new ColoredSlabBlock(this, Color.LIME);
        this.yellow = new ColoredSlabBlock(this, Color.YELLOW);
        this.lightblue = new ColoredSlabBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredSlabBlock(this, Color.MAGENTA);
        this.orange = new ColoredSlabBlock(this, Color.ORANGE);
        this.white = new ColoredSlabBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
