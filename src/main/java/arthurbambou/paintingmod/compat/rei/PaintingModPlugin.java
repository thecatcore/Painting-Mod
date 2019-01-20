package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.PaintingMod;
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
    }

    @Override
    public void registerRecipes() {
        RecipeHelper.registerRecipe(HAMMER, new DisplayHammer());
    }

    @Override
    public void registerSpeedCraft() {
        RecipeHelper.registerSpeedCraftFunctional(HAMMER, new SpeedCraftFunctional<DefaultCraftingDisplay>() {
            @Override
            public Class[] getFunctioningFor() {
                return new Class[]{PlayerInventoryGui.class, CraftingTableGui.class};
            }

            @Override
            public boolean performAutoCraft(Gui gui, DefaultCraftingDisplay recipe) {
                if (gui.getClass().isAssignableFrom(CraftingTableGui.class))
                    ((IMixinRecipeBookGui) (((CraftingTableGui) gui).getRecipeBookGui())).getGhostSlots().reset();
                else if (gui.getClass().isAssignableFrom(PlayerInventoryGui.class))
                    ((IMixinRecipeBookGui) (((PlayerInventoryGui) gui).getRecipeBookGui())).getGhostSlots().reset();
                else return false;
                MinecraftClient.getInstance().interactionManager.clickRecipe(MinecraftClient.getInstance().player.container.syncId, recipe.getRecipe(), Gui.isShiftPressed());
                return true;
            }

            @Override
            public boolean acceptRecipe(Gui gui, DefaultCraftingDisplay recipe) {
                return gui instanceof CraftingTableGui || (gui instanceof PlayerInventoryGui && recipe.getHeight() < 3 && recipe.getWidth() < 3);
            }
        });
    }
}
