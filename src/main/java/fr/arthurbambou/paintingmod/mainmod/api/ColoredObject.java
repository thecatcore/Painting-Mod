package fr.arthurbambou.paintingmod.mainmod.api;

import com.google.common.collect.HashBasedTable;
import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class ColoredObject {
    public Identifier name;

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
    public String replaceName;

    public Block.Settings blockSettings;
    private Settings settings;

    public ColoredObject(String name, Settings settings) {
        this.name = new Identifier(PaintingMod.MODID, name);
        this.settings = settings;
    }

    public ColoredObject(Identifier name,Settings settings) {
        this.name = name;
        this.settings = settings;
    }

    public String getName() {
        return this.name.getPath();
    }

    public Identifier getRegisteryName() {
        return this.name;
    }

    public abstract void createBlocks();

    public void registerBlocks() {
        for (int z = 0; z < this.settings.map.size(); z++) {
            switch ((BlockType) this.settings.map.columnMap().keySet().toArray()[z]) {
                case REPLACE:
                    Map<Block, String> map = (Map<Block, String>)this.settings.map.columnMap().values().toArray()[z];
                    this.replace = (Block) map.keySet().toArray()[0];
            }
        }
    }

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

    public static class Settings {
        private Block.Settings blockSettings;
        private HashBasedTable<Block, BlockType, String> map;

        private Settings(HashBasedTable<Block, BlockType, String> map) {
            this.map = map;
            for (int i = 0; i < map.size(); i++) {
                if (map.row((Block) map.rowKeySet().toArray()[i]).keySet().toArray()[0].equals(BlockType.REPLACE)) {
                    this.blockSettings = Block.Settings.copy((Block) map.rowKeySet().toArray()[i]);
                    break;
                }
            }
        }

        private Settings(HashBasedTable<Block, BlockType, String> map, Block.Settings settings) {
            this.map = map;
            this.blockSettings = settings;
        }

        public static Settings createSettings(HashBasedTable<Block, BlockType, String> map) {
            return new Settings(map);
        }

        public static Settings createSettings(HashBasedTable<Block, BlockType, String> map, Block.Settings settings) {
            return new Settings(map, settings);
        }

    }

    public enum BlockType {
        REPLACE,
        BLACK,
        RED,
        GREEN,
        BROWN,
        BLUE,
        PURPLE,
        CYAN,
        LIGHT_GRAY,
        GRAY,
        PINK,
        LIME,
        YELLOW,
        LIGHT_BLUE,
        MAGENTA,
        ORANGE,
        WHITE
    }
}
