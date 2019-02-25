package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.blocks.SoggyClay;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(PaintingMod.MODID)
public class ModBlocks {
    public static Block soggy_clay;

    public ModBlocks() {
        soggy_clay = new SoggyClay();
    }

    public void onBlockRegister(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(soggy_clay);
    }

    public void onItemRegister(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(soggy_clay, new Item.Properties().group(ItemGroup.MATERIALS).addToolType(ToolType.SHOVEL, 0)).setRegistryName(soggy_clay.getRegistryName()));
    }
}
