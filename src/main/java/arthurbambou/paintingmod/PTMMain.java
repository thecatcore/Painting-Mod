package arthurbambou.paintingmod;

import arthurbambou.paintingmod.api.AddPaintbrush;
import arthurbambou.paintingmod.util.handlers.PTMRecipeHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import arthurbambou.paintingmod.api.ColoredBlock;
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
		ColoredBlock plank = PTMBlocks.PLANK;
		Blocks.FIRE.setFireInfo(plank.black, 5, 20);
		Blocks.FIRE.setFireInfo(plank.blue, 5, 20);
		Blocks.FIRE.setFireInfo(plank.brown, 5, 20);
		Blocks.FIRE.setFireInfo(plank.cyan, 5, 20);
		Blocks.FIRE.setFireInfo(plank.gray, 5, 20);
		Blocks.FIRE.setFireInfo(plank.green, 5, 20);
		Blocks.FIRE.setFireInfo(plank.lightblue, 5, 20);
		Blocks.FIRE.setFireInfo(plank.lightgray, 5, 20);
		Blocks.FIRE.setFireInfo(plank.lime, 5, 20);
		Blocks.FIRE.setFireInfo(plank.magenta, 5, 20);
		Blocks.FIRE.setFireInfo(plank.orange, 5, 20);
		Blocks.FIRE.setFireInfo(plank.pink, 5, 20);
		Blocks.FIRE.setFireInfo(plank.purple, 5, 20);
		Blocks.FIRE.setFireInfo(plank.red, 5, 20);
		Blocks.FIRE.setFireInfo(plank.white, 5, 20);
		Blocks.FIRE.setFireInfo(plank.yellow, 5, 20);
		PTMRecipeHandler.init();
		for (ColoredBlock cblocks : PTMBlocks.COLORED_BLOCKS) {
			AddPaintbrush.registerSimpleBlock(cblocks);
		}
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
}
