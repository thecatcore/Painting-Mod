package arthurbambou.paintingmod.mainmod.items;

import arthurbambou.paintingmod.mainmod.api.*;
import arthurbambou.paintingmod.mainmod.utils.UnPaintFunctions;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class HeatGun extends ItemBase {
    public HeatGun(Settings var1) {
        super(var1, "heat_gun");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            UnPaintFunctions.unpaintblock(var1.getWorld(), var1.getBlockPos(), coloredBlock, var1.getItemStack());
        }
        for (ColoredStairs coloredStairs : Registry.getColoredStairsList()) {
            UnPaintFunctions.unpaintstairs(var1.getWorld(), var1.getBlockPos(), coloredStairs, var1.getItemStack());
        }
        for (ColoredSlab coloredSlab : Registry.getColoredSlabList()) {
            UnPaintFunctions.unpaintslab(var1.getWorld(), var1.getBlockPos(), coloredSlab, var1.getItemStack());
        }
        for (ColoredWall coloredWall : Registry.getColoredWallList()) {
            UnPaintFunctions.unpaintwall(var1.getWorld(), var1.getBlockPos(), coloredWall, var1.getItemStack());
        }
        for (ColoredFenceGate coloredFenceGate : Registry.getColoredFenceGateList()) {
            UnPaintFunctions.unpaintfencegate(var1.getWorld(), var1.getBlockPos(), coloredFenceGate, var1.getItemStack());
        }
        for (ColoredFence coloredFence : Registry.getColoredFenceList()) {
            UnPaintFunctions.unpaintfence(var1.getWorld(), var1.getBlockPos(), coloredFence, var1.getItemStack());
        }
        for (ColoredPressurePlate coloredPressurePlate : Registry.getColoredPressurePlateList()) {
            UnPaintFunctions.unpaintpressureplate(var1.getWorld(), var1.getBlockPos(), coloredPressurePlate, var1.getItemStack());
        }
        for (ColoredButton coloredButton : Registry.getColoredButtonList()) {
            UnPaintFunctions.unpaintbutton(var1.getWorld(), var1.getBlockPos(), coloredButton, var1.getItemStack());
        }
        return super.useOnBlock(var1);
    }
}
