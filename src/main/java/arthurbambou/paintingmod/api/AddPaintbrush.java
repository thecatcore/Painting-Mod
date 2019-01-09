package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

import arthurbambou.paintingmod.PTMMain;
import arthurbambou.paintingmod.blocks.ColoredBlockMetaSlime;

public class AddPaintbrush {
	// Like the Stone, the Sandstone and the Crafting Table
	private static final List<ColoredBlock> SIMPLECOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	private static final List<ColoredBlockMeta> SIMPLECOLOREDBLOCKMETA = new ArrayList<ColoredBlockMeta>();
	// Like the Oak Log, the Furnace and the Dispenser
	private static final List<ColoredBlock> COMPLEXCOLOREDBLOCKS = new ArrayList<ColoredBlock>();
	private static final List<ColoredBlockMeta> COMPLEXCOLOREDBLOCKMETA = new ArrayList<ColoredBlockMeta>();
	private static final List<ColoredFallingBlockMeta> SIMPLECOLOREDFALLINGBLOCKMETA = new ArrayList<ColoredFallingBlockMeta>();
	private static final List<ColoredBlockMetaSlime> COLORED_BLOCK_META_SLIMES = new ArrayList<ColoredBlockMetaSlime>();
	private static final List<ColoredStairs> COLORED_STAIRS_META_LIST = new ArrayList<ColoredStairs>();
	private static final List<ColoredFence> COLORED_FENCE_LIST = new ArrayList<ColoredFence>();
	private static final List<ColoredWall> COLORED_WALL_LIST = new ArrayList<ColoredWall>();
	private static final List<ColoredFenceGate> COLORED_FENCE_GATE_LIST = new ArrayList<ColoredFenceGate>();

	public static void registerSimpleBlock(ColoredBlock coloredblock) {
		String modID = coloredblock.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable simple block => " + modID + ":" + coloredblock.name);
		SIMPLECOLOREDBLOCKS.add(coloredblock);
	}

	public static void registerComplexBlock(ColoredBlock coloredblock) {
		String modID = coloredblock.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable complex block => " + modID + ":" + coloredblock.name);
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

    public static void registerSimpleBlockwithMeta(ColoredFallingBlockMeta coloredFallingBlockMeta) {
		PTMMain.logger.info("[API]: Add paintable simple block => " + coloredFallingBlockMeta.getRegistryName());
		SIMPLECOLOREDFALLINGBLOCKMETA.add(coloredFallingBlockMeta);
    }

	public static List<ColoredFallingBlockMeta> getSIMPLECOLOREDFALLINGBLOCKMETA() {
		return SIMPLECOLOREDFALLINGBLOCKMETA;
	}

    public static List<ColoredBlockMetaSlime> getColoredBlockMetaSlimes() {
        return COLORED_BLOCK_META_SLIMES;
    }

    public static void registerSimpleBlockwithMeta(ColoredBlockMetaSlime coloredFallingBlockMeta) {
        PTMMain.logger.info("[API]: Add paintable simple block => " + coloredFallingBlockMeta.getRegistryName());
        COLORED_BLOCK_META_SLIMES.add(coloredFallingBlockMeta);
    }

	public static List<ColoredStairs> getColoredStairsMetaList() {
		return COLORED_STAIRS_META_LIST;
	}

	public static void registerColoredStairsMeta(ColoredStairs coloredStairsMeta) {
		String modID = coloredStairsMeta.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable stairs => " + modID + ":" + coloredStairsMeta.name);
		COLORED_STAIRS_META_LIST.add(coloredStairsMeta);
	}

	public static List<ColoredFence> getColoredFenceList() {
		return COLORED_FENCE_LIST;
	}

	public static void registerColoredFence(ColoredFence coloredFence) {
		String modID = coloredFence.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable fence => " + modID + ":" + coloredFence.name);
		COLORED_FENCE_LIST.add(coloredFence);
	}

	public static List<ColoredWall> getColoredWallList() {
		return COLORED_WALL_LIST;
	}

	public static void registerColoredWall(ColoredWall coloredWall) {
		String modID = coloredWall.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable wall => " + modID + ":" + coloredWall.name);
		COLORED_WALL_LIST.add(coloredWall);
	}

	public static List<ColoredFenceGate> getColoredFenceGateList() {
		return COLORED_FENCE_GATE_LIST;
	}

	public static void registerColoredFenceGate(ColoredFenceGate coloredFenceGate) {
		String modID = coloredFenceGate.black.getRegistryName().getNamespace();
		PTMMain.logger.info("[API]: Add paintable fence gate => " + modID + ":" + coloredFenceGate.name);
		COLORED_FENCE_GATE_LIST.add(coloredFenceGate);
	}
}
