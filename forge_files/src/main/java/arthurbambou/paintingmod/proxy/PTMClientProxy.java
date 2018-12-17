package arthurbambou.paintingmod.proxy;

import arthurbambou.paintingmod.util.PTMReference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class PTMClientProxy extends PTMCommonProxy
{
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}

    public void registerVariantRenderer(Item item, int meta, String filename, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(PTMReference.MOD_ID, filename), id));
    }
}
