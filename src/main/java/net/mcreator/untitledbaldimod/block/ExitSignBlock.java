
package net.mcreator.untitledbaldimod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
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

public class ExitSignBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ExitSignBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 7).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
			default -> Shapes.or(box(24, 5, 7, 25, 12, 9), box(7, 5, 7, 8, 12, 9), box(8, 5, 7.75, 24, 12, 8.25), box(13, 13, 7, 19, 14, 9), box(12, 14, 7, 20, 15, 9), box(11, 15, 7, 21, 16, 9), box(8, 12, 7, 24, 13, 9), box(8, 4, 7, 24, 5, 9));
			case NORTH -> Shapes.or(box(-9, 5, 7, -8, 12, 9), box(8, 5, 7, 9, 12, 9), box(-8, 5, 7.75, 8, 12, 8.25), box(-3, 13, 7, 3, 14, 9), box(-4, 14, 7, 4, 15, 9), box(-5, 15, 7, 5, 16, 9), box(-8, 12, 7, 8, 13, 9), box(-8, 4, 7, 8, 5, 9));
			case EAST -> Shapes.or(box(7, 5, -9, 9, 12, -8), box(7, 5, 8, 9, 12, 9), box(7.75, 5, -8, 8.25, 12, 8), box(7, 13, -3, 9, 14, 3), box(7, 14, -4, 9, 15, 4), box(7, 15, -5, 9, 16, 5), box(7, 12, -8, 9, 13, 8), box(7, 4, -8, 9, 5, 8));
			case WEST -> Shapes.or(box(7, 5, 24, 9, 12, 25), box(7, 5, 7, 9, 12, 8), box(7.75, 5, 8, 8.25, 12, 24), box(7, 13, 13, 9, 14, 19), box(7, 14, 12, 9, 15, 20), box(7, 15, 11, 9, 16, 21), box(7, 12, 8, 9, 13, 24), box(7, 4, 8, 9, 5, 24));
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
