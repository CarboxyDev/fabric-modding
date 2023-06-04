package me.carboxydev.main;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import me.carboxydev.main.enchants.ModEnchants;
import me.carboxydev.main.item.ModItems;

public class DemoMod implements ModInitializer {
	public static final String MOD_ID = "carboxydev_demo_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Demo Mod");
		ModItems.registerItems();
		ModEnchants.registerEnchantments();
	}
}
