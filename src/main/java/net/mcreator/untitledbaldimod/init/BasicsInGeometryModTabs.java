
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.untitledbaldimod.BasicsInGeometryMod;

public class BasicsInGeometryModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BasicsInGeometryMod.MODID);
	public static final RegistryObject<CreativeModeTab> BASICS_IN_GEOMETRY = REGISTRY.register("basics_in_geometry",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.basics_in_geometry.basics_in_geometry")).icon(() -> new ItemStack(BasicsInGeometryModBlocks.SCHOOLHOUSE_WALL_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_CEILING.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_FLOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_CARPET.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_WALL_1.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_WALL_TOP.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOL_HOUSE_WALL_BOTTOM.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOL_HOUSE_WALL_2.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_TILES.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_CEILING_2.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SWINGING_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.CLASSROOM_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOL_FACULTY_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SUPPLY_CLOSET_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.PRINCIPAL_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.OFFICE_DOOR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOL_RULES_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.RECYCLING_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.ATTENTION_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.JANITOR_BOOTS_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.RED_LOCKER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.BLUE_LOCKER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOL_HOUSE_TILES_2.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SMALL_DESK.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.DESK.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.CELLPHONE_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCISSORS_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.WD_NO_SQUEE_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.CHAIR.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.EXIT_SIGN.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.LIGHT_BLOCK.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.BOARD.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.NUMBERS_ARE_EASY_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.BSODA_VENDING_MACHINE.get().asItem());
				tabData.accept(BasicsInGeometryModItems.BSODA.get());
				tabData.accept(BasicsInGeometryModBlocks.ZESTY_BAR_VENDING_MACHINE.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.PLANT.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.WINDOW_1.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.WINDOW_2.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.CAFETERIA_TABLE.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.OUT_OF_ORDER_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.NOTEBOOKS_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.READ_POSTERS.get().asItem());
				tabData.accept(BasicsInGeometryModItems.ZESTY_BAR.get());
				tabData.accept(BasicsInGeometryModBlocks.DETENTION_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModItems.QUARTER.get());
				tabData.accept(BasicsInGeometryModBlocks.REWARDED_4_THINKING_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.CANDY_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.BE_A_KID_POSTER.get().asItem());
				tabData.accept(BasicsInGeometryModBlocks.SCHOOLHOUSE_FENCE.get().asItem());
			})

					.build());
}
