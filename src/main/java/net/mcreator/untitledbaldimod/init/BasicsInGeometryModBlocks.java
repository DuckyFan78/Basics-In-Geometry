
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.untitledbaldimod.block.ZestyBarVendingMachineBlock;
import net.mcreator.untitledbaldimod.block.Window2Block;
import net.mcreator.untitledbaldimod.block.Window1Block;
import net.mcreator.untitledbaldimod.block.WDNoSqueePosterBlock;
import net.mcreator.untitledbaldimod.block.SwingingDoorBlock;
import net.mcreator.untitledbaldimod.block.SupplyClosetDoorBlock;
import net.mcreator.untitledbaldimod.block.SmallDeskBlock;
import net.mcreator.untitledbaldimod.block.ScissorsPosterBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseWallTopBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseWall1Block;
import net.mcreator.untitledbaldimod.block.SchoolhouseTilesBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseFloorBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseFenceBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseCeilingBlock;
import net.mcreator.untitledbaldimod.block.SchoolhouseCeiling2Block;
import net.mcreator.untitledbaldimod.block.SchoolhouseCarpetBlock;
import net.mcreator.untitledbaldimod.block.SchoolRulesPosterBlock;
import net.mcreator.untitledbaldimod.block.SchoolHouseWallBottomBlock;
import net.mcreator.untitledbaldimod.block.SchoolHouseWall2Block;
import net.mcreator.untitledbaldimod.block.SchoolHouseTiles2Block;
import net.mcreator.untitledbaldimod.block.SchoolFacultyDoorBlock;
import net.mcreator.untitledbaldimod.block.Rewarded4ThinkingPosterBlock;
import net.mcreator.untitledbaldimod.block.RedLockerBlock;
import net.mcreator.untitledbaldimod.block.RecyclingPosterBlock;
import net.mcreator.untitledbaldimod.block.ReadPostersBlock;
import net.mcreator.untitledbaldimod.block.PrincipalDoorBlock;
import net.mcreator.untitledbaldimod.block.PlantBlock;
import net.mcreator.untitledbaldimod.block.OutOfOrderPosterBlock;
import net.mcreator.untitledbaldimod.block.OfficeDoorBlock;
import net.mcreator.untitledbaldimod.block.NumbersAreEasyPosterBlock;
import net.mcreator.untitledbaldimod.block.NotebooksPosterBlock;
import net.mcreator.untitledbaldimod.block.LightBlockBlock;
import net.mcreator.untitledbaldimod.block.JanitorBootsPosterBlock;
import net.mcreator.untitledbaldimod.block.GreenLockerBlock;
import net.mcreator.untitledbaldimod.block.ExitSignBlock;
import net.mcreator.untitledbaldimod.block.DetentionPosterBlock;
import net.mcreator.untitledbaldimod.block.DeskBlock;
import net.mcreator.untitledbaldimod.block.ClassroomDoorBlock;
import net.mcreator.untitledbaldimod.block.ChairBlock;
import net.mcreator.untitledbaldimod.block.CellphonePosterBlock;
import net.mcreator.untitledbaldimod.block.CandyPosterBlock;
import net.mcreator.untitledbaldimod.block.CafeteriaTableBlock;
import net.mcreator.untitledbaldimod.block.BoardBlock;
import net.mcreator.untitledbaldimod.block.BlueLockerBlock;
import net.mcreator.untitledbaldimod.block.BeAKidPosterBlock;
import net.mcreator.untitledbaldimod.block.BSODAVendingMachineBlock;
import net.mcreator.untitledbaldimod.block.AttentionPosterBlock;
import net.mcreator.untitledbaldimod.BasicsInGeometryMod;

