package arthurbambou.paintingmod.items;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.Registry;
import arthurbambou.paintingmod.registery.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Paintbrush extends ItemBase {


    public Paintbrush(Settings settings, String name) {
        super(settings, name);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext var1) {
        World world = var1.getWorld();
        PlayerEntity playerEntity = var1.getPlayer();
        BlockPos blockPos = var1.getPos();
        for (ColoredBlock coloredBlock : Registry.getCommonBlocks()) {
            newbloctopaint(playerEntity, world, blockPos, coloredBlock);
        }
        return super.useOnBlock(var1);
    }

    private void newbloctopaint(PlayerEntity player, World worldIn, BlockPos pos,
                                ColoredBlock coloredblock) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.NORMAL_PAINTBRUSH) {

        } else {
            if (worldIn.getBlockState(pos).getBlock() == coloredblock.replace) {
                black(player, worldIn, pos, coloredblock.black);
                red(player, worldIn, pos, coloredblock.red);
                green(player, worldIn, pos, coloredblock.green);
                brown(player, worldIn, pos, coloredblock.brown);
                blue(player, worldIn, pos, coloredblock.blue);
                purple(player, worldIn, pos, coloredblock.purple);
                cyan(player, worldIn, pos, coloredblock.cyan);
                lightGray(player, worldIn, pos, coloredblock.lightgray);
                gray(player, worldIn, pos, coloredblock.gray);
                pink(player, worldIn, pos, coloredblock.pink);
                lime(player, worldIn, pos, coloredblock.lime);
                yellow(player, worldIn, pos, coloredblock.yellow);
                lightBlue(player, worldIn, pos, coloredblock.lightblue);
                magenta(player, worldIn, pos, coloredblock.magenta);
                orange(player, worldIn, pos, coloredblock.orange);
                white(player, worldIn, pos, coloredblock.white);
            }
        }

    }

    private void usedpaintbrush (PlayerEntity player) {
        player.getStackInHand(Hand.MAIN).setAmount(0);
        player.inventory.addPickBlock(new ItemStack(ModItems.NORMAL_PAINTBRUSH));
    }

    private void black (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLACK_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void red (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.RED_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void green (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GREEN_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void brown (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BROWN_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void blue (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.BLUE_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void purple (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PURPLE_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void cyan (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.CYAN_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void lightGray (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_GRAY_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void gray (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.GRAY_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void pink (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.PINK_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void lime (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIME_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void yellow (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.YELLOW_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void lightBlue (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.LIGHT_BLUE_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void magenta (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.MAGENTA_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void orange (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.ORANGE_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }

    private void white (PlayerEntity player, World worldIn, BlockPos pos, Block item) {
        if (player.getStackInHand(Hand.MAIN).getItem() == ModItems.WHITE_PAINTBRUSH) {
            worldIn.setBlockState(pos, item.getDefaultState());
            usedpaintbrush(player);
        }
    }
}
