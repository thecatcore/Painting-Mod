package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredBlockBlock;
import fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ColoredBlock extends ColoredObject {

    public ColoredBlock(String name, Block replace) {
        super(name, replace, PaintingMod.MODID);
        Identifier replaceId = Registry.BLOCK.getId(replace);
        Map<TextureFace, Identifier> map = new HashMap<>();
        map.put(TextureFace.ALL, new Identifier(replaceId.getNamespace(), "block/" + replaceId.getPath()));
        this.setTextureMap(map);
        ModBlocks.COLORED_BLOCKS.add(this);
    }

    public ColoredBlock(String name, Block replace, String modid) {
        super(name, replace, modid);
    }

    public ColoredBlock(String name,Block.Settings settings , String replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }

    @Override
    public void createBlocks() {
        this.black = new ColoredBlockBlock(this, Color.BLACK);
        this.red = new ColoredBlockBlock(this, Color.RED);
        this.green = new ColoredBlockBlock(this, Color.GREEN);
        this.brown = new ColoredBlockBlock(this, Color.BROWN);
        this.blue = new ColoredBlockBlock(this, Color.BLUE);
        this.purple = new ColoredBlockBlock(this, Color.PURPLE);
        this.cyan = new ColoredBlockBlock(this, Color.CYAN);
        this.lightgray = new ColoredBlockBlock(this, Color.LIGHT_GRAY);
        this.gray = new ColoredBlockBlock(this, Color.GRAY);
        this.pink = new ColoredBlockBlock(this, Color.PINK);
        this.lime = new ColoredBlockBlock(this, Color.LIME);
        this.yellow = new ColoredBlockBlock(this, Color.YELLOW);
        this.lightblue = new ColoredBlockBlock(this, Color.LIGHT_BLUE);
        this.magenta = new ColoredBlockBlock(this, Color.MAGENTA);
        this.orange = new ColoredBlockBlock(this, Color.ORANGE);
        this.white = new ColoredBlockBlock(this, Color.WHITE);
        PaintingModRegistry.registerColoredObject(this);
    }
}
