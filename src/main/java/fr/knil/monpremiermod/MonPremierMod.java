package fr.knil.monpremiermod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.knil.monpremiermod.item.ModItem;

public class MonPremierMod implements ModInitializer {
	public static final String MOD_ID = "monpremiermod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		ModItem.registerModItems();
	}
}