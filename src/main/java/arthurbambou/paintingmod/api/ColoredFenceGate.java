package arthurbambou.paintingmod.api;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ColoredFenceGate {
    public Material material;
    public String name;
    public BlockFenceGate black;
    public BlockFenceGate red;
    public BlockFenceGate green;
    public BlockFenceGate brown;
    public BlockFenceGate blue;
    public BlockFenceGate purple;
    public BlockFenceGate cyan;
    public BlockFenceGate lightgray;
    public BlockFenceGate gray;
    public BlockFenceGate pink;
    public BlockFenceGate lime;
    public BlockFenceGate yellow;
    public BlockFenceGate lightblue;
    public BlockFenceGate magenta;
    public BlockFenceGate orange;
    public BlockFenceGate white;
    public Block replace;

    public ColoredFenceGate(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.material = replace.getMaterial(replace.getDefaultState());
    }
}
