package fr.arthurbambou.paintingmod.api;

import fr.arthurbambou.paintingmod.PaintingMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;

@Mod.EventBusSubscriber(modid = PaintingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColoredFunctionRegistry {
    public static ForgeRegistry<ColoredFunction> registry;

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void createRegistry(RegistryEvent.NewRegistry event) {
        registry = (ForgeRegistry<ColoredFunction>) new RegistryBuilder<ColoredFunction>()
                .setType(ColoredFunction.class)
                .setName(new ResourceLocation(PaintingMod.MODID, "colored_functions"))
                .setIDRange(0, 100)
                .create();
        PaintingMod.LOGGER.info("Colored Function Registry Created");
    }
}
