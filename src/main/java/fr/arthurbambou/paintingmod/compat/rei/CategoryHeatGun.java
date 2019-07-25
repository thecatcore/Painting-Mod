//package fr.arthurbambou.paintingmod.compat.rei;
//
//import fr.arthurbambou.paintingmod.mainmod.registery.ModItems;
//import com.google.common.collect.Lists;
//import com.mojang.blaze3d.platform.GlStateManager;
//import me.shedaniel.rei.api.DisplaySettings;
//import me.shedaniel.rei.api.RecipeCategory;
//import me.shedaniel.rei.api.RecipeDisplay;
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
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Supplier;
//
//public class CategoryHeatGun implements RecipeCategory<DisplayHeatGun> {
//    private static final Identifier DISPLAY_TEXTURE = new Identifier("paintingmod", "textures/gui/display.png");
//
//    @Override
//    public Identifier getIdentifier() {
//        return PaintingModPlugin.HEATGUN;
//    }
//
//    @Override
//    public ItemStack getCategoryIcon() {
//        return new ItemStack(ModItems.HEAT_GUN);
//    }
//
//    @Override
//    public String getCategoryName() {
//        return I18n.translate("category.paintingmod.heatgun");
//    }
//
//    @Override
//    public DisplaySettings getDisplaySettings() {
//        return new DisplaySettings() {
//            @Override
//            public int getDisplayHeight(RecipeCategory iRecipeCategory) {
//                return 140;
//            }
//
//            @Override
//            public int getDisplayWidth(RecipeCategory iRecipeCategory, RecipeDisplay display) {
//                return 150;
//            }
//
//            @Override
//            public int getMaximumRecipePerPage(RecipeCategory iRecipeCategory) {
//                return -1;
//            }
//
//            @Override
//            public int getFixedRecipesPerPage() {
//                return 1;
//            }
//        };
//    }
//
//    @Override
//    public List<Widget> setupDisplay(Supplier<DisplayHeatGun> recipeDisplaySupplier, Rectangle bounds) {
//        List<Widget> widgets = Lists.newArrayList();
//        Point startingPoint = new Point(bounds.x + bounds.width - 55, bounds.y + 110);
//        widgets.add(new RecipeBaseWidget(bounds) {
//            @Override
//            public void render(int mouseX, int mouseY, float partialTicks) {
//                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
//                GuiLighting.disable();
//                MinecraftClient.getInstance().getTextureManager().bindTexture(DISPLAY_TEXTURE);
//                this.blit(startingPoint.x, startingPoint.y, 0, 0, 55, 26);
//            }
//        });
//        for(int y = 0; y < 2; y++)
//            for(int x = 0; x < 8; x++)
//                widgets.add(new ItemSlotWidget((int) bounds.getCenterX() - 72 + x * 18, bounds.y + y * 18, Arrays.asList(recipeDisplaySupplier.get().getInput().get(0).get(y * 8 + x)), true, true, true));
//        widgets.add(new ItemSlotWidget((int) startingPoint.x + 34, startingPoint.y + 5, recipeDisplaySupplier.get().getOutput(), false, true));
//        return widgets;
//    }
//}
