
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.untitledbaldimod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.untitledbaldimod.block.entity.GreenLockerBlockEntity;
import net.mcreator.untitledbaldimod.BasicsInGeometryMod;

public class BasicsInGeometryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BasicsInGeometryMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GREEN_LOCKER = register("green_locker", BasicsInGeometryModBlocks.GREEN_LOCKER, GreenLockerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
