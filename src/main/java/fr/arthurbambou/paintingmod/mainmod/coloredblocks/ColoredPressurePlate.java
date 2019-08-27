package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredPressurePlateBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredPressurePlate extends ColoredObject {

    private PressurePlateBlock.ActivationRule type;

    public ColoredPressurePlate(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        if (replace == Blocks.STONE_PRESSURE_PLATE) {
            this.type = PressurePlateBlock.ActivationRule.MOBS;
        } else {
            this.type = PressurePlateBlock.ActivationRule.EVERYTHING;
        }
        Identifier replaceId = Registry.BLOCK.getId(replace);
        this.getTextureMap().put(TextureFace.ALL, new Identifier(replaceId.getNamespace(), "block/" + replaceId.getPath().replace("_pressure_plate", "")));
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredPressurePlate(String name, Block replace, String modid, PressurePlateBlock.ActivationRule type) {
        super(name,replace,modid);
        this.type = type;
    }
    public ColoredPressurePlate(Identifier replaceName, String modid, PressurePlateBlock.ActivationRule type) {
        super(replaceName, modid);
        this.type = type;
    }

    public ColoredPressurePlate(String name, Block replace, String modid) {
        super(name,replace,modid);
    }
    public ColoredPressurePlate(Identifier replaceName, String modid) {
        super(replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredPressurePlateBlock(this, Color.BLACK, this.type);
        this.red = new ColoredPressurePlateBlock(this, Color.RED, this.type);
        this.green = new ColoredPressurePlateBlock(this, Color.GREEN, this.type);
        this.brown = new ColoredPressurePlateBlock(this, Color.BROWN, this.type);
        this.blue = new ColoredPressurePlateBlock(this, Color.BLUE, this.type);
        this.purple = new ColoredPressurePlateBlock(this, Color.PURPLE, this.type);
        this.cyan = new ColoredPressurePlateBlock(this, Color.CYAN, this.type);
        this.lightgray = new ColoredPressurePlateBlock(this, Color.LIGHT_GRAY, this.type);
        this.gray = new ColoredPressurePlateBlock(this, Color.GRAY, this.type);
        this.pink = new ColoredPressurePlateBlock(this, Color.PINK, this.type);
        this.lime = new ColoredPressurePlateBlock(this, Color.LIME, this.type);
        this.yellow = new ColoredPressurePlateBlock(this, Color.YELLOW, this.type);
        this.lightblue = new ColoredPressurePlateBlock(this, Color.LIGHT_BLUE, this.type);
        this.magenta = new ColoredPressurePlateBlock(this, Color.MAGENTA, this.type);
        this.orange = new ColoredPressurePlateBlock(this, Color.ORANGE, this.type);
        this.white = new ColoredPressurePlateBlock(this, Color.WHITE, this.type);
        PaintingModRegistry.registerColoredObject(this);
    }
}
