package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.villagers.TradeBuilder;
import net.minecraft.village.*;

public class ModVillagers {
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
        villagerData();
        TradeBuilder.createRecipes();
    }

    private static void villagerData() {
        PLAINS_PAINTER = new VillagerData(VillagerType.PLAINS, PAINTER, 1);
        DESERT_PAINTER = new VillagerData(VillagerType.DESERT, PAINTER, 1);
        JUNGLE_PAINTER = new VillagerData(VillagerType.JUNGLE, PAINTER, 1);
        SAVANNA_PAINTER = new VillagerData(VillagerType.SAVANNA, PAINTER, 1);
        SNOW_PAINTER = new VillagerData(VillagerType.SNOW, PAINTER, 1);
        SWAMP_PAINTER = new VillagerData(VillagerType.SWAMP, PAINTER, 1);
        TAIGA_PAINTER = new VillagerData(VillagerType.TAIGA, PAINTER, 1);
    }

//    private void createRecipes() {
//        VillagerTrades.PROFESSION_TO_LEVELED_TRADE.put(PAINTER, copyToFastUtilMap(ImmutableMap.of(1, new VillagerTrades.Factory[] {
//                new VillagerTrades.BuyItemFactory(Items.WHEAT, new VillagerTrades.PriceRange(18, 22))
//        })));
//    }
//
//    private static Int2ObjectMap<VillagerTrades.Factory[]> copyToFastUtilMap(ImmutableMap<Integer, VillagerTrades.Factory[]> immutableMap_1) {
//        return new Int2ObjectOpenHashMap(immutableMap_1);
//    }
//
//    static class BuyItemFactory implements VillagerTrades.Factory {
//        public Item bought;
//        public VillagerTrades.PriceRange range;
//
//        public BuyItemFactory(ItemProvider itemProvider_1, VillagerTrades.PriceRange villagerTrades$PriceRange_1) {
//            this.bought = itemProvider_1.getItem();
//            this.range = villagerTrades$PriceRange_1;
//        }
//
//        public VillagerRecipe create(Villager villager_1, Random random_1) {
//            ItemStack itemStack_1 = new ItemStack(this.bought, this.range == null ? 1 : this.range.getPrice(random_1));
//            return new VillagerRecipe(itemStack_1, new ItemStack(Items.EMERALD));
//        }
//    }
}
