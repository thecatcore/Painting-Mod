package fr.arthurbambou.paintingmod.mainmod.items;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredFunction;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class HeatGun extends ItemBase {
    public HeatGun(Settings var1) {
        super(var1, "heat_gun");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        for (ColoredObject coloredObject : PaintingModRegistry.getColoredObjectList().values()) {
            for (ColoredFunction coloredFunction : PaintingModRegistry.getColoredFunctionsList().values()) {
                coloredFunction.unPaint(var1, coloredObject);
            }
        }
        return super.useOnBlock(var1);
    }
}
