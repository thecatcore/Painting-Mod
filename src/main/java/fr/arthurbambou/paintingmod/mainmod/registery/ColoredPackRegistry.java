package fr.arthurbambou.paintingmod.mainmod.registery;

import blue.endless.jankson.Jankson;
import blue.endless.jankson.JsonArray;
import blue.endless.jankson.JsonElement;
import blue.endless.jankson.JsonObject;
import blue.endless.jankson.impl.SyntaxError;
import com.google.gson.Gson;
import fr.arthurbambou.paintingmod.mainmod.api.ColoredObject;
import fr.arthurbambou.paintingmod.mainmod.api.PaintingModRegistry;
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
                    continue;
                }
                name = element.get(String.class, "name");
                if (!element.containsKey("version")) {
                    LOGGER.warn("Colored Pack " + name + " doesn't specify a version");
                    continue;
                }
                version = element.get(String.class, "version");
                if (!element.containsKey("coloredBlocks")) {
                    LOGGER.error("Colored Pack " + name + " is empty, it will not be load!");
                    continue;
                }
                JsonArray blocks = (JsonArray) element.get("coloredBlocks");
                if (blocks.isEmpty()) {
                    LOGGER.error("Colored Pack " + name + " is empty, it will not be load!");
                    continue;
                }
                List<ColoredBlockEntry> entries = gson.fromJson(fileReader, ColoredPack.class).getColoredBlocks();
                List<ColoredBlockEntry> list = new ArrayList<>();
                for (int d = 0; d < entries.size(); d++) {
                    if (entries.get(d).getReplaceS() == null) {
                        LOGGER.error("Can't get the base block of colored block " + d + " in pack" + name + " skipping");
                        continue;
                    }
                    if (entries.get(d).getTypeS() == null) {
                        LOGGER.error("Can't get the type of colored block " + entries.get(d).getReplaceI().toString() + " in pack" + name + " skipping");
                        continue;
                    }
                    if (!PaintingModRegistry.getColoredObjectTypeList().containsKey(entries.get(d).getTypeI())) {
                        LOGGER.error("Unknow type " + entries.get(d).getTypeI() + " for " + entries.get(d).getReplaceI().toString() + " in pack" + name + " skipping");
                        continue;
                    }
                    if (entries.get(d).getTextureMapS() == null) {
                        Map<ColoredObject.TextureFace, String> map = new HashMap<>();
                        map.put(ColoredObject.TextureFace.ALL, new Identifier(entries.get(d).getReplaceI().getNamespace(), "blocks/" + entries.get(d).getReplaceI().getPath()).toString());
                        entries.get(d).setTextureMap(map);
                    }
                    list.add(entries.get(d));
                }
                if (list.isEmpty()) {
                    LOGGER.error("No valid colored block found in Colored Pack " + name + ", it will not be load!");
                    continue;
                }

                COLORED_PACK_LIST.add(new ColoredPack(name,version,list));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SyntaxError syntaxError) {
                syntaxError.printStackTrace();
            }

        }
        if (COLORED_PACK_LIST.isEmpty()) return;
        for (ColoredPack pack : COLORED_PACK_LIST) {
            System.out.println(pack.getName());
            System.out.println(pack.getVersion());
            for (ColoredBlockEntry coloredBlockEntry : pack.getColoredBlocks()) {
                System.out.println(coloredBlockEntry.getReplaceI().toString());
                System.out.println(coloredBlockEntry.getTypeI().toString());
                System.out.println(coloredBlockEntry.getTextureMapS().toString());
            }
        }
    }
}
