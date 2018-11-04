package arthurbambou.paintingmod.util.handlers;

import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class PTMRecipeHandler {

    public static void init() {
        Shaped();
        Shapeless();
    }

    private static void Shapeless() {
        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.WATER_VIAL, 8),
                Items.WATER_BUCKET,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE,
                Items.GLASS_BOTTLE);

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.DOUBLE_WATER_VIAL, 1, 0), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, 0),
                new ItemStack(PTMItems.WATER_VIAL, 1, 0)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(Items.WATER_BUCKET, 1), new Object[] {
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.DOUBLE_WATER_VIAL, 1, 0),
                new ItemStack(PTMItems.DOUBLE_WATER_VIAL, 1, 0),
                new ItemStack(PTMItems.DOUBLE_WATER_VIAL, 1, 0),
                new ItemStack(PTMItems.DOUBLE_WATER_VIAL, 1, 0)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BLACK_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 0)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BLUE_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 4)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BROWN_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 3)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.CYAN_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 6)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.GRAY_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 8)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.GREEN_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 2)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIGHT_BLUE_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 12)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIGHT_GRAY_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 7)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIME_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 10)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.MAGENTA_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 13)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.ORANGE_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 14)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.PINK_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 9)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.PURPLE_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 5)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.RED_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 1)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.WHITE_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 15)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.YELLOW_POT, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(Items.BUCKET),
                new ItemStack(PTMItems.EARTH_MORTAR),
                new ItemStack(Items.DYE, 1, 11)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BLACK_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.BLACK_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.RED_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.RED_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.GREEN_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.GREEN_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BROWN_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.BROWN_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.BLUE_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.BLUE_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.PURPLE_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.PURPLE_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.CYAN_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.CYAN_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIGHT_GRAY_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.LIGHT_GRAY_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.GRAY_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.GRAY_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.PINK_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.PINK_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIME_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.LIME_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.YELLOW_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.YELLOW_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.LIGHT_BLUE_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.LIGHT_BLUE_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.MAGENTA_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.MAGENTA_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.ORANGE_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.ORANGE_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });

        GameRegistry.addShapelessRecipe(new ItemStack(PTMItems.WHITE_PAINTBRUSH, 1), new Object[] {
                new ItemStack(PTMItems.WATER_VIAL, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.WHITE_POT, 1, OreDictionary.WILDCARD_VALUE),
                new ItemStack(PTMItems.NORMAL_PAINTBRUSH)
        });
    }

    private static void Shaped() {
        GameRegistry.addShapedRecipe(new ItemStack(PTMItems.HAMMER, 1),
                "RRR",
                "RWR",
                " W ",
                'R', Items.IRON_INGOT,
                'W', Items.STICK);

        GameRegistry.addShapedRecipe(new ItemStack(PTMItems.HEAT_GUN, 1),
                " RR",
                "CLR",
                " R ",
                'R', Items.IRON_INGOT,
                'L', Items.LAVA_BUCKET,
                'C', new ItemBlock(Blocks.COAL_BLOCK));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PTMItems.NORMAL_PAINTBRUSH, 1), new Object[] {
                "SSS",
                "PPP",
                " T ",
                'S', "string",
                'P', "plankWood",
                'T', "stickWood"
        }));

        GameRegistry.addShapedRecipe(new ItemStack(PTMBlocks.SOGGY_CLAY, 1),
                "RRR",
                "RWR",
                "RRR",
                'R', Items.CLAY_BALL,
                'W', Items.WATER_BUCKET);
    }
}