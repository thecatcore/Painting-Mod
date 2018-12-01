package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.EnumPaintColor;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMIMetaName;
import arthurbambou.paintingmod.util.PTMItemBlockVariant;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class PTMColoredBlockMetaSoulSand extends ColoredBlockMeta implements PTMIHasModel, PTMIMetaName {

    protected static final AxisAlignedBB SOUL_SAND_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

    public PTMColoredBlockMetaSoulSand(String name, Material materialIn, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel, Block replace) {
        super(materialIn, replace);
        setRegistryName(name);
        setUnlocalizedName(name);
        setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
//        for (EnumPaintColor color : EnumPaintColor.values()) {
//            this.setTranslationKey(color.getTranslationKey() + "_" + name);
//            this.blockState.getBaseState().withProperty(COLOR, color);
//        }
        PTMBlocks.COLORED_BLOCKS_META.add(this);
        PTMItems.ITEMS_META.add(new PTMItemBlockVariant(this).setRegistryName(this.getRegistryName()));
    }

    public PTMColoredBlockMetaSoulSand(String name, Material materialIn, SoundType sound, float hardness, float resistance, String harvestTool, int harvestLevel, Block replace, int replacemeta) {
        super(materialIn, replace, replacemeta);
        setRegistryName(name);
        setUnlocalizedName(name);
        setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(harvestTool,harvestLevel);
        setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS);
//        for (EnumPaintColor color : EnumPaintColor.values()) {
//            this.setTranslationKey(color.getTranslationKey() + "_" + name);
//            this.blockState.getBaseState().withProperty(COLOR, color);
//        }
        PTMBlocks.COLORED_BLOCKS_META.add(this);
        PTMItems.ITEMS_META.add(new PTMItemBlockVariant(this).setRegistryName(this.getRegistryName()));
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return SOUL_SAND_AABB;
    }

    public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.motionX *= 0.4D;
        entityIn.motionZ *= 0.4D;
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
