package arthurbambou.paintingmod.util;

public class PTMReference {
	public static final String MOD_ID = "paintingmod";
	public static final String NAME = "Painting Mod";
	public static final String VERSION = "dev";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	public static final String CLIENT_PROXY_CLASS = "arthurbambou.paintingmod.proxy.PTMClientProxy";
	public static final String COMMON_PROXY_CLASS = "arthurbambou.paintingmod.proxy.PTMCommonProxy";

	public static String getMinecraftVersion() {
		return ACCEPTED_VERSIONS;
	}
}
