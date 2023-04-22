package com.pojlikno.fm.items.tools;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.item.ItemPickaxe;

public class ItemGreenPickaxe extends ItemPickaxe {
	public ItemGreenPickaxe(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_COMBAT_TAB);
		
		InitItems.ITEMS.add(this);
	}
}
