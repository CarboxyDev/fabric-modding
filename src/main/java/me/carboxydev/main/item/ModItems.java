package me.carboxydev.main.item;

import me.carboxydev.main.DemoMod;
import me.carboxydev.main.HollowfixMaterial;
import me.carboxydev.main.HollowfixSword;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final ToolItem HOLLOWFIX_SWORD = new HollowfixSword(HollowfixMaterial.INSTANCE, 12, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1).rarity(Rarity.EPIC).fireproof());
    

    public static void registerItems() {
        registerItem("hollowfix_sword", HOLLOWFIX_SWORD);
    }

    private static Item registerItem(String name, Item item) {
        DemoMod.LOGGER.debug("Registering Mod Items for" + DemoMod.MOD_ID);
		return Registry.register(Registry.ITEM, new Identifier(DemoMod.MOD_ID, name), item);
	}
}
