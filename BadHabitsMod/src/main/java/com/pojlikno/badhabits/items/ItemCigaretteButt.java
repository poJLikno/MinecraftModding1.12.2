package com.pojlikno.badhabits.items;

import com.pojlikno.badhabits.init.InitItems;
import com.pojlikno.badhabits.init.InitTabs;

import net.minecraft.item.Item;

public class ItemCigaretteButt extends Item {
	public ItemCigaretteButt(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(InitTabs.BAD_HABITS_TAB);
		
		InitItems.ITEMS.add(this);
	}
}
