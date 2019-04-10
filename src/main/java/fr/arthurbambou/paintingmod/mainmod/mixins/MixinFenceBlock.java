package fr.arthurbambou.paintingmod.mainmod.mixins;

import net.minecraft.block.*;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FenceBlock.class)
public class MixinFenceBlock extends Block {

    public MixinFenceBlock(Settings block$Settings_1) {
        super(block$Settings_1);
    }

    /**
     * @author arthurbambou
     */
    @Overwrite
    public boolean canConnect(BlockState blockState_1, boolean boolean_1, Direction direction_1) {
        Block block_1 = blockState_1.getBlock();
        boolean boolean_2 = block_1 instanceof FenceBlock && blockState_1.getMaterial() == this.material;
        boolean boolean_3 = block_1 instanceof FenceGateBlock && FenceGateBlock.canWallConnect(blockState_1, direction_1);
        return !method_9581(block_1) && boolean_1 || boolean_2 || boolean_3;
    }
}
