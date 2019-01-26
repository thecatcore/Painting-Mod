package arthurbambou.paintingmod.mainmod.blocks;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.ViewableWorld;

public class ColoredWallBlock extends WallBlock {
    public ColoredWallBlock(String name, Settings block$Settings_1, String modID) {
        super(block$Settings_1);
        Registry.BLOCK.register(new Identifier(modID, name), this);
        if (modID == PaintingMod.MODID) {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_WALLS)));
        } else {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.ADDON_WALLS)));
        }
    }

    private boolean shouldConnectTo(BlockState blockState_1, boolean boolean_1, Direction direction_1) {
        Block block_1 = blockState_1.getBlock();
        boolean boolean_2 = block_1 instanceof ColoredWallBlock || block_1 instanceof FenceGateBlock && FenceGateBlock.canWallConnect(blockState_1, direction_1);
        return !cannotConnectTo(block_1) && boolean_1 || boolean_2;
    }

    public static boolean cannotConnectTo(Block block_1) {
        return Block.method_9581(block_1) || block_1 == Blocks.BARRIER || block_1 == Blocks.MELON || block_1 == Blocks.PUMPKIN || block_1 == Blocks.CARVED_PUMPKIN || block_1 == Blocks.JACK_O_LANTERN || block_1 == Blocks.FROSTED_ICE || block_1 == Blocks.TNT;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext itemPlacementContext_1) {
        ViewableWorld viewableWorld_1 = itemPlacementContext_1.getWorld();
        BlockPos blockPos_1 = itemPlacementContext_1.getBlockPos();
        FluidState fluidState_1 = itemPlacementContext_1.getWorld().getFluidState(itemPlacementContext_1.getBlockPos());
        BlockPos blockPos_2 = blockPos_1.north();
        BlockPos blockPos_3 = blockPos_1.east();
        BlockPos blockPos_4 = blockPos_1.south();
        BlockPos blockPos_5 = blockPos_1.west();
        BlockState blockState_1 = viewableWorld_1.getBlockState(blockPos_2);
        BlockState blockState_2 = viewableWorld_1.getBlockState(blockPos_3);
        BlockState blockState_3 = viewableWorld_1.getBlockState(blockPos_4);
        BlockState blockState_4 = viewableWorld_1.getBlockState(blockPos_5);
        boolean boolean_1 = this.shouldConnectTo(blockState_1, Block.isFaceFullSquare(blockState_1.getCollisionShape(viewableWorld_1, blockPos_2), Direction.SOUTH), Direction.SOUTH);
        boolean boolean_2 = this.shouldConnectTo(blockState_2, Block.isFaceFullSquare(blockState_2.getCollisionShape(viewableWorld_1, blockPos_3), Direction.WEST), Direction.WEST);
        boolean boolean_3 = this.shouldConnectTo(blockState_3, Block.isFaceFullSquare(blockState_3.getCollisionShape(viewableWorld_1, blockPos_4), Direction.NORTH), Direction.NORTH);
        boolean boolean_4 = this.shouldConnectTo(blockState_4, Block.isFaceFullSquare(blockState_4.getCollisionShape(viewableWorld_1, blockPos_5), Direction.EAST), Direction.EAST);
        boolean boolean_5 = (!boolean_1 || boolean_2 || !boolean_3 || boolean_4) && (boolean_1 || !boolean_2 || boolean_3 || !boolean_4);
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.getDefaultState().with(UP, boolean_5 || !viewableWorld_1.isAir(blockPos_1.up()))).with(NORTH, boolean_1)).with(EAST, boolean_2)).with(SOUTH, boolean_3)).with(WEST, boolean_4)).with(WATERLOGGED, fluidState_1.getFluid() == Fluids.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState blockState_1, Direction direction_1, BlockState blockState_2, IWorld iWorld_1, BlockPos blockPos_1, BlockPos blockPos_2) {
        if ((Boolean)blockState_1.get(WATERLOGGED)) {
            iWorld_1.getFluidTickScheduler().schedule(blockPos_1, Fluids.WATER, Fluids.WATER.getTickRate(iWorld_1));
        }

        if (direction_1 == Direction.DOWN) {
            return super.getStateForNeighborUpdate(blockState_1, direction_1, blockState_2, iWorld_1, blockPos_1, blockPos_2);
        } else {
            Direction direction_2 = direction_1.getOpposite();
            boolean boolean_1 = direction_1 == Direction.NORTH ? this.shouldConnectTo(blockState_2, Block.isFaceFullSquare(blockState_2.getCollisionShape(iWorld_1, blockPos_2), direction_2), direction_2) : (Boolean)blockState_1.get(NORTH);
            boolean boolean_2 = direction_1 == Direction.EAST ? this.shouldConnectTo(blockState_2, Block.isFaceFullSquare(blockState_2.getCollisionShape(iWorld_1, blockPos_2), direction_2), direction_2) : (Boolean)blockState_1.get(EAST);
            boolean boolean_3 = direction_1 == Direction.SOUTH ? this.shouldConnectTo(blockState_2, Block.isFaceFullSquare(blockState_2.getCollisionShape(iWorld_1, blockPos_2), direction_2), direction_2) : (Boolean)blockState_1.get(SOUTH);
            boolean boolean_4 = direction_1 == Direction.WEST ? this.shouldConnectTo(blockState_2, Block.isFaceFullSquare(blockState_2.getCollisionShape(iWorld_1, blockPos_2), direction_2), direction_2) : (Boolean)blockState_1.get(WEST);
            boolean boolean_5 = (!boolean_1 || boolean_2 || !boolean_3 || boolean_4) && (boolean_1 || !boolean_2 || boolean_3 || !boolean_4);
            return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)blockState_1.with(UP, boolean_5 || !iWorld_1.isAir(blockPos_1.up()))).with(NORTH, boolean_1)).with(EAST, boolean_2)).with(SOUTH, boolean_3)).with(WEST, boolean_4);
        }
    }
}
