package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.blocks.SoggyClay;
import com.arthurbambou.paintingmod.blocks.colored.*;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOGGY_CLAY = new SoggyClay("soggy_clay", Material.IRON, Main.PAINTING_MOD);
	
	
	//Planks Blocks
	public static final Block BLACK_PLANK = new BlackBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block RED_PLANK = new RedBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GREEN_PLANK = new GreenBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BROWN_PLANK = new BrownBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BLUE_PLANK = new BlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PURPLE_PLANK = new PurpleBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block CYAN_PLANK = new CyanBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_GRAY_PLANK = new LightGrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GRAY_PLANK = new GrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PINK_PLANK = new PinkBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIME_PLANK = new LimeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block YELLOW_PLANK = new YellowBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_BLUE_PLANK = new LightBlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block MAGENTA_PLANK = new MagentaBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block ORANGE_PLANK = new OrangeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block WHITE_PLANK = new WhiteBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);

	//Stone Blocks
	public static final Block BLACK_STONE = new BlackBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_STONE = new RedBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_STONE = new GreenBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_STONE = new BrownBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_STONE = new BlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_STONE = new PurpleBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_STONE = new CyanBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_STONE = new LightGrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_STONE = new GrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_STONE = new PinkBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_STONE = new LimeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_STONE = new YellowBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_STONE = new LightBlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_STONE = new MagentaBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_STONE = new OrangeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_STONE = new WhiteBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
}
