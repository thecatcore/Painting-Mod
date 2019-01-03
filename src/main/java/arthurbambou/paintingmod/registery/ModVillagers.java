package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.villagers.TradeBuilder;
import net.minecraft.village.*;

public class ModVillagers {
    public static VillagerProfession PAINTER;

    public static void init() {
        PAINTER = VillagerProfession.register("painter");
        TradeBuilder.createRecipes();
    }
}
