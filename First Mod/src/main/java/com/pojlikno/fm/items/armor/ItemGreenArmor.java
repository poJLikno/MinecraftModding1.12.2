package com.pojlikno.fm.items.armor;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemGreenArmor extends ItemArmor {
	public ItemGreenArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_COMBAT_TAB);
		
		InitItems.ITEMS.add(this);
	}
}
