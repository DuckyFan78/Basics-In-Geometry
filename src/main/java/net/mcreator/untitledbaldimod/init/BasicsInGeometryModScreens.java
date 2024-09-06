
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.untitledbaldimod.client.gui.GreenLockerGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BasicsInGeometryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BasicsInGeometryModMenus.GREEN_LOCKER_GUI.get(), GreenLockerGUIScreen::new);
		});
	}
}
