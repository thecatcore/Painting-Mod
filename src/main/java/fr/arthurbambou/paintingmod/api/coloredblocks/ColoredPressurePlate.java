package fr.arthurbambou.paintingmod.api.coloredblocks;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import net.minecraft.block.Block;

public abstract class ColoredPressurePlate extends ColoredObject {
    public ColoredPressurePlate(Block replace, String modID) {
        super(replace, modID);
    }

    public ColoredPressurePlate(Block replace, String modID, String name) {
        super(replace, modID, name);
    }
}
