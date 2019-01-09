package arthurbambou.paintingmod.api;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class ColoredStairs {
    public String name;
    public BlockStairs black;
    public BlockStairs red;
    public BlockStairs green;
    public BlockStairs brown;
    public BlockStairs blue;
    public BlockStairs purple;
    public BlockStairs cyan;
    public BlockStairs lightgray;
    public BlockStairs gray;
    public BlockStairs pink;
    public BlockStairs lime;
    public BlockStairs yellow;
    public BlockStairs lightblue;
    public BlockStairs magenta;
    public BlockStairs orange;
    public BlockStairs white;
    public Block replace;

    public ColoredStairs(String name,Block replace) {
        this.name = name;
        this.replace = replace;
    }
}
