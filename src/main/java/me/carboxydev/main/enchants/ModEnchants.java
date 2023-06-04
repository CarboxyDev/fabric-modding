package me.carboxydev.main.enchants;

import me.carboxydev.main.DemoMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchants {

    public static Enchantment HOLLOWBITE_ENCHANTMENT = new HollowbiteEnchantment(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});


    public static void registerEnchantments() {
        registerEnchantment("hollowbite_enchantment", HOLLOWBITE_ENCHANTMENT);
    }

    private static Enchantment registerEnchantment(String name, Enchantment enchant) {
        DemoMod.LOGGER.debug("Registering Mod Enchants for" + DemoMod.MOD_ID);
		return Registry.register(Registry.ENCHANTMENT, new Identifier(DemoMod.MOD_ID, name), enchant);
	}
}
