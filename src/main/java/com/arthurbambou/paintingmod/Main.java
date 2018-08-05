package com.arthurbambou.paintingmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.arthurbambou.paintingmod.init.ModBlocks;
import com.arthurbambou.paintingmod.proxy.CommonProxy;
import com.arthurbambou.paintingmod.tabs.PaintPotTab;
import com.arthurbambou.paintingmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs PAINTING_MOD = new PaintPotTab("paintingmod_tab");
	//public static final CreativeTabs PAINTBRUSH = new PaintPotTab("paintbrush_tab", ModItems.PAINTBRUSH);
	public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		Blocks.FIRE.setFireInfo(ModBlocks.BLACK_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.RED_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.GREEN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.BROWN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.BLUE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.PURPLE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.CYAN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.LIGHT_GRAY_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.GRAY_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.PINK_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.LIME_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.YELLOW_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.LIGHT_BLUE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.MAGENTA_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.ORANGE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(ModBlocks.WHITE_PLANK, 5, 20);
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
