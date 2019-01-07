package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredItemSlab;
import arthurbambou.paintingmod.util.PTMIHasModel;
import net.minecraft.block.Block;

public class PTMColoredItemSlab extends ColoredItemSlab implements PTMIHasModel {
    public PTMColoredItemSlab(Block block, Block doubleBlock) {
        super(block, doubleBlock);
    }

    @Override
    public void registerModels()
    {
        PTMMain.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
