package arthurbambou.paintingmod.api;

import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ColoredSlab {
    public String name;
    public String modid;
    public BlockSlab replace;
    public ColoredSlabHalf coloredSlabHalf;
    public ColoredSlabDouble coloredSlabDouble;
    public ColoredItemSlab coloredItemSlab;

    public ColoredSlab(String name, String modid, BlockSlab replace) {
        this.name = name;
        this.modid = modid;
        this.replace = replace;
        this.coloredSlabHalf = new ColoredSlabHalf(this.name, this.modid, this.replace);
        this.coloredSlabDouble = new ColoredSlabDouble(this.name, this.modid, this.replace);
        this.coloredItemSlab = new ColoredItemSlab();
    }

    public class ColoredSlabHalf {
        public String name;
        public String modid;
        public ColoredBlockSlabHalf black;
        public ColoredBlockSlabHalf red;
        public ColoredBlockSlabHalf green;
        public ColoredBlockSlabHalf brown;
        public ColoredBlockSlabHalf blue;
        public ColoredBlockSlabHalf purple;
        public ColoredBlockSlabHalf cyan;
        public ColoredBlockSlabHalf lightgray;
        public ColoredBlockSlabHalf gray;
        public ColoredBlockSlabHalf pink;
        public ColoredBlockSlabHalf lime;
        public ColoredBlockSlabHalf yellow;
        public ColoredBlockSlabHalf lightblue;
        public ColoredBlockSlabHalf magenta;
        public ColoredBlockSlabHalf orange;
        public ColoredBlockSlabHalf white;
        public BlockSlab replace;

        private ColoredSlabHalf(String name, String modid, BlockSlab replace) {
            this.name = name;
            this.modid = modid;
            this.replace = replace;
        }
    }

    public class ColoredSlabDouble {
        public String name;
        public String modid;
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

        private ColoredSlabDouble(String name, String modid, BlockSlab replace) {
            this.name = name;
            this.modid = modid;
            this.replace = replace;
        }
    }

    public class ColoredItemSlab {
        public ItemSlab black;
        public ItemSlab red;
        public ItemSlab green;
        public ItemSlab brown;
        public ItemSlab blue;
        public ItemSlab purple;
        public ItemSlab cyan;
        public ItemSlab lightgray;
        public ItemSlab gray;
        public ItemSlab pink;
        public ItemSlab lime;
        public ItemSlab yellow;
        public ItemSlab lightblue;
        public ItemSlab magenta;
        public ItemSlab orange;
        public ItemSlab white;

        private ColoredItemSlab() {

        }
    }

    public void register() {
        this.coloredSlabHalf.black = new ColoredBlockSlabHalf("black_" + this.name + "_half", this.modid, this.coloredSlabHalf.black, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.red = new ColoredBlockSlabHalf("red_" + this.name + "_half", this.modid, this.coloredSlabHalf.red, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.green = new ColoredBlockSlabHalf("green_" + this.name + "_half", this.modid, this.coloredSlabHalf.green, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.brown = new ColoredBlockSlabHalf("brown_" + this.name + "_half", this.modid, this.coloredSlabHalf.brown, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.blue = new ColoredBlockSlabHalf("blue_" + this.name + "_half", this.modid, this.coloredSlabHalf.blue, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.purple = new ColoredBlockSlabHalf("purple_" + this.name + "_half", this.modid, this.coloredSlabHalf.purple, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.cyan = new ColoredBlockSlabHalf("cyan_" + this.name + "_half", this.modid, this.coloredSlabHalf.cyan, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.lightgray = new ColoredBlockSlabHalf("light_gray_" + this.name + "_half", this.modid, this.coloredSlabHalf.lightgray, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.gray = new ColoredBlockSlabHalf("gray_" + this.name + "_half", this.modid, this.coloredSlabHalf.gray, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.pink = new ColoredBlockSlabHalf("pink_" + this.name + "_half", this.modid, this.coloredSlabHalf.pink, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.lime = new ColoredBlockSlabHalf("lime_" + this.name + "_half", this.modid, this.coloredSlabHalf.lime, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.yellow = new ColoredBlockSlabHalf("yellow_" + this.name + "_half", this.modid, this.coloredSlabHalf.yellow, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.lightblue = new ColoredBlockSlabHalf("light_blue_" + this.name + "_half", this.modid, this.coloredSlabHalf.lightblue, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.magenta = new ColoredBlockSlabHalf("magenta_" + this.name + "_half", this.modid, this.coloredSlabHalf.magenta, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.orange = new ColoredBlockSlabHalf("orange_" + this.name + "_half", this.modid, this.coloredSlabHalf.orange, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabHalf.white = new ColoredBlockSlabHalf("white_" + this.name + "_half", this.modid, this.coloredSlabHalf.white, this.replace.getMaterial(this.replace.getDefaultState()));

        this.coloredSlabDouble.black = new ColoredBlockSlabDouble("black_" + this.name + "_half", this.modid, this.coloredSlabHalf.black, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.red = new ColoredBlockSlabDouble("red_" + this.name + "_half", this.modid, this.coloredSlabHalf.red, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.green = new ColoredBlockSlabDouble("green_" + this.name + "_half", this.modid, this.coloredSlabHalf.green, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.brown = new ColoredBlockSlabDouble("brown_" + this.name + "_half", this.modid, this.coloredSlabHalf.brown, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.blue = new ColoredBlockSlabDouble("blue_" + this.name + "_half", this.modid, this.coloredSlabHalf.blue, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.purple = new ColoredBlockSlabDouble("purple_" + this.name + "_half", this.modid, this.coloredSlabHalf.purple, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.cyan = new ColoredBlockSlabDouble("cyan_" + this.name + "_half", this.modid, this.coloredSlabHalf.cyan, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.lightgray = new ColoredBlockSlabDouble("light_gray_" + this.name + "_half", this.modid, this.coloredSlabHalf.lightgray, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.gray = new ColoredBlockSlabDouble("gray_" + this.name + "_half", this.modid, this.coloredSlabHalf.gray, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.pink = new ColoredBlockSlabDouble("pink_" + this.name + "_half", this.modid, this.coloredSlabHalf.pink, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.lime = new ColoredBlockSlabDouble("lime_" + this.name + "_half", this.modid, this.coloredSlabHalf.lime, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.yellow = new ColoredBlockSlabDouble("yellow_" + this.name + "_half", this.modid, this.coloredSlabHalf.yellow, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.lightblue = new ColoredBlockSlabDouble("light_blue_" + this.name + "_half", this.modid, this.coloredSlabHalf.lightblue, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.magenta = new ColoredBlockSlabDouble("magenta_" + this.name + "_half", this.modid, this.coloredSlabHalf.magenta, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.orange = new ColoredBlockSlabDouble("orange_" + this.name + "_half", this.modid, this.coloredSlabHalf.orange, this.replace.getMaterial(this.replace.getDefaultState()));
        this.coloredSlabDouble.white = new ColoredBlockSlabDouble("white_" + this.name + "_half", this.modid, this.coloredSlabHalf.white, this.replace.getMaterial(this.replace.getDefaultState()));

        this.coloredItemSlab.black = new ItemSlab(this.coloredSlabHalf.black, this.coloredSlabHalf.black, this.coloredSlabDouble.black);
        this.coloredItemSlab.red = new ItemSlab(this.coloredSlabHalf.red, this.coloredSlabHalf.red, this.coloredSlabDouble.red);
        this.coloredItemSlab.green = new ItemSlab(this.coloredSlabHalf.green, this.coloredSlabHalf.green, this.coloredSlabDouble.green);
        this.coloredItemSlab.brown = new ItemSlab(this.coloredSlabHalf.brown, this.coloredSlabHalf.brown, this.coloredSlabDouble.brown);
        this.coloredItemSlab.blue = new ItemSlab(this.coloredSlabHalf.blue, this.coloredSlabHalf.blue, this.coloredSlabDouble.blue);
        this.coloredItemSlab.purple = new ItemSlab(this.coloredSlabHalf.purple, this.coloredSlabHalf.purple, this.coloredSlabDouble.purple);
        this.coloredItemSlab.cyan = new ItemSlab(this.coloredSlabHalf.cyan, this.coloredSlabHalf.cyan, this.coloredSlabDouble.cyan);
        this.coloredItemSlab.lightgray = new ItemSlab(this.coloredSlabHalf.lightgray, this.coloredSlabHalf.lightgray, this.coloredSlabDouble.lightgray);
        this.coloredItemSlab.gray = new ItemSlab(this.coloredSlabHalf.gray, this.coloredSlabHalf.gray, this.coloredSlabDouble.gray);
        this.coloredItemSlab.pink = new ItemSlab(this.coloredSlabHalf.pink, this.coloredSlabHalf.pink, this.coloredSlabDouble.pink);
        this.coloredItemSlab.lime = new ItemSlab(this.coloredSlabHalf.lime, this.coloredSlabHalf.lime, this.coloredSlabDouble.lime);
        this.coloredItemSlab.yellow = new ItemSlab(this.coloredSlabHalf.yellow, this.coloredSlabHalf.yellow, this.coloredSlabDouble.yellow);
        this.coloredItemSlab.lightblue = new ItemSlab(this.coloredSlabHalf.lightblue, this.coloredSlabHalf.lightblue, this.coloredSlabDouble.lightblue);
        this.coloredItemSlab.magenta = new ItemSlab(this.coloredSlabHalf.magenta, this.coloredSlabHalf.magenta, this.coloredSlabDouble.magenta);
        this.coloredItemSlab.orange = new ItemSlab(this.coloredSlabHalf.orange, this.coloredSlabHalf.orange, this.coloredSlabDouble.orange);
        this.coloredItemSlab.white = new ItemSlab(this.coloredSlabHalf.white, this.coloredSlabHalf.white, this.coloredSlabDouble.white);

    }
}
