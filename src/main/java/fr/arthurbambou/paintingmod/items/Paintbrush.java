package fr.arthurbambou.paintingmod.items;

import fr.arthurbambou.paintingmod.api.ColoredFunctionRegistry;
import fr.arthurbambou.paintingmod.api.ColoredObjectRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.EnumActionResult;

public class Paintbrush extends ItemBase {

    public Paintbrush(String name) {
        super(new Item.Properties().maxStackSize(1));
        setRegistryName(name + "_paintbrush");
    }

    @Override
    public EnumActionResult onItemUse(ItemUseContext p_195939_1_) {
        ColoredObjectRegistry.registry.forEach(coloredObject -> {
            ColoredFunctionRegistry.registry.forEach(coloredFunction -> {
                coloredFunction.paint(coloredObject, p_195939_1_.getWorld(), p_195939_1_.getPos(), p_195939_1_.getPlayer(), this);
            });
        });
        return super.onItemUse(p_195939_1_);
    }

    public enum Type {
        NORMAL("normal"),
        BLACK("black"),
        RED("red"),
        GREEN("green"),
        BROWN("brown"),
        BLUE("blue"),
        PURPLE("purple"),
        CYAN("cyan"),
        LIGHT_GRAY("light_gray"),
        GRAY("gray"),
        PINK("pink"),
        LIME("lime"),
        YELLOW("yellow"),
        LIGHT_BLUE("light_blue"),
        MAGENTA("magenta"),
        ORANGE("orange"),
        WHITE("white");

        private String name;

        private Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
