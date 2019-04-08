package arthurbambou.paintingmod.mainmod.items;

import arthurbambou.paintingmod.mainmod.api.ColoredFunction;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class Paintbrush extends ItemBase {


    public Paintbrush(Settings settings, String name) {
        super(settings, name);
        ModItems.PAINTBRUSHES.add(this);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        if (var1.getItemStack().getItem() != ModItems.PAINTBRUSHES.get(0)) {
            for (ColoredObject coloredObject : PaintingModRegistry.getColoredObjectList().values()) {
                for (ColoredFunction coloredFunction : PaintingModRegistry.getColoredFunctionsList().values()) {
                    coloredFunction.paint(var1, coloredObject);
                }
            }
        }
        return super.useOnBlock(var1);
    }
}
