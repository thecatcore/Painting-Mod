package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;

public class AddPaintbrush {
	// Like the Stone
	private static final List<ColoredBlock> SIMPLECOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	// Like the Sandstone
	private static final List<ColoredBlock> MIXTECOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	// Like the Oak Log
	private static final List<ColoredBlock> COMPLEXCOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	
	public void registerSimpleBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable simple block : " + coloredblock.name)
	        SIMPLECOLOREDBLOCKS.push(coloredblock);
	}
	public void registerMixteBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable mixte block : " + coloredblock.name)
	        MIXTECOLOREDBLOCKS.push(coloredblock);
	}
	public void registerComplexBlock(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable complex block : " + coloredblock.name)
	        COMPLEXCOLOREDBLOCKS.push(coloredblock);
	}
}
