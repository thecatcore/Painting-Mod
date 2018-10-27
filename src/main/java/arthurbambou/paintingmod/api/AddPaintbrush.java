package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;

public class AddPaintbrush {
	// Like the Stone, the Sandstone and the Crafting Table
	private static final List<ColoredBlock> SIMPLECOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	// Like the Oak Log, the Furnace and the Dispenser
	private static final List<ColoredBlock> COMPLEXCOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	
	public static void registerSimpleBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable simple block : " + coloredblock.name);
		SIMPLECOLOREDBLOCKS.add(coloredblock);
	}

	public static void registerComplexBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable complex block : " + coloredblock.name);
		COMPLEXCOLOREDBLOCKS.add(coloredblock);
	}

	public static List<ColoredBlock> getSIMPLECOLOREDBLOCKS() {
		return SIMPLECOLOREDBLOCKS;
	}

	public static List<ColoredBlock> getCOMPLEXCOLOREDBLOCKS() {
		return COMPLEXCOLOREDBLOCKS;
	}
}
