package fr.arthurbambou.paintingmod.api.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import net.minecraft.block.Block;

public class ColoredObject {
    public String name;
    public Block black;
    public Block red;
    public Block green;
    public Block brown;
    public Block blue;
    public Block purple;
    public Block cyan;
    public Block lightgray;
    public Block gray;
    public Block pink;
    public Block lime;
    public Block yellow;
    public Block lightblue;
    public Block magenta;
    public Block orange;
    public Block white;
    public Block replace;
    public Block.Properties settings;

    public ColoredObject(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        if (this.replace != null) {
            this.settings = Block.Properties.from(this.replace);
        }
    }

    public String getName() {
        return name;
    }

    public String getRegisteryName() {
        return PaintingMod.MODID + ":" + name;
    }

    public Block[] getBlockArray() {
        return new Block[] {black,red,green,brown,blue,purple,cyan,lightgray,gray,pink,lime,yellow,lightblue,magenta,orange,white};
    }

    public ColoredObject createBlocks() {
        return this;
    }
}
