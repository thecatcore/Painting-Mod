package arthurbambou.paintingmod.registery;

import net.minecraft.village.VillagerData;
import net.minecraft.village.VillagerProfession;
import net.minecraft.village.VillagerType;

public class ModEntities {
    public static VillagerProfession PAINTER;
    public static VillagerData PLAINS_PAINTER;
    public static VillagerData DESERT_PAINTER;
    public static VillagerData JUNGLE_PAINTER;
    public static VillagerData SAVANNA_PAINTER;
    public static VillagerData SNOW_PAINTER;
    public static VillagerData SWAMP_PAINTER;
    public static VillagerData TAIGA_PAINTER;

    public static void init() {
        PAINTER = VillagerProfession.register("painter");
//        PLAINS_PAINTER = new VillagerData(VillagerType.PLAINS, PAINTER, 1);
//        DESERT_PAINTER = new VillagerData(VillagerType.DESERT, PAINTER, 1);
//        JUNGLE_PAINTER = new VillagerData(VillagerType.JUNGLE, PAINTER, 1);
//        SAVANNA_PAINTER = new VillagerData(VillagerType.SAVANNA, PAINTER, 1);
//        SNOW_PAINTER = new VillagerData(VillagerType.SNOW, PAINTER, 1);
//        SWAMP_PAINTER = new VillagerData(VillagerType.SWAMP, PAINTER, 1);
//        TAIGA_PAINTER = new VillagerData(VillagerType.TAIGA, PAINTER, 1);
    }
}
