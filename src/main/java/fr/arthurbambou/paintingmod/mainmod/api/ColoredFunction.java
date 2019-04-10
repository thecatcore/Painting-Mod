package fr.arthurbambou.paintingmod.mainmod.api;

import fr.arthurbambou.paintingmod.mainmod.registery.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;

public abstract class ColoredFunction {
    private Identifier identifier;

    public ColoredFunction(Identifier identifier) {
        this.identifier = identifier;
    }

    public ColoredFunction(String identifier) {
        this.identifier = new Identifier(identifier);
    }

    public ColoredFunction(String modid, String name) {
        this.identifier = new Identifier(modid, name);
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void usedpaintbrush (PlayerEntity player) {
        if (!player.isCreative()) {
            player.getStackInHand(Hand.MAIN).setAmount(0);
            player.inventory.insertStack(new ItemStack(ModItems.NORMAL_PAINTBRUSH));
        }
    }

    public void heatgun(ItemStack itemStack) {
        System.out.println(itemStack.getDamage() + "=" + itemStack.getDurability());
        itemStack.setDamage(itemStack.getDamage() + 1);
        System.out.println(itemStack.getDamage() + "=" + itemStack.getDurability());
        if (itemStack.getDamage() >= itemStack.getDurability() + 1) {
            itemStack.setAmount(0);
        }
    }

    public abstract void paint(ItemUsageContext var1, ColoredObject coloredObject);
    public abstract void unPaint(ItemUsageContext var1, ColoredObject coloredObject);
    public abstract boolean isFromType(ColoredObject coloredObject);
    public abstract Class getColoredObjectType();
}
