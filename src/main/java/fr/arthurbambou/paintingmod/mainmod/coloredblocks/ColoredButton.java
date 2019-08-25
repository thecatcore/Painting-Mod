package fr.arthurbambou.paintingmod.mainmod.coloredblocks;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public abstract class ColoredButton extends ColoredObject {
    public ColoredButton(String name, Block replace, String modid) {
        super(name, replace, modid);
    }
    public ColoredButton(String name, Block.Settings settings , Identifier replaceName, String modid) {
        super(name, settings, replaceName, modid);
    }
}
