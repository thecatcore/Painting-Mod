package arthurbambou.paintingmod.mainmod.registery;

import arthurbambou.paintingmod.mainmod.villagers.TradeBuilder;
import net.minecraft.village.*;

public class ModVillagers implements VillagerProfession {
    public static VillagerProfession PAINTER;

    public static void init() {
       PAINTER = arthurbambou.paintingmod.mainmod.villagers.VillagerProfession.register("painter");
       TradeBuilder.createRecipes();
    }
}
