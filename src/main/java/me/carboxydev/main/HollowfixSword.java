package me.carboxydev.main;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class HollowfixSword extends SwordItem {

    public HollowfixSword(
        ToolMaterial instance,
        int attackDamage,
        float attackSpeed,
        Settings settings
    ) {
        super(instance, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(
        ItemStack itemStack,
        World world,
        java.util.List<net.minecraft.text.Text> tooltip,
        net.minecraft.client.item.TooltipContext tooltipContext
    ) {
        tooltip.add(
            Text
                .translatable(
                    "item.carboxydev_demo_mod.hollowfix_sword.tooltip"
                )
                .formatted(Formatting.GOLD)
        );
    }

    @Override
    public boolean postHit(
        ItemStack stack,
        LivingEntity target,
        LivingEntity attacker
    ) {
        target.playSound(SoundEvents.BLOCK_BEACON_ACTIVATE, 0.3F, 1.0F);
        return super.postHit(stack, target, attacker);
    }
}
