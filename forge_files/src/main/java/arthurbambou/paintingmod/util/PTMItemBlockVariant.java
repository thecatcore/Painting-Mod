package arthurbambou.paintingmod.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PTMItemBlockVariant extends ItemBlock {
    public PTMItemBlockVariant(Block block) {
        super(block);
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedNameInefficiently(ItemStack stack) {
        return "tile." + PTMReference.MOD_ID + "." +  ((PTMIMetaName)this.block).getSpecialName(stack) + "_" + super.getUnlocalizedNameInefficiently(stack).substring(5);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }
}
