package fr.arthurbambou.paintingmod.api;

import fr.arthurbambou.paintingmod.api.interfaces.IColoredObject;
import net.minecraft.block.Block;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.registries.ForgeRegistryEntry;

public abstract class ColoredObject extends ForgeRegistryEntry<ColoredObject> implements Comparable<ColoredObject>, IStringSerializable, IColoredObject {
    private String name;
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

    public ColoredObject(Block replace, String modID) {
        this.name = replace.getRegistryName().getPath();
        this.replace = replace;
        if (this.replace != null) {
            this.settings = Block.Properties.from(this.replace);
        }
        this.setRegistryName(modID, this.name);
    }

    public ColoredObject(Block replace, String modID, String name) {
        this.name = name;
        this.replace = replace;
        if (this.replace != null) {
            this.settings = Block.Properties.from(this.replace);
        }
        this.setRegistryName(modID, this.name);
    }

    public Block[] getBlockArray() {
        return new Block[] {black,red,green,brown,blue,purple,cyan,lightgray,gray,pink,lime,yellow,lightblue,magenta,orange,white};
    }

    @Override
    public int compareTo(ColoredObject o) {
        return 0;
    }

    @Override
    public String getName() {
        return getRegistryName().getPath();
    }
}
