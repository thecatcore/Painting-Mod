package fr.arthurbambou.paintingmod.mainmod.registery;

import blue.endless.jankson.Jankson;
import blue.endless.jankson.JsonElement;
import blue.endless.jankson.JsonObject;
import blue.endless.jankson.impl.SyntaxError;
import com.google.gson.Gson;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.registery.coloredpack.ColoredBlockEntry;
import fr.arthurbambou.paintingmod.mainmod.registery.coloredpack.ColoredPack;
import net.fabricmc.loader.FabricLoader;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColoredPackRegistry {
    protected static Logger LOGGER = LogManager.getLogger("PaintingMod");

    public static final List<ColoredPack> COLORED_PACK_LIST = new ArrayList<>();

    private static File packPath;

    public static void init() {
        Gson gson = new Gson();
        File pPath = new File(FabricLoader.INSTANCE.getConfigDirectory(), "paintingmod");
        if (!pPath.exists()) {
            pPath.mkdir();
        }
        packPath = new File(pPath, "colored_packs");
        if (!packPath.exists()) {
            packPath.mkdir();
        }
//        try (FileWriter fileWriter = new FileWriter(new File(packPath, "test.json"))) {
//            List<ColoredBlockEntry> list = new ArrayList<>();
//            Map<ColoredObject.TextureFace, String> textureMap = new HashMap<>();
//            textureMap.put(ColoredObject.TextureFace.ALL, new Identifier("sgifqd").toString());
//            ColoredBlockEntry entry = new ColoredBlockEntry("testte", "stairs",textureMap);
//            list.add(entry);
//            fileWriter.write(gson.toJson(new ColoredPack("myname", "0.0.1", list)));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        if (packPath.listFiles() == null) {
            LOGGER.info("No ColoredPack found.");
            return;
        }
        File[] files = packPath.listFiles();
        for (File file : files) {
            try (FileReader fileReader = new FileReader(file)){
                JsonObject element = Jankson.builder().build().load(file);
                String name;
                String version;

                if (!element.containsKey("name")) {
                    LOGGER.warn("Colored Pack " + file.getName() + " doesn't specify a name");
                }
                name = element.get(String.class, "name");
                if (!element.containsKey("version")) {
                    LOGGER.warn("Colored Pack " + file.getName() + " doesn't specify a version");
                }
                version = element.get(String.class, "version");
                if (!element.containsKey("coloredBlocks")) {
                    LOGGER.error("Colored Pack " + file.getName() + " is empty, it will not be load!");
                    continue;
                }
                JsonObject blocks = element.getObject("coloredBlocks");

//                COLORED_PACK_LIST.add(gson.fromJson(fileReader, ColoredPack.class));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SyntaxError syntaxError) {
                syntaxError.printStackTrace();
            }

        }
    }
}
