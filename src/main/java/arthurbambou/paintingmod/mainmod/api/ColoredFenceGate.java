package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.blocks.ColoredFenceGateBlock;
import arthurbambou.paintingmod.blocks.ColoredSlabBlock;
import arthurbambou.paintingmod.registery.ModBlocks;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.SlabBlock;

public class ColoredFenceGate extends ColoredObject {

    public ColoredFenceGate(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredFenceGate(String name, Block replace, String modid) {
        super(name,replace,modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredFenceGateBlock("black_" + this.name, this.settings, this.modid);
        this.red = new ColoredFenceGateBlock("red_" + this.name, this.settings, this.modid);
        this.green = new ColoredFenceGateBlock("green_" + this.name, this.settings, this.modid);
        this.brown = new ColoredFenceGateBlock("brown_" + this.name, this.settings, this.modid);
        this.blue = new ColoredFenceGateBlock("blue_" + this.name, this.settings, this.modid);
        this.purple = new ColoredFenceGateBlock("purple_" + this.name, this.settings, this.modid);
        this.cyan = new ColoredFenceGateBlock("cyan_" + this.name, this.settings, this.modid);
        this.lightgray = new ColoredFenceGateBlock("light_gray_" + this.name, this.settings, this.modid);
        this.gray = new ColoredFenceGateBlock("gray_" + this.name, this.settings, this.modid);
        this.pink = new ColoredFenceGateBlock("pink_" + this.name, this.settings, this.modid);
        this.lime = new ColoredFenceGateBlock("lime_" + this.name, this.settings, this.modid);
        this.yellow = new ColoredFenceGateBlock("yellow_" + this.name, this.settings, this.modid);
        this.lightblue = new ColoredFenceGateBlock("light_blue_" + this.name, this.settings, this.modid);
        this.magenta = new ColoredFenceGateBlock("magenta_" + this.name, this.settings, this.modid);
        this.orange = new ColoredFenceGateBlock("orange_" + this.name, this.settings, this.modid);
        this.white = new ColoredFenceGateBlock("white_" + this.name, this.settings, this.modid);
        Registry.registerColoredFenceGate(this);
    }
}
