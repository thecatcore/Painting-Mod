package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.ColoredFallingBlockMeta;
import arthurbambou.paintingmod.blocks.ColoredBlockMetaSlime;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMEnumPaintbrush;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMIMetaName;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PTMPaintbrushVariant extends PTMItemVariantTemplate2 implements PTMIHasModel, PTMIMetaName {
    public PTMPaintbrushVariant(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setMaxStackSize(1);
        PTMItems.ITEMS_META.add(this);
    }

    @Override
    public void registerModels() {
        for (PTMEnumPaintbrush color: PTMEnumPaintbrush.values()) {
            PTMMain.proxy.registerVariantRenderer(this, color.getDyeDamage(), color.getDyeColorName() + "_" + this.getRegistryName().toString().substring(12), "inventory");
        }
    }

    @Override
    public String getSpecialName(ItemStack stack) {
        return PTMEnumPaintbrush.byDyeDamage(stack.getMetadata()).getName();
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        for (ColoredBlockMeta block : AddPaintbrush.getSimplecoloredblockmeta()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        for (ColoredBlockMetaSlime block : AddPaintbrush.getColoredBlockMetaSlimes()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        for (ColoredFallingBlockMeta block : AddPaintbrush.getSIMPLECOLOREDFALLINGBLOCKMETA()) {
            newbloctopaintmeta(player, worldIn, pos, block);
        }
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMeta block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredBlockMetaSlime block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
    private void newbloctopaintmeta(EntityPlayer player, World worldIn, BlockPos pos, ColoredFallingBlockMeta block) {
        if (player.getHeldItemMainhand().getMetadata() == 0) {

        } else {
            if (block.getReplacemeta() == -1 && worldIn.getBlockState(pos).getBlock() == block.getReplace()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            } else if (worldIn.getBlockState(pos).getBlock() == block.getReplace() &&
                    worldIn.getBlockState(pos).getBlock().getMetaFromState(worldIn.getBlockState(pos)) == block.getReplacemeta()) {
                for (int i = 0; i < 16; i++) {
                    if (player.getHeldItemMainhand().getMetadata() == i + 1) {
                        worldIn.setBlockState(pos, block.getStateFromMeta(i));
                        player.getHeldItemMainhand().shrink(1);
                        player.inventory.addItemStackToInventory(new ItemStack(PTMItems.PAINTBRUSHES, 1, 0));
                    }
                }
            }
        }
    }
}
