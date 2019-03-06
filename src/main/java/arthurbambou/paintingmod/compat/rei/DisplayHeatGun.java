package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import arthurbambou.paintingmod.mainmod.registery.ModItems;
import com.google.common.collect.Lists;
import me.shedaniel.rei.api.RecipeDisplay;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DisplayHeatGun implements RecipeDisplay {
    private List<Block> order = new ArrayList<Block>();
    private ItemStack output;
    
    public DisplayHeatGun(ColoredObject coloredObject) {
        this.order.add(coloredObject.black);
        this.order.add(coloredObject.red);
        this.order.add(coloredObject.green);
        this.order.add(coloredObject.brown);
        this.order.add(coloredObject.blue);
        this.order.add(coloredObject.purple);
        this.order.add(coloredObject.cyan);
        this.order.add(coloredObject.lightgray);
        this.order.add(coloredObject.gray);
        this.order.add(coloredObject.pink);
        this.order.add(coloredObject.lime);
        this.order.add(coloredObject.yellow);
        this.order.add(coloredObject.lightblue);
        this.order.add(coloredObject.magenta);
        this.order.add(coloredObject.orange);
        this.order.add(coloredObject.white);
        this.output = new ItemStack(coloredObject.replace);
    }
    
    @Override
    public Optional<Recipe> getRecipe() {
        return Optional.empty();
    }
    
    @Override
    public List<List<ItemStack>> getInput() {
        List<List<ItemStack>> lists = getRequiredItems();
        lists.add(Arrays.asList(new ItemStack(ModItems.HEAT_GUN)));
        return lists;
    }
    
    @Override
    public List<ItemStack> getOutput() {
        return Arrays.asList(output);
    }
    
    @Override
    public List<List<ItemStack>> getRequiredItems() {
        List<List<ItemStack>> lists = Lists.newArrayList();
        List<ItemStack> list = Lists.newArrayList();
        order.stream().map(block -> new ItemStack(block)).forEach(list::add);
        lists.add(list);
        return lists;
    }
    
    @Override
    public Identifier getRecipeCategory() {
        return PaintingModPlugin.HEATGUN;
    }
}
