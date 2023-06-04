package me.carboxydev.main.enchants;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class HollowbiteEnchantment extends Enchantment {

    protected HollowbiteEnchantment(
        Rarity weight,
        EnchantmentTarget type,
        EquipmentSlot[] slotTypes
    ) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 14 * level;
    }

    @Override
    public int getMaxPower(int level) {
        return 30;
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return super.canAccept(other);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            // 20 * 3 * level = (3 * level) secs duration
            ((LivingEntity) target).addStatusEffect(
                    new StatusEffectInstance(
                        StatusEffects.GLOWING,
                        20 * 3 * level,
                        level - 1
                    )
                );
            ((LivingEntity) target).addStatusEffect(
                    new StatusEffectInstance(
                        StatusEffects.LEVITATION,
                        20 * 2 * level,
                        level
                    )
                );
        }

        super.onTargetDamaged(user, target, level);
    }
}
