package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredBlockSlab;
import arthurbambou.paintingmod.api.ColoredSlab;
import arthurbambou.paintingmod.blocks.PTMColoredSlabDouble;
import arthurbambou.paintingmod.blocks.PTMColoredSlabHalf;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.items.PTMColoredItemSlab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.function.Function;

public class BaseSlab extends ColoredSlab {

    public BaseSlab(String name, BlockSlab replaceHalf, BlockSlab replaceDouble) {
        super(name, replaceHalf, replaceDouble);
        register();
        PTMBlocks.COLORED_SLAB_LIST.add(this);
    }

    private void register() {
        this.coloredSlabHalf.black = new PTMColoredSlabHalf("black_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.red = new PTMColoredSlabHalf("red_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.green = new PTMColoredSlabHalf("green_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.brown = new PTMColoredSlabHalf("brown_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.blue = new PTMColoredSlabHalf("blue_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.purple = new PTMColoredSlabHalf("purple_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.cyan = new PTMColoredSlabHalf("cyan_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.lightgray = new PTMColoredSlabHalf("light_gray_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.gray = new PTMColoredSlabHalf("gray_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.pink = new PTMColoredSlabHalf("pink_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.lime = new PTMColoredSlabHalf("lime_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.yellow = new PTMColoredSlabHalf("yellow_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.lightblue = new PTMColoredSlabHalf("light_blue_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.magenta = new PTMColoredSlabHalf("magenta_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.orange = new PTMColoredSlabHalf("orange_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());
        this.coloredSlabHalf.white = new PTMColoredSlabHalf("white_" + this.name + "_slab", () -> this.coloredSlabHalf.replace.getDefaultState());

        this.coloredSlabDouble.black = new PTMColoredSlabDouble("black_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.red = new PTMColoredSlabDouble("red_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.green = new PTMColoredSlabDouble("green_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.brown = new PTMColoredSlabDouble("brown_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.blue = new PTMColoredSlabDouble("blue_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.purple = new PTMColoredSlabDouble("purple_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.cyan = new PTMColoredSlabDouble("cyan_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.lightgray = new PTMColoredSlabDouble("light_gray_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.gray = new PTMColoredSlabDouble("gray_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.pink = new PTMColoredSlabDouble("pink_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.lime = new PTMColoredSlabDouble("lime_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.yellow = new PTMColoredSlabDouble("yellow_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.lightblue = new PTMColoredSlabDouble("light_blue_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.magenta = new PTMColoredSlabDouble("magenta_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.orange = new PTMColoredSlabDouble("orange_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);
        this.coloredSlabDouble.white = new PTMColoredSlabDouble("white_" + this.name + "_slab", () -> this.coloredSlabDouble.replace);

        this.coloredSlabItem.black = itemBlock(this.coloredSlabHalf.black, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.black));
        this.coloredSlabItem.red = itemBlock(this.coloredSlabHalf.red, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.red));
        this.coloredSlabItem.green = itemBlock(this.coloredSlabHalf.green, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.green));
        this.coloredSlabItem.brown = itemBlock(this.coloredSlabHalf.brown, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.brown));
        this.coloredSlabItem.blue = itemBlock(this.coloredSlabHalf.blue, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.blue));
        this.coloredSlabItem.purple = itemBlock(this.coloredSlabHalf.purple, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.purple));
        this.coloredSlabItem.cyan = itemBlock(this.coloredSlabHalf.cyan, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.cyan));
        this.coloredSlabItem.lightgray = itemBlock(this.coloredSlabHalf.lightgray, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.lightgray));
        this.coloredSlabItem.gray = itemBlock(this.coloredSlabHalf.gray, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.gray));
        this.coloredSlabItem.pink = itemBlock(this.coloredSlabHalf.pink, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.pink));
        this.coloredSlabItem.lime = itemBlock(this.coloredSlabHalf.lime, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.lime));
        this.coloredSlabItem.yellow = itemBlock(this.coloredSlabHalf.yellow, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.yellow));
        this.coloredSlabItem.lightblue = itemBlock(this.coloredSlabHalf.lightblue, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.lightblue));
        this.coloredSlabItem.magenta = itemBlock(this.coloredSlabHalf.magenta, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.magenta));
        this.coloredSlabItem.orange = itemBlock(this.coloredSlabHalf.orange, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.orange));
        this.coloredSlabItem.white = itemBlock(this.coloredSlabHalf.white, b -> new PTMColoredItemSlab(b, this.coloredSlabDouble.black));
    }

    public static Item itemBlock(Block block, Function<Block, ItemBlock> supplier) {
        return iBRegister(ColoredSlab.itemBlock(block, supplier));
    }

    private static Item iBRegister(Item item) {
        PTMItems.ITEMS_META.add(item);
        PTMItems.ITEMS_ID.add(item);
        return item;
    }
}
