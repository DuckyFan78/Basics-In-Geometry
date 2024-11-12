
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.untitledbaldimod.item.ZestyBarItem;
import net.mcreator.untitledbaldimod.item.YouCanThinkPadItem;
import net.mcreator.untitledbaldimod.item.QuarterItem;
import net.mcreator.untitledbaldimod.item.BSODAItem;
import net.mcreator.untitledbaldimod.BasicsInGeometryMod;

public class BasicsInGeometryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BasicsInGeometryMod.MODID);
	public static final RegistryObject<Item> SCHOOLHOUSE_CEILING = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_CEILING);
	public static final RegistryObject<Item> SCHOOLHOUSE_FLOOR = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_FLOOR);
	public static final RegistryObject<Item> SCHOOLHOUSE_CARPET = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_CARPET);
	public static final RegistryObject<Item> SCHOOLHOUSE_WALL_1 = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_WALL_1);
	public static final RegistryObject<Item> SCHOOLHOUSE_WALL_TOP = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_WALL_TOP);
	public static final RegistryObject<Item> SCHOOL_HOUSE_WALL_BOTTOM = block(BasicsInGeometryModBlocks.SCHOOL_HOUSE_WALL_BOTTOM);
	public static final RegistryObject<Item> SCHOOL_HOUSE_WALL_2 = block(BasicsInGeometryModBlocks.SCHOOL_HOUSE_WALL_2);
	public static final RegistryObject<Item> SCHOOLHOUSE_TILES = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_TILES);
	public static final RegistryObject<Item> SCHOOLHOUSE_CEILING_2 = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_CEILING_2);
	public static final RegistryObject<Item> SWINGING_DOOR = doubleBlock(BasicsInGeometryModBlocks.SWINGING_DOOR);
	public static final RegistryObject<Item> CLASSROOM_DOOR = doubleBlock(BasicsInGeometryModBlocks.CLASSROOM_DOOR);
	public static final RegistryObject<Item> SCHOOL_FACULTY_DOOR = doubleBlock(BasicsInGeometryModBlocks.SCHOOL_FACULTY_DOOR);
	public static final RegistryObject<Item> SUPPLY_CLOSET_DOOR = doubleBlock(BasicsInGeometryModBlocks.SUPPLY_CLOSET_DOOR);
	public static final RegistryObject<Item> PRINCIPAL_DOOR = doubleBlock(BasicsInGeometryModBlocks.PRINCIPAL_DOOR);
	public static final RegistryObject<Item> OFFICE_DOOR = doubleBlock(BasicsInGeometryModBlocks.OFFICE_DOOR);
	public static final RegistryObject<Item> SCHOOL_RULES_POSTER = block(BasicsInGeometryModBlocks.SCHOOL_RULES_POSTER);
	public static final RegistryObject<Item> RECYCLING_POSTER = block(BasicsInGeometryModBlocks.RECYCLING_POSTER);
	public static final RegistryObject<Item> ATTENTION_POSTER = block(BasicsInGeometryModBlocks.ATTENTION_POSTER);
	public static final RegistryObject<Item> JANITOR_BOOTS_POSTER = block(BasicsInGeometryModBlocks.JANITOR_BOOTS_POSTER);
	public static final RegistryObject<Item> RED_LOCKER = block(BasicsInGeometryModBlocks.RED_LOCKER);
	public static final RegistryObject<Item> BLUE_LOCKER = block(BasicsInGeometryModBlocks.BLUE_LOCKER);
	public static final RegistryObject<Item> SCHOOL_HOUSE_TILES_2 = block(BasicsInGeometryModBlocks.SCHOOL_HOUSE_TILES_2);
	public static final RegistryObject<Item> SMALL_DESK = block(BasicsInGeometryModBlocks.SMALL_DESK);
	public static final RegistryObject<Item> DESK = block(BasicsInGeometryModBlocks.DESK);
	public static final RegistryObject<Item> CELLPHONE_POSTER = block(BasicsInGeometryModBlocks.CELLPHONE_POSTER);
	public static final RegistryObject<Item> SCISSORS_POSTER = block(BasicsInGeometryModBlocks.SCISSORS_POSTER);
	public static final RegistryObject<Item> WD_NO_SQUEE_POSTER = block(BasicsInGeometryModBlocks.WD_NO_SQUEE_POSTER);
	public static final RegistryObject<Item> CHAIR = block(BasicsInGeometryModBlocks.CHAIR);
	public static final RegistryObject<Item> EXIT_SIGN = block(BasicsInGeometryModBlocks.EXIT_SIGN);
	public static final RegistryObject<Item> LIGHT_BLOCK = block(BasicsInGeometryModBlocks.LIGHT_BLOCK);
	public static final RegistryObject<Item> BOARD = block(BasicsInGeometryModBlocks.BOARD);
	public static final RegistryObject<Item> GREEN_LOCKER = block(BasicsInGeometryModBlocks.GREEN_LOCKER);
	public static final RegistryObject<Item> NUMBERS_ARE_EASY_POSTER = block(BasicsInGeometryModBlocks.NUMBERS_ARE_EASY_POSTER);
	public static final RegistryObject<Item> BSODA_VENDING_MACHINE = block(BasicsInGeometryModBlocks.BSODA_VENDING_MACHINE);
	public static final RegistryObject<Item> BSODA = REGISTRY.register("bsoda", () -> new BSODAItem());
	public static final RegistryObject<Item> ZESTY_BAR_VENDING_MACHINE = block(BasicsInGeometryModBlocks.ZESTY_BAR_VENDING_MACHINE);
	public static final RegistryObject<Item> PLANT = block(BasicsInGeometryModBlocks.PLANT);
	public static final RegistryObject<Item> WINDOW_1 = block(BasicsInGeometryModBlocks.WINDOW_1);
	public static final RegistryObject<Item> WINDOW_2 = block(BasicsInGeometryModBlocks.WINDOW_2);
	public static final RegistryObject<Item> CAFETERIA_TABLE = block(BasicsInGeometryModBlocks.CAFETERIA_TABLE);
	public static final RegistryObject<Item> OUT_OF_ORDER_POSTER = block(BasicsInGeometryModBlocks.OUT_OF_ORDER_POSTER);
	public static final RegistryObject<Item> NOTEBOOKS_POSTER = block(BasicsInGeometryModBlocks.NOTEBOOKS_POSTER);
	public static final RegistryObject<Item> READ_POSTERS = block(BasicsInGeometryModBlocks.READ_POSTERS);
	public static final RegistryObject<Item> ZESTY_BAR = REGISTRY.register("zesty_bar", () -> new ZestyBarItem());
	public static final RegistryObject<Item> DETENTION_POSTER = block(BasicsInGeometryModBlocks.DETENTION_POSTER);
	public static final RegistryObject<Item> QUARTER = REGISTRY.register("quarter", () -> new QuarterItem());
	public static final RegistryObject<Item> REWARDED_4_THINKING_POSTER = block(BasicsInGeometryModBlocks.REWARDED_4_THINKING_POSTER);
	public static final RegistryObject<Item> CANDY_POSTER = block(BasicsInGeometryModBlocks.CANDY_POSTER);
	public static final RegistryObject<Item> BE_A_KID_POSTER = block(BasicsInGeometryModBlocks.BE_A_KID_POSTER);
	public static final RegistryObject<Item> YOU_CAN_THINK_PAD = REGISTRY.register("you_can_think_pad", () -> new YouCanThinkPadItem());
	public static final RegistryObject<Item> SCHOOLHOUSE_FENCE = block(BasicsInGeometryModBlocks.SCHOOLHOUSE_FENCE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
