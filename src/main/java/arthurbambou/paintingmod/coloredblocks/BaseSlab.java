package arthurbambou.paintingmod.coloredblocks;

import arthurbambou.paintingmod.api.ColoredBlockSlabDouble;
import arthurbambou.paintingmod.api.ColoredBlockSlabHalf;
import arthurbambou.paintingmod.api.ColoredSlab;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class BaseSlab extends ColoredSlab {
    public BaseSlab(String name, BlockSlab replace) {
        super(name, PTMReference.MOD_ID, replace);
        this.register();
        PTMBlocks.COLORED_SLAB_LIST.add(this);
    }
}
