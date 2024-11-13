package fr.knil.monpremiermod.item;

import fr.knil.monpremiermod.MonPremierMod;
import fr.knil.monpremiermod.item.custom.DiamondDetectorItem;
import fr.knil.monpremiermod.item.custom.magic_stick;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	
	public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
	public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
	public static final Item AIMANT = registerItem("aimant", new Item(new FabricItemSettings()));
	public static final Item DIAMOND_DETECTOR = registerItem("diamond_detector", new DiamondDetectorItem(new FabricItemSettings().maxDamage(64)));
	public static final Item MAGIC_STICK = registerItem("magic_stick", new magic_stick(new FabricItemSettings().maxDamage(64)));
	
	private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
		entries.add(RUBY);
		entries.add(RAW_RUBY);
	}
	
	private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
		entries.add(AIMANT);
	}
	
	
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(MonPremierMod.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		MonPremierMod.LOGGER.info("Registering Mod Items for " + MonPremierMod.MOD_ID);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
		
	}
}
