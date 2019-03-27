package arthurbambou.paintingmod.mainmod.utils;

import arthurbambou.paintingmod.mainmod.PaintingMod;
import arthurbambou.paintingmod.mainmod.utils.config.Config;
import arthurbambou.paintingmod.mainmod.utils.config.DefaultConfig;
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
    private static Config DefaultConfig = new DefaultConfig();

    public static Config init() {
        configFile = new File(CONFIG_PATH, configFilename + (configFilename.endsWith(".json") ? "" : ".json"));
        if (!configFile.exists()) {
            saveConfig(DefaultConfig);
        }
        return loadConfig();
    }

    public static Config loadConfig() {
        try (FileReader fileReader = new FileReader(configFile)) {
            return gson.fromJson(fileReader, Config.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveConfig(Config instanceConfig) {
        try (FileWriter fileWriter = new FileWriter(configFile)) {
            fileWriter.write(gson.toJson(instanceConfig));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveConfig() {
        saveConfig(PaintingMod.config);
    }
}
