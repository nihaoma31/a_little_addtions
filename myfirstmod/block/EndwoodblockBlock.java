
package net.mcreator.myfirstmod.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EndwoodblockBlock extends Block {
	public EndwoodblockBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.nether_wood.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.nether_wood.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.nether_wood.fall"))))
				.strength(2.7f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
