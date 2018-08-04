package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.blocks.SoggyClay;
import com.arthurbambou.paintingmod.blocks.colored.BlackBlock;
import com.arthurbambou.paintingmod.blocks.colored.BlueBlock;
import com.arthurbambou.paintingmod.blocks.colored.BrownBlock;
import com.arthurbambou.paintingmod.blocks.colored.CyanBlock;
import com.arthurbambou.paintingmod.blocks.colored.GrayBlock;
import com.arthurbambou.paintingmod.blocks.colored.GreenBlock;
import com.arthurbambou.paintingmod.blocks.colored.LightBlueBlock;
import com.arthurbambou.paintingmod.blocks.colored.LightGrayBlock;
import com.arthurbambou.paintingmod.blocks.colored.LimeBlock;
import com.arthurbambou.paintingmod.blocks.colored.MagentaBlock;
import com.arthurbambou.paintingmod.blocks.colored.OrangeBlock;
import com.arthurbambou.paintingmod.blocks.colored.PinkBlock;
import com.arthurbambou.paintingmod.blocks.colored.PurpleBlock;
import com.arthurbambou.paintingmod.blocks.colored.RedBlock;
import com.arthurbambou.paintingmod.blocks.colored.WhiteBlock;
import com.arthurbambou.paintingmod.blocks.colored.YellowBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOGGY_CLAY = new SoggyClay("soggy_clay", Material.IRON, Main.PAINTING_MOD);
	
	
	//Black Blocks
	public static final Block BLACK_PLANK = new BlackBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Red Blocks
	public static final Block RED_PLANK = new RedBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Green Blocks
	public static final Block GREEN_PLANK = new GreenBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Brown Blocks
	public static final Block BROWN_PLANK = new BrownBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Blue Blocks
	public static final Block BLUE_PLANK = new BlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Purple Blocks
	public static final Block PURPLE_PLANK = new PurpleBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Cyan Blocks
	public static final Block CYAN_PLANK = new CyanBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Light Gray Blocks
	public static final Block LIGHT_GRAY_PLANK = new LightGrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Gray Blocks
	public static final Block GRAY_PLANK = new GrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Pink Blocks
	public static final Block PINK_PLANK = new PinkBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Lime Blocks
	public static final Block LIME_PLANK = new LimeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Yellow Blocks
	public static final Block YELLOW_PLANK = new YellowBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Light Blue Blocks
	public static final Block LIGHT_BLUE_PLANK = new LightBlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Magenta Blocks
	public static final Block MAGENTA_PLANK = new MagentaBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//Orange Blocks
	public static final Block WHITE_PLANK = new WhiteBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, null, 0);
	//White Blocks
}
