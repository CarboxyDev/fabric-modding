package me.carboxydev.main;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HollowfixMaterial implements ToolMaterial {

  public static final HollowfixMaterial INSTANCE = new HollowfixMaterial();

  @Override
  public int getDurability() {
    return 5000;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return 1.0F;
  }

  @Override
  public float getAttackDamage() {
    return 0F;
  }

  @Override
  public int getMiningLevel() {
    return 0;
  }

  @Override
  public int getEnchantability() {
    return 20;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.BEACON);
  }
}
