package fr.arthurbambou.paintingmod.mainmod.items;

import fr.arthurbambou.paintingmod.mainmod.api.ColoredBlock;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class ColoredItemBlock extends BlockItem {
    public ColoredItemBlock(Block block_1, Settings item$Settings_1) {
        super(block_1, item$Settings_1);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public Text getName(ItemStack stack) {
        return new TranslatableText("text.paintingmod.color." + ((ColoredBlock)(this.getBlock())).getColor().name().toLowerCase(),
                new TranslatableText(((ColoredBlock)(this.getBlock())).getColoredObject().replace.getTranslationKey()));
    }
}
