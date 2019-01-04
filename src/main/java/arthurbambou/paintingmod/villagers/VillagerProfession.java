package arthurbambou.paintingmod.villagers;

import arthurbambou.paintingmod.PaintingMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface VillagerProfession {
    static net.minecraft.village.VillagerProfession register(String string_1) {
        return (net.minecraft.village.VillagerProfession) Registry.VILLAGER_PROFESSION.register(new Identifier(PaintingMod.MODID, string_1), new net.minecraft.village.VillagerProfession() {
            public String toString() {
                return string_1;
            }
        });
    }
}
