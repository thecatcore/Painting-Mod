package fr.arthurbambou.paintingmod.coloredblocks;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.coloredblocks.ColoredPressurePlate;
import fr.arthurbambou.paintingmod.blocks.coloreds.PressurePlate;
import fr.arthurbambou.paintingmod.blocks.coloreds.PressurePlateWeighted;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;

public class PMColoredPressurePlate extends ColoredPressurePlate {
    public PMColoredPressurePlate(Block replace, PressurePlateBlock.Sensitivity sensitivity) {
        super(replace, sensitivity, PaintingMod.MODID);
    }

    public PMColoredPressurePlate(Block replace, PressurePlateBlock.Sensitivity sensitivity, String name) {
        super(replace, sensitivity, PaintingMod.MODID, name);
    }

    public PMColoredPressurePlate(Block replace, int maxWeight) {
        super(replace, maxWeight, PaintingMod.MODID);
    }

    public PMColoredPressurePlate(Block replace, int maxWeight, String name) {
        super(replace, maxWeight, PaintingMod.MODID, name);
    }

    @Override
    public void createBlocks() {
        if (isWeighted) {
            this.black = new PressurePlateWeighted("black_" + getName(), this.settings, this.maxWeight);
            this.red = new PressurePlateWeighted("red_" + getName(), this.settings, this.maxWeight);
            this.green = new PressurePlateWeighted("green_" + getName(), this.settings, this.maxWeight);
            this.brown = new PressurePlateWeighted("brown_" + getName(), this.settings, this.maxWeight);
            this.blue = new PressurePlateWeighted("blue_" + getName(), this.settings, this.maxWeight);
            this.purple = new PressurePlateWeighted("purple_" + getName(), this.settings, this.maxWeight);
            this.cyan = new PressurePlateWeighted("cyan_" + getName(), this.settings, this.maxWeight);
            this.lightgray = new PressurePlateWeighted("light_gray_" + getName(), this.settings, this.maxWeight);
            this.gray = new PressurePlateWeighted("gray_" + getName(), this.settings, this.maxWeight);
            this.pink = new PressurePlateWeighted("pink_" + getName(), this.settings, this.maxWeight);
            this.lime = new PressurePlateWeighted("lime_" + getName(), this.settings, this.maxWeight);
            this.yellow = new PressurePlateWeighted("yellow_" + getName(), this.settings, this.maxWeight);
            this.lightblue = new PressurePlateWeighted("light_blue_" + getName(), this.settings, this.maxWeight);
            this.magenta = new PressurePlateWeighted("magenta_" + getName(), this.settings, this.maxWeight);
            this.orange = new PressurePlateWeighted("orange_" + getName(), this.settings, this.maxWeight);
            this.white = new PressurePlateWeighted("white_" + getName(), this.settings, this.maxWeight);
        } else {
            this.black = new PressurePlate("black_" + getName(), this.settings, this.sensitivity);
            this.red = new PressurePlate("red_" + getName(), this.settings, this.sensitivity);
            this.green = new PressurePlate("green_" + getName(), this.settings, this.sensitivity);
            this.brown = new PressurePlate("brown_" + getName(), this.settings, this.sensitivity);
            this.blue = new PressurePlate("blue_" + getName(), this.settings, this.sensitivity);
            this.purple = new PressurePlate("purple_" + getName(), this.settings, this.sensitivity);
            this.cyan = new PressurePlate("cyan_" + getName(), this.settings, this.sensitivity);
            this.lightgray = new PressurePlate("light_gray_" + getName(), this.settings, this.sensitivity);
            this.gray = new PressurePlate("gray_" + getName(), this.settings, this.sensitivity);
            this.pink = new PressurePlate("pink_" + getName(), this.settings, this.sensitivity);
            this.lime = new PressurePlate("lime_" + getName(), this.settings, this.sensitivity);
            this.yellow = new PressurePlate("yellow_" + getName(), this.settings, this.sensitivity);
            this.lightblue = new PressurePlate("light_blue_" + getName(), this.settings, this.sensitivity);
            this.magenta = new PressurePlate("magenta_" + getName(), this.settings, this.sensitivity);
            this.orange = new PressurePlate("orange_" + getName(), this.settings, this.sensitivity);
            this.white = new PressurePlate("white_" + getName(), this.settings, this.sensitivity);
        }
    }
}
