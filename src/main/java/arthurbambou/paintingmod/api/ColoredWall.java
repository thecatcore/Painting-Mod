package arthurbambou.paintingmod.api;

import net.minecraft.block.Block;

public class ColoredWall {
    public String name;
    public BlockWall black;
    public BlockWall red;
    public BlockWall green;
    public BlockWall brown;
    public BlockWall blue;
    public BlockWall purple;
    public BlockWall cyan;
    public BlockWall lightgray;
    public BlockWall gray;
    public BlockWall pink;
    public BlockWall lime;
    public BlockWall yellow;
    public BlockWall lightblue;
    public BlockWall magenta;
    public BlockWall orange;
    public BlockWall white;
    public Block replace;
    public int meta;
    public boolean metab;

    public ColoredWall(String name, Block replace) {
        this.name = name;
        this.replace = replace;
        this.metab = false;
    }

    public ColoredWall(String name, Block replace, int meta) {
        this.name = name;
        this.replace = replace;
        this.metab = true;
        this.meta = meta;
    }
}
