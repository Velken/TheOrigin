package xbagon.theorigin.init;

import xbagon.theorigin.NameUtils;
import xbagon.theorigin.items.ItemOriginPearl;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item originPearl;
	
	public void init() {
		originPearl = new ItemOriginPearl();
		NameUtils.setNames(originPearl, "originPearl");
	}
	
	public void register() {
		registerItem(originPearl);
	}
	
	private void registerItem(Item item){
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(originPearl);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
