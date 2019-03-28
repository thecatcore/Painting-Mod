package arthurbambou.paintingmod.mainmod.mixins;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import static net.minecraft.block.Block.method_9581;

@Mixin(WallBlock.class)
public class MixinWallBlock {

    /**
     * @author arthurbambou
     */
    @Overwrite
    private boolean shouldConnectTo(BlockState blockState_1, boolean boolean_1, Direction direction_1) {
        Block block_1 = blockState_1.getBlock();
        boolean boolean_2 = block_1 instanceof WallBlock || block_1 instanceof FenceGateBlock && FenceGateBlock.canWallConnect(blockState_1, direction_1);
        return !method_9581(block_1) && boolean_1 || boolean_2;
    }
}
