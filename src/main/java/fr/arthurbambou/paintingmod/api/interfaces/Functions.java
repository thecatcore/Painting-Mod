package fr.arthurbambou.paintingmod.api.interfaces;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.items.Paintbrush;
import net.minecraft.item.ItemUseContext;

public interface Functions {
    void paint(ColoredObject coloredObject, ItemUseContext context, Paintbrush paintbrush);

    void unPaint(ColoredObject coloredObject, ItemUseContext context);
}
