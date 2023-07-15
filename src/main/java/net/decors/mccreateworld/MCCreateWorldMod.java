package net.decors.mccreateworld;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCreateWorldMod implements ModInitializer {
    public static final String MOD_ID = "mscreateworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// new comment 2
		LOGGER.info("Hello Fabric world!");
	}
}