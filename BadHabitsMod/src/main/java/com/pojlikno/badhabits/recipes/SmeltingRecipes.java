package com.pojlikno.badhabits.recipes;

import com.pojlikno.badhabits.init.InitItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void registerRecipes() {
		GameRegistry.addSmelting(new ItemStack(InitItems.TOBACCO_LEAVES), new ItemStack(InitItems.DRY_TOBACCO_LEAVES), 0.2f);
	}
}
