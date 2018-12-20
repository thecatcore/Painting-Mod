package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.api.ColoredBlock;
import net.fabricmc.fabric.tags.TagRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<ColoredBlock> COLORED_BLOCKS = new ArrayList<ColoredBlock>();
    public static final List<ColoredBlock> COLORED_BLOCK_LIST = new ArrayList<ColoredBlock>();

    public static ColoredBlock STONE;

    public static void init() {
        STONE = new ColoredBlock("stone", Blocks.STONE).setMaterial(Material.STONE).setBlockSoundGroup(BlockSoundGroup.STONE).setHardness(1.5F).setResistance(30.0F);
        for (ColoredBlock coloredBlock : COLORED_BLOCKS) {
            coloredBlock.createBlocks();
        }
    }
}
