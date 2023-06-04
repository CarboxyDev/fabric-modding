package me.carboxydev.main;

import me.carboxydev.main.enchants.ModEnchants;
import me.carboxydev.main.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod implements ModInitializer {

    public static final String MOD_ID = "carboxydev_demo_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Demo Mod");
        ModItems.registerItems();
        ModEnchants.registerEnchantments();

        PlayerBlockBreakEvents.AFTER.register(
            (world, player, pos, state, entity) -> {
                if (
                    player.getMainHandStack().getItem() ==
                    ModItems.HOLLOWFIX_SWORD
                ) {
                    ((LivingEntity) player).addStatusEffect(
                            new StatusEffectInstance(
                                StatusEffects.BLINDNESS,
                                3,
                                0
                            )
                        );
                    ((LivingEntity) player).playSound(
                            SoundEvents.ENTITY_GHAST_HURT,
                            1.5F,
                            1.0F
                        );
                }
            }
        );
    }
}
