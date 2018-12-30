package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.registery.ModBlocks;
import arthurbambou.paintingmod.registery.ModItems;
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
            Block block = itemUsageContext_1.getWorld().getBlockState(itemUsageContext_1.getPos()).getBlock();
            if (block == ModBlocks.SOGGY_CLAY) {
                itemUsageContext_1.getWorld().setBlockState(itemUsageContext_1.getPos(), Blocks.AIR.getDefaultState());
                ItemEntity itemEntity = new ItemEntity(itemUsageContext_1.getWorld(), itemUsageContext_1.getPos().getX(), itemUsageContext_1.getPos().getY(), itemUsageContext_1.getPos().getZ(), new ItemStack(ModItems.EARTH_MORTAR, 4));
                itemUsageContext_1.getWorld().spawnEntity(itemEntity);
            }
        }
        return super.useOnBlock(itemUsageContext_1);
    }
}
