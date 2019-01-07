package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlockSlab;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class PTMColoredSlabHalf extends ColoredBlockSlab {
    public PTMColoredSlabHalf(String name, Supplier<IBlockState> parentSupplier) {
        super(parentSupplier);
        this.setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
        this.setRegistryName(name);
        this.setTranslationKey(PTMReference.MOD_ID + "." + name);
        PTMBlocks.COLORED_BLOCK_SLABS.add(this);
    }
}
