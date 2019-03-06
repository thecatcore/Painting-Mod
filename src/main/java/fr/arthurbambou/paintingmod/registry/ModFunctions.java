package fr.arthurbambou.paintingmod.registry;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.ColoredFunction;
import fr.arthurbambou.paintingmod.coloredfunctions.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PaintingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFunctions {
    private static ColoredFunction BLOCKS;
    private static ColoredFunction STAIRS;
    private static ColoredFunction SLABS;
    private static ColoredFunction PRESSURE_PLATES;
    private static ColoredFunction FENCES;

    public ModFunctions() {
        BLOCKS = new ColoredBlock();
        STAIRS = new ColoredStairs();
        SLABS = new ColoredSlab();
        PRESSURE_PLATES = new ColoredPressurePlate();
        FENCES = new ColoredFence();
    }

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void registerColoredFunctions(RegistryEvent.Register<ColoredFunction> event) {
        event.getRegistry().register(BLOCKS);
        event.getRegistry().register(STAIRS);
        event.getRegistry().register(SLABS);
        event.getRegistry().register(PRESSURE_PLATES);
        event.getRegistry().register(FENCES);
    }
}
