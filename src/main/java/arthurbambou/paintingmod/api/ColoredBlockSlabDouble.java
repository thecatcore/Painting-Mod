package arthurbambou.paintingmod.api;

import net.minecraft.block.material.Material;

public class ColoredBlockSlabDouble extends ColoredBlockSlab {
    public ColoredBlockSlabDouble(String name, String modid, ColoredBlockSlabHalf coloredSlab, Material materialIn) {
        super(name, modid, coloredSlab, materialIn);
    }

    @Override
    public boolean isDouble() {
        return true;
    }
}
