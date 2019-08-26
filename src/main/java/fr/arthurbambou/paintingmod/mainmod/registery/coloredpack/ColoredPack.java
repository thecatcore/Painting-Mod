package fr.arthurbambou.paintingmod.mainmod.registery.coloredpack;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class ColoredPack {
    private String name;
    private String version;
    private List<ColoredBlockEntry> coloredBlocks;

    public ColoredPack(String name, String version, List<ColoredBlockEntry> list) {
        this.name = name;
        this.version = version;
        this.coloredBlocks = list;
    }

    public List<ColoredBlockEntry> getColoredBlocks() {
        return coloredBlocks;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}
