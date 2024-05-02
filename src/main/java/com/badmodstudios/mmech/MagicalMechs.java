package com.badmodstudios.mmech;

import com.badmodstudios.mmech.block.ModBlocks;
import com.badmodstudios.mmech.item.ModItemGroups;
import com.badmodstudios.mmech.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MagicalMechs implements ModInitializer {
	public static final String MOD_ID = "mmech";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("****Initializing****");
		ModItems.RegisterModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

	}
}