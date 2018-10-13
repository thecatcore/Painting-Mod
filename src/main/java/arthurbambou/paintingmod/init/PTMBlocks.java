package arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.blocks.PTMSoggyClay;
import arthurbambou.paintingmod.blocks.colored.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PTMBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOGGY_CLAY = new PTMSoggyClay("soggy_clay", Material.IRON, PTMMain.PAINTING_MOD);
	
	
	//Stone Blocks
	public static final Block BLACK_STONE = new PTMBlackBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_STONE = new PTMRedBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_STONE = new PTMGreenBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_STONE = new PTMBrownBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_STONE = new PTMBlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_STONE = new PTMPurpleBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_STONE = new PTMCyanBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_STONE = new PTMLightGrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_STONE = new PTMGrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_STONE = new PTMPinkBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_STONE = new PTMLimeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_STONE = new PTMYellowBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_STONE = new PTMLightBlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_STONE = new PTMMagentaBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_STONE = new PTMOrangeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_STONE = new PTMWhiteBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Granite Blocks
	public static final Block BLACK_GRANITE = new PTMBlackBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_GRANITE = new PTMRedBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_GRANITE = new PTMGreenBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_GRANITE = new PTMBrownBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_GRANITE = new PTMBlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_GRANITE = new PTMPurpleBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_GRANITE = new PTMCyanBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_GRANITE = new PTMLightGrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_GRANITE = new PTMGrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_GRANITE = new PTMPinkBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_GRANITE = new PTMLimeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_GRANITE = new PTMYellowBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_GRANITE = new PTMLightBlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_GRANITE = new PTMMagentaBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_GRANITE = new PTMOrangeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_GRANITE = new PTMWhiteBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Granite Blocks
	public static final Block BLACK_POLISHED_GRANITE = new PTMBlackBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_GRANITE = new PTMRedBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_GRANITE = new PTMGreenBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_GRANITE = new PTMBrownBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_GRANITE = new PTMBlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_GRANITE = new PTMPurpleBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_GRANITE = new PTMCyanBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_GRANITE = new PTMLightGrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_GRANITE = new PTMGrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_GRANITE = new PTMPinkBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_GRANITE = new PTMLimeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_GRANITE = new PTMYellowBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_GRANITE = new PTMLightBlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_GRANITE = new PTMMagentaBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_GRANITE = new PTMOrangeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_GRANITE = new PTMWhiteBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Diorite
	public static final Block BLACK_DIORITE= new PTMBlackBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_DIORITE= new PTMRedBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_DIORITE= new PTMGreenBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_DIORITE= new PTMBrownBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_DIORITE= new PTMBlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_DIORITE= new PTMPurpleBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_DIORITE= new PTMCyanBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_DIORITE= new PTMLightGrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_DIORITE= new PTMGrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_DIORITE= new PTMPinkBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_DIORITE= new PTMLimeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_DIORITE= new PTMYellowBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_DIORITE= new PTMLightBlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_DIORITE= new PTMMagentaBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_DIORITE= new PTMOrangeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_DIORITE= new PTMWhiteBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Diorite
	public static final Block BLACK_POLISHED_DIORITE= new PTMBlackBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_DIORITE= new PTMRedBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_DIORITE= new PTMGreenBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_DIORITE= new PTMBrownBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_DIORITE= new PTMBlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_DIORITE= new PTMPurpleBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_DIORITE= new PTMCyanBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_DIORITE= new PTMLightGrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_DIORITE= new PTMGrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_DIORITE= new PTMPinkBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_DIORITE= new PTMLimeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_DIORITE= new PTMYellowBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_DIORITE= new PTMLightBlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_DIORITE= new PTMMagentaBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_DIORITE= new PTMOrangeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_DIORITE= new PTMWhiteBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Andesite
	public static final Block BLACK_ANDESITE= new PTMBlackBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_ANDESITE= new PTMRedBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_ANDESITE= new PTMGreenBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_ANDESITE= new PTMBrownBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_ANDESITE= new PTMBlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_ANDESITE= new PTMPurpleBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_ANDESITE= new PTMCyanBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_ANDESITE= new PTMLightGrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_ANDESITE= new PTMGrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_ANDESITE= new PTMPinkBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_ANDESITE= new PTMLimeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_ANDESITE= new PTMYellowBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_ANDESITE= new PTMLightBlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_ANDESITE= new PTMMagentaBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_ANDESITE= new PTMOrangeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_ANDESITE= new PTMWhiteBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Andesite
	public static final Block BLACK_POLISHED_ANDESITE= new PTMBlackBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_ANDESITE= new PTMRedBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_ANDESITE= new PTMGreenBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_ANDESITE= new PTMBrownBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_ANDESITE= new PTMBlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_ANDESITE= new PTMPurpleBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_ANDESITE= new PTMCyanBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_ANDESITE= new PTMLightGrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_ANDESITE= new PTMGrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_ANDESITE= new PTMPinkBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_ANDESITE= new PTMLimeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_ANDESITE= new PTMYellowBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_ANDESITE= new PTMLightBlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_ANDESITE= new PTMMagentaBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_ANDESITE= new PTMOrangeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_ANDESITE= new PTMWhiteBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	
	//Dirt
	public static final Block BLACK_DIRT= new PTMBlackBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_DIRT= new PTMRedBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_DIRT= new PTMGreenBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_DIRT= new PTMBrownBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_DIRT= new PTMBlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_DIRT= new PTMPurpleBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_DIRT= new PTMCyanBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_DIRT= new PTMLightGrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_DIRT= new PTMGrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_DIRT= new PTMPinkBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_DIRT= new PTMLimeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_DIRT= new PTMYellowBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_DIRT= new PTMLightBlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_DIRT= new PTMMagentaBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_DIRT= new PTMOrangeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_DIRT= new PTMWhiteBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Coarse Dirt
	public static final Block BLACK_COARSE_DIRT= new PTMBlackBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_COARSE_DIRT= new PTMRedBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_COARSE_DIRT= new PTMGreenBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_COARSE_DIRT= new PTMBrownBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_COARSE_DIRT= new PTMBlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_COARSE_DIRT= new PTMPurpleBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_COARSE_DIRT= new PTMCyanBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_COARSE_DIRT= new PTMLightGrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_COARSE_DIRT= new PTMGrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_COARSE_DIRT= new PTMPinkBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_COARSE_DIRT= new PTMLimeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_COARSE_DIRT= new PTMYellowBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_COARSE_DIRT= new PTMLightBlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_COARSE_DIRT= new PTMMagentaBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_COARSE_DIRT= new PTMOrangeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_COARSE_DIRT= new PTMWhiteBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Cobblestone
	public static final Block BLACK_COBBLESTONE= new PTMBlackBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_COBBLESTONE= new PTMRedBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_COBBLESTONE= new PTMGreenBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_COBBLESTONE= new PTMBrownBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_COBBLESTONE= new PTMBlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_COBBLESTONE= new PTMPurpleBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_COBBLESTONE= new PTMCyanBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_COBBLESTONE= new PTMLightGrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_COBBLESTONE= new PTMGrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_COBBLESTONE= new PTMPinkBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_COBBLESTONE= new PTMLimeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_COBBLESTONE= new PTMYellowBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_COBBLESTONE= new PTMLightBlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_COBBLESTONE= new PTMMagentaBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_COBBLESTONE= new PTMOrangeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_COBBLESTONE= new PTMWhiteBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);

	//Planks Blocks
	public static final Block BLACK_PLANK = new PTMBlackBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block RED_PLANK = new PTMRedBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GREEN_PLANK = new PTMGreenBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BROWN_PLANK = new PTMBrownBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BLUE_PLANK = new PTMBlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PURPLE_PLANK = new PTMPurpleBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block CYAN_PLANK = new PTMCyanBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_GRAY_PLANK = new PTMLightGrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GRAY_PLANK = new PTMGrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PINK_PLANK = new PTMPinkBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIME_PLANK = new PTMLimeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block YELLOW_PLANK = new PTMYellowBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_BLUE_PLANK = new PTMLightBlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block MAGENTA_PLANK = new PTMMagentaBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block ORANGE_PLANK = new PTMOrangeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block WHITE_PLANK = new PTMWhiteBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	
	//Sand
	public static final Block BLACK_SAND= new PTMBlackBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_SAND= new PTMRedBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_SAND= new PTMGreenBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_SAND= new PTMBrownBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_SAND= new PTMBlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_SAND= new PTMPurpleBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_SAND= new PTMCyanBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_SAND= new PTMLightGrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_SAND= new PTMGrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_SAND= new PTMPinkBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_SAND= new PTMLimeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_SAND= new PTMYellowBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_SAND= new PTMLightBlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_SAND= new PTMMagentaBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_SAND= new PTMOrangeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_SAND= new PTMWhiteBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);

	//Gravel
	public static final Block BLACK_GRAVEL= new PTMBlackBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block RED_GRAVEL= new PTMRedBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GREEN_GRAVEL= new PTMGreenBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BROWN_GRAVEL= new PTMBrownBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BLUE_GRAVEL= new PTMBlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PURPLE_GRAVEL= new PTMPurpleBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block CYAN_GRAVEL= new PTMCyanBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_GRAY_GRAVEL= new PTMLightGrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GRAY_GRAVEL= new PTMGrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PINK_GRAVEL= new PTMPinkBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIME_GRAVEL= new PTMLimeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block YELLOW_GRAVEL= new PTMYellowBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_BLUE_GRAVEL= new PTMLightBlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block MAGENTA_GRAVEL= new PTMMagentaBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block ORANGE_GRAVEL= new PTMOrangeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block WHITE_GRAVEL= new PTMWhiteBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);

	//Sponge
	public static final Block BLACK_SPONGE= new PTMBlackBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_SPONGE= new PTMRedBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_SPONGE= new PTMGreenBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_SPONGE= new PTMBrownBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_SPONGE= new PTMBlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_SPONGE= new PTMPurpleBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_SPONGE= new PTMCyanBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_SPONGE= new PTMLightGrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_SPONGE= new PTMGrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_SPONGE= new PTMPinkBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_SPONGE= new PTMLimeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_SPONGE= new PTMYellowBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_SPONGE= new PTMLightBlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_SPONGE= new PTMMagentaBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_SPONGE= new PTMOrangeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_SPONGE= new PTMWhiteBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);

	//Wet Sponge
	public static final Block BLACK_WET_SPONGE= new PTMBlackBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_WET_SPONGE= new PTMRedBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_WET_SPONGE= new PTMGreenBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_WET_SPONGE= new PTMBrownBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_WET_SPONGE= new PTMBlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_WET_SPONGE= new PTMPurpleBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_WET_SPONGE= new PTMCyanBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_WET_SPONGE= new PTMLightGrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_WET_SPONGE= new PTMGrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_WET_SPONGE= new PTMPinkBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_WET_SPONGE= new PTMLimeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_WET_SPONGE= new PTMYellowBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_WET_SPONGE= new PTMLightBlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_WET_SPONGE= new PTMMagentaBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_WET_SPONGE= new PTMOrangeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_WET_SPONGE= new PTMWhiteBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);

	//Lapis Lazuli Block
	public static final Block BLACK_LAPIS_LAZULI_BLOCK= new PTMBlackBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block RED_LAPIS_LAZULI_BLOCK= new PTMRedBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block GREEN_LAPIS_LAZULI_BLOCK= new PTMGreenBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block BROWN_LAPIS_LAZULI_BLOCK= new PTMBrownBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block BLUE_LAPIS_LAZULI_BLOCK= new PTMBlueBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block PURPLE_LAPIS_LAZULI_BLOCK= new PTMPurpleBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block CYAN_LAPIS_LAZULI_BLOCK= new PTMCyanBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIGHT_GRAY_LAPIS_LAZULI_BLOCK= new PTMLightGrayBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block GRAY_LAPIS_LAZULI_BLOCK= new PTMGrayBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block PINK_LAPIS_LAZULI_BLOCK= new PTMPinkBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIME_LAPIS_LAZULI_BLOCK= new PTMLimeBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block YELLOW_LAPIS_LAZULI_BLOCK= new PTMYellowBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block LIGHT_BLUE_LAPIS_LAZULI_BLOCK= new PTMLightBlueBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block MAGENTA_LAPIS_LAZULI_BLOCK= new PTMMagentaBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block ORANGE_LAPIS_LAZULI_BLOCK= new PTMOrangeBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);
	public static final Block WHITE_LAPIS_LAZULI_BLOCK= new PTMWhiteBlock("lapis_lazuli_block", Material.IRON, SoundType.METAL, 3.0F, 15.0F, "pickaxe", 2);

	//Sandstone
	public static final Block BLACK_SANDSTONE= new PTMBlackBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block RED_SANDSTONE= new PTMRedBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GREEN_SANDSTONE= new PTMGreenBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BROWN_SANDSTONE= new PTMBrownBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block BLUE_SANDSTONE= new PTMBlueBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PURPLE_SANDSTONE= new PTMPurpleBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block CYAN_SANDSTONE= new PTMCyanBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_SANDSTONE= new PTMLightGrayBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block GRAY_SANDSTONE= new PTMGrayBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block PINK_SANDSTONE= new PTMPinkBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIME_SANDSTONE= new PTMLimeBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block YELLOW_SANDSTONE= new PTMYellowBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_SANDSTONE= new PTMLightBlueBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block MAGENTA_SANDSTONE= new PTMMagentaBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block ORANGE_SANDSTONE= new PTMOrangeBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
	public static final Block WHITE_SANDSTONE= new PTMWhiteBlock("sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);

//	//Chiseled Sandstone
//	public static final Block BLACK_CHISELED_SANDSTONE= new PTMBlackBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_CHISELED_SANDSTONE= new PTMRedBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_CHISELED_SANDSTONE= new PTMGreenBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_CHISELED_SANDSTONE= new PTMBrownBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_CHISELED_SANDSTONE= new PTMBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_CHISELED_SANDSTONE= new PTMPurpleBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_CHISELED_SANDSTONE= new PTMCyanBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_CHISELED_SANDSTONE= new PTMLightGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_CHISELED_SANDSTONE= new PTMGrayBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_CHISELED_SANDSTONE= new PTMPinkBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_CHISELED_SANDSTONE= new PTMLimeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_CHISELED_SANDSTONE= new PTMYellowBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_CHISELED_SANDSTONE= new PTMLightBlueBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_CHISELED_SANDSTONE= new PTMMagentaBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_CHISELED_SANDSTONE= new PTMOrangeBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_CHISELED_SANDSTONE= new PTMWhiteBlock("chiseled_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//
//	//Smooth Sandstone
//	public static final Block BLACK_SMOOTH_SANDSTONE= new PTMBlackBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block RED_SMOOTH_SANDSTONE= new PTMRedBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GREEN_SMOOTH_SANDSTONE= new PTMGreenBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BROWN_SMOOTH_SANDSTONE= new PTMBrownBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block BLUE_SMOOTH_SANDSTONE= new PTMBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PURPLE_SMOOTH_SANDSTONE= new PTMPurpleBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block CYAN_SMOOTH_SANDSTONE= new PTMCyanBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE= new PTMLightGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block GRAY_SMOOTH_SANDSTONE= new PTMGrayBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block PINK_SMOOTH_SANDSTONE= new PTMPinkBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIME_SMOOTH_SANDSTONE= new PTMLimeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block YELLOW_SMOOTH_SANDSTONE= new PTMYellowBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE= new PTMLightBlueBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block MAGENTA_SMOOTH_SANDSTONE= new PTMMagentaBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block ORANGE_SMOOTH_SANDSTONE= new PTMOrangeBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	public static final Block WHITE_SMOOTH_SANDSTONE= new PTMWhiteBlock("smooth_sandstone", Material.GROUND, SoundType.STONE, 0.8F, 4.0F, "pickaxe", 1);
//	
	//Gold Block
	public static final Block BLACK_GOLD_BLOCK= new PTMBlackBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block RED_GOLD_BLOCK= new PTMRedBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block GREEN_GOLD_BLOCK= new PTMGreenBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block BROWN_GOLD_BLOCK= new PTMBrownBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block BLUE_GOLD_BLOCK= new PTMBlueBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block PURPLE_GOLD_BLOCK= new PTMPurpleBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block CYAN_GOLD_BLOCK= new PTMCyanBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_GRAY_GOLD_BLOCK= new PTMLightGrayBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block GRAY_GOLD_BLOCK= new PTMGrayBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block PINK_GOLD_BLOCK= new PTMPinkBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIME_GOLD_BLOCK= new PTMLimeBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block YELLOW_GOLD_BLOCK= new PTMYellowBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_BLUE_GOLD_BLOCK= new PTMLightBlueBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block MAGENTA_GOLD_BLOCK= new PTMMagentaBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block ORANGE_GOLD_BLOCK= new PTMOrangeBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);
	public static final Block WHITE_GOLD_BLOCK= new PTMWhiteBlock("gold_block", Material.IRON, SoundType.METAL, 3.0F, 30.0F, "pickaxe", 3);

	//Iron Block
	public static final Block BLACK_IRON_BLOCK= new PTMBlackBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block RED_IRON_BLOCK= new PTMRedBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block GREEN_IRON_BLOCK= new PTMGreenBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block BROWN_IRON_BLOCK= new PTMBrownBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block BLUE_IRON_BLOCK= new PTMBlueBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block PURPLE_IRON_BLOCK= new PTMPurpleBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block CYAN_IRON_BLOCK= new PTMCyanBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIGHT_GRAY_IRON_BLOCK= new PTMLightGrayBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block GRAY_IRON_BLOCK= new PTMGrayBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block PINK_IRON_BLOCK= new PTMPinkBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIME_IRON_BLOCK= new PTMLimeBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block YELLOW_IRON_BLOCK= new PTMYellowBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block LIGHT_BLUE_IRON_BLOCK= new PTMLightBlueBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block MAGENTA_IRON_BLOCK= new PTMMagentaBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block ORANGE_IRON_BLOCK= new PTMOrangeBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);
	public static final Block WHITE_IRON_BLOCK= new PTMWhiteBlock("iron_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 2);

	//Brick
	public static final Block BLACK_BRICK= new PTMBlackBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_BRICK= new PTMRedBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_BRICK= new PTMGreenBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_BRICK= new PTMBrownBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_BRICK= new PTMBlueBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_BRICK= new PTMPurpleBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_BRICK= new PTMCyanBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_BRICK= new PTMLightGrayBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_BRICK= new PTMGrayBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_BRICK= new PTMPinkBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_BRICK= new PTMLimeBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_BRICK= new PTMYellowBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_BRICK= new PTMLightBlueBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_BRICK= new PTMMagentaBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_BRICK= new PTMOrangeBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_BRICK= new PTMWhiteBlock("brick", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);

	//Moss Stone
	public static final Block BLACK_MOSS_STONE= new PTMBlackBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_MOSS_STONE= new PTMRedBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_MOSS_STONE= new PTMGreenBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_MOSS_STONE= new PTMBrownBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_MOSS_STONE= new PTMBlueBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_MOSS_STONE= new PTMPurpleBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_MOSS_STONE= new PTMCyanBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_MOSS_STONE= new PTMLightGrayBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_MOSS_STONE= new PTMGrayBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_MOSS_STONE= new PTMPinkBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_MOSS_STONE= new PTMLimeBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_MOSS_STONE= new PTMYellowBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_MOSS_STONE= new PTMLightBlueBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_MOSS_STONE= new PTMMagentaBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_MOSS_STONE= new PTMOrangeBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_MOSS_STONE= new PTMWhiteBlock("moss_stone", Material.ROCK, SoundType.GROUND, 2.0F, 30.0F, "pickaxe", 1);

	//Obsidian
	public static final Block BLACK_OBSIDIAN= new PTMBlackBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block RED_OBSIDIAN= new PTMRedBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block GREEN_OBSIDIAN= new PTMGreenBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block BROWN_OBSIDIAN= new PTMBrownBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block BLUE_OBSIDIAN= new PTMBlueBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block PURPLE_OBSIDIAN= new PTMPurpleBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block CYAN_OBSIDIAN= new PTMCyanBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIGHT_GRAY_OBSIDIAN= new PTMLightGrayBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block GRAY_OBSIDIAN= new PTMGrayBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block PINK_OBSIDIAN= new PTMPinkBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIME_OBSIDIAN= new PTMLimeBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block YELLOW_OBSIDIAN= new PTMYellowBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block LIGHT_BLUE_OBSIDIAN= new PTMLightBlueBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block MAGENTA_OBSIDIAN= new PTMMagentaBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block ORANGE_OBSIDIAN= new PTMOrangeBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);
	public static final Block WHITE_OBSIDIAN= new PTMWhiteBlock("obsidian", Material.ROCK, SoundType.STONE, 50.0F, 6000.0F, "pickaxe", 4);

	//Diamond Block
	public static final Block BLACK_DIAMOND_BLOCK= new PTMBlackBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block RED_DIAMOND_BLOCK= new PTMRedBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GREEN_DIAMOND_BLOCK= new PTMGreenBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BROWN_DIAMOND_BLOCK= new PTMBrownBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BLUE_DIAMOND_BLOCK= new PTMBlueBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PURPLE_DIAMOND_BLOCK= new PTMPurpleBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block CYAN_DIAMOND_BLOCK= new PTMCyanBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_GRAY_DIAMOND_BLOCK= new PTMLightGrayBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GRAY_DIAMOND_BLOCK= new PTMGrayBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PINK_DIAMOND_BLOCK= new PTMPinkBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIME_DIAMOND_BLOCK= new PTMLimeBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block YELLOW_DIAMOND_BLOCK= new PTMYellowBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_BLUE_DIAMOND_BLOCK= new PTMLightBlueBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block MAGENTA_DIAMOND_BLOCK= new PTMMagentaBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block ORANGE_DIAMOND_BLOCK= new PTMOrangeBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block WHITE_DIAMOND_BLOCK= new PTMWhiteBlock("diamond_block", Material.IRON, SoundType.METAL, 5.0F, 30.0F, "pickaxe", 3);

	//Ice
	public static final Block BLACK_ICE= new PTMBlackBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block RED_ICE= new PTMRedBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block GREEN_ICE= new PTMGreenBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block BROWN_ICE= new PTMBrownBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block BLUE_ICE= new PTMBlueBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block PURPLE_ICE= new PTMPurpleBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block CYAN_ICE= new PTMCyanBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIGHT_GRAY_ICE= new PTMLightGrayBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block GRAY_ICE= new PTMGrayBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block PINK_ICE= new PTMPinkBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIME_ICE= new PTMLimeBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block YELLOW_ICE= new PTMYellowBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block LIGHT_BLUE_ICE= new PTMLightBlueBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block MAGENTA_ICE= new PTMMagentaBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block ORANGE_ICE= new PTMOrangeBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	public static final Block WHITE_ICE= new PTMWhiteBlock("ice", Material.GLASS, SoundType.GROUND, 0.5F, 2.5F, "null", 0);
	
	//Snow Block
	public static final Block BLACK_SNOW_BLOCK= new PTMBlackBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block RED_SNOW_BLOCK= new PTMRedBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block GREEN_SNOW_BLOCK= new PTMGreenBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block BROWN_SNOW_BLOCK= new PTMBrownBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block BLUE_SNOW_BLOCK= new PTMBlueBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block PURPLE_SNOW_BLOCK= new PTMPurpleBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block CYAN_SNOW_BLOCK= new PTMCyanBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block LIGHT_GRAY_SNOW_BLOCK= new PTMLightGrayBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block GRAY_SNOW_BLOCK= new PTMGrayBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block PINK_SNOW_BLOCK= new PTMPinkBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block LIME_SNOW_BLOCK= new PTMLimeBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block YELLOW_SNOW_BLOCK= new PTMYellowBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block LIGHT_BLUE_SNOW_BLOCK= new PTMLightBlueBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block MAGENTA_SNOW_BLOCK= new PTMMagentaBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block ORANGE_SNOW_BLOCK= new PTMOrangeBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);
	public static final Block WHITE_SNOW_BLOCK= new PTMWhiteBlock("snow_block", Material.SNOW, SoundType.SNOW, 0.2F, 1.0F, "shovel", 1);

	//Clay Block
	public static final Block BLACK_CLAY_BLOCK= new PTMBlackBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block RED_CLAY_BLOCK= new PTMRedBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block GREEN_CLAY_BLOCK= new PTMGreenBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block BROWN_CLAY_BLOCK= new PTMBrownBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block BLUE_CLAY_BLOCK= new PTMBlueBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block PURPLE_CLAY_BLOCK= new PTMPurpleBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block CYAN_CLAY_BLOCK= new PTMCyanBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIGHT_GRAY_CLAY_BLOCK= new PTMLightGrayBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block GRAY_CLAY_BLOCK= new PTMGrayBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block PINK_CLAY_BLOCK= new PTMPinkBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIME_CLAY_BLOCK= new PTMLimeBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block YELLOW_CLAY_BLOCK= new PTMYellowBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block LIGHT_BLUE_CLAY_BLOCK= new PTMLightBlueBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block MAGENTA_CLAY_BLOCK= new PTMMagentaBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block ORANGE_CLAY_BLOCK= new PTMOrangeBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);
	public static final Block WHITE_CLAY_BLOCK= new PTMWhiteBlock("clay_block", Material.CLAY, SoundType.GROUND, 2.0F, 30.0F, "shovel", 0);

	//Netherrack
	public static final Block BLACK_NETHERRACK= new PTMBlackBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block RED_NETHERRACK= new PTMRedBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block GREEN_NETHERRACK= new PTMGreenBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block BROWN_NETHERRACK= new PTMBrownBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block BLUE_NETHERRACK= new PTMBlueBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block PURPLE_NETHERRACK= new PTMPurpleBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block CYAN_NETHERRACK= new PTMCyanBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_NETHERRACK= new PTMLightGrayBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block GRAY_NETHERRACK= new PTMGrayBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block PINK_NETHERRACK= new PTMPinkBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block LIME_NETHERRACK= new PTMLimeBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block YELLOW_NETHERRACK= new PTMYellowBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_NETHERRACK= new PTMLightBlueBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block MAGENTA_NETHERRACK= new PTMMagentaBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block ORANGE_NETHERRACK= new PTMOrangeBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);
	public static final Block WHITE_NETHERRACK= new PTMWhiteBlock("netherrack", Material.ROCK, SoundType.STONE, 0.4F, 2.0F, "pickaxe", 1);

	//Soul Sand
	public static final Block BLACK_SOUL_SAND= new PTMBlackBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_SOUL_SAND= new PTMRedBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_SOUL_SAND= new PTMGreenBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_SOUL_SAND= new PTMBrownBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_SOUL_SAND= new PTMBlueBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_SOUL_SAND= new PTMPurpleBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_SOUL_SAND= new PTMCyanBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_SOUL_SAND= new PTMLightGrayBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_SOUL_SAND= new PTMGrayBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_SOUL_SAND= new PTMPinkBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_SOUL_SAND= new PTMLimeBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_SOUL_SAND= new PTMYellowBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_SOUL_SAND= new PTMLightBlueBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_SOUL_SAND= new PTMMagentaBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_SOUL_SAND= new PTMOrangeBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_SOUL_SAND= new PTMWhiteBlock("soul_sand", Material.ROCK, SoundType.STONE, 0.5F, 2.5F, "shovel", 0);

	//Glowstone
	public static final Block BLACK_GLOWSTONE= new PTMBlackBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block RED_GLOWSTONE= new PTMRedBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block GREEN_GLOWSTONE= new PTMGreenBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block BROWN_GLOWSTONE= new PTMBrownBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block BLUE_GLOWSTONE= new PTMBlueBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block PURPLE_GLOWSTONE= new PTMPurpleBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block CYAN_GLOWSTONE= new PTMCyanBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block LIGHT_GRAY_GLOWSTONE= new PTMLightGrayBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block GRAY_GLOWSTONE= new PTMGrayBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block PINK_GLOWSTONE= new PTMPinkBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block LIME_GLOWSTONE= new PTMLimeBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block YELLOW_GLOWSTONE= new PTMYellowBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block LIGHT_BLUE_GLOWSTONE= new PTMLightBlueBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block MAGENTA_GLOWSTONE= new PTMMagentaBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block ORANGE_GLOWSTONE= new PTMOrangeBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);
	public static final Block WHITE_GLOWSTONE= new PTMWhiteBlock("glowstone", Material.GLASS, SoundType.GLASS, 0.3F, 1.5F, "pickaxe", 0);

	//Stone Brick
	public static final Block BLACK_STONE_BRICK= new PTMBlackBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_STONE_BRICK= new PTMRedBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_STONE_BRICK= new PTMGreenBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_STONE_BRICK= new PTMBrownBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_STONE_BRICK= new PTMBlueBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_STONE_BRICK= new PTMPurpleBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_STONE_BRICK= new PTMCyanBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_STONE_BRICK= new PTMLightGrayBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_STONE_BRICK= new PTMGrayBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_STONE_BRICK= new PTMPinkBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_STONE_BRICK= new PTMLimeBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_STONE_BRICK= new PTMYellowBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_STONE_BRICK= new PTMLightBlueBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_STONE_BRICK= new PTMMagentaBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_STONE_BRICK= new PTMOrangeBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_STONE_BRICK= new PTMWhiteBlock("stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Cracked Stone Brick
	public static final Block BLACK_CRACKED_STONE_BRICK= new PTMBlackBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_CRACKED_STONE_BRICK= new PTMRedBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_CRACKED_STONE_BRICK= new PTMGreenBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_CRACKED_STONE_BRICK= new PTMBrownBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_CRACKED_STONE_BRICK= new PTMBlueBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_CRACKED_STONE_BRICK= new PTMPurpleBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_CRACKED_STONE_BRICK= new PTMCyanBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_CRACKED_STONE_BRICK= new PTMLightGrayBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_CRACKED_STONE_BRICK= new PTMGrayBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_CRACKED_STONE_BRICK= new PTMPinkBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_CRACKED_STONE_BRICK= new PTMLimeBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_CRACKED_STONE_BRICK= new PTMYellowBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_CRACKED_STONE_BRICK= new PTMLightBlueBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_CRACKED_STONE_BRICK= new PTMMagentaBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_CRACKED_STONE_BRICK= new PTMOrangeBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_CRACKED_STONE_BRICK= new PTMWhiteBlock("cracked_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Mossy Stone Brick
	public static final Block BLACK_MOSSY_STONE_BRICK= new PTMBlackBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_MOSSY_STONE_BRICK= new PTMRedBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_MOSSY_STONE_BRICK= new PTMGreenBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_MOSSY_STONE_BRICK= new PTMBrownBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_MOSSY_STONE_BRICK= new PTMBlueBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_MOSSY_STONE_BRICK= new PTMPurpleBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_MOSSY_STONE_BRICK= new PTMCyanBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_MOSSY_STONE_BRICK= new PTMLightGrayBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_MOSSY_STONE_BRICK= new PTMGrayBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_MOSSY_STONE_BRICK= new PTMPinkBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_MOSSY_STONE_BRICK= new PTMLimeBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_MOSSY_STONE_BRICK= new PTMYellowBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_MOSSY_STONE_BRICK= new PTMLightBlueBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_MOSSY_STONE_BRICK= new PTMMagentaBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_MOSSY_STONE_BRICK= new PTMOrangeBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_MOSSY_STONE_BRICK= new PTMWhiteBlock("mossy_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Chiseled Stone Brick
	public static final Block BLACK_CHISELED_STONE_BRICK= new PTMBlackBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_CHISELED_STONE_BRICK= new PTMRedBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_CHISELED_STONE_BRICK= new PTMGreenBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_CHISELED_STONE_BRICK= new PTMBrownBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_CHISELED_STONE_BRICK= new PTMBlueBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_CHISELED_STONE_BRICK= new PTMPurpleBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_CHISELED_STONE_BRICK= new PTMCyanBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_CHISELED_STONE_BRICK= new PTMLightGrayBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_CHISELED_STONE_BRICK= new PTMGrayBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_CHISELED_STONE_BRICK= new PTMPinkBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_CHISELED_STONE_BRICK= new PTMLimeBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_CHISELED_STONE_BRICK= new PTMYellowBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_CHISELED_STONE_BRICK= new PTMLightBlueBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_CHISELED_STONE_BRICK= new PTMMagentaBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_CHISELED_STONE_BRICK= new PTMOrangeBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_CHISELED_STONE_BRICK= new PTMWhiteBlock("chiseled_stone_brick", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Nether Brick
	public static final Block BLACK_NETHER_BRICK= new PTMBlackBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_NETHER_BRICK= new PTMRedBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_NETHER_BRICK= new PTMGreenBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_NETHER_BRICK= new PTMBrownBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_NETHER_BRICK= new PTMBlueBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_NETHER_BRICK= new PTMPurpleBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_NETHER_BRICK= new PTMCyanBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_NETHER_BRICK= new PTMLightGrayBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_NETHER_BRICK= new PTMGrayBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_NETHER_BRICK= new PTMPinkBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_NETHER_BRICK= new PTMLimeBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_NETHER_BRICK= new PTMYellowBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_NETHER_BRICK= new PTMLightBlueBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_NETHER_BRICK= new PTMMagentaBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_NETHER_BRICK= new PTMOrangeBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_NETHER_BRICK= new PTMWhiteBlock("nether_brick", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);

	//End Stone
	public static final Block BLACK_END_STONE= new PTMBlackBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block RED_END_STONE= new PTMRedBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block GREEN_END_STONE= new PTMGreenBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block BROWN_END_STONE= new PTMBrownBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block BLUE_END_STONE= new PTMBlueBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block PURPLE_END_STONE= new PTMPurpleBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block CYAN_END_STONE= new PTMCyanBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_END_STONE= new PTMLightGrayBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block GRAY_END_STONE= new PTMGrayBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block PINK_END_STONE= new PTMPinkBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block LIME_END_STONE= new PTMLimeBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block YELLOW_END_STONE= new PTMYellowBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_END_STONE= new PTMLightBlueBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block MAGENTA_END_STONE= new PTMMagentaBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block ORANGE_END_STONE= new PTMOrangeBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);
	public static final Block WHITE_END_STONE= new PTMWhiteBlock("end_stone", Material.ROCK, SoundType.STONE, 3.0F, 45.0F, "pickaxe", 1);

	//Block of Emerald
	public static final Block BLACK_EMERALD_BLOCK= new PTMBlackBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block RED_EMERALD_BLOCK= new PTMRedBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GREEN_EMERALD_BLOCK= new PTMGreenBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BROWN_EMERALD_BLOCK= new PTMBrownBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block BLUE_EMERALD_BLOCK= new PTMBlueBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PURPLE_EMERALD_BLOCK= new PTMPurpleBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block CYAN_EMERALD_BLOCK= new PTMCyanBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_GRAY_EMERALD_BLOCK= new PTMLightGrayBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block GRAY_EMERALD_BLOCK= new PTMGrayBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block PINK_EMERALD_BLOCK= new PTMPinkBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIME_EMERALD_BLOCK= new PTMLimeBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block YELLOW_EMERALD_BLOCK= new PTMYellowBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block LIGHT_BLUE_EMERALD_BLOCK= new PTMLightBlueBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block MAGENTA_EMERALD_BLOCK= new PTMMagentaBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block ORANGE_EMERALD_BLOCK= new PTMOrangeBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
	public static final Block WHITE_EMERALD_BLOCK= new PTMWhiteBlock("emerald_block", Material.ROCK, SoundType.STONE, 5.0F, 30.0F, "pickaxe", 3);
}
