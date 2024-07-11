
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.myfirstmod.enchantment.WitheringEnchantment;
import net.mcreator.myfirstmod.ALittleAddtionsMod;

public class ALittleAddtionsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ALittleAddtionsMod.MODID);
	public static final RegistryObject<Enchantment> WITHERING = REGISTRY.register("withering", () -> new WitheringEnchantment());
}
