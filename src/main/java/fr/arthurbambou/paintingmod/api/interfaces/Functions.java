package fr.arthurbambou.paintingmod.api.interfaces;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.items.Paintbrush;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface Functions {
    void paint(ColoredObject coloredObject, World world, BlockPos blockPos, EntityPlayer player, Paintbrush paintbrush);

    void unPaint(ColoredObject coloredObject, World world, BlockPos blockPos, EntityPlayer player);
}
