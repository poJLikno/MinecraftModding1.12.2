package com.pojlikno.fm.items;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;
import com.pojlikno.fm.utils.interfaces.IHasModel;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemGreenberry extends ItemFood implements IHasModel  {
	
	public ItemGreenberry(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_MISC_TAB);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.EAT;
	}
	
	@Override
	public void registerModels() {
		FirstMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
