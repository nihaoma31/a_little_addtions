
package net.mcreator.myfirstmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.myfirstmod.init.ALittleAddtionsModItems;
import net.mcreator.myfirstmod.init.ALittleAddtionsModFluids;
import net.mcreator.myfirstmod.init.ALittleAddtionsModFluidTypes;
import net.mcreator.myfirstmod.init.ALittleAddtionsModBlocks;

public abstract class BloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ALittleAddtionsModFluidTypes.BLOOD_TYPE.get(), () -> ALittleAddtionsModFluids.BLOOD.get(), () -> ALittleAddtionsModFluids.FLOWING_BLOOD.get())
			.explosionResistance(100f).bucket(() -> ALittleAddtionsModItems.BLOOD_BUCKET.get()).block(() -> (LiquidBlock) ALittleAddtionsModBlocks.BLOOD.get());

	private BloodFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BloodFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
