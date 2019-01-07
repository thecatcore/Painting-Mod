package arthurbambou.paintingmod.util.handlers;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.api.BlockWall;
import arthurbambou.paintingmod.api.ColoredBlockMeta;
import arthurbambou.paintingmod.api.ColoredFallingBlockMeta;
import arthurbambou.paintingmod.api.ColoredSlab;
import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.init.PTMItems;
import arthurbambou.paintingmod.util.PTMIHasModel;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.function.Function;

@EventBusSubscriber
public class PTMRegistryHandler
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		if (PTMReference.getMinecraftVersion() == "[1.13]" || PTMReference.getMinecraftVersion() == "[1.13.1]" || PTMReference.getMinecraftVersion() == "[1.13.2]") {
			event.getRegistry().registerAll(PTMItems.ITEMS_ID.toArray(new Item[0]));
		} else {
            event.getRegistry().registerAll(PTMItems.ITEMS_META.toArray(new Item[0]));
        }
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		if (PTMReference.getMinecraftVersion() == "[1.13]" || PTMReference.getMinecraftVersion() == "[1.13.1]" || PTMReference.getMinecraftVersion() == "[1.13.2]") {
			event.getRegistry().registerAll(PTMBlocks.BLOCKS_ID.toArray(new Block[0]));
			event.getRegistry().registerAll(PTMBlocks.BLOCK_STAIRS_LIST.toArray(new Block[0]));
			event.getRegistry().registerAll(PTMBlocks.BLOCK_FENCE_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.BLOCK_WALL_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCK_SLABS.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCK_SLAB_DOUBLES.toArray(new Block[0]));
		} else {
            event.getRegistry().registerAll(PTMBlocks.BLOCKS_META.toArray(new Block[0]));

            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCKS_META.toArray(new Block[0]));

            event.getRegistry().registerAll(PTMBlocks.COLORED_FALLING_BLOCK_METAS.toArray(new Block[0]));

            event.getRegistry().register(PTMBlocks.SLIME_BLOCK_META);
            event.getRegistry().registerAll(PTMBlocks.BLOCK_STAIRS_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.BLOCK_FENCE_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.BLOCK_WALL_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCK_SLABS.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCK_SLAB_DOUBLES.toArray(new Block[0]));
		}
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
        if (PTMReference.getMinecraftVersion() == "[1.13]" || PTMReference.getMinecraftVersion() == "[1.13.1]" || PTMReference.getMinecraftVersion() == "[1.13.2]") {
            for (Item item : PTMItems.ITEMS_ID) {
                if (item instanceof PTMIHasModel) {
                    ((PTMIHasModel) item).registerModels();
                }
            }

            for (BlockStairs blockStairs : PTMBlocks.BLOCK_STAIRS_LIST) {
                if (blockStairs instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockStairs).registerModels();
                }
            }

            for (Block block : PTMBlocks.BLOCKS_ID) {
                if (block instanceof PTMIHasModel) {
                    ((PTMIHasModel) block).registerModels();
                }
            }
            for (BlockFence blockFence : PTMBlocks.BLOCK_FENCE_LIST) {
                if (blockFence instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockFence).registerModels();
                }
            }
            for (BlockWall blockWall : PTMBlocks.BLOCK_WALL_LIST) {
                if (blockWall instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockWall).registerModels();
                }
            }
        } else {
            for (Block block : PTMBlocks.BLOCKS_META) {
                if (block instanceof PTMIHasModel) {
                    ((PTMIHasModel) block).registerModels();
                }
            }

            for (Item item : PTMItems.ITEMS_META) {
                if (item instanceof PTMIHasModel) {
                    ((PTMIHasModel) item).registerModels();
                }
            }

            for (Block block : PTMBlocks.COLORED_BLOCKS_META) {
                if (block instanceof PTMIHasModel) {
                    ((PTMIHasModel) block).registerModels();
                }
            }
            for (Block block : PTMBlocks.COLORED_FALLING_BLOCK_METAS) {
                if (block instanceof PTMIHasModel) {
                    ((PTMIHasModel) block).registerModels();
                }
            }
            ((PTMIHasModel) PTMBlocks.SLIME_BLOCK_META).registerModels();

            for (BlockStairs blockStairs : PTMBlocks.BLOCK_STAIRS_LIST) {
                if (blockStairs instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockStairs).registerModels();
                }
            }
            for (BlockFence blockFence : PTMBlocks.BLOCK_FENCE_LIST) {
                if (blockFence instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockFence).registerModels();
                }
            }
            for (BlockWall blockWall : PTMBlocks.BLOCK_WALL_LIST) {
                if (blockWall instanceof PTMIHasModel) {
                    ((PTMIHasModel) blockWall).registerModels();
                }
            }

        }

	}

	public static void APIinit() {
	    for (ColoredBlockMeta block : PTMBlocks.COLORED_BLOCKS_META) {
	        block.getLocalizedName();
        }
        for (ColoredFallingBlockMeta blockMeta : PTMBlocks.COLORED_FALLING_BLOCK_METAS) {
            blockMeta.getLocalizedName();
        }
        PTMBlocks.SLIME_BLOCK_META.getLocalizedName();
    }
}
