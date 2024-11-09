package fr.knil.monpremiermod.item;

import fr.knil.monpremiermod.MonPremierMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MonPremierMod.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		MonPremierMod.LOGGER.info("Registering Mod Items for " + MonPremierMod.MOD_ID);
		
	}
}
