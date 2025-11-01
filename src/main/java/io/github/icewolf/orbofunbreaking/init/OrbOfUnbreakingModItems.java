/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.icewolf.orbofunbreaking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.icewolf.orbofunbreaking.item.OrbOfUnbreakingItem;
import io.github.icewolf.orbofunbreaking.OrbOfUnbreakingMod;

public class OrbOfUnbreakingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OrbOfUnbreakingMod.MODID);
	public static final RegistryObject<Item> ORB_OF_UNBREAKING = REGISTRY.register("orb_of_unbreaking", OrbOfUnbreakingItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}