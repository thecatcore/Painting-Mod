package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.Registry;
import arthurbambou.paintingmod.utils.UnPaintFunctions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HeatGun extends ItemBase {
    public HeatGun(Settings var1) {
        super(var1, "heat_gun");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            UnPaintFunctions.unpaintblock(var1.getWorld(), var1.getPos(), coloredBlock, var1.getItemStack());
        }
        return super.useOnBlock(var1);
    }
}
