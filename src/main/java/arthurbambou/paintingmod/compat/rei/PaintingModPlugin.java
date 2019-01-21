package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.api.Registry;
import me.shedaniel.rei.api.IRecipePlugin;
import me.shedaniel.rei.api.SpeedCraftFunctional;
import me.shedaniel.rei.client.RecipeHelper;
import me.shedaniel.rei.listeners.IMixinRecipeBookGui;
import me.shedaniel.rei.plugin.DefaultCraftingDisplay;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.container.CraftingTableGui;
import net.minecraft.client.gui.ingame.PlayerInventoryGui;
import net.minecraft.util.Identifier;

public class PaintingModPlugin implements IRecipePlugin {

    static final Identifier HAMMER = new Identifier(PaintingMod.MODID, "plugins/hammer");
    static final Identifier PAINTBRUSH = new Identifier(PaintingMod.MODID, "plugins/paintbrush");
    static final Identifier HEATGUN = new Identifier(PaintingMod.MODID, "plugins/heatgun");

    @Override
    public void registerPluginCategories() {
        RecipeHelper.registerCategory(new CategoryHammer());
        RecipeHelper.registerCategory(new CategoryHeatGun());
    }

    @Override
    public void registerRecipes() {
        RecipeHelper.registerRecipe(HAMMER, new DisplayHammer());
        for (ColoredObject coloredObject : Registry.getColoredObjectList()) {
            RecipeHelper.registerRecipe(HEATGUN, new DisplayHeatGun(coloredObject));
        }
    }

    @Override
    public void registerSpeedCraft() {
        RecipeHelper.registerSpeedCraftFunctional(HAMMER, null);
        RecipeHelper.registerSpeedCraftFunctional(HEATGUN, null);
    }
}
