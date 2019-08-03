package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredStoneButtonBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class ColoredStoneButton extends ColoredButton {
    public ColoredStoneButton(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredStoneButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }

    public ColoredStoneButton(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredStoneButtonBlock(this, Color.BLACK);
        this.red = new ColoredStoneButtonBlock(this, Color.RED);
        this.green = new ColoredStoneButtonBlock(this, Color.GREEN);
        this.brown = new ColoredStoneButtonBlock(this, Color.BROWN);
        this.blue = new ColoredStoneButtonBlock(this, Color.BLUE);
        this.purple = new ColoredStoneButtonBlock(this, Color.PURPLE);
        this.cyan = new ColoredStoneButtonBlock(this, Color.CYAN);
        this.lightgray = new ColoredStoneButtonBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredStoneButtonBlock(this, Color.GRAY);
        this.pink = new ColoredStoneButtonBlock(this, Color.PINK);
        this.lime = new ColoredStoneButtonBlock(this, Color.LIME);
        this.yellow = new ColoredStoneButtonBlock(this, Color.YELLOW);
        this.lightblue = new ColoredStoneButtonBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredStoneButtonBlock(this, Color.MAGENTA);
        this.orange = new ColoredStoneButtonBlock(this, Color.ORANGE);
        this.white = new ColoredStoneButtonBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
