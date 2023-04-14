package com.pojlikno.fm.items.tools;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;
import com.pojlikno.fm.utils.interfaces.IHasModel;

import net.minecraft.item.ItemPickaxe;

public class ItemGreenPickaxe extends ItemPickaxe implements IHasModel {
	
	public ItemGreenPickaxe(String name, ToolMaterial material) {
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
