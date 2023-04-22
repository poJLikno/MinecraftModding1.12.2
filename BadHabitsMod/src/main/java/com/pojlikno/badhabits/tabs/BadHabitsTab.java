package com.pojlikno.badhabits.tabs;

import com.pojlikno.badhabits.init.InitItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BadHabitsTab extends CreativeTabs {
	public BadHabitsTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(InitItems.CIGARETTE);
	}
}
