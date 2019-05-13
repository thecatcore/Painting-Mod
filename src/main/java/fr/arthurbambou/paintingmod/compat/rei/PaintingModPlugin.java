package fr.arthurbambou.paintingmod.compat.rei;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.registery.ModItems;
import me.shedaniel.rei.api.*;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class PaintingModPlugin implements REIPluginEntry {

    public static final Identifier HAMMER = new Identifier(PaintingMod.MODID, "plugins/hammer");
    public static final Identifier PAINTBRUSH = new Identifier(PaintingMod.MODID, "plugins/paintbrush");
    public static final Identifier HEATGUN = new Identifier(PaintingMod.MODID, "plugins/heatgun");

    @Override
    public void onFirstLoad(PluginDisabler pluginDisabler) {

    }

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
        for(ColoredObject coloredObject : PaintingModRegistry.getColoredObjectList().values()) {
            recipeHelper.registerDisplay(HEATGUN, new DisplayHeatGun(coloredObject));
            for (int a = 0; a < coloredObject.getArrayList().size(); a++) {
                recipeHelper.registerDisplay(PAINTBRUSH, new DisplayPaintBrush(
                        ModItems.PAINTBRUSHES.get(a + 1).getDefaultStack(),
                        coloredObject.replace.asItem().getDefaultStack(),
                        coloredObject.getArrayList().get(a).asItem().getDefaultStack()
                ));
            }
        }
    }

    @Override
    public void registerSpeedCraft(RecipeHelper recipeHelper) {

    }

    @Override
    public void registerBounds(DisplayHelper displayHelper) {

    }

    @Override
    public void registerOthers(RecipeHelper recipeHelper) {
        recipeHelper.registerSpeedCraftButtonArea(HAMMER, null);
        recipeHelper.registerSpeedCraftButtonArea(HEATGUN, null);
        recipeHelper.registerSpeedCraftButtonArea(PAINTBRUSH, null);
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public Identifier getPluginIdentifier() {
        return new Identifier("paintingmod", "rei_compat");
    }

}
