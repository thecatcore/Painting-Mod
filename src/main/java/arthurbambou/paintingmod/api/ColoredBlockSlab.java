package arthurbambou.paintingmod.api;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.Random;

public abstract class ColoredBlockSlab extends BlockSlab {
    private ColoredBlockSlabHalf coloredSlab;
    public ColoredBlockSlab(String name, String modid, ColoredBlockSlabHalf coloredSlab, Material materialIn) {
        super(materialIn);
        this.coloredSlab = coloredSlab;
        this.setTranslationKey(name);
        this.setRegistryName(new ResourceLocation(modid, name));
        IBlockState state = this.blockState.getBaseState();
        if (!this.isDouble())
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        setDefaultState(state);
        this.useNeighborBrightness = true;
    }

    @Override
    public String getTranslationKey(int meta) {
        return this.getTranslationKey();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return null;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return false;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (!this.isDouble())
            return this.getDefaultState().withProperty(HALF,
                    EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        return this.getDefaultState();
    }

    /**
     * Gets the meta from the state so it will save correctly
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble())
            return 0;
        return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return  new ItemBlock(this.coloredSlab);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { HALF });
    }
}
