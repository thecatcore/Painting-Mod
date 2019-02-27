package fr.arthurbambou.paintingmod.items;

import fr.arthurbambou.paintingmod.api.ColoredFunctionRegistry;
import fr.arthurbambou.paintingmod.api.ColoredObjectRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.EnumActionResult;
import net.minecraftforge.common.ToolType;

public class HeatGun extends ItemBase {
    public HeatGun(Properties p_i48487_1_) {
        super(p_i48487_1_);
        setRegistryName("heat_gun");
    }

    @Override
    public EnumActionResult onItemUse(ItemUseContext p_195939_1_) {
        ColoredObjectRegistry.registry.forEach(coloredObject -> {
            ColoredFunctionRegistry.registry.forEach(coloredFunction -> {
                coloredFunction.unPaint(coloredObject, p_195939_1_.getWorld(), p_195939_1_.getPos(), p_195939_1_.getPlayer());
            });
        });
        return super.onItemUse(p_195939_1_);
    }
}
