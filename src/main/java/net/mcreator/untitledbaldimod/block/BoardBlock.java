
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

public class BoardBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public BoardBlock() {
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
			default -> Shapes.or(box(-15, 0, 0, 31, 30, 1), box(-15, 0, 1, -13, 30, 3), box(-13, 2, 1, 29, 28, 2), box(29, 0, 1, 31, 30, 3), box(-13, 0, 1, 29, 2, 3), box(15, 2, 1, 22, 3, 3), box(-13, 28, 1, 29, 30, 3));
			case NORTH -> Shapes.or(box(-15, 0, 15, 31, 30, 16), box(29, 0, 13, 31, 30, 15), box(-13, 2, 14, 29, 28, 15), box(-15, 0, 13, -13, 30, 15), box(-13, 0, 13, 29, 2, 15), box(-6, 2, 13, 1, 3, 15), box(-13, 28, 13, 29, 30, 15));
			case EAST -> Shapes.or(box(0, 0, -15, 1, 30, 31), box(1, 0, 29, 3, 30, 31), box(1, 2, -13, 2, 28, 29), box(1, 0, -15, 3, 30, -13), box(1, 0, -13, 3, 2, 29), box(1, 2, -6, 3, 3, 1), box(1, 28, -13, 3, 30, 29));
			case WEST -> Shapes.or(box(15, 0, -15, 16, 30, 31), box(13, 0, -15, 15, 30, -13), box(14, 2, -13, 15, 28, 29), box(13, 0, 29, 15, 30, 31), box(13, 0, -13, 15, 2, 29), box(13, 2, 15, 15, 3, 22), box(13, 28, -13, 15, 30, 29));
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
