package me.carboxydev.main.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class SmeltTouchEnchantment extends Enchantment {

    protected SmeltTouchEnchantment(
        Rarity weight,
        EnchantmentTarget type,
        EquipmentSlot[] slotTypes
    ) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 24;
    }

    @Override
    public int getMaxPower(int level) {
        return 30;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
}
