package fr.arthurbambou.paintingmod.mainmod.client.render;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.utils.PMSprite;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.RendererAccess;
import net.fabricmc.fabric.api.renderer.v1.material.RenderMaterial;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.MeshBuilder;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBakedModel;
import net.fabricmc.fabric.api.renderer.v1.model.ModelHelper;
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.fabricmc.fabric.impl.client.texture.FabricSprite;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelItemPropertyOverrideList;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.resource.metadata.AnimationResourceMetadata;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.PngFile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ExtendedBlockView;
import net.minecraft.world.World;

import java.awt.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ColoredBlockRenderer implements BakedModel, FabricBakedModel {

    ColoredBlock coloredBlock;
    Sprite base;

    public ColoredBlockRenderer(ColoredBlock coloredblock) {
        coloredBlock = coloredblock;
        base = MinecraftClient.getInstance().getSpriteAtlas().getSprite((Identifier) this.coloredBlock.getColoredObject().getTextureMap().values().toArray()[0]);
    }

    @Override
    public boolean isVanillaAdapter() {
        return false;
    }

    @Override
    public void emitBlockQuads(ExtendedBlockView blockView, BlockState state, BlockPos pos, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh());
    }

    private Mesh mesh() {
        Renderer renderer = RendererAccess.INSTANCE.getRenderer();
        MeshBuilder builder = renderer.meshBuilder();
        QuadEmitter emitter = builder.getEmitter();

        RenderMaterial mat = renderer.materialFinder().disableDiffuse(0, true).find();
        int color = coloredBlock.getColor().getColor().getRGB();

        if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.ALL)) {
            Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.ALL));

            emitter.square(Direction.SOUTH, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.EAST, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.WEST, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.NORTH, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.DOWN, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.UP, 0, 0, 1, 1, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
        } else {
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.BOTTOM)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.BOTTOM));
                emitter.square(Direction.DOWN, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.TOP)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.TOP));
                emitter.square(Direction.UP, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.SIDE)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE));
                emitter.square(Direction.SOUTH, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.EAST, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.WEST, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.NORTH, 0, 0, 1, 1, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
        }

        return builder.build();
    }

    @Override
    public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh());
    }

    @Override
    public List<BakedQuad> getQuads(BlockState var1, Direction var2, Random var3) {
        return Collections.emptyList();
    }

    @Override
    public boolean useAmbientOcclusion() {
        return true;
    }

    @Override
    public boolean hasDepthInGui() {
        return true;
    }

    @Override
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public Sprite getSprite() {
        return base;
    }

    @Override
    public ModelTransformation getTransformation() {
        return ModelHelper.MODEL_TRANSFORM_BLOCK;
    }

    protected class ItemProxy extends ModelItemPropertyOverrideList {
        public ItemProxy() {
            super(null, null, null, Collections.emptyList());
        }

        @Override
        public BakedModel apply(BakedModel bakedModel_1, ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {
            return ColoredBlockRenderer.this;
        }
    }

    @Override
    public ModelItemPropertyOverrideList getItemPropertyOverrides() {
        return new ItemProxy();
    }
}
