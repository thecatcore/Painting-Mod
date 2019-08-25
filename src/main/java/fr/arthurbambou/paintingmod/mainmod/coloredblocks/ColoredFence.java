package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredFenceBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ColoredFence extends ColoredObject {

    public ColoredFence(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        Identifier replaceId = Registry.BLOCK.getId(replace);
        this.getTextureMap().put(TextureFace.ALL, new Identifier(replaceId.getNamespace(), "block/" + replaceId.getPath().replace("_fence", "")));
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredFence(String name, Block replace, String modID) {
        super(name,replace,modID);
    }
    public ColoredFence(String name,Block.Settings settings , Identifier replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredFenceBlock(this, Color.BLACK);
        this.red = new ColoredFenceBlock(this, Color.RED);
        this.green = new ColoredFenceBlock(this, Color.GREEN);
        this.brown = new ColoredFenceBlock(this, Color.BROWN);
        this.blue = new ColoredFenceBlock(this, Color.BLUE);
        this.purple = new ColoredFenceBlock(this, Color.PURPLE);
        this.cyan = new ColoredFenceBlock(this, Color.CYAN);
        this.lightgray = new ColoredFenceBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredFenceBlock(this, Color.GRAY);
        this.pink = new ColoredFenceBlock(this, Color.PINK);
        this.lime = new ColoredFenceBlock(this, Color.LIME);
        this.yellow = new ColoredFenceBlock(this, Color.YELLOW);
        this.lightblue = new ColoredFenceBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredFenceBlock(this, Color.MAGENTA);
        this.orange = new ColoredFenceBlock(this, Color.ORANGE);
        this.white = new ColoredFenceBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
