package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.ColoredFallingBlockMeta;
import arthurbambou.paintingmod.api.EnumPaintColor;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMIMetaName;
import arthurbambou.paintingmod.util.PTMItemBlockVariant;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PTMColoredFallingBlockMeta extends ColoredFallingBlockMeta implements PTMIHasModel, PTMIMetaName {

    public PTMColoredFallingBlockMeta(String name, Material materialIn, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel, Block replace) {
        super(materialIn, replace);
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
//        for (EnumPaintColor color : EnumPaintColor.values()) {
//            this.setTranslationKey(color.getTranslationKey() + "_" + name);
//            this.blockState.getBaseState().withProperty(COLOR, color);
//        }
        PTMBlocks.COLORED_FALLING_BLOCK_METAS.add(this);
        PTMItems.ITEMS_META.add(new PTMItemBlockVariant(this).setRegistryName(this.getRegistryName()));
    }

    public PTMColoredFallingBlockMeta(String name, Material materialIn, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel, Block replace, int replacemeta) {
        super(materialIn, replace, replacemeta);
        setRegistryName(name);
        setTranslationKey(name);
        setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
//        for (EnumPaintColor color : EnumPaintColor.values()) {
//            this.setTranslationKey(color.getTranslationKey() + "_" + name);
//            this.blockState.getBaseState().withProperty(COLOR, color);
//        }
        PTMBlocks.COLORED_FALLING_BLOCK_METAS.add(this);
        PTMItems.ITEMS_META.add(new PTMItemBlockVariant(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        for (EnumPaintColor color: EnumPaintColor.values()) {
            PTMMain.proxy.registerVariantRenderer(Item.getItemFromBlock(this), color.getDyeDamage(), color.getDyeColorName() + "_" + this.getRegistryName().toString().substring(12), "inventory");
        }
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return EnumPaintColor.byDyeDamage(stack.getMetadata()).getName();
    }
}
