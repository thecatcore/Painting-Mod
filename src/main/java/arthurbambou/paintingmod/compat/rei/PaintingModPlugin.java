package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.Registry;
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
    }
    
    @Override
    public void registerRecipeDisplays(RecipeHelper recipeHelper) {
        recipeHelper.registerDisplay(HAMMER, new DisplayHammer());
        for(ColoredObject coloredObject : Registry.getColoredObjectList())
            recipeHelper.registerDisplay(HEATGUN, new DisplayHeatGun(coloredObject));
    }
    
    @Override
    public void registerSpeedCraft(RecipeHelper recipeHelper) {
        recipeHelper.registerSpeedCraftButtonArea(HAMMER, null);
        recipeHelper.registerSpeedCraftButtonArea(HEATGUN, null);
    }
    
}
