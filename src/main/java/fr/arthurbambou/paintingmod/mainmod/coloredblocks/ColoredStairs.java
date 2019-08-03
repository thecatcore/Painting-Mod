package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredStairsBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;

public class ColoredStairs extends ColoredObject {
    private BlockState blockState;

    public ColoredStairs(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        this.blockState = replace.getDefaultState();
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredStairs(String name, Block replace, String modid) {
        super(name,replace,modid);
        this.blockState = replace.getDefaultState();
    }

    public ColoredStairs(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredStairsBlock(this, Color.BLACK);
        this.red = new ColoredStairsBlock(this, Color.RED);
        this.green = new ColoredStairsBlock(this, Color.GREEN);
        this.brown = new ColoredStairsBlock(this, Color.BROWN);
        this.blue = new ColoredStairsBlock(this, Color.BLUE);
        this.purple = new ColoredStairsBlock(this, Color.PURPLE);
        this.cyan = new ColoredStairsBlock(this, Color.CYAN);
        this.lightgray = new ColoredStairsBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredStairsBlock(this, Color.GRAY);
        this.pink = new ColoredStairsBlock(this, Color.PINK);
        this.lime = new ColoredStairsBlock(this, Color.LIME);
        this.yellow = new ColoredStairsBlock(this, Color.YELLOW);
        this.lightblue = new ColoredStairsBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredStairsBlock(this, Color.MAGENTA);
        this.orange = new ColoredStairsBlock(this, Color.ORANGE);
        this.white = new ColoredStairsBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
