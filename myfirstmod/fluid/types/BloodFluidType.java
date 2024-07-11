
package net.mcreator.myfirstmod.fluid.types;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class BloodFluidType extends FluidType {
	public BloodFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.007D).canConvertToSource(true).rarity(Rarity.UNCOMMON)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")))
				.sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@Override
	public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("a_little_addtions:block/blod"), FLOWING_TEXTURE = new ResourceLocation("a_little_addtions:block/blod");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		});
	}
}
