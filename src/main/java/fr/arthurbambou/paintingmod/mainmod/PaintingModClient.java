package fr.arthurbambou.paintingmod.mainmod;

import com.swordglowsblue.artifice.api.Artifice;
import fr.arthurbambou.paintingmod.mainmod.utils.artifice.ResourcePackUtils;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.util.Identifier;

public class PaintingModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssets(new Identifier(PaintingMod.MODID, "default_pack"), pack -> {
            ResourcePackUtils.createPack(pack);
        });
    }
}
