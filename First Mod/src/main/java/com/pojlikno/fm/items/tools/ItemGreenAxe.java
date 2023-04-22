package com.pojlikno.fm.items.tools;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemGreenAxe extends ItemAxe {
	public ItemGreenAxe(String name, ToolMaterial material, float damage, float speed) {
		super(material, damage - 1.f, speed - 4.f);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_COMBAT_TAB);
		
		InitItems.ITEMS.add(this);
	}
}
