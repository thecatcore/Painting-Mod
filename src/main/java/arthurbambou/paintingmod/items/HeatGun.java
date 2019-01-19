package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.*;
import arthurbambou.paintingmod.utils.UnPaintFunctions;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class HeatGun extends ItemBase {
    public HeatGun(Settings var1) {
        super(var1, "heat_gun");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            UnPaintFunctions.unpaintblock(var1.getWorld(), var1.getPos(), coloredBlock, var1.getItemStack());
        }
        for (ColoredStairs coloredStairs : Registry.getColoredStairsList()) {
            UnPaintFunctions.unpaintstairs(var1.getWorld(), var1.getPos(), coloredStairs, var1.getItemStack());
        }
        for (ColoredSlab coloredSlab : Registry.getColoredSlabList()) {
            UnPaintFunctions.unpaintslab(var1.getWorld(), var1.getPos(), coloredSlab, var1.getItemStack());
        }
        for (ColoredWall coloredWall : Registry.getColoredWallList()) {
            UnPaintFunctions.unpaintwall(var1.getWorld(), var1.getPos(), coloredWall, var1.getItemStack());
        }
        for (ColoredFenceGate coloredFenceGate : Registry.getColoredFenceGateList()) {
            UnPaintFunctions.unpaintfencegate(var1.getWorld(), var1.getPos(), coloredFenceGate, var1.getItemStack());
        }
        for (ColoredFence coloredFence : Registry.getColoredFenceList()) {
            UnPaintFunctions.unpaintfence(var1.getWorld(), var1.getPos(), coloredFence, var1.getItemStack());
        }
        for (ColoredPressurePlate coloredPressurePlate : Registry.getColoredPressurePlateList()) {
            UnPaintFunctions.unpaintpressureplate(var1.getWorld(), var1.getPos(), coloredPressurePlate, var1.getItemStack());
        }
        for (ColoredButton coloredButton : Registry.getColoredButtonList()) {
            UnPaintFunctions.unpaintbutton(var1.getWorld(), var1.getPos(), coloredButton, var1.getItemStack());
        }
        return super.useOnBlock(var1);
    }
}
