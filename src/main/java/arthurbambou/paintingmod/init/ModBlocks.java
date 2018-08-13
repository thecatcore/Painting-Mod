package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.Main;
import arthurbambou.paintingmod.blocks.SoggyClay;
import arthurbambou.paintingmod.blocks.colored.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOGGY_CLAY = new SoggyClay("soggy_clay", Material.IRON, Main.PAINTING_MOD);
	
	
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

	//Granite Blocks
	public static final Block BLACK_GRANITE = new BlackBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_GRANITE = new RedBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_GRANITE = new GreenBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_GRANITE = new BrownBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_GRANITE = new BlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_GRANITE = new PurpleBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_GRANITE = new CyanBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_GRANITE = new LightGrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_GRANITE = new GrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_GRANITE = new PinkBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_GRANITE = new LimeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_GRANITE = new YellowBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_GRANITE = new LightBlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_GRANITE = new MagentaBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_GRANITE = new OrangeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_GRANITE = new WhiteBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Granite Blocks
	public static final Block BLACK_POLISHED_GRANITE = new BlackBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_GRANITE = new RedBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_GRANITE = new GreenBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_GRANITE = new BrownBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_GRANITE = new BlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_GRANITE = new PurpleBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_GRANITE = new CyanBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_GRANITE = new LightGrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_GRANITE = new GrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_GRANITE = new PinkBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_GRANITE = new LimeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_GRANITE = new YellowBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_GRANITE = new LightBlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_GRANITE = new MagentaBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_GRANITE = new OrangeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_GRANITE = new WhiteBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Diorite
	public static final Block BLACK_DIORITE= new BlackBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_DIORITE= new RedBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_DIORITE= new GreenBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_DIORITE= new BrownBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_DIORITE= new BlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_DIORITE= new PurpleBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_DIORITE= new CyanBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_DIORITE= new LightGrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_DIORITE= new GrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_DIORITE= new PinkBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_DIORITE= new LimeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_DIORITE= new YellowBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_DIORITE= new LightBlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_DIORITE= new MagentaBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_DIORITE= new OrangeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_DIORITE= new WhiteBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Diorite
	public static final Block BLACK_POLISHED_DIORITE= new BlackBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_DIORITE= new RedBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_DIORITE= new GreenBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_DIORITE= new BrownBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_DIORITE= new BlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_DIORITE= new PurpleBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_DIORITE= new CyanBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_DIORITE= new LightGrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_DIORITE= new GrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_DIORITE= new PinkBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_DIORITE= new LimeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_DIORITE= new YellowBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_DIORITE= new LightBlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_DIORITE= new MagentaBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_DIORITE= new OrangeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_DIORITE= new WhiteBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Andesite
	public static final Block BLACK_ANDESITE= new BlackBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_ANDESITE= new RedBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_ANDESITE= new GreenBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_ANDESITE= new BrownBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_ANDESITE= new BlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_ANDESITE= new PurpleBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_ANDESITE= new CyanBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_ANDESITE= new LightGrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_ANDESITE= new GrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_ANDESITE= new PinkBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_ANDESITE= new LimeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_ANDESITE= new YellowBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_ANDESITE= new LightBlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_ANDESITE= new MagentaBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_ANDESITE= new OrangeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_ANDESITE= new WhiteBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Andesite
	public static final Block BLACK_POLISHED_ANDESITE= new BlackBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_ANDESITE= new RedBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_ANDESITE= new GreenBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_ANDESITE= new BrownBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_ANDESITE= new BlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_ANDESITE= new PurpleBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_ANDESITE= new CyanBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_ANDESITE= new LightGrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_ANDESITE= new GrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_ANDESITE= new PinkBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_ANDESITE= new LimeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_ANDESITE= new YellowBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_ANDESITE= new LightBlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_ANDESITE= new MagentaBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_ANDESITE= new OrangeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_ANDESITE= new WhiteBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	
	//Dirt
	public static final Block BLACK_DIRT= new BlackBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_DIRT= new RedBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_DIRT= new GreenBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_DIRT= new BrownBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_DIRT= new BlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_DIRT= new PurpleBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_DIRT= new CyanBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_DIRT= new LightGrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_DIRT= new GrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_DIRT= new PinkBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_DIRT= new LimeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_DIRT= new YellowBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_DIRT= new LightBlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_DIRT= new MagentaBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_DIRT= new OrangeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_DIRT= new WhiteBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Coarse Dirt
	public static final Block BLACK_COARSE_DIRT= new BlackBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_COARSE_DIRT= new RedBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_COARSE_DIRT= new GreenBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_COARSE_DIRT= new BrownBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_COARSE_DIRT= new BlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_COARSE_DIRT= new PurpleBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_COARSE_DIRT= new CyanBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_COARSE_DIRT= new LightGrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_COARSE_DIRT= new GrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_COARSE_DIRT= new PinkBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_COARSE_DIRT= new LimeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_COARSE_DIRT= new YellowBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_COARSE_DIRT= new LightBlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_COARSE_DIRT= new MagentaBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_COARSE_DIRT= new OrangeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_COARSE_DIRT= new WhiteBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Cobblestone
	public static final Block BLACK_COBBLESTONE= new BlackBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_COBBLESTONE= new RedBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_COBBLESTONE= new GreenBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_COBBLESTONE= new BrownBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_COBBLESTONE= new BlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_COBBLESTONE= new PurpleBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_COBBLESTONE= new CyanBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_COBBLESTONE= new LightGrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_COBBLESTONE= new GrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_COBBLESTONE= new PinkBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_COBBLESTONE= new LimeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_COBBLESTONE= new YellowBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_COBBLESTONE= new LightBlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_COBBLESTONE= new MagentaBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_COBBLESTONE= new OrangeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_COBBLESTONE= new WhiteBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);

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
	
	//Sand
	public static final Block BLACK_SAND= new BlackBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_SAND= new RedBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_SAND= new GreenBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_SAND= new BrownBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_SAND= new BlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_SAND= new PurpleBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_SAND= new CyanBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_SAND= new LightGrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_SAND= new GrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_SAND= new PinkBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_SAND= new LimeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_SAND= new YellowBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_SAND= new LightBlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_SAND= new MagentaBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_SAND= new OrangeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_SAND= new WhiteBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);

	//Gravel
	public static final Block BLACK_GRAVEL= new BlackBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block RED_GRAVEL= new RedBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GREEN_GRAVEL= new GreenBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BROWN_GRAVEL= new BrownBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BLUE_GRAVEL= new BlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PURPLE_GRAVEL= new PurpleBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block CYAN_GRAVEL= new CyanBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_GRAY_GRAVEL= new LightGrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GRAY_GRAVEL= new GrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PINK_GRAVEL= new PinkBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIME_GRAVEL= new LimeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block YELLOW_GRAVEL= new YellowBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_BLUE_GRAVEL= new LightBlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block MAGENTA_GRAVEL= new MagentaBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block ORANGE_GRAVEL= new OrangeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block WHITE_GRAVEL= new WhiteBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);

	//Sponge
	public static final Block BLACK_SPONGE= new BlackBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_SPONGE= new RedBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_SPONGE= new GreenBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_SPONGE= new BrownBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_SPONGE= new BlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_SPONGE= new PurpleBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_SPONGE= new CyanBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_SPONGE= new LightGrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_SPONGE= new GrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_SPONGE= new PinkBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_SPONGE= new LimeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_SPONGE= new YellowBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_SPONGE= new LightBlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_SPONGE= new MagentaBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_SPONGE= new OrangeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_SPONGE= new WhiteBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);

	//Wet Sponge
	public static final Block BLACK_WET_SPONGE= new BlackBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_WET_SPONGE= new RedBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_WET_SPONGE= new GreenBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_WET_SPONGE= new BrownBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_WET_SPONGE= new BlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_WET_SPONGE= new PurpleBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_WET_SPONGE= new CyanBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_WET_SPONGE= new LightGrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_WET_SPONGE= new GrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_WET_SPONGE= new PinkBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_WET_SPONGE= new LimeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_WET_SPONGE= new YellowBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_WET_SPONGE= new LightBlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_WET_SPONGE= new MagentaBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_WET_SPONGE= new OrangeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_WET_SPONGE= new WhiteBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);

	//Lapis Lazuli Block
	public static final Block BLACK_LAPIS_LAZULI_BLOCK= new BlackBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block RED_LAPIS_LAZULI_BLOCK= new RedBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block GREEN_LAPIS_LAZULI_BLOCK= new GreenBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block BROWN_LAPIS_LAZULI_BLOCK= new BrownBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block BLUE_LAPIS_LAZULI_BLOCK= new BlueBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block PURPLE_LAPIS_LAZULI_BLOCK= new PurpleBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block CYAN_LAPIS_LAZULI_BLOCK= new CyanBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIGHT_GRAY_LAPIS_LAZULI_BLOCK= new LightGrayBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block GRAY_LAPIS_LAZULI_BLOCK= new GrayBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block PINK_LAPIS_LAZULI_BLOCK= new PinkBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIME_LAPIS_LAZULI_BLOCK= new LimeBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block YELLOW_LAPIS_LAZULI_BLOCK= new YellowBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIGHT_BLUE_LAPIS_LAZULI_BLOCK= new LightBlueBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block MAGENTA_LAPIS_LAZULI_BLOCK= new MagentaBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block ORANGE_LAPIS_LAZULI_BLOCK= new OrangeBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block WHITE_LAPIS_LAZULI_BLOCK= new WhiteBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);

	//Sandstone
	public static final Block BLACK_SANDSTONE= new BlackBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block RED_SANDSTONE= new RedBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GREEN_SANDSTONE= new GreenBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BROWN_SANDSTONE= new BrownBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BLUE_SANDSTONE= new BlueBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PURPLE_SANDSTONE= new PurpleBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block CYAN_SANDSTONE= new CyanBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_SANDSTONE= new LightGrayBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GRAY_SANDSTONE= new GrayBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PINK_SANDSTONE= new PinkBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIME_SANDSTONE= new LimeBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block YELLOW_SANDSTONE= new YellowBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_SANDSTONE= new LightBlueBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block MAGENTA_SANDSTONE= new MagentaBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block ORANGE_SANDSTONE= new OrangeBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block WHITE_SANDSTONE= new WhiteBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);

	//Chiseled Sandstone
	public static final Block BLACK_CHISELED_SANDSTONE= new BlackBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block RED_CHISELED_SANDSTONE= new RedBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GREEN_CHISELED_SANDSTONE= new GreenBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BROWN_CHISELED_SANDSTONE= new BrownBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BLUE_CHISELED_SANDSTONE= new BlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PURPLE_CHISELED_SANDSTONE= new PurpleBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block CYAN_CHISELED_SANDSTONE= new CyanBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_CHISELED_SANDSTONE= new LightGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GRAY_CHISELED_SANDSTONE= new GrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PINK_CHISELED_SANDSTONE= new PinkBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIME_CHISELED_SANDSTONE= new LimeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block YELLOW_CHISELED_SANDSTONE= new YellowBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_CHISELED_SANDSTONE= new LightBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block MAGENTA_CHISELED_SANDSTONE= new MagentaBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block ORANGE_CHISELED_SANDSTONE= new OrangeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block WHITE_CHISELED_SANDSTONE= new WhiteBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);

	//Smooth Sandstone
	public static final Block BLACK_SMOOTH_SANDSTONE= new BlackBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block RED_SMOOTH_SANDSTONE= new RedBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GREEN_SMOOTH_SANDSTONE= new GreenBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BROWN_SMOOTH_SANDSTONE= new BrownBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BLUE_SMOOTH_SANDSTONE= new BlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PURPLE_SMOOTH_SANDSTONE= new PurpleBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block CYAN_SMOOTH_SANDSTONE= new CyanBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE= new LightGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GRAY_SMOOTH_SANDSTONE= new GrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PINK_SMOOTH_SANDSTONE= new PinkBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIME_SMOOTH_SANDSTONE= new LimeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block YELLOW_SMOOTH_SANDSTONE= new YellowBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE= new LightBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block MAGENTA_SMOOTH_SANDSTONE= new MagentaBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block ORANGE_SMOOTH_SANDSTONE= new OrangeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block WHITE_SMOOTH_SANDSTONE= new WhiteBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	
	//Gold Block
	public static final Block BLACK_GOLD_BLOCK= new BlackBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block RED_GOLD_BLOCK= new RedBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block GREEN_GOLD_BLOCK= new GreenBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block BROWN_GOLD_BLOCK= new BrownBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block BLUE_GOLD_BLOCK= new BlueBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block PURPLE_GOLD_BLOCK= new PurpleBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block CYAN_GOLD_BLOCK= new CyanBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_GRAY_GOLD_BLOCK= new LightGrayBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block GRAY_GOLD_BLOCK= new GrayBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block PINK_GOLD_BLOCK= new PinkBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIME_GOLD_BLOCK= new LimeBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block YELLOW_GOLD_BLOCK= new YellowBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_BLUE_GOLD_BLOCK= new LightBlueBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block MAGENTA_GOLD_BLOCK= new MagentaBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block ORANGE_GOLD_BLOCK= new OrangeBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block WHITE_GOLD_BLOCK= new WhiteBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);

	//Iron Block
	public static final Block BLACK_IRON_BLOCK= new BlackBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block RED_IRON_BLOCK= new RedBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block GREEN_IRON_BLOCK= new GreenBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block BROWN_IRON_BLOCK= new BrownBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block BLUE_IRON_BLOCK= new BlueBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block PURPLE_IRON_BLOCK= new PurpleBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block CYAN_IRON_BLOCK= new CyanBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIGHT_GRAY_IRON_BLOCK= new LightGrayBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block GRAY_IRON_BLOCK= new GrayBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block PINK_IRON_BLOCK= new PinkBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIME_IRON_BLOCK= new LimeBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block YELLOW_IRON_BLOCK= new YellowBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIGHT_BLUE_IRON_BLOCK= new LightBlueBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block MAGENTA_IRON_BLOCK= new MagentaBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block ORANGE_IRON_BLOCK= new OrangeBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block WHITE_IRON_BLOCK= new WhiteBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);

	//Brick
	public static final Block BLACK_BRICK= new BlackBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_BRICK= new RedBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_BRICK= new GreenBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_BRICK= new BrownBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_BRICK= new BlueBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_BRICK= new PurpleBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_BRICK= new CyanBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_BRICK= new LightGrayBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_BRICK= new GrayBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_BRICK= new PinkBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_BRICK= new LimeBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_BRICK= new YellowBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_BRICK= new LightBlueBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_BRICK= new MagentaBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_BRICK= new OrangeBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_BRICK= new WhiteBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);

	//Moss Stone
	public static final Block BLACK_MOSS_STONE= new BlackBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_MOSS_STONE= new RedBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_MOSS_STONE= new GreenBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_MOSS_STONE= new BrownBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_MOSS_STONE= new BlueBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_MOSS_STONE= new PurpleBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_MOSS_STONE= new CyanBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_MOSS_STONE= new LightGrayBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_MOSS_STONE= new GrayBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_MOSS_STONE= new PinkBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_MOSS_STONE= new LimeBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_MOSS_STONE= new YellowBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_MOSS_STONE= new LightBlueBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_MOSS_STONE= new MagentaBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_MOSS_STONE= new OrangeBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_MOSS_STONE= new WhiteBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);

	//Obsidian
	public static final Block BLACK_OBSIDIAN= new BlackBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block RED_OBSIDIAN= new RedBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block GREEN_OBSIDIAN= new GreenBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block BROWN_OBSIDIAN= new BrownBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block BLUE_OBSIDIAN= new BlueBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block PURPLE_OBSIDIAN= new PurpleBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block CYAN_OBSIDIAN= new CyanBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIGHT_GRAY_OBSIDIAN= new LightGrayBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block GRAY_OBSIDIAN= new GrayBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block PINK_OBSIDIAN= new PinkBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIME_OBSIDIAN= new LimeBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block YELLOW_OBSIDIAN= new YellowBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIGHT_BLUE_OBSIDIAN= new LightBlueBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block MAGENTA_OBSIDIAN= new MagentaBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block ORANGE_OBSIDIAN= new OrangeBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block WHITE_OBSIDIAN= new WhiteBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);

	//Diamond Block
	public static final Block BLACK_DIAMOND_BLOCK= new BlackBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block RED_DIAMOND_BLOCK= new RedBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GREEN_DIAMOND_BLOCK= new GreenBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BROWN_DIAMOND_BLOCK= new BrownBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BLUE_DIAMOND_BLOCK= new BlueBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PURPLE_DIAMOND_BLOCK= new PurpleBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block CYAN_DIAMOND_BLOCK= new CyanBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_GRAY_DIAMOND_BLOCK= new LightGrayBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GRAY_DIAMOND_BLOCK= new GrayBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PINK_DIAMOND_BLOCK= new PinkBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIME_DIAMOND_BLOCK= new LimeBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block YELLOW_DIAMOND_BLOCK= new YellowBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_BLUE_DIAMOND_BLOCK= new LightBlueBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block MAGENTA_DIAMOND_BLOCK= new MagentaBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block ORANGE_DIAMOND_BLOCK= new OrangeBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block WHITE_DIAMOND_BLOCK= new WhiteBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);

	//Ice
	public static final Block BLACK_ICE= new BlackBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block RED_ICE= new RedBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block GREEN_ICE= new GreenBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block BROWN_ICE= new BrownBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block BLUE_ICE= new BlueBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block PURPLE_ICE= new PurpleBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block CYAN_ICE= new CyanBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIGHT_GRAY_ICE= new LightGrayBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block GRAY_ICE= new GrayBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block PINK_ICE= new PinkBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIME_ICE= new LimeBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block YELLOW_ICE= new YellowBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIGHT_BLUE_ICE= new LightBlueBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block MAGENTA_ICE= new MagentaBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block ORANGE_ICE= new OrangeBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block WHITE_ICE= new WhiteBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);

	//Clay Block
	public static final Block BLACK_CLAY_BLOCK= new BlackBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block RED_CLAY_BLOCK= new RedBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block GREEN_CLAY_BLOCK= new GreenBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block BROWN_CLAY_BLOCK= new BrownBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block BLUE_CLAY_BLOCK= new BlueBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block PURPLE_CLAY_BLOCK= new PurpleBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block CYAN_CLAY_BLOCK= new CyanBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIGHT_GRAY_CLAY_BLOCK= new LightGrayBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block GRAY_CLAY_BLOCK= new GrayBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block PINK_CLAY_BLOCK= new PinkBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIME_CLAY_BLOCK= new LimeBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block YELLOW_CLAY_BLOCK= new YellowBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIGHT_BLUE_CLAY_BLOCK= new LightBlueBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block MAGENTA_CLAY_BLOCK= new MagentaBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block ORANGE_CLAY_BLOCK= new OrangeBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block WHITE_CLAY_BLOCK= new WhiteBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);

}
