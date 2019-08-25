package fr.arthurbambou.paintingmod.mainmod.registery.coloredpack;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ColoredBlockEntry {
    private String replace;
    private Map<ColoredObject.TextureFace, Identifier> textureMap;

    public ColoredBlockEntry(String replace, Map<ColoredObject.TextureFace, Identifier> textureMap) {
        this.replace = replace;
        this.textureMap = textureMap;
    }
}
