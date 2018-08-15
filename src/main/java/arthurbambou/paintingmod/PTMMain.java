package arthurbambou.paintingmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import arthurbambou.paintingmod.init.PTMBlocks;
import arthurbambou.paintingmod.proxy.PTMCommonProxy;
import arthurbambou.paintingmod.tabs.PTMTab;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PTMReference.MOD_ID, name = PTMReference.NAME, version = PTMReference.VERSION, updateJSON = "https://gist.githubusercontent.com/arthurbambou/2c316e790e623363385bd26a59ab8847/raw/versions.json")
public class PTMMain {
	
	
	public static final CreativeTabs PAINTING_MOD = new PTMTab("paintingmod_tab");

	
	public static final Logger logger = LogManager.getLogger(PTMReference.MOD_ID);
	
	@Instance
	public static PTMMain instance;
	
	@SidedProxy(clientSide = PTMReference.CLIENT_PROXY_CLASS, serverSide = PTMReference.COMMON_PROXY_CLASS)
	public static PTMCommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		Blocks.FIRE.setFireInfo(PTMBlocks.BLACK_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.RED_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.GREEN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.BROWN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.BLUE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.PURPLE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.CYAN_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.LIGHT_GRAY_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.GRAY_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.PINK_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.LIME_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.YELLOW_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.LIGHT_BLUE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.MAGENTA_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.ORANGE_PLANK, 5, 20);
		Blocks.FIRE.setFireInfo(PTMBlocks.WHITE_PLANK, 5, 20);
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
