package fr.arthurbambou.paintingmod.mainmod.api;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public abstract class ColoredObject {
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
    public Block.Settings settings;
    public String modid;

    public ColoredObject(String name, Block replace, String modid) {
        this.name = name;
        this.replace = replace;
        if (this.replace != null) {
            this.settings = Block.Settings.copy(this.replace);
        }
        this.modid = modid;
    }

    public String getName() {
        return name;
    }

    public String getModid() {
        return modid;
    }

    public Identifier getRegisteryName() {
        return new Identifier(modid, name);
    }

    public abstract void createBlocks();

    public ArrayList<Block> getArrayList() {
        ArrayList<Block> list = new ArrayList<>();
        list.add(this.black);
        list.add(this.red);
        list.add(this.green);
        list.add(this.brown);
        list.add(this.blue);
        list.add(this.purple);
        list.add(this.cyan);
        list.add(this.lightgray);
        list.add(this.gray);
        list.add(this.pink);
        list.add(this.lime);
        list.add(this.yellow);
        list.add(this.lightblue);
        list.add(this.magenta);
        list.add(this.orange);
        list.add(this.white);

        return list;
    }
}
