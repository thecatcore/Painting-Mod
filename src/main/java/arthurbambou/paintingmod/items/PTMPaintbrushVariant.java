package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMEnumPaintbrush;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMIMetaName;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PTMPaintbrushVariant extends PTMItemVariantTemplate2 implements PTMIHasModel, PTMIMetaName {
    public PTMPaintbrushVariant(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        PTMItems.ITEMS_META.add(this);
    }

    @Override
    public void registerModels() {
        for (PTMEnumPaintbrush color: PTMEnumPaintbrush.values()) {
            PTMMain.proxy.registerVariantRenderer(this, color.getDyeDamage(), color.getDyeColorName() + "_" + this.getRegistryName().toString().substring(12), "inventory");
        }
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return PTMEnumPaintbrush.byDyeDamage(stack.getMetadata()).getName();
    }
}
