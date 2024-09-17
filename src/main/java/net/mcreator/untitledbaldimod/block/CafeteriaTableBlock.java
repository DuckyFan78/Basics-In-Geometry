
package net.mcreator.untitledbaldimod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CafeteriaTableBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CafeteriaTableBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(-15, 6, -16, 1, 8, 32), box(0, 14, -16, 16, 16, 32), box(15, 6, -16, 31, 8, 32), box(7, 0, 28, 9, 14, 30), box(-8, 4, 28, 24, 6, 30), box(7, 0, -13, 9, 14, -11), box(-8, 4, -13, 24, 6, -11));
			case NORTH -> Shapes.or(box(15, 6, -16, 31, 8, 32), box(0, 14, -16, 16, 16, 32), box(-15, 6, -16, 1, 8, 32), box(7, 0, -14, 9, 14, -12), box(-8, 4, -14, 24, 6, -12), box(7, 0, 27, 9, 14, 29), box(-8, 4, 27, 24, 6, 29));
			case EAST -> Shapes.or(box(-16, 6, 15, 32, 8, 31), box(-16, 14, 0, 32, 16, 16), box(-16, 6, -15, 32, 8, 1), box(28, 0, 7, 30, 14, 9), box(28, 4, -8, 30, 6, 24), box(-13, 0, 7, -11, 14, 9), box(-13, 4, -8, -11, 6, 24));
			case WEST -> Shapes.or(box(-16, 6, -15, 32, 8, 1), box(-16, 14, 0, 32, 16, 16), box(-16, 6, 15, 32, 8, 31), box(-14, 0, 7, -12, 14, 9), box(-14, 4, -8, -12, 6, 24), box(27, 0, 7, 29, 14, 9), box(27, 4, -8, 29, 6, 24));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}
