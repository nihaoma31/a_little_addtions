
package net.mcreator.myfirstmod.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class EndwoodBlock extends Block {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

	public EndwoodBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.fall"))))
				.strength(3f, 4f));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AXIS);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(AXIS, context.getClickedFace().getAxis());
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
			if (state.getValue(AXIS) == Direction.Axis.X) {
				return state.setValue(AXIS, Direction.Axis.Z);
			} else if (state.getValue(AXIS) == Direction.Axis.Z) {
				return state.setValue(AXIS, Direction.Axis.X);
			}
		}
		return state;
	}
}
