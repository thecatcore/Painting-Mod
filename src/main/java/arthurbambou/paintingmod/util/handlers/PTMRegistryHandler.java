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
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

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
            for (ColoredSlab coloredSlab : PTMBlocks.COLORED_SLAB_LIST) {
                IForgeRegistry<Item> registry = event.getRegistry();
                registry.register(coloredSlab.coloredItemSlab.black.setRegistryName(coloredSlab.coloredSlabHalf.black.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.red.setRegistryName(coloredSlab.coloredSlabHalf.red.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.green.setRegistryName(coloredSlab.coloredSlabHalf.green.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.brown.setRegistryName(coloredSlab.coloredSlabHalf.brown.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.blue.setRegistryName(coloredSlab.coloredSlabHalf.blue.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.purple.setRegistryName(coloredSlab.coloredSlabHalf.purple.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.cyan.setRegistryName(coloredSlab.coloredSlabHalf.cyan.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.lightgray.setRegistryName(coloredSlab.coloredSlabHalf.lightgray.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.gray.setRegistryName(coloredSlab.coloredSlabHalf.gray.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.pink.setRegistryName(coloredSlab.coloredSlabHalf.pink.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.lime.setRegistryName(coloredSlab.coloredSlabHalf.lime.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.yellow.setRegistryName(coloredSlab.coloredSlabHalf.yellow.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.lightblue.setRegistryName(coloredSlab.coloredSlabHalf.lightblue.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.magenta.setRegistryName(coloredSlab.coloredSlabHalf.magenta.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.orange.setRegistryName(coloredSlab.coloredSlabHalf.orange.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
                registry.register(coloredSlab.coloredItemSlab.white.setRegistryName(coloredSlab.coloredSlabHalf.white.getRegistryName()).setCreativeTab(PTMMain.PAINTING_MOD_BLOCKS));
            }
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
            for (ColoredSlab coloredSlab : PTMBlocks.COLORED_SLAB_LIST) {
                IForgeRegistry<Block> registry = event.getRegistry();
                registry.register(coloredSlab.coloredSlabHalf.black);
                registry.register(coloredSlab.coloredSlabHalf.red);
                registry.register(coloredSlab.coloredSlabHalf.green);
                registry.register(coloredSlab.coloredSlabHalf.brown);
                registry.register(coloredSlab.coloredSlabHalf.blue);
                registry.register(coloredSlab.coloredSlabHalf.purple);
                registry.register(coloredSlab.coloredSlabHalf.cyan);
                registry.register(coloredSlab.coloredSlabHalf.lightgray);
                registry.register(coloredSlab.coloredSlabHalf.gray);
                registry.register(coloredSlab.coloredSlabHalf.pink);
                registry.register(coloredSlab.coloredSlabHalf.lime);
                registry.register(coloredSlab.coloredSlabHalf.yellow);
                registry.register(coloredSlab.coloredSlabHalf.lightblue);
                registry.register(coloredSlab.coloredSlabHalf.magenta);
                registry.register(coloredSlab.coloredSlabHalf.orange);
                registry.register(coloredSlab.coloredSlabHalf.white);

                registry.register(coloredSlab.coloredSlabDouble.black);
                registry.register(coloredSlab.coloredSlabDouble.red);
                registry.register(coloredSlab.coloredSlabDouble.green);
                registry.register(coloredSlab.coloredSlabDouble.brown);
                registry.register(coloredSlab.coloredSlabDouble.blue);
                registry.register(coloredSlab.coloredSlabDouble.purple);
                registry.register(coloredSlab.coloredSlabDouble.cyan);
                registry.register(coloredSlab.coloredSlabDouble.lightgray);
                registry.register(coloredSlab.coloredSlabDouble.gray);
                registry.register(coloredSlab.coloredSlabDouble.pink);
                registry.register(coloredSlab.coloredSlabDouble.lime);
                registry.register(coloredSlab.coloredSlabDouble.yellow);
                registry.register(coloredSlab.coloredSlabDouble.lightblue);
                registry.register(coloredSlab.coloredSlabDouble.magenta);
                registry.register(coloredSlab.coloredSlabDouble.orange);
                registry.register(coloredSlab.coloredSlabDouble.white);
            }
		} else {
            event.getRegistry().registerAll(PTMBlocks.BLOCKS_META.toArray(new Block[0]));

            event.getRegistry().registerAll(PTMBlocks.COLORED_BLOCKS_META.toArray(new Block[0]));

            event.getRegistry().registerAll(PTMBlocks.COLORED_FALLING_BLOCK_METAS.toArray(new Block[0]));

            event.getRegistry().register(PTMBlocks.SLIME_BLOCK_META);
            event.getRegistry().registerAll(PTMBlocks.BLOCK_STAIRS_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.BLOCK_FENCE_LIST.toArray(new Block[0]));
            event.getRegistry().registerAll(PTMBlocks.BLOCK_WALL_LIST.toArray(new Block[0]));
            for (ColoredSlab coloredSlab : PTMBlocks.COLORED_SLAB_LIST) {
                IForgeRegistry<Block> registry = event.getRegistry();
                registry.register(coloredSlab.coloredSlabHalf.black);
                registry.register(coloredSlab.coloredSlabHalf.red);
                registry.register(coloredSlab.coloredSlabHalf.green);
                registry.register(coloredSlab.coloredSlabHalf.brown);
                registry.register(coloredSlab.coloredSlabHalf.blue);
                registry.register(coloredSlab.coloredSlabHalf.purple);
                registry.register(coloredSlab.coloredSlabHalf.cyan);
                registry.register(coloredSlab.coloredSlabHalf.lightgray);
                registry.register(coloredSlab.coloredSlabHalf.gray);
                registry.register(coloredSlab.coloredSlabHalf.pink);
                registry.register(coloredSlab.coloredSlabHalf.lime);
                registry.register(coloredSlab.coloredSlabHalf.yellow);
                registry.register(coloredSlab.coloredSlabHalf.lightblue);
                registry.register(coloredSlab.coloredSlabHalf.magenta);
                registry.register(coloredSlab.coloredSlabHalf.orange);
                registry.register(coloredSlab.coloredSlabHalf.white);

                registry.register(coloredSlab.coloredSlabDouble.black);
                registry.register(coloredSlab.coloredSlabDouble.red);
                registry.register(coloredSlab.coloredSlabDouble.green);
                registry.register(coloredSlab.coloredSlabDouble.brown);
                registry.register(coloredSlab.coloredSlabDouble.blue);
                registry.register(coloredSlab.coloredSlabDouble.purple);
                registry.register(coloredSlab.coloredSlabDouble.cyan);
                registry.register(coloredSlab.coloredSlabDouble.lightgray);
                registry.register(coloredSlab.coloredSlabDouble.gray);
                registry.register(coloredSlab.coloredSlabDouble.pink);
                registry.register(coloredSlab.coloredSlabDouble.lime);
                registry.register(coloredSlab.coloredSlabDouble.yellow);
                registry.register(coloredSlab.coloredSlabDouble.lightblue);
                registry.register(coloredSlab.coloredSlabDouble.magenta);
                registry.register(coloredSlab.coloredSlabDouble.orange);
                registry.register(coloredSlab.coloredSlabDouble.white);
            }
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
