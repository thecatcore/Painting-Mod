package fr.arthurbambou.paintingmod.items;

import fr.arthurbambou.paintingmod.api.ColoredFunctionRegistry;
import fr.arthurbambou.paintingmod.api.ColoredObjectRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;

public class HeatGun extends ItemBase {
    public HeatGun(Properties p_i48487_1_) {
        super(p_i48487_1_);
        setRegistryName("heat_gun");
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        ColoredObjectRegistry.registry.forEach(coloredObject -> {
            ColoredFunctionRegistry.registry.forEach(coloredFunction -> {
                coloredFunction.unPaint(coloredObject, context);
            });
        });
        return super.onItemUseFirst(stack, context);
    }
}
