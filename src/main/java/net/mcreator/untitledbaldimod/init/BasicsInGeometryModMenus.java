
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.untitledbaldimod.world.inventory.GreenLockerGUIMenu;
import net.mcreator.untitledbaldimod.BasicsInGeometryMod;

public class BasicsInGeometryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BasicsInGeometryMod.MODID);
	public static final RegistryObject<MenuType<GreenLockerGUIMenu>> GREEN_LOCKER_GUI = REGISTRY.register("green_locker_gui", () -> IForgeMenuType.create(GreenLockerGUIMenu::new));
}
