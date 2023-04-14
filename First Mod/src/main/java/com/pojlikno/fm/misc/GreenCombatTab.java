package com.pojlikno.fm.misc;

import com.pojlikno.fm.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GreenCombatTab extends CreativeTabs {
	
	public GreenCombatTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitItems.GREEN_SWORD);
	}
}
