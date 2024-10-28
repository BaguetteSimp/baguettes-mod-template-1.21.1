package net.baguette.baguettesmod;

import net.baguette.baguettesmod.block.ModBlocks;
import net.baguette.baguettesmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaguettesMod implements ModInitializer {
	public static final String MOD_ID = "baguettesmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}