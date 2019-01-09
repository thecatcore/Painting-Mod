package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMColoredFenceBase extends BlockFence implements PTMIHasModel {
    public PTMColoredFenceBase(String name, Material materialIn, MapColor mapColorIn) {
        super(materialIn, mapColorIn);
        setTranslationKey(PTMReference.MOD_ID + "." + name);
        setRegistryName(name);
        setCreativeTab(PTMMain.PAINTING_MOD_FENCES);
        this.useNeighborBrightness = true;
        PTMBlocks.BLOCK_FENCE_LIST.add(this);
        PTMItems.ITEMS_META.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        PTMItems.ITEMS_ID.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels()
    {
        PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
