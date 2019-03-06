package fr.arthurbambou.paintingmod.api.coloredblocks;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import net.minecraft.block.Block;

public abstract class ColoredFence extends ColoredObject {
    public ColoredFence(Block replace, String modID) {
        super(replace, modID);
    }

    public ColoredFence(Block replace, String modID, String name) {
        super(replace, modID, name);
    }
}
