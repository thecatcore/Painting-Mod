package fr.arthurbambou.paintingmod.mainmod.registery;

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
        try (FileWriter fileWriter = new FileWriter(new File(packPath, "test.json"))) {
            List<ColoredBlockEntry> list = new ArrayList<>();
            Map<ColoredObject.TextureFace, Identifier> textureMap = new HashMap<>();
            textureMap.put(ColoredObject.TextureFace.ALL, new Identifier("sgifqd"));
            ColoredBlockEntry entry = new ColoredBlockEntry("testte", textureMap);
            list.add(entry);
            fileWriter.write(gson.toJson(new ColoredPack("myname", "0.0.1", list)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (packPath.listFiles() == null) {
            LOGGER.info("No ColoredPack found.");
        }
        File[] files = packPath.listFiles();
        for (File file : files) {
            try {
                FileReader fileReader = new FileReader(file);
                gson.fromJson(fileReader, ColoredPack.class);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
