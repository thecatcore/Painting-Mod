package arthurbambou.paintingmod.mainmod.items;

import arthurbambou.paintingmod.mainmod.api.*;
import arthurbambou.paintingmod.mainmod.utils.PaintFunctions;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Paintbrush extends ItemBase {


    public Paintbrush(Settings settings, String name) {
        super(settings, name);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        World world = var1.getWorld();
        PlayerEntity playerEntity = var1.getPlayer();
        BlockPos blockPos = var1.getBlockPos();
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            PaintFunctions.newbloctopaint(playerEntity, world, blockPos, coloredBlock);
        }
        for (ColoredStairs coloredStairs : Registry.getColoredStairsList()) {
            PaintFunctions.newstairstopaint(playerEntity, world, blockPos, coloredStairs);
        }
        for (ColoredSlab coloredSlab : Registry.getColoredSlabList()) {
            PaintFunctions.newslabtopaint(playerEntity,world,blockPos,coloredSlab);
        }
        for (ColoredWall coloredWall : Registry.getColoredWallList()) {
            PaintFunctions.newwalltopaint(playerEntity,world,blockPos,coloredWall);
        }
        for (ColoredFenceGate coloredFenceGate : Registry.getColoredFenceGateList()) {
            PaintFunctions.newfencegatetopaint(playerEntity,world,blockPos,coloredFenceGate);
        }
        for (ColoredFence coloredFence : Registry.getColoredFenceList()) {
            PaintFunctions.newfencetopaint(playerEntity, world, blockPos, coloredFence);
        }
        for (ColoredPressurePlate coloredPressurePlate : Registry.getColoredPressurePlateList()) {
            PaintFunctions.newpressureplatetopaint(playerEntity, world, blockPos, coloredPressurePlate);
        }
        for (ColoredButton coloredButton : Registry.getColoredButtonList()) {
            PaintFunctions.newbuttontopaint(playerEntity,world,blockPos,coloredButton);
        }
        return super.useOnBlock(var1);
    }
}
