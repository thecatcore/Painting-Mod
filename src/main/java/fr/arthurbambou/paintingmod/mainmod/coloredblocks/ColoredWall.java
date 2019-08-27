package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredWallBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredWall extends ColoredObject {

    public ColoredWall(String name, Block replace) {
        super(name,replace,PaintingMod.MODID);
        Identifier replaceId = Registry.BLOCK.getId(replace);
        this.getTextureMap().put(TextureFace.ALL, new Identifier(replaceId.getNamespace(), "block/" + replaceId.getPath().replace("_wall", "")));
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredWall(String name, Block replace, String modID) {
        super(name,replace,modID);
    }
    public ColoredWall(Identifier replaceName, String modid) {
        super(replaceName, modid);
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
}
