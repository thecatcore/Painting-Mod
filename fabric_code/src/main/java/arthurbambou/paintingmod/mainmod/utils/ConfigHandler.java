package arthurbambou.paintingmod.mainmod.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.FabricLoader;

import java.io.*;

public class ConfigHandler {
    private static File CONFIG_PATH = FabricLoader.INSTANCE.getConfigDirectory();

    private static final Gson DEFAULT_GSON = new GsonBuilder().setPrettyPrinting().create();

    private static File configFile;
    private static String configFilename = "paintingmod";
    private static Gson gson = DEFAULT_GSON;
    private static Object DefaultConfig = new DefaultConfig();

    public static InstanceConfig init() {
        configFile = new File(CONFIG_PATH, configFilename + (configFilename.endsWith(".json") ? "" : ".json"));
        if (!configFile.exists()) {
            try (FileWriter fileWriter = new FileWriter(configFile)) {
                fileWriter.write(gson.toJson(DefaultConfig));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileReader fileReader = new FileReader(configFile)) {
            return gson.fromJson(fileReader, InstanceConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static class DefaultConfig extends InstanceConfig {

        public DefaultConfig() {
            this.fabriBlocksCompat = true;
        }
    }

    public static class InstanceConfig {
        public boolean fabriBlocksCompat;
    }
}
