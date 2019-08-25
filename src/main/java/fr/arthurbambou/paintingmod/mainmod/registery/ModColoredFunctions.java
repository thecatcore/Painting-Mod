package fr.arthurbambou.paintingmod.mainmod.registery;

import fr.arthurbambou.paintingmod.mainmod.PaintingMod;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredFunction;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
import fr.arthurbambou.paintingmod.mainmod.coloredfunctions.*;
import net.minecraft.util.Identifier;

public class ModColoredFunctions {

    public static void init() {
        register(
                new BlockFunction(new Identifier(PaintingMod.MODID, "blocks")),
//                new StairsFunction(new Identifier(PaintingMod.MODID, "stairs")),
                new SlabFunction(new Identifier(PaintingMod.MODID, "slabs")),
//                new FenceGateFunction(new Identifier(PaintingMod.MODID, "fence_gates")),
//                new FenceFunction(new Identifier(PaintingMod.MODID, "fences")),
                new WallFunction(new Identifier(PaintingMod.MODID, "walls")),
                new PressurePlatesFunction(new Identifier(PaintingMod.MODID, "pressure_plates"))//,
//                new ButtonFunction(new Identifier(PaintingMod.MODID, "buttons"))
        );
    }

    private static void register(ColoredFunction... coloredFunctions) {
        for (int a = 0; a < coloredFunctions.length; a++)
            PaintingModRegistry.registerColoredFunction(coloredFunctions[a]);
    }
}
