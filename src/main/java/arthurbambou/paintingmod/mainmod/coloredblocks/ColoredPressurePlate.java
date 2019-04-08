package arthurbambou.paintingmod.mainmod.coloredblocks;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import arthurbambou.paintingmod.mainmod.blocks.ColoredPressurePlateBlock;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;

public class ColoredPressurePlate extends ColoredObject {

    private PressurePlateBlock.Type type;

    public ColoredPressurePlate(String name, Block replace, PressurePlateBlock.Type type) {
        super(name,replace,PaintingMod.MODID);
        this.type = type;
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredPressurePlate(String name, Block replace, String modid) {
        super(name,replace,modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredPressurePlateBlock("black_" + this.name, this.type, this.settings, this.modid);
        this.red = new ColoredPressurePlateBlock("red_" + this.name, this.type,this.settings, this.modid);
        this.green = new ColoredPressurePlateBlock("green_" + this.name, this.type,this.settings, this.modid);
        this.brown = new ColoredPressurePlateBlock("brown_" + this.name, this.type,this.settings, this.modid);
        this.blue = new ColoredPressurePlateBlock("blue_" + this.name, this.type,this.settings, this.modid);
        this.purple = new ColoredPressurePlateBlock("purple_" + this.name, this.type,this.settings, this.modid);
        this.cyan = new ColoredPressurePlateBlock("cyan_" + this.name, this.type,this.settings, this.modid);
        this.lightgray = new ColoredPressurePlateBlock("light_gray_" + this.name, this.type,this.settings, this.modid);
        this.gray = new ColoredPressurePlateBlock("gray_" + this.name, this.type,this.settings, this.modid);
        this.pink = new ColoredPressurePlateBlock("pink_" + this.name, this.type,this.settings, this.modid);
        this.lime = new ColoredPressurePlateBlock("lime_" + this.name, this.type,this.settings, this.modid);
        this.yellow = new ColoredPressurePlateBlock("yellow_" + this.name, this.type,this.settings, this.modid);
        this.lightblue = new ColoredPressurePlateBlock("light_blue_" + this.name, this.type,this.settings, this.modid);
        this.magenta = new ColoredPressurePlateBlock("magenta_" + this.name, this.type,this.settings, this.modid);
        this.orange = new ColoredPressurePlateBlock("orange_" + this.name, this.type,this.settings, this.modid);
        this.white = new ColoredPressurePlateBlock("white_" + this.name, this.type,this.settings, this.modid);
        PaintingModRegistry.registerColoredObject(this);
    }
}
