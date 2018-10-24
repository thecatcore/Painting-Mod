package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;

public class AddPaintbrush {
	private static final List<ColoredBlock> COLOREDBLOCKS = new ArrayList<ColoredBlock>();
	
	public void register(ColoredBlock coloredblock) {
		PTMMain.logger.info("[API]: Add paintable block : " + coloredblock.name)
	        COLOREDBLOCKS.push(coloredblock);
	}
}
