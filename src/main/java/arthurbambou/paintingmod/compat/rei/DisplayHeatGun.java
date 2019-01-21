package arthurbambou.paintingmod.compat.rei;

import arthurbambou.paintingmod.mainmod.api.ColoredObject;
import me.shedaniel.rei.api.IRecipeDisplay;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.Identifier;

import java.util.*;

public class DisplayHeatGun implements IRecipeDisplay {
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
    public Recipe getRecipe() {
        return null;
    }

    @Override
    public List<List<ItemStack>> getInput() {
        List<List<ItemStack>> lists = new ArrayList<>();
        order.stream().forEachOrdered(itemProvider -> {
            lists.add(Arrays.asList(new ItemStack(itemProvider.getItem())));
        });
        return lists;
    }

    @Override
    public List<ItemStack> getOutput() {
        List<ItemStack> list = new ArrayList<ItemStack>();
        list.add(output);
        return list;
    }

    @Override
    public Identifier getRecipeCategory() {
        return PaintingModPlugin.HEATGUN;
    }
}
