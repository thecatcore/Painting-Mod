package fr.arthurbambou.paintingmod.mainmod.registery.coloredpack;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.util.Identifier;

import java.util.*;

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
        Set<Map.Entry<ColoredObject.TextureFace, String>> entries = textureMap.entrySet();
        for (Map.Entry<ColoredObject.TextureFace, String> entry : entries) {
            textureMap1.put(entry.getKey(), new Identifier(entry.getValue()));
        }
        return textureMap1;
    }

    public String getTypeS() {
        return type;
    }

    public String getReplaceS() {
        return replace;
    }

    public void setTextureMap(Map<ColoredObject.TextureFace, String> textureMap) {
        this.textureMap = textureMap;
    }

    public Identifier getReplaceI() {
        return new Identifier(replace);
    }

    public Identifier getTypeI() {
        return new Identifier(type);
    }

    public Identifier[] getColoredBlockIds() {
        List<Identifier> list = new ArrayList<>();
        for (ColoredObject.Color color : ColoredObject.Color.values()) {
            list.add(new Identifier(PaintingMod.MODID, color.name().toLowerCase() + "_" + this.getReplaceI().getPath()));
        }
        return (Identifier[]) list.toArray();
    }
}
