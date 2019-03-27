package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.registery.ModBlocks;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import me.shedaniel.rei.api.RecipeDisplay;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DisplayHammer implements RecipeDisplay {
    
    @Override
    public Optional<Recipe> getRecipe() {
        return Optional.empty();
    }
    
    @Override
    public List<List<ItemStack>> getInput() {
        List<List<ItemStack>> lists = getRequiredItems();
        lists.add(Arrays.asList(getHammer()));
        return lists;
    }
    
    @Override
    public List<ItemStack> getOutput() {
        return Arrays.asList(new ItemStack(ModItems.EARTH_MORTAR, PaintingMod.config.general.soggyClayDropNumber));
    }
    
    @Override
    public Identifier getRecipeCategory() {
        return PaintingModPlugin.HAMMER;
    }
    
    @Override
    public List<List<ItemStack>> getRequiredItems() {
        List<List<ItemStack>> lists = new ArrayList<>();
        lists.add(Arrays.asList(new ItemStack(ModBlocks.SOGGY_CLAY)));
        return lists;
    }
    
    public ItemStack getHammer() {
        return new ItemStack(ModItems.HAMMER);
    }
    
}
