package arthurbambou.paintingmod.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.function.Function;

public class ColoredSlab {
    public String name;
    public BlockSlab replaceHalf;
    public BlockSlab replaceDouble;
    public ColoredSlabHalf coloredSlabHalf;
    public ColoredSlabDouble coloredSlabDouble;
    public ColoredSlabItem coloredSlabItem;

    public ColoredSlab(String name,BlockSlab replaceHalf, BlockSlab replaceDouble) {
        this.name = name;
        this.replaceHalf = replaceHalf;
        this.replaceDouble = replaceDouble;
        this.coloredSlabHalf = new ColoredSlabHalf(this.name, this.replaceHalf);
        this.coloredSlabDouble = new ColoredSlabDouble(this.name, this.replaceDouble);
        this.coloredSlabItem = new ColoredSlabItem();
    }

    public class ColoredSlabHalf {
        public String name;
        public ColoredBlockSlab black;
        public ColoredBlockSlab red;
        public ColoredBlockSlab green;
        public ColoredBlockSlab brown;
        public ColoredBlockSlab blue;
        public ColoredBlockSlab purple;
        public ColoredBlockSlab cyan;
        public ColoredBlockSlab lightgray;
        public ColoredBlockSlab gray;
        public ColoredBlockSlab pink;
        public ColoredBlockSlab lime;
        public ColoredBlockSlab yellow;
        public ColoredBlockSlab lightblue;
        public ColoredBlockSlab magenta;
        public ColoredBlockSlab orange;
        public ColoredBlockSlab white;
        public BlockSlab replace;

        private ColoredSlabHalf(String name, BlockSlab replace) {
            this.name = name;
            this.replace = replace;
        }
    }

    public class ColoredSlabDouble {
        public String name;
        public ColoredBlockSlabDouble black;
        public ColoredBlockSlabDouble red;
        public ColoredBlockSlabDouble green;
        public ColoredBlockSlabDouble brown;
        public ColoredBlockSlabDouble blue;
        public ColoredBlockSlabDouble purple;
        public ColoredBlockSlabDouble cyan;
        public ColoredBlockSlabDouble lightgray;
        public ColoredBlockSlabDouble gray;
        public ColoredBlockSlabDouble pink;
        public ColoredBlockSlabDouble lime;
        public ColoredBlockSlabDouble yellow;
        public ColoredBlockSlabDouble lightblue;
        public ColoredBlockSlabDouble magenta;
        public ColoredBlockSlabDouble orange;
        public ColoredBlockSlabDouble white;
        public BlockSlab replace;

        private ColoredSlabDouble(String name, BlockSlab replace) {
            this.name = name;
            this.replace = replace;
        }
    }

    public class ColoredSlabItem {
        public Item black;
        public Item red;
        public Item green;
        public Item brown;
        public Item blue;
        public Item purple;
        public Item cyan;
        public Item lightgray;
        public Item gray;
        public Item pink;
        public Item lime;
        public Item yellow;
        public Item lightblue;
        public Item magenta;
        public Item orange;
        public Item white;

        private ColoredSlabItem() {

        }
    }

//    public static Item itemBlock(Block block, Function<Block, ItemBlock> supplier) {
//        ItemBlock item = supplier.apply(block);
//        if (block.getRegistryName() == null) {
//            throw new IllegalArgumentException("Cannot create ItemBlock for Block without registry name");
//        }
//        item.setRegistryName(block.getRegistryName());
//        return item;
//    }
}
