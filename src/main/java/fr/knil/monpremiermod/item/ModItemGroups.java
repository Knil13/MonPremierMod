package fr.knil.monpremiermod.item;

import fr.knil.monpremiermod.MonPremierMod;
import fr.knil.monpremiermod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	
	public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, 
			new Identifier(MonPremierMod.MOD_ID,"ruby"), 
			net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
			.icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContent, entries) -> {
				entries.add(ModItems.RUBY);
				entries.add(ModItems.RAW_RUBY);
				
				entries.add(Items.DIAMOND);
				
				entries.add(ModBlocks.RUBY_BLOCK);
				entries.add(ModBlocks.RAW_RUBY_BLOCK);
				
			} ).build());
	
	public static void registerItemGroups(){
		MonPremierMod.LOGGER.info("Registering Mod Item Groups for " + MonPremierMod.MOD_ID);
	}
}