public class BasicsInGeometryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BasicsInGeometryMod.MODID);
	public static final RegistryObject<Block> SCHOOLHOUSE_CEILING = REGISTRY.register("schoolhouse_ceiling", () -> new SchoolhouseCeilingBlock());
	public static final RegistryObject<Block> SCHOOLHOUSE_FLOOR = REGISTRY.register("schoolhouse_floor", () -> new SchoolhouseFloorBlock());
	public static final RegistryObject<Block> SCHOOLHOUSE_CARPET = REGISTRY.register("schoolhouse_carpet", () -> new SchoolhouseCarpetBlock());
	public static final RegistryObject<Block> SCHOOLHOUSE_WALL_1 = REGISTRY.register("schoolhouse_wall_1", () -> new SchoolhouseWall1Block());
	public static final RegistryObject<Block> SCHOOLHOUSE_WALL_TOP = REGISTRY.register("schoolhouse_wall_top", () -> new SchoolhouseWallTopBlock());
	public static final RegistryObject<Block> SCHOOL_HOUSE_WALL_BOTTOM = REGISTRY.register("school_house_wall_bottom", () -> new SchoolHouseWallBottomBlock());
	public static final RegistryObject<Block> SCHOOL_HOUSE_WALL_2 = REGISTRY.register("school_house_wall_2", () -> new SchoolHouseWall2Block());
	public static final RegistryObject<Block> SCHOOLHOUSE_TILES = REGISTRY.register("schoolhouse_tiles", () -> new SchoolhouseTilesBlock());
	public static final RegistryObject<Block> SCHOOLHOUSE_CEILING_2 = REGISTRY.register("schoolhouse_ceiling_2", () -> new SchoolhouseCeiling2Block());
	public static final RegistryObject<Block> SWINGING_DOOR = REGISTRY.register("swinging_door", () -> new SwingingDoorBlock());
	public static final RegistryObject<Block> CLASSROOM_DOOR = REGISTRY.register("classroom_door", () -> new ClassroomDoorBlock());
	public static final RegistryObject<Block> SCHOOL_FACULTY_DOOR = REGISTRY.register("school_faculty_door", () -> new SchoolFacultyDoorBlock());
	public static final RegistryObject<Block> SUPPLY_CLOSET_DOOR = REGISTRY.register("supply_closet_door", () -> new SupplyClosetDoorBlock());
	public static final RegistryObject<Block> PRINCIPAL_DOOR = REGISTRY.register("principal_door", () -> new PrincipalDoorBlock());
	public static final RegistryObject<Block> OFFICE_DOOR = REGISTRY.register("office_door", () -> new OfficeDoorBlock());
	public static final RegistryObject<Block> SCHOOL_RULES_POSTER = REGISTRY.register("school_rules_poster", () -> new SchoolRulesPosterBlock());
	public static final RegistryObject<Block> RECYCLING_POSTER = REGISTRY.register("recycling_poster", () -> new RecyclingPosterBlock());
	public static final RegistryObject<Block> ATTENTION_POSTER = REGISTRY.register("attention_poster", () -> new AttentionPosterBlock());
	public static final RegistryObject<Block> JANITOR_BOOTS_POSTER = REGISTRY.register("janitor_boots_poster", () -> new JanitorBootsPosterBlock());
	public static final RegistryObject<Block> RED_LOCKER = REGISTRY.register("red_locker", () -> new RedLockerBlock());
	public static final RegistryObject<Block> BLUE_LOCKER = REGISTRY.register("blue_locker", () -> new BlueLockerBlock());
	public static final RegistryObject<Block> SCHOOL_HOUSE_TILES_2 = REGISTRY.register("school_house_tiles_2", () -> new SchoolHouseTiles2Block());
	public static final RegistryObject<Block> SMALL_DESK = REGISTRY.register("small_desk", () -> new SmallDeskBlock());
	public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());
	public static final RegistryObject<Block> CELLPHONE_POSTER = REGISTRY.register("cellphone_poster", () -> new CellphonePosterBlock());
	public static final RegistryObject<Block> SCISSORS_POSTER = REGISTRY.register("scissors_poster", () -> new ScissorsPosterBlock());
	public static final RegistryObject<Block> WD_NO_SQUEE_POSTER = REGISTRY.register("wd_no_squee_poster", () -> new WDNoSqueePosterBlock());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> EXIT_SIGN = REGISTRY.register("exit_sign", () -> new ExitSignBlock());
	public static final RegistryObject<Block> LIGHT_BLOCK = REGISTRY.register("light_block", () -> new LightBlockBlock());
	public static final RegistryObject<Block> BOARD = REGISTRY.register("board", () -> new BoardBlock());
	public static final RegistryObject<Block> GREEN_LOCKER = REGISTRY.register("green_locker", () -> new GreenLockerBlock());
	public static final RegistryObject<Block> NUMBERS_ARE_EASY_POSTER = REGISTRY.register("numbers_are_easy_poster", () -> new NumbersAreEasyPosterBlock());
	public static final RegistryObject<Block> BSODA_VENDING_MACHINE = REGISTRY.register("bsoda_vending_machine", () -> new BSODAVendingMachineBlock());
	public static final RegistryObject<Block> ZESTY_BAR_VENDING_MACHINE = REGISTRY.register("zesty_bar_vending_machine", () -> new ZestyBarVendingMachineBlock());
	public static final RegistryObject<Block> PLANT = REGISTRY.register("plant", () -> new PlantBlock());
	public static final RegistryObject<Block> WINDOW_1 = REGISTRY.register("window_1", () -> new Window1Block());
	public static final RegistryObject<Block> WINDOW_2 = REGISTRY.register("window_2", () -> new Window2Block());
	public static final RegistryObject<Block> CAFETERIA_TABLE = REGISTRY.register("cafeteria_table", () -> new CafeteriaTableBlock());
	public static final RegistryObject<Block> OUT_OF_ORDER_POSTER = REGISTRY.register("out_of_order_poster", () -> new OutOfOrderPosterBlock());
	public static final RegistryObject<Block> NOTEBOOKS_POSTER = REGISTRY.register("notebooks_poster", () -> new NotebooksPosterBlock());
	public static final RegistryObject<Block> READ_POSTERS = REGISTRY.register("read_posters", () -> new ReadPostersBlock());
	public static final RegistryObject<Block> DETENTION_POSTER = REGISTRY.register("detention_poster", () -> new DetentionPosterBlock());
	public static final RegistryObject<Block> REWARDED_4_THINKING_POSTER = REGISTRY.register("rewarded_4_thinking_poster", () -> new Rewarded4ThinkingPosterBlock());
	public static final RegistryObject<Block> CANDY_POSTER = REGISTRY.register("candy_poster", () -> new CandyPosterBlock());
	public static final RegistryObject<Block> BE_A_KID_POSTER = REGISTRY.register("be_a_kid_poster", () -> new BeAKidPosterBlock());
	public static final RegistryObject<Block> SCHOOLHOUSE_FENCE = REGISTRY.register("schoolhouse_fence", () -> new SchoolhouseFenceBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
