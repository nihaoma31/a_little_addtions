
package net.mcreator.myfirstmod.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.myfirstmod.init.ALittleAddtionsModItems;

import java.util.List;

public class WitheringEnchantment extends Enchantment {
	public WitheringEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.SHARPNESS, Enchantments.MENDING, Enchantments.FIRE_ASPECT, Enchantments.MOB_LOOTING, Enchantments.SWEEPING_EDGE, Enchantments.UNBREAKING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return !Ingredient
				.of(new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.IRON_SWORD), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.NETHERITE_SWORD),
						new ItemStack(Items.WOODEN_AXE), new ItemStack(Items.STONE_AXE), new ItemStack(Items.WOODEN_PICKAXE), new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.DIAMOND_PICKAXE),
						new ItemStack(Items.IRON_AXE), new ItemStack(Items.IRON_PICKAXE), new ItemStack(ALittleAddtionsModItems.ENDWOODPICKAXE_2.get()), new ItemStack(Items.TRIDENT), new ItemStack(Items.BOW), new ItemStack(Items.CROSSBOW))
				.test(itemstack);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}
}
