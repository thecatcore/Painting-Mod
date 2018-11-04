package arthurbambou.paintingmod.blocks;

import java.util.Random;

import arthurbambou.paintingmod.init.PTMItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMSoggyClay extends PTMBlockBase
{

	public PTMSoggyClay(String name, Material material, CreativeTabs tab)
	{
		super(name, material, tab);
		setSoundType(SoundType.SAND);
		setHardness(0.6F);
		setResistance(3.0F);
		setHarvestLevel("pickaxe", 1);
	}
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return Items.CLAY_BALL;
    }

    @Override
    public int quantityDropped(Random random){
    	int amount = 0;
    	amount = 2 + random.nextInt(2);
        return amount; 
    }

    public int quantityDroppedWithBonus(int fortune, Random random){
        if(fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune)){
            int i = random.nextInt(fortune + 2) - 1;

            if(i < 1){
                i = 1;
            }
            return this.quantityDropped(random) * (i);
        } else {
            return this.quantityDropped(random);
        }
    }
    
    /**
     * On right click on this block,
     * if the item in the main hand is the paintingmod hammer then:
     * the block disappear and 4 paintingmod earth mortar are dropped
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (!worldIn.isRemote)
        {
            ItemStack item = playerIn.getHeldItemMainhand();
            Item itemm = item.getItem();
            if(itemm == PTMItems.HAMMER) {
                worldIn.setBlockToAir(pos);
                EntityItem iitem = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(PTMItems.EARTH_MORTAR, 4, 0));
                worldIn.spawnEntity(iitem);
            }
        }
        return false;
    }

}
