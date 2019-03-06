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
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            PaintFunctions.newbloctopaint(var1);
        }
        for (ColoredStairs coloredStairs : Registry.getColoredStairsList()) {
            PaintFunctions.newstairstopaint(var1);
        }
        for (ColoredSlab coloredSlab : Registry.getColoredSlabList()) {
            PaintFunctions.newslabtopaint(var1);
        }
        for (ColoredWall coloredWall : Registry.getColoredWallList()) {
            PaintFunctions.newwalltopaint(var1);
        }
        for (ColoredFenceGate coloredFenceGate : Registry.getColoredFenceGateList()) {
            PaintFunctions.newfencegatetopaint(var1);
        }
        for (ColoredFence coloredFence : Registry.getColoredFenceList()) {
            PaintFunctions.newfencetopaint(var1);
        }
        for (ColoredPressurePlate coloredPressurePlate : Registry.getColoredPressurePlateList()) {
            PaintFunctions.newpressureplatetopaint(var1);
        }
        for (ColoredButton coloredButton : Registry.getColoredButtonList()) {
            PaintFunctions.newbuttontopaint(var1);
        }
        return super.useOnBlock(var1);
    }
}
