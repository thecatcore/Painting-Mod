package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredFenceGateBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ColoredFenceGate extends ColoredObject {

    public ColoredFenceGate(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredFenceGate(String name, Block replace, String modid) {
        super(name,replace,modid);
    }
    public ColoredFenceGate(Identifier replaceName, String modid) {
        super(replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredFenceGateBlock(this, Color.BLACK);
        this.red = new ColoredFenceGateBlock(this, Color.RED);
        this.green = new ColoredFenceGateBlock(this, Color.GREEN);
        this.brown = new ColoredFenceGateBlock(this, Color.BROWN);
        this.blue = new ColoredFenceGateBlock(this, Color.BLUE);
        this.purple = new ColoredFenceGateBlock(this, Color.PURPLE);
        this.cyan = new ColoredFenceGateBlock(this, Color.CYAN);
        this.lightgray = new ColoredFenceGateBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredFenceGateBlock(this, Color.GRAY);
        this.pink = new ColoredFenceGateBlock(this, Color.PINK);
        this.lime = new ColoredFenceGateBlock(this, Color.LIME);
        this.yellow = new ColoredFenceGateBlock(this, Color.YELLOW);
        this.lightblue = new ColoredFenceGateBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredFenceGateBlock(this, Color.MAGENTA);
        this.orange = new ColoredFenceGateBlock(this, Color.ORANGE);
        this.white = new ColoredFenceGateBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
