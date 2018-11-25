package arthurbambou.paintingmod.api;

import arthurbambou.paintingmod.PTMMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ColoredBlockMeta extends Block {

    private int replacemeta = 0 - 1;
    private Block replace = null;

    public static final PropertyEnum<EnumPaintColor> COLOR = PropertyEnum.<EnumPaintColor>create("color", EnumPaintColor.class);

    public ColoredBlockMeta(Material materialIn, Block replace, int replacemeta) {
        super(materialIn);
        this.replace = replace;
        this.replacemeta = replacemeta;
        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumPaintColor.WHITE));
    }

    public ColoredBlockMeta(Material materialIn, Block replace) {
        super(materialIn);
        this.replace = replace;
        this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumPaintColor.WHITE));
    }

    public int damageDropped(IBlockState state)
    {
        return ((EnumPaintColor)state.getValue(COLOR)).getDyeDamage();
    }

    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (EnumPaintColor enumdyecolor : EnumPaintColor.values())
        {
            items.add(new ItemStack(this, 1, enumdyecolor.getDyeDamage()));
        }
    }

//    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
//    {
//        return (EnumPaintColor)state.getValue(COLOR);
//    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, EnumPaintColor.byDyeDamage(meta));
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((EnumPaintColor)state.getValue(COLOR)).getDyeDamage();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR});
    }

    public Block getReplace() {
        return replace;
    }

    public void setReplace(Block replace) {
        this.replace = replace;
    }

    public int getReplacemeta() {
        return replacemeta;
    }

    public void setReplacemeta(int replacemeta) {
        this.replacemeta = replacemeta;
    }

    public void registerPaintableBlock() {
        AddPaintbrush.registerSimpleBlockwithMeta(this);
    }

    @Override
    public String getLocalizedName() {
        AddPaintbrush.registerSimpleBlockwithMeta(this);
        return super.getLocalizedName();
    }
}
