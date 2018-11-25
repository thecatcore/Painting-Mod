package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.block.Block;

public class AddPaintbrush {
	// Like the Stone, the Sandstone and the Crafting Table
	private static final List<ColoredBlock> SIMPLECOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	private static final List<ColoredBlockMeta> SIMPLECOLOREDBLOCKMETA = new ArrayList<ColoredBlockMeta>();
	// Like the Oak Log, the Furnace and the Dispenser
	private static final List<ColoredBlock> COMPLEXCOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	private static final List<ColoredBlockMeta> COMPLEXCOLOREDBLOCKMETA = new ArrayList<ColoredBlockMeta>();
	
	public static void registerSimpleBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable simple block => " + coloredblock.name);
		SIMPLECOLOREDBLOCKS.add(coloredblock);
	}

	public static void registerComplexBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable complex block => " + coloredblock.name);
		COMPLEXCOLOREDBLOCKS.add(coloredblock);
	}

	public static List<ColoredBlock> getSIMPLECOLOREDBLOCKS() {
		return SIMPLECOLOREDBLOCKS;
	}

	public static List<ColoredBlock> getCOMPLEXCOLOREDBLOCKS() {
		return COMPLEXCOLOREDBLOCKS;
	}

	public static void registerSimpleBlockwithMeta(ColoredBlockMeta block) {
        PTMMain.logger.info("[API]: Add paintable simple block => " + block.getRegistryName());
        SIMPLECOLOREDBLOCKMETA.add(block);
	}

	public static void registerComplexBlockwithMeta(ColoredBlockMeta block) {
        PTMMain.logger.info("[API]: Add paintable complex block => " + block.getRegistryName());
        COMPLEXCOLOREDBLOCKMETA.add(block);
    }

    public static List<ColoredBlockMeta> getSimplecoloredblockmeta() {
	    return SIMPLECOLOREDBLOCKMETA;
    }

    public static List<ColoredBlockMeta> getComplexcoloredblockmeta() {
	    return COMPLEXCOLOREDBLOCKMETA;
    }
}
