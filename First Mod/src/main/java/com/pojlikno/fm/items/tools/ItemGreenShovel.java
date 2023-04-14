package com.pojlikno.fm.items.tools;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;
import com.pojlikno.fm.utils.interfaces.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemGreenShovel extends ItemSpade implements IHasModel {
	
	public ItemGreenShovel(String name, ToolMaterial material) {
		super(material);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_COMBAT_TAB);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		FirstMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}