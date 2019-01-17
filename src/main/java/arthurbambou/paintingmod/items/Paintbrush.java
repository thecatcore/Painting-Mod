package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.*;
import arthurbambou.paintingmod.registery.ModItems;
import arthurbambou.paintingmod.utils.PaintFunctions;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
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
        BlockPos blockPos = var1.getPos();
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
        return super.useOnBlock(var1);
    }
}
