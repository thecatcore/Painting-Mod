package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.blocks.ColoredBlockBlock;
import fr.arthurbambou.paintingmod.mainmod.client.render.*;
import fr.arthurbambou.paintingmod.mainmod.coloredblocks.ColoredBlock;
import fr.arthurbambou.paintingmod.mainmod.utils.artifice.ResourcePackUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.block.*;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.ModelBakeSettings;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

import static fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks.BLOCK_MAP;
import static fr.arthurbambou.paintingmod.mainmod.registery.ModBlocks.COLORED_BLOCKS;

public class PaintingModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssets(new Identifier(PaintingMod.MODID, "default_pack"), pack -> {
            ResourcePackUtils.createPack(pack);
        });
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEX)
                .register((spriteAtlasTexture, registry) -> {
                    for (ColoredObject coloredObject : COLORED_BLOCKS) {
                        for (Identifier identifier : coloredObject.getTextureMap().values()) {
                            registry.register(identifier);
                        }
                    }
                });



        ModelLoadingRegistry.INSTANCE.registerVariantProvider(resourceManager -> (modelIdentifier, modelProviderContext) -> {
            ModelProviderContext modelPrCon = modelProviderContext;
            if(!modelIdentifier.getNamespace().equals("paintingmod")){
                return null;
            }
            Identifier identifier = new Identifier(modelIdentifier.getNamespace(), modelIdentifier.getPath()
                    .replace("_top", "").replace("_down", "").replace("_inventory", "")
                    .replace("_post", "").replace("_side", ""));
            if (!(BLOCK_MAP.containsKey(identifier))) {
                return null;
            }
            return new UnbakedModel() {
                @Override
                public Collection<Identifier> getModelDependencies() {
                    return Collections.emptyList();
                }

                @Override
                public Collection<Identifier> getTextureDependencies(Function<Identifier, UnbakedModel> var1, Set<String> var2) {
                    return Collections.emptyList();
                }

                @Override
                public BakedModel bake(ModelLoader var1, Function<Identifier, Sprite> var2, ModelBakeSettings var3) {
                    if (BLOCK_MAP.get(identifier) instanceof SlabBlock) {
                        return new ColoredSlabRenderer((fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock) BLOCK_MAP.get(identifier));
                    }
                    if (BLOCK_MAP.get(identifier) instanceof PressurePlateBlock) {
                        return new ColoredPPRenderer((fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock) BLOCK_MAP.get(identifier));
                    }
                    if (BLOCK_MAP.get(identifier) instanceof WallBlock) {
                        return new ColoredWallRenderer((fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock) BLOCK_MAP.get(identifier));
                    }
//                    if (BLOCK_MAP.get(identifier) instanceof FenceBlock) {
//                        return new ColoredFenceRenderer((fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock) BLOCK_MAP.get(identifier));
//                    }
                    return new ColoredBlockRenderer(
                            (fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock) BLOCK_MAP.get(
                                    new Identifier(modelIdentifier.getNamespace(), modelIdentifier.getPath())));
                }
            };

        });
    }
}
