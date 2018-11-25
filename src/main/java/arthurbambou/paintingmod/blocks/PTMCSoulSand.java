package arthurbambou.paintingmod.blocks;

import javax.annotation.Nullable;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSoulSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PTMCSoulSand extends Block implements PTMIHasModel{
	protected static final AxisAlignedBB SOUL_SAND_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

	public PTMCSoulSand(String string, Material material, SoundType soundtype, float hardness, float resistance,
			String harvesttool, int harvestlevel) {
		super(material);
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
		PTMMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
