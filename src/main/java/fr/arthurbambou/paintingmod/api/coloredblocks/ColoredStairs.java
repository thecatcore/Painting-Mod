package fr.arthurbambou.paintingmod.api.coloredblocks;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import net.minecraft.block.Block;

public abstract class ColoredStairs extends ColoredObject {
    public ColoredStairs(Block replace, String modID) {
        super(replace, modID);
    }

    public ColoredStairs(Block replace, String modID, String name) {
        super(replace, modID, name);
    }
}
