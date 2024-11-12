
package net.mcreator.untitledbaldimod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.untitledbaldimod.procedures.DetentionPosterOnBlockRightClickedProcedure;

public class DetentionPosterBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 6);
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public DetentionPosterBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				if (s.getValue(BLOCKSTATE) == 3)
					return 0;
				if (s.getValue(BLOCKSTATE) == 4)
					return 0;
				if (s.getValue(BLOCKSTATE) == 5)
					return 0;
				if (s.getValue(BLOCKSTATE) == 6)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
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
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(11, 12, 2, 24, 31, 3), box(11, 31, 2, 24, 32, 4), box(10, 11, 2, 11, 32, 4), box(24, 11, 2, 25, 32, 4), box(11, 11, 2, 24, 12, 4), box(10, 11, 0, 25, 32, 2), box(-4, 4, 0, 19, 9, 2), box(5, 11, 2, 6, 32, 4),
						box(-8, 11, 2, 5, 12, 4), box(-9, 11, 2, -8, 32, 4), box(-8, 31, 2, 5, 32, 4), box(-9, 11, 0, 6, 32, 2), box(-8, 12, 2, 5, 31, 3));
				case NORTH -> Shapes.or(box(-8, 12, 13, 5, 31, 14), box(-8, 31, 12, 5, 32, 14), box(5, 11, 12, 6, 32, 14), box(-9, 11, 12, -8, 32, 14), box(-8, 11, 12, 5, 12, 14), box(-9, 11, 14, 6, 32, 16), box(-3, 4, 14, 20, 9, 16),
						box(10, 11, 12, 11, 32, 14), box(11, 11, 12, 24, 12, 14), box(24, 11, 12, 25, 32, 14), box(11, 31, 12, 24, 32, 14), box(10, 11, 14, 25, 32, 16), box(11, 12, 13, 24, 31, 14));
				case EAST -> Shapes.or(box(2, 12, -8, 3, 31, 5), box(2, 31, -8, 4, 32, 5), box(2, 11, 5, 4, 32, 6), box(2, 11, -9, 4, 32, -8), box(2, 11, -8, 4, 12, 5), box(0, 11, -9, 2, 32, 6), box(0, 4, -3, 2, 9, 20), box(2, 11, 10, 4, 32, 11),
						box(2, 11, 11, 4, 12, 24), box(2, 11, 24, 4, 32, 25), box(2, 31, 11, 4, 32, 24), box(0, 11, 10, 2, 32, 25), box(2, 12, 11, 3, 31, 24));
				case WEST -> Shapes.or(box(13, 12, 11, 14, 31, 24), box(12, 31, 11, 14, 32, 24), box(12, 11, 10, 14, 32, 11), box(12, 11, 24, 14, 32, 25), box(12, 11, 11, 14, 12, 24), box(14, 11, 10, 16, 32, 25), box(14, 4, -4, 16, 9, 19),
						box(12, 11, 5, 14, 32, 6), box(12, 11, -8, 14, 12, 5), box(12, 11, -9, 14, 32, -8), box(12, 31, -8, 14, 32, 5), box(14, 11, -9, 16, 32, 6), box(13, 12, -8, 14, 31, 5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(11, 12, 2, 24, 31, 3), box(11, 31, 2, 24, 32, 4), box(10, 11, 2, 11, 32, 4), box(24, 11, 2, 25, 32, 4), box(11, 11, 2, 24, 12, 4), box(10, 11, 0, 25, 32, 2), box(-4, 4, 0, 19, 9, 2), box(5, 11, 2, 6, 32, 4),
						box(-8, 11, 2, 5, 12, 4), box(-9, 11, 2, -8, 32, 4), box(-8, 31, 2, 5, 32, 4), box(-9, 11, 0, 6, 32, 2), box(-8, 12, 2, 5, 31, 3));
				case NORTH -> Shapes.or(box(-8, 12, 13, 5, 31, 14), box(-8, 31, 12, 5, 32, 14), box(5, 11, 12, 6, 32, 14), box(-9, 11, 12, -8, 32, 14), box(-8, 11, 12, 5, 12, 14), box(-9, 11, 14, 6, 32, 16), box(-3, 4, 14, 20, 9, 16),
						box(10, 11, 12, 11, 32, 14), box(11, 11, 12, 24, 12, 14), box(24, 11, 12, 25, 32, 14), box(11, 31, 12, 24, 32, 14), box(10, 11, 14, 25, 32, 16), box(11, 12, 13, 24, 31, 14));
				case EAST -> Shapes.or(box(2, 12, -8, 3, 31, 5), box(2, 31, -8, 4, 32, 5), box(2, 11, 5, 4, 32, 6), box(2, 11, -9, 4, 32, -8), box(2, 11, -8, 4, 12, 5), box(0, 11, -9, 2, 32, 6), box(0, 4, -3, 2, 9, 20), box(2, 11, 10, 4, 32, 11),
						box(2, 11, 11, 4, 12, 24), box(2, 11, 24, 4, 32, 25), box(2, 31, 11, 4, 32, 24), box(0, 11, 10, 2, 32, 25), box(2, 12, 11, 3, 31, 24));
				case WEST -> Shapes.or(box(13, 12, 11, 14, 31, 24), box(12, 31, 11, 14, 32, 24), box(12, 11, 10, 14, 32, 11), box(12, 11, 24, 14, 32, 25), box(12, 11, 11, 14, 12, 24), box(14, 11, 10, 16, 32, 25), box(14, 4, -4, 16, 9, 19),
						box(12, 11, 5, 14, 32, 6), box(12, 11, -8, 14, 12, 5), box(12, 11, -9, 14, 32, -8), box(12, 31, -8, 14, 32, 5), box(14, 11, -9, 16, 32, 6), box(13, 12, -8, 14, 31, 5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 3) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(11, 12, 2, 24, 31, 3), box(11, 31, 2, 24, 32, 4), box(10, 11, 2, 11, 32, 4), box(24, 11, 2, 25, 32, 4), box(11, 11, 2, 24, 12, 4), box(10, 11, 0, 25, 32, 2), box(-4, 4, 0, 19, 9, 2), box(5, 11, 2, 6, 32, 4),
						box(-8, 11, 2, 5, 12, 4), box(-9, 11, 2, -8, 32, 4), box(-8, 31, 2, 5, 32, 4), box(-9, 11, 0, 6, 32, 2), box(-8, 12, 2, 5, 31, 3));
				case NORTH -> Shapes.or(box(-8, 12, 13, 5, 31, 14), box(-8, 31, 12, 5, 32, 14), box(5, 11, 12, 6, 32, 14), box(-9, 11, 12, -8, 32, 14), box(-8, 11, 12, 5, 12, 14), box(-9, 11, 14, 6, 32, 16), box(-3, 4, 14, 20, 9, 16),
						box(10, 11, 12, 11, 32, 14), box(11, 11, 12, 24, 12, 14), box(24, 11, 12, 25, 32, 14), box(11, 31, 12, 24, 32, 14), box(10, 11, 14, 25, 32, 16), box(11, 12, 13, 24, 31, 14));
				case EAST -> Shapes.or(box(2, 12, -8, 3, 31, 5), box(2, 31, -8, 4, 32, 5), box(2, 11, 5, 4, 32, 6), box(2, 11, -9, 4, 32, -8), box(2, 11, -8, 4, 12, 5), box(0, 11, -9, 2, 32, 6), box(0, 4, -3, 2, 9, 20), box(2, 11, 10, 4, 32, 11),
						box(2, 11, 11, 4, 12, 24), box(2, 11, 24, 4, 32, 25), box(2, 31, 11, 4, 32, 24), box(0, 11, 10, 2, 32, 25), box(2, 12, 11, 3, 31, 24));
				case WEST -> Shapes.or(box(13, 12, 11, 14, 31, 24), box(12, 31, 11, 14, 32, 24), box(12, 11, 10, 14, 32, 11), box(12, 11, 24, 14, 32, 25), box(12, 11, 11, 14, 12, 24), box(14, 11, 10, 16, 32, 25), box(14, 4, -4, 16, 9, 19),
						box(12, 11, 5, 14, 32, 6), box(12, 11, -8, 14, 12, 5), box(12, 11, -9, 14, 32, -8), box(12, 31, -8, 14, 32, 5), box(14, 11, -9, 16, 32, 6), box(13, 12, -8, 14, 31, 5));
			};
		}
		if (state.getValue(BLOCKSTATE) == 4) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(11, 12, 2, 24, 31, 3), box(11, 31, 2, 24, 32, 4), box(10, 11, 2, 11, 32, 4), box(24, 11, 2, 25, 32, 4), box(11, 11, 2, 24, 12, 4), box(10, 11, 0, 25, 32, 2), box(-4, 4, 0, 19, 9, 2), box(5, 11, 2, 6, 32, 4),
						box(-8, 11, 2, 5, 12, 4), box(-9, 11, 2, -8, 32, 4), box(-8, 31, 2, 5, 32, 4), box(-9, 11, 0, 6, 32, 2), box(-8, 12, 2, 5, 31, 3));
				case NORTH -> Shapes.or(box(-8, 12, 13, 5, 31, 14), box(-8, 31, 12, 5, 32, 14), box(5, 11, 12, 6, 32, 14), box(-9, 11, 12, -8, 32, 14), box(-8, 11, 12, 5, 12, 14), box(-9, 11, 14, 6, 32, 16), box(-3, 4, 14, 20, 9, 16),
						box(10, 11, 12, 11, 32, 14), box(11, 11, 12, 24, 12, 14), box(24, 11, 12, 25, 32, 14), box(11, 31, 12, 24, 32, 14), box(10, 11, 14, 25, 32, 16), box(11, 12, 13, 24, 31, 14));
				case EAST -> Shapes.or(box(2, 12, -8, 3, 31, 5), box(2, 31, -8, 4, 32, 5), box(2, 11, 5, 4, 32, 6), box(2, 11, -9, 4, 32, -8), box(2, 11, -8, 4, 12, 5), box(0, 11, -9, 2, 32, 6), box(0, 4, -3, 2, 9, 20), box(2, 11, 10, 4, 32, 11),
						box(2, 11, 11, 4, 12, 24), box(2, 11, 24, 4, 32, 25), box(2, 31, 11, 4, 32, 24), box(0, 11, 10, 2, 32, 25), box(2, 12, 11, 3, 31, 24));
				case WEST -> Shapes.or(box(13, 12, 11, 14, 31, 24), box(12, 31, 11, 14, 32, 24), box(12, 11, 10, 14, 32, 11), box(12, 11, 24, 14, 32, 25), box(12, 11, 11, 14, 12, 24), box(14, 11, 10, 16, 32, 25), box(14, 4, -4, 16, 9, 19),
						box(12, 11, 5, 14, 32, 6), box(12, 11, -8, 14, 12, 5), box(12, 11, -9, 14, 32, -8), box(12, 31, -8, 14, 32, 5), box(14, 11, -9, 16, 32, 6), box(13, 12, -8, 14, 31, 5));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(11, 12, 2, 24, 31, 3), box(11, 31, 2, 24, 32, 4), box(10, 11, 2, 11, 32, 4), box(24, 11, 2, 25, 32, 4), box(11, 11, 2, 24, 12, 4), box(10, 11, 0, 25, 32, 2), box(-4, 4, 0, 19, 9, 2), box(5, 11, 2, 6, 32, 4),
					box(-8, 11, 2, 5, 12, 4), box(-9, 11, 2, -8, 32, 4), box(-8, 31, 2, 5, 32, 4), box(-9, 11, 0, 6, 32, 2), box(-8, 12, 2, 5, 31, 3));
			case NORTH -> Shapes.or(box(-8, 12, 13, 5, 31, 14), box(-8, 31, 12, 5, 32, 14), box(5, 11, 12, 6, 32, 14), box(-9, 11, 12, -8, 32, 14), box(-8, 11, 12, 5, 12, 14), box(-9, 11, 14, 6, 32, 16), box(-3, 4, 14, 20, 9, 16),
					box(10, 11, 12, 11, 32, 14), box(11, 11, 12, 24, 12, 14), box(24, 11, 12, 25, 32, 14), box(11, 31, 12, 24, 32, 14), box(10, 11, 14, 25, 32, 16), box(11, 12, 13, 24, 31, 14));
			case EAST -> Shapes.or(box(2, 12, -8, 3, 31, 5), box(2, 31, -8, 4, 32, 5), box(2, 11, 5, 4, 32, 6), box(2, 11, -9, 4, 32, -8), box(2, 11, -8, 4, 12, 5), box(0, 11, -9, 2, 32, 6), box(0, 4, -3, 2, 9, 20), box(2, 11, 10, 4, 32, 11),
					box(2, 11, 11, 4, 12, 24), box(2, 11, 24, 4, 32, 25), box(2, 31, 11, 4, 32, 24), box(0, 11, 10, 2, 32, 25), box(2, 12, 11, 3, 31, 24));
			case WEST -> Shapes.or(box(13, 12, 11, 14, 31, 24), box(12, 31, 11, 14, 32, 24), box(12, 11, 10, 14, 32, 11), box(12, 11, 24, 14, 32, 25), box(12, 11, 11, 14, 12, 24), box(14, 11, 10, 16, 32, 25), box(14, 4, -4, 16, 9, 19),
					box(12, 11, 5, 14, 32, 6), box(12, 11, -8, 14, 12, 5), box(12, 11, -9, 14, 32, -8), box(12, 31, -8, 14, 32, 5), box(14, 11, -9, 16, 32, 6), box(13, 12, -8, 14, 31, 5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING, BLOCKSTATE);
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

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		DetentionPosterOnBlockRightClickedProcedure.execute(world, x, y, z, blockstate);
		return InteractionResult.SUCCESS;
	}
}
