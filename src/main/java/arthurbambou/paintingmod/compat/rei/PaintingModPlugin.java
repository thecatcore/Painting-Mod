package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.Registry;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import me.shedaniel.rei.api.ItemRegistry;
import me.shedaniel.rei.api.REIPlugin;
import me.shedaniel.rei.api.RecipeHelper;
import net.minecraft.util.Identifier;

public class PaintingModPlugin implements REIPlugin {
    
    public static final Identifier HAMMER = new Identifier(PaintingMod.MODID, "plugins/hammer");
    public static final Identifier PAINTBRUSH = new Identifier(PaintingMod.MODID, "plugins/paintbrush");
    public static final Identifier HEATGUN = new Identifier(PaintingMod.MODID, "plugins/heatgun");
    
    @Override
    public void registerItems(ItemRegistry itemRegistry) {
    
    }
    
    @Override
    public void registerPluginCategories(RecipeHelper recipeHelper) {
        recipeHelper.registerCategory(new CategoryHammer());
        recipeHelper.registerCategory(new CategoryHeatGun());
        recipeHelper.registerCategory(new CategoryPaintBrush());
    }
    
    @Override
    public void registerRecipeDisplays(RecipeHelper recipeHelper) {
        recipeHelper.registerDisplay(HAMMER, new DisplayHammer());
        for(ColoredObject coloredObject : Registry.getColoredObjectList()) {
            recipeHelper.registerDisplay(HEATGUN, new DisplayHeatGun(coloredObject));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.BLACK_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.black.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.RED_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.red.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.GREEN_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.green.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.BROWN_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.brown.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.BLUE_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.blue.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.PURPLE_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.purple.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.CYAN_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.cyan.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.LIGHT_GRAY_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.lightgray.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.GRAY_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.gray.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.PINK_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.pink.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.LIME_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.lime.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.YELLOW_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.yellow.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.LIGHT_BLUE_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.lightblue.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.MAGENTA_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.magenta.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.ORANGE_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.orange.getItem().getDefaultStack()));
            recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(ModItems.WHITE_PAINTBRUSH.getDefaultStack(), coloredObject.replace.getItem().getDefaultStack(), coloredObject.white.getItem().getDefaultStack()));
        }
    }

    @Override
    public void registerOthers(RecipeHelper recipeHelper) {
        recipeHelper.registerSpeedCraftButtonArea(HAMMER, null);
        recipeHelper.registerSpeedCraftButtonArea(HEATGUN, null);
        recipeHelper.registerSpeedCraftButtonArea(PAINTBRUSH, null);
    }
    
}
