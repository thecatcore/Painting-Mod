package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PaintingMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.block.BlockItem;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;

public class ColoredFenceBlock extends FenceBlock {
    public ColoredFenceBlock(String name, Settings block$Settings_1, String modID) {
        super(block$Settings_1);
        Registry.BLOCK.register(new Identifier(modID, name), this);
        if (modID == PaintingMod.MODID) {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_FENCE)));
        } else {
            Registry.ITEM.register(new Identifier(modID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.ADDON_FENCE)));
        }
    }

    public boolean method_10184(BlockState blockState_1, boolean boolean_1, Direction direction_1) {
        Block block_1 = blockState_1.getBlock();
        boolean boolean_2 = block_1 instanceof FenceBlock && blockState_1.getMaterial() == this.material;
        boolean boolean_3 = block_1 instanceof FenceGateBlock && FenceGateBlock.method_16703(blockState_1, direction_1);
        return !method_10185(block_1) && boolean_1 || boolean_2 || boolean_3;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext itemPlacementContext_1) {
        BlockView blockView_1 = itemPlacementContext_1.getWorld();
        BlockPos blockPos_1 = itemPlacementContext_1.getPos();
        FluidState fluidState_1 = itemPlacementContext_1.getWorld().getFluidState(itemPlacementContext_1.getPos());
        BlockPos blockPos_2 = blockPos_1.north();
        BlockPos blockPos_3 = blockPos_1.east();
        BlockPos blockPos_4 = blockPos_1.south();
        BlockPos blockPos_5 = blockPos_1.west();
        BlockState blockState_1 = blockView_1.getBlockState(blockPos_2);
        BlockState blockState_2 = blockView_1.getBlockState(blockPos_3);
        BlockState blockState_3 = blockView_1.getBlockState(blockPos_4);
        BlockState blockState_4 = blockView_1.getBlockState(blockPos_5);
        return (BlockState)((BlockState)((BlockState)((BlockState)((BlockState)super.getPlacementState(itemPlacementContext_1).with(NORTH, this.method_10184(blockState_1, Block.isFaceFullCube(blockState_1.getCollisionShape(blockView_1, blockPos_2), Direction.SOUTH), Direction.SOUTH))).with(EAST, this.method_10184(blockState_2, Block.isFaceFullCube(blockState_2.getCollisionShape(blockView_1, blockPos_3), Direction.WEST), Direction.WEST))).with(SOUTH, this.method_10184(blockState_3, Block.isFaceFullCube(blockState_3.getCollisionShape(blockView_1, blockPos_4), Direction.NORTH), Direction.NORTH))).with(WEST, this.method_10184(blockState_4, Block.isFaceFullCube(blockState_4.getCollisionShape(blockView_1, blockPos_5), Direction.EAST), Direction.EAST))).with(WATERLOGGED, fluidState_1.getFluid() == Fluids.WATER);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState blockState_1, Direction direction_1, BlockState blockState_2, IWorld iWorld_1, BlockPos blockPos_1, BlockPos blockPos_2) {
        if ((Boolean)blockState_1.get(WATERLOGGED)) {
            iWorld_1.getFluidTickScheduler().schedule(blockPos_1, Fluids.WATER, Fluids.WATER.method_15789(iWorld_1));
        }

        return direction_1.getAxis().method_10180() == Direction.class_2353.HORIZONTAL ? (BlockState)blockState_1.with((Property)FACING_PROPERTIES.get(direction_1), this.method_10184(blockState_2, Block.isFaceFullCube(blockState_2.getCollisionShape(iWorld_1, blockPos_2), direction_1.getOpposite()), direction_1.getOpposite())) : super.getStateForNeighborUpdate(blockState_1, direction_1, blockState_2, iWorld_1, blockPos_1, blockPos_2);
    }
}
