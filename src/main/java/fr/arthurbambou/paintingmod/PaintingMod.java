package fr.arthurbambou.paintingmod;

import fr.arthurbambou.paintingmod.registry.ModBlocks;
import fr.arthurbambou.paintingmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PaintingMod.MODID)
public class PaintingMod
{
    // Directly reference a log4j logger.
    public static final String MODID = "paintingmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public static ItemGroup MOD_ITEMS = new ItemGroup("mod_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.soggy_clay);
        }
    };

    public PaintingMod() {
        ModBlocks modBlocks = new ModBlocks();
        ModItems modItems = new ModItems();
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, modBlocks::onBlockRegister);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, modBlocks::onItemRegister);
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, modItems::onItemRegister);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
