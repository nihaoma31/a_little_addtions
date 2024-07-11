package net.mcreator.myfirstmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.myfirstmod.endbiomes.TheEndBiomes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ALittleAddtionsModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("a_little_addtions:endexpansion")), 2d);
			TheEndBiomes.addMainIslandBiome(ResourceKey.create(Registries.BIOME, new ResourceLocation("a_little_addtions:dupe")), 2d);
		});
	}
}
