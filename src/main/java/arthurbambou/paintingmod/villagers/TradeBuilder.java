package arthurbambou.paintingmod.villagers;

import arthurbambou.paintingmod.registery.ModItems;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.item.*;
import net.minecraft.village.Villager;
import net.minecraft.village.VillagerRecipe;
import net.minecraft.village.VillagerTrades;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

import static arthurbambou.paintingmod.registery.ModVillagers.PAINTER;

public class TradeBuilder {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void createRecipes() {
        VillagerTrades.PROFESSION_TO_LEVELED_TRADE.put(PAINTER, copyToFastUtilMap(ImmutableMap.of(1, new VillagerTrades.Factory[] {
                new BuyItemFactory(ModItems.HEAT_GUN, new PriceRange(6, 8))
        })));
    }

    private static Int2ObjectMap<VillagerTrades.Factory[]> copyToFastUtilMap(ImmutableMap<Integer, VillagerTrades.Factory[]> immutableMap_1) {
        return new Int2ObjectOpenHashMap(immutableMap_1);
    }

    static class PriceRange {
        final int lower;
        final int range;

        public PriceRange(int int_1, int int_2) {
            this.lower = int_1;
            this.range = 1 + Math.max(0, int_2 - int_1);
            if (int_2 < int_1) {
                LOGGER.warn("PriceRange({}, {}) invalid, {} smaller than {}", int_1, int_2, int_2, int_1);
            }

        }

        public int getPrice(Random random_1) {
            return this.lower + random_1.nextInt(this.range);
        }
    }

    static class BuyItemFactory implements VillagerTrades.Factory {
        public Item bought;
        public PriceRange range;

        public BuyItemFactory(ItemProvider itemProvider_1, PriceRange villagerTrades$PriceRange_1) {
            this.bought = itemProvider_1.getItem();
            this.range = villagerTrades$PriceRange_1;
        }

        public VillagerRecipe create(Villager villager_1, Random random_1) {
            return new VillagerRecipe(new ItemStack(Items.EMERALD, this.range == null ? 1 : this.range.getPrice(random_1)), new ItemStack(this.bought));
        }
    }
}
