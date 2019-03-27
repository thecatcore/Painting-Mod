package arthurbambou.paintingmod.mainmod.items;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class Hammer extends ItemBase {
    public Hammer(Settings settings, String name) {
        super(settings, name);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext itemUsageContext_1) {
        if (!itemUsageContext_1.getWorld().isClient) {
            Block block = itemUsageContext_1.getWorld().getBlockState(itemUsageContext_1.getBlockPos()).getBlock();
            if (block == ModBlocks.SOGGY_CLAY) {
                itemUsageContext_1.getWorld().setBlockState(itemUsageContext_1.getBlockPos(), Blocks.AIR.getDefaultState());
                ItemEntity itemEntity = new ItemEntity(itemUsageContext_1.getWorld(), itemUsageContext_1.getBlockPos().getX(), itemUsageContext_1.getBlockPos().getY(), itemUsageContext_1.getBlockPos().getZ(), new ItemStack(ModItems.EARTH_MORTAR, PaintingMod.config.general.soggyClayDropNumber));
                itemUsageContext_1.getWorld().spawnEntity(itemEntity);
            }
        }
        return super.useOnBlock(itemUsageContext_1);
    }
}
