package com.pojlikno.fm.items;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGreenIngot extends Item {
	public ItemGreenIngot(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_MISC_TAB);
		
		InitItems.ITEMS.add(this);
	}
}
