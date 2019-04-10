package fr.arthurbambou.paintingmod.compat.rei;

import com.google.common.collect.Lists;
import me.shedaniel.rei.api.RecipeDisplay;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Optional;

public class DisplayPaintBrush implements RecipeDisplay {

    private ItemStack paintbrush, input, output;

    public DisplayPaintBrush(ItemStack paintbrush, ItemStack input, ItemStack output) {
        this.paintbrush = paintbrush;
        this.input = input;
        this.output = output;
    }

    public ItemStack getInputItem() {
        return input;
    }

    public ItemStack getPaintbrush() {
        return paintbrush;
    }

    @Override
    public Optional getRecipe() {
        return Optional.empty();
    }

    @Override
    public List<List<ItemStack>> getInput() {
        List<List<ItemStack>> lists = getRequiredItems();
        lists.add(Lists.newArrayList(paintbrush));
        return lists;
    }

    @Override
    public List<ItemStack> getOutput() {
        return Lists.newArrayList(output);
    }

    @Override
    public Identifier getRecipeCategory() {
        return PaintingModPlugin.PAINTBRUSH;
    }

    @Override
    public List<List<ItemStack>> getRequiredItems() {
        List<List<ItemStack>> lists = Lists.newArrayList();
        lists.add(Lists.newArrayList(input));
        return lists;
    }

}
