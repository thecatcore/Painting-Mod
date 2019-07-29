package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredWoodButtonBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;

public class ColoredWoodButton extends ColoredButton {
    public ColoredWoodButton(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredWoodButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }
    public ColoredWoodButton(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredWoodButtonBlock(this, Color.BLACK);
        this.red = new ColoredWoodButtonBlock(this, Color.RED);
        this.green = new ColoredWoodButtonBlock(this, Color.GREEN);
        this.brown = new ColoredWoodButtonBlock(this, Color.BROWN);
        this.blue = new ColoredWoodButtonBlock(this, Color.BLUE);
        this.purple = new ColoredWoodButtonBlock(this, Color.PURPLE);
        this.cyan = new ColoredWoodButtonBlock(this, Color.CYAN);
        this.lightgray = new ColoredWoodButtonBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredWoodButtonBlock(this, Color.GRAY);
        this.pink = new ColoredWoodButtonBlock(this, Color.PINK);
        this.lime = new ColoredWoodButtonBlock(this, Color.LIME);
        this.yellow = new ColoredWoodButtonBlock(this, Color.YELLOW);
        this.lightblue = new ColoredWoodButtonBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredWoodButtonBlock(this, Color.MAGENTA);
        this.orange = new ColoredWoodButtonBlock(this, Color.ORANGE);
        this.white = new ColoredWoodButtonBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
