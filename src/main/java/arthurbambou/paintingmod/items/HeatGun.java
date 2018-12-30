package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PaintingMod;
import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.Registry;
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
            heatgun(var1.getWorld(), var1.getPos(), coloredBlock, var1.getItemStack());
        }
        return super.useOnBlock(var1);
    }

    private void heatgun(World worldIn, BlockPos pos, ColoredBlock coloredblock, ItemStack itemStack) {
        if (worldIn.getBlockState(pos).getBlock() == coloredblock.black ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.blue ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.brown ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.cyan ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.gray ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.green ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.lightblue ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.lightgray ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.lime ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.magenta ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.orange ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.pink ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.purple ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.red ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.white ||
                worldIn.getBlockState(pos).getBlock() == coloredblock.yellow) {

                worldIn.setBlockState(pos, coloredblock.replace.getDefaultState());
                itemStack.setDamage(itemStack.getDamage());
        }
    }
}
