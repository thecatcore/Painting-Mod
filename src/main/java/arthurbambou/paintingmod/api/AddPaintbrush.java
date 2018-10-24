package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class AddPaintbrush {
	private static final List<ColoredBlock> COLOREDBLOCKS = new ArrayList<ColoredBlock>();
	
	public void register(ColoredBlock coloredblock) {
		
	     COLOREDBLOCKS.push(coloredblock);
	}
}
