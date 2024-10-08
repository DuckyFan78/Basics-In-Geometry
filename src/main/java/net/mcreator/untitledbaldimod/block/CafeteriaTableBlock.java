
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
			default -> Shapes.or(box(-16, 14, 0, 32, 16, 16), box(-16, 7, 12, 32, 9, 28), box(-16, 7, -13, 32, 9, 3), box(-12, 0, 7, -10, 14, 9), box(26, 0, 7, 28, 14, 9), box(26, 5, -6, 28, 7, 22), box(-12, 5, -6, -10, 7, 22));
			case NORTH -> Shapes.or(box(-16, 14, 0, 32, 16, 16), box(-16, 7, -12, 32, 9, 4), box(-16, 7, 13, 32, 9, 29), box(26, 0, 7, 28, 14, 9), box(-12, 0, 7, -10, 14, 9), box(-12, 5, -6, -10, 7, 22), box(26, 5, -6, 28, 7, 22));
			case EAST -> Shapes.or(box(0, 14, -16, 16, 16, 32), box(12, 7, -16, 28, 9, 32), box(-13, 7, -16, 3, 9, 32), box(7, 0, 26, 9, 14, 28), box(7, 0, -12, 9, 14, -10), box(-6, 5, -12, 22, 7, -10), box(-6, 5, 26, 22, 7, 28));
			case WEST -> Shapes.or(box(0, 14, -16, 16, 16, 32), box(-12, 7, -16, 4, 9, 32), box(13, 7, -16, 29, 9, 32), box(7, 0, -12, 9, 14, -10), box(7, 0, 26, 9, 14, 28), box(-6, 5, 26, 22, 7, 28), box(-6, 5, -12, 22, 7, -10));
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
