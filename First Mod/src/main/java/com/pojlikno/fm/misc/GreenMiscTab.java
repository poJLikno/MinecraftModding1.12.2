package com.pojlikno.fm.misc;

import com.pojlikno.fm.init.InitBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GreenMiscTab extends CreativeTabs {
	public GreenMiscTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(InitBlocks.GREEN_BLOCK));
	}
}
