package fr.arthurbambou.paintingmod.mainmod.api;

import net.minecraft.util.Identifier;

public interface ColoredBlock {

    ColoredObject getColoredObject();

    ColoredObject.Color getColor();

    Identifier getIdentifier();
}
