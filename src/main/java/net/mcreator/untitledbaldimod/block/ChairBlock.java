
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

public class ChairBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ChairBlock() {
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
			default -> Shapes.or(box(0, 8, 0, 16, 24, 1), box(0, 6, 0, 16, 8, 16), box(0, 0, 0, 2, 6, 3), box(14, 0, 0, 16, 6, 3), box(0, 0, 13, 2, 6, 16), box(14, 0, 13, 16, 6, 16));
			case NORTH -> Shapes.or(box(0, 8, 15, 16, 24, 16), box(0, 6, 0, 16, 8, 16), box(14, 0, 13, 16, 6, 16), box(0, 0, 13, 2, 6, 16), box(14, 0, 0, 16, 6, 3), box(0, 0, 0, 2, 6, 3));
			case EAST -> Shapes.or(box(0, 8, 0, 1, 24, 16), box(0, 6, 0, 16, 8, 16), box(0, 0, 14, 3, 6, 16), box(0, 0, 0, 3, 6, 2), box(13, 0, 14, 16, 6, 16), box(13, 0, 0, 16, 6, 2));
			case WEST -> Shapes.or(box(15, 8, 0, 16, 24, 16), box(0, 6, 0, 16, 8, 16), box(13, 0, 0, 16, 6, 2), box(13, 0, 14, 16, 6, 16), box(0, 0, 0, 3, 6, 2), box(0, 0, 14, 3, 6, 16));
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
