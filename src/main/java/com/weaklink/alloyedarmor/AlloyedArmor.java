package com.weaklink.alloyedarmor;

import com.weaklink.alloyedarmor.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlloyedArmor implements ModInitializer {
	public static final String MOD_ID = "alloyedarmor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}