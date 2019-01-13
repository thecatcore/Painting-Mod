package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredSlab;
import arthurbambou.paintingmod.api.ColoredStairs;
import arthurbambou.paintingmod.api.Registry;
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
        return super.useOnBlock(var1);
    }
}
