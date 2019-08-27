package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public abstract class ColoredButton extends ColoredObject {
    public ColoredButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }
    public ColoredButton(Identifier replaceName, String modid) {
        super(replaceName, modid);
    }
}
