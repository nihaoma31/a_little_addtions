
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.myfirstmod.ALittleAddtionsMod;

public class ALittleAddtionsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ALittleAddtionsMod.MODID);
	public static final RegistryObject<PaintingVariant> Q = REGISTRY.register("q", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> W = REGISTRY.register("w", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> E = REGISTRY.register("e", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> R = REGISTRY.register("r", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> T = REGISTRY.register("t", () -> new PaintingVariant(16, 16));
}
