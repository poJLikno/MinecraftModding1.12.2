package com.pojlikno.badhabits.recipes;

import com.pojlikno.badhabits.init.InitItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void registerRecipes() {
		GameRegistry.addSmelting(new ItemStack(InitItems.TOBACCO_LEAVES), new ItemStack(InitItems.DRY_TOBACCO_LEAVES), 0.2f);
		GameRegistry.addSmelting(new ItemStack(Items.COAL, 1, 0), new ItemStack(InitItems.ACTIVATED_CARBON), 0.2f);
		GameRegistry.addSmelting(new ItemStack(Items.COAL, 1, 1), new ItemStack(InitItems.ACTIVATED_CARBON), 0.2f);
	}
}
