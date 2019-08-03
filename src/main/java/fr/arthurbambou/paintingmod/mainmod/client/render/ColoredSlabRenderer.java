package fr.arthurbambou.paintingmod.mainmod.client.render;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
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
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.render.model.json.ModelItemPropertyOverrideList;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ExtendedBlockView;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ColoredSlabRenderer implements BakedModel, FabricBakedModel {

    ColoredBlock coloredBlock;
    Sprite base;

    public ColoredSlabRenderer(ColoredBlock coloredblock) {
        coloredBlock = coloredblock;
        base = MinecraftClient.getInstance().getSpriteAtlas().getSprite((Identifier) this.coloredBlock.getColoredObject().getTextureMap().values().toArray()[0]);
    }

    @Override
    public boolean isVanillaAdapter() {
        return false;
    }

    @Override
    public void emitBlockQuads(ExtendedBlockView blockView, BlockState state, BlockPos pos, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh(state.get(SlabBlock.TYPE)));
    }

    private Mesh mesh(SlabType type) {
        Renderer renderer = RendererAccess.INSTANCE.getRenderer();
        MeshBuilder builder = renderer.meshBuilder();
        QuadEmitter emitter = builder.getEmitter();

        RenderMaterial mat = renderer.materialFinder().disableDiffuse(0, true).find();
        int color = coloredBlock.getColor().getColor().getRGB();
        float top;
        float bottom;
        float topDepth;
        float bottomDepth;
        if (type == SlabType.BOTTOM) {
            top = 0.5F;
            bottom = 0F;
            topDepth = 0.5F;
            bottomDepth = 0F;
        } else {
            if (type == SlabType.TOP) {
                top = 1F;
                bottom = 0.5F;
                topDepth = 0F;
                bottomDepth = 0.5F;
            } else {
                top = 1F;
                bottom = 0F;
                topDepth = 0F;
                bottomDepth = 0F;
            }
        }
        emitter.square(Direction.SOUTH, 0, bottom, 1, top, 0)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE)), MutableQuadView.BAKE_LOCK_UV).emit();
        emitter.square(Direction.EAST, 0, bottom, 1, top, 0)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE)), MutableQuadView.BAKE_LOCK_UV).emit();
        emitter.square(Direction.WEST, 0, bottom, 1, top, 0)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE)), MutableQuadView.BAKE_LOCK_UV).emit();
        emitter.square(Direction.NORTH, 0, bottom, 1, top, 0)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE)), MutableQuadView.BAKE_LOCK_UV).emit();
        emitter.square(Direction.DOWN, 0, 0, 1, 1, bottomDepth)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.BOTTOM)), MutableQuadView.BAKE_LOCK_UV).emit();
        emitter.square(Direction.UP, 0, 0, 1, 1, topDepth)
                .material(mat)
                .spriteColor(0, color, color, color, color)
                .spriteBake(0,
                        MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock
                                .getColoredObject().getTextureMap().get(ColoredObject.TextureFace.TOP)), MutableQuadView.BAKE_LOCK_UV).emit();

        return builder.build();
    }

    @Override
    public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh(SlabType.BOTTOM));
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
            return ColoredSlabRenderer.this;
        }
    }

    @Override
    public ModelItemPropertyOverrideList getItemPropertyOverrides() {
        return new ItemProxy();
    }
}
