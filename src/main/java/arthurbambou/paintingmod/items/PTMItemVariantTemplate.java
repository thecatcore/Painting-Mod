package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.util.PTMIMetaName;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class PTMItemVariantTemplate extends Item {
    public static final int[] DYE_COLORS = new int[] {1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320};

    public PTMItemVariantTemplate()
    {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(PTMMain.PAINTING_MOD_ITEMS);
    }

    @Override
    public String getUnlocalizedNameInefficiently(ItemStack stack) {
        return "item." + PTMReference.MOD_ID + "." + ((PTMIMetaName) this).getSpecialName(stack) + "_" + super.getUnlocalizedNameInefficiently(stack).substring(5);
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems) {
        if (this.getCreativeTab() == tab)
        {
            for (int i = 0; i < 16; ++i)
            {
                subItems.add(new ItemStack(this, 1, i));
            }
        }
    }
}
