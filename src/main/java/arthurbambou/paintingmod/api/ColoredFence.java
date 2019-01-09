package arthurbambou.paintingmod.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ColoredFence {
    public Material material;
    public MapColor mapColor;
    public String name;
    public BlockFence black;
    public BlockFence red;
    public BlockFence green;
    public BlockFence brown;
    public BlockFence blue;
    public BlockFence purple;
    public BlockFence cyan;
    public BlockFence lightgray;
    public BlockFence gray;
    public BlockFence pink;
    public BlockFence lime;
    public BlockFence yellow;
    public BlockFence lightblue;
    public BlockFence magenta;
    public BlockFence orange;
    public BlockFence white;
    public Block replace;

    public ColoredFence(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.material = replace.getMaterial(replace.getDefaultState());
        this.mapColor = this.material.getMaterialMapColor();
    }
}
