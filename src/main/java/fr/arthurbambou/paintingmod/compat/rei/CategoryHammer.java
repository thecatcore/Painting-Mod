//package fr.arthurbambou.paintingmod.compat.rei;
//
//import fr.arthurbambou.paintingmod.mainmod.registery.ModItems;
//import com.google.common.collect.Lists;
//import com.mojang.blaze3d.platform.GlStateManager;
//import me.shedaniel.rei.api.RecipeCategory;
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
//public class CategoryHammer implements RecipeCategory<DisplayHammer> {
//
//    private static final Identifier DISPLAY_TEXTURE = new Identifier("paintingmod", "textures/gui/display.png");
//
//    @Override
//    public Identifier getIdentifier() {
//        return PaintingModPlugin.HAMMER;
//    }
//
//    @Override
//    public ItemStack getCategoryIcon() {
//        return new ItemStack(ModItems.HAMMER);
//    }
//
//    @Override
//    public String getCategoryName() {
//        return I18n.translate("category.paintingmod.hammer");
//    }
//
//    @Override
//    public List<Widget> setupDisplay(Supplier<DisplayHammer> recipeDisplaySupplier, Rectangle bounds) {
//        List<Widget> widgets = Lists.newArrayList();
//        Point startPoint = new Point((int) bounds.getCenterX() - 50, (int) bounds.getCenterY() - 25 - 7);
//        widgets.add(new RecipeBaseWidget(bounds) {
//            @Override
//            public void render(int mouseX, int mouseY, float partialTicks) {
//                super.render(mouseX, mouseY, partialTicks);
//                GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
//                GuiLighting.disable();
//                MinecraftClient.getInstance().getTextureManager().bindTexture(DISPLAY_TEXTURE);
//                this.blit(startPoint.x, startPoint.y + 5, 0, 31, 99, 45);
//            }
//        });
//        final List<List<ItemStack>> input = recipeDisplaySupplier.get().getInput();
//        widgets.add(new ItemSlotWidget(startPoint.x + 14, startPoint.y + 25, input.get(0), true, true, true) {
//            @Override
//            protected String getItemCountOverlay(ItemStack currentStack) {
//                if (currentStack.getCount() == 1)
//                    return "";
//                return currentStack.getCount() < 1 ? "§c" + currentStack.getCount() : currentStack.getCount() + "";
//            }
//        });
//        widgets.add(new ItemSlotWidget(startPoint.x + 42, startPoint.y + 43, Arrays.asList(recipeDisplaySupplier.get().getHammer()), true, true, true) {
//            @Override
//            protected String getItemCountOverlay(ItemStack currentStack) {
//                if (currentStack.getCount() == 1)
//                    return "";
//                return currentStack.getCount() < 1 ? "§c" + currentStack.getCount() : currentStack.getCount() + "";
//            }
//        });
//        widgets.add(new ItemSlotWidget(startPoint.x + 71, startPoint.y + 24, recipeDisplaySupplier.get().getOutput(), false, true, true) {
//            @Override
//            protected String getItemCountOverlay(ItemStack currentStack) {
//                if (currentStack.getCount() == 1)
//                    return "";
//                return currentStack.getCount() < 1 ? "§c" + currentStack.getCount() : currentStack.getCount() + "";
//            }
//        });
//        return widgets;
//    }
//}
