package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class PTMCGravel extends BlockFalling implements PTMIHasModel {

    public PTMCGravel(String string, Material material, SoundType soundtype, float hardness, float resistance,
                      String harvesttool, int harvestlevel) {
        setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
        setTranslationKey(PTMReference.MOD_ID + "." + string);
        setRegistryName(string);
        setSoundType(soundtype);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvesttool, harvestlevel);
        PTMBlocks.BLOCKS_ID.add(this);
        PTMItems.ITEMS_ID.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
