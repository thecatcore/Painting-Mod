package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import static fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks.COLORED_BLOCKS;

public class PaintingModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssets(new Identifier(PaintingMod.MODID, "default_pack"), pack -> {
            for (ColoredObject coloredBlock : COLORED_BLOCKS) {
                for (Block block : coloredBlock.getArrayList()) {
                    Identifier id = new Identifier(PaintingMod.MODID, block.getTranslationKey().replace("block.paintingmod.", ""));
                    pack.addBlockState(id, blockStateBuilder -> {
                        blockStateBuilder.variant("", variant -> {
                            variant.model(new Identifier(id.getNamespace(), "block/" + id.getPath()));
                        });
                    });
                }
            }
        });
    }
}
