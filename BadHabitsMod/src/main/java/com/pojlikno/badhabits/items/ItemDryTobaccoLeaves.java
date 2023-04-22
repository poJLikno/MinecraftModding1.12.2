package com.pojlikno.badhabits.items;

import com.pojlikno.badhabits.init.InitItems;
import com.pojlikno.badhabits.init.InitTabs;

import net.minecraft.item.Item;

public class ItemDryTobaccoLeaves extends Item {
	public ItemDryTobaccoLeaves(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.BAD_HABITS_TAB);
		
		InitItems.ITEMS.add(this);
	}
}