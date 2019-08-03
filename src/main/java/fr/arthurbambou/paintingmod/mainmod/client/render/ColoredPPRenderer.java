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
import net.fabricmc.fabric.api.renderer.v1.render.RenderContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelItemPropertyOverrideList;
import net.minecraft.client.texture.Sprite;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ExtendedBlockView;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.Random;
import java.util.function.Supplier;

public class ColoredPPRenderer extends AbstractColoredRenderer {

    public ColoredPPRenderer(ColoredBlock coloredblock) {
        super(coloredblock);
    }

    @Override
    public void emitBlockQuads(ExtendedBlockView blockView, BlockState state, BlockPos pos, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh(state.get(PressurePlateBlock.POWERED)));
    }

    private Mesh mesh(boolean powered) {
        Renderer renderer = RendererAccess.INSTANCE.getRenderer();
        MeshBuilder builder = renderer.meshBuilder();
        QuadEmitter emitter = builder.getEmitter();

        RenderMaterial mat = renderer.materialFinder().disableDiffuse(0, true).find();
        int color = coloredBlock.getColor().getColor().getRGB();
        float top = 0.0F;
        if (!(powered)) {
            top = 0.0625F;
        } else {
            top = 0.03125F;
        }
        if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.ALL)) {
            Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.ALL));

            emitter.square(Direction.SOUTH, 0.0625F, 0, 0.9375F, top, 0.0625F)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.EAST, 0.0625F, 0, 0.9375F, top, 0.0625F)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.WEST, 0.0625F, 0, 0.9375F, top, 0.0625F)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.NORTH, 0.0625F, 0, 0.9375F, top, 0.0625F)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.DOWN, 0.0625F, 0.0625F, 0.9375F, 0.9375F, 0)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            emitter.square(Direction.UP, 0.0625F, 0.0625F, 0.9375F, 0.9375F, 1-top)
                    .material(mat)
                    .spriteColor(0, color, color, color, color)
                    .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
        } else {
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.BOTTOM)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.BOTTOM));
                emitter.square(Direction.DOWN, 0.0625F, 0.0625F, 0.9375F, 0.9375F, 0)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.TOP)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.TOP));
                emitter.square(Direction.UP, 0.0625F, 0.0625F, 0.9375F, 0.9375F, 1-top)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
            if (coloredBlock.getColoredObject().getTextureMap().containsKey(ColoredObject.TextureFace.SIDE)) {
                Sprite sprite = MinecraftClient.getInstance().getSpriteAtlas().getSprite(coloredBlock.getColoredObject().getTextureMap().get(ColoredObject.TextureFace.SIDE));
                emitter.square(Direction.SOUTH, 0.0625F, 0, 0.9375F, top, 0.0625F)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.EAST, 0.0625F, 0, 0.9375F, top, 0.0625F)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.WEST, 0.0625F, 0, 0.9375F, top, 0.0625F)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
                emitter.square(Direction.NORTH, 0.0625F, 0, 0.9375F, top, 0.0625F)
                        .material(mat)
                        .spriteColor(0, color, color, color, color)
                        .spriteBake(0, sprite, MutableQuadView.BAKE_LOCK_UV).emit();
            }
        }

        return builder.build();
    }

    @Override
    public void emitItemQuads(ItemStack stack, Supplier<Random> randomSupplier, RenderContext context) {
        context.meshConsumer().accept(mesh(false));
    }

    protected class ItemProxy extends ModelItemPropertyOverrideList {
        public ItemProxy() {
            super(null, null, null, Collections.emptyList());
        }

        @Override
        public BakedModel apply(BakedModel bakedModel_1, ItemStack itemStack_1, World world_1, LivingEntity livingEntity_1) {
            return ColoredPPRenderer.this;
        }
    }

    @Override
    public ModelItemPropertyOverrideList getItemPropertyOverrides() {
        return new ItemProxy();
    }
}
