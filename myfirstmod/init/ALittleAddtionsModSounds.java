
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.myfirstmod.ALittleAddtionsMod;

public class ALittleAddtionsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ALittleAddtionsMod.MODID);
	public static final RegistryObject<SoundEvent> GIORNOGEVOVANATHMEMEGOLDENWIND = REGISTRY.register("giornogevovanathmemegoldenwind",
			() -> SoundEvent.createVariableRangeEvent(new ResourceLocation("a_little_addtions", "giornogevovanathmemegoldenwind")));
	public static final RegistryObject<SoundEvent> NAE_NAE = REGISTRY.register("nae_nae", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("a_little_addtions", "nae_nae")));
}
