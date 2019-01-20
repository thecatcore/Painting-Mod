package arthurbambou.paintingmod.mainmod.api;

import net.fabricmc.fabric.block.FabricBlockSettings;
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
    public Block.Settings settings;
    public String modid;

    public ColoredObject(String name, Block replace, String modid) {
        this.name = name;
        this.replace = replace;
//        this.settings = FabricBlockSettings.copy(this.replace).build();
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

    public String getRegisteryName() {
        return modid + ":" + name;
    }

    public void createBlocks() {}
}
