package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlockSlabDouble;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;

import java.util.function.Supplier;

public class PTMColoredSlabDouble extends ColoredBlockSlabDouble {
    public PTMColoredSlabDouble(String name, Supplier<Block> singleSlabSupplier) {
        super(singleSlabSupplier);
        this.setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
        this.setRegistryName(name);
        this.setTranslationKey(PTMReference.MOD_ID + "." + name);
        PTMBlocks.COLORED_BLOCK_SLAB_DOUBLES.add(this);
    }
}
