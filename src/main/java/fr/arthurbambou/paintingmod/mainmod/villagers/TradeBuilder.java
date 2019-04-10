package fr.arthurbambou.paintingmod.mainmod.villagers;

public class TradeBuilder {
//    private static final Logger LOGGER = LogManager.getLogger();
//    public static void createRecipes() {
//        Trades.PROFESSION_TO_LEVELED_TRADE.put(PAINTER, copyToFastUtilMap(ImmutableMap.of(1, new Trades.Factory[] {
//                new BuyItemFactory(ModItems.HEAT_GUN, new PriceRange(6, 8))
//        })));
//    }
//
//    private static Int2ObjectMap<Trades.Factory[]> copyToFastUtilMap(ImmutableMap<Integer, Trades.Factory[]> immutableMap_1) {
//        return new Int2ObjectOpenHashMap(immutableMap_1);
//    }
//
//    static class PriceRange {
//        final int lower;
//        final int range;
//
//        public PriceRange(int int_1, int int_2) {
//            this.lower = int_1;
//            this.range = 1 + Math.max(0, int_2 - int_1);
//            if (int_2 < int_1) {
//                LOGGER.warn("PriceRange({}, {}) invalid, {} smaller than {}", int_1, int_2, int_2, int_1);
//            }
//
//        }
//
//        public int getPrice(Random random_1) {
//            return this.lower + random_1.nextInt(this.range);
//        }
//    }
//
//    static class BuyItemFactory implements Trades.Factory {
//        public Item bought;
//        public PriceRange range;
//
//        public BuyItemFactory(ItemProvider itemProvider_1, PriceRange villagerTrades$PriceRange_1) {
//            this.bought = itemProvider_1.getItem();
//            this.range = villagerTrades$PriceRange_1;
//        }
//
//        public TraderRecipe create(Trader villager_1, Random random_1) {
//            return new TraderRecipe(new ItemStack(Items.EMERALD, this.range == null ? 1 : this.range.getPrice(random_1)), new ItemStack(this.bought));
//        }
//    }
}
