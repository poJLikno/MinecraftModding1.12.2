package com.pojlikno.fm.utils;

import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {
	public static void registerRecipes() {
		GameRegistry.addSmelting(new ItemStack(InitItems.GREEN_INGOT), new ItemStack(InitItems.GREEN_COAL), 1.F);
		GameRegistry.addSmelting(new ItemStack(InitBlocks.GREEN_BLOCK), new ItemStack(InitItems.GREEN_INGOT, 4), 1.F);
	}
}
