package fr.arthurbambou.paintingmod.mainmod.registery.coloredpack;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class ColoredBlockEntry {
    private String replace;
    private String type;
    private Map<ColoredObject.TextureFace, String> textureMap;

    public ColoredBlockEntry(String replace, String type, Map<ColoredObject.TextureFace, String> textureMap) {
        this.replace = replace;
        this.type = type;
        this.textureMap = textureMap;
    }

    public Map<ColoredObject.TextureFace, String> getTextureMapS() {
        return textureMap;
    }

    public Map<ColoredObject.TextureFace, Identifier> getTextureMapI() {
        Map<ColoredObject.TextureFace, Identifier> textureMap1 = new HashMap<>();
        Map.Entry<ColoredObject.TextureFace, String>[] entries = (Map.Entry<ColoredObject.TextureFace, String>[])textureMap.entrySet().toArray();
        for (int i = 0; i < textureMap.size(); i++) {
            textureMap1.put(entries[i].getKey(), new Identifier(entries[i].getValue()));
        }
        return textureMap1;
    }

    public String getTypeS() {
        return type;
    }

    public String getReplaceS() {
        return replace;
    }

    public Identifier getReplaceI() {
        return new Identifier(replace);
    }

    public Identifier getTypeI() {
        return new Identifier(type);
    }
}
