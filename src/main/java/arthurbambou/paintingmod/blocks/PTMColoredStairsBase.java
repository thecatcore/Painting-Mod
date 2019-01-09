package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMColoredStairsBase extends BlockStairs implements PTMIHasModel {
    public PTMColoredStairsBase(String name,Block modelState) {
        super(modelState.getDefaultState());
        setTranslationKey(PTMReference.MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(PTMMain.PAINTING_MOD_STAIRS);
        PTMBlocks.BLOCK_STAIRS_LIST.add(this);
        PTMItems.ITEMS_META.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        PTMItems.ITEMS_ID.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
