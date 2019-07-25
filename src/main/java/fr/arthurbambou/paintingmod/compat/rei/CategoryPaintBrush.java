//package fr.arthurbambou.paintingmod.compat.rei;
//
//import fr.arthurbambou.paintingmod.mainmod.registery.ModItems;
//import com.google.common.collect.Lists;
//import com.mojang.blaze3d.platform.GlStateManager;
//import me.shedaniel.rei.api.RecipeCategory;
//import me.shedaniel.rei.api.Renderer;
//import me.shedaniel.rei.gui.widget.ItemSlotWidget;
//import me.shedaniel.rei.gui.widget.RecipeBaseWidget;
//import me.shedaniel.rei.gui.widget.Widget;
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.client.render.GuiLighting;
//import net.minecraft.client.resource.language.I18n;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.Identifier;
//
//import java.awt.*;
//import java.util.List;
//import java.util.function.Supplier;
//
//public class CategoryPaintBrush implements RecipeCategory<DisplayPaintBrush> {
//
//    private static final Identifier DISPLAY_TEXTURE = new Identifier("paintingmod", "textures/gui/display.png");
//
//    @Override
//    public Identifier getIdentifier() {
//        return PaintingModPlugin.PAINTBRUSH;
//    }
//
//    @Override
//    public ItemStack getCategoryIcon() {
//        return ModItems.NORMAL_PAINTBRUSH.getStackForRender();
//    }
//
//    @Override
//    public String getCategoryName() {
//        return I18n.translate("category.paintingmod.paintbrush");
//    }
//
//    @Override
//    public List<Widget> setupDisplay(Supplier<DisplayPaintBrush> recipeDisplaySupplier, Rectangle bounds) {
//        Point startingPoint = new Point((int) bounds.getCenterX() - 55 / 2 + 25, (int) bounds.getCenterY() - 13);
//        List list = Lists.newArrayList(new RecipeBaseWidget(bounds) {
//            @Override
//            public void render(int mouseX, int mouseY, float delta) {
//                super.render(mouseX, mouseY, delta);
//                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
//                GuiLighting.disable();
//                MinecraftClient.getInstance().getTextureManager().bindTexture(DISPLAY_TEXTURE);
//                this.blit(startingPoint.x, startingPoint.y, 0, 0, 55, 26);
//            }
//        });
//        list.add(new ItemSlotWidget(startingPoint.x - 53, startingPoint.y + 5, recipeDisplaySupplier.get().getPaintbrush(), true, true));
//        list.add(new ItemSlotWidget(startingPoint.x - 23, startingPoint.y + 5, recipeDisplaySupplier.get().getInputItem(), true, true));
//        list.add(new ItemSlotWidget(startingPoint.x + 34, startingPoint.y + 5, recipeDisplaySupplier.get().getOutput(), false, true));
//        return list;
//    }
//
//}
