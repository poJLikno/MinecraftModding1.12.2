package com.pojlikno.badhabits.items;

import com.pojlikno.badhabits.init.InitItems;
import com.pojlikno.badhabits.init.InitTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemActivatedCarbon extends ItemFood {

	public ItemActivatedCarbon(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setAlwaysEdible();
		this.setCreativeTab(InitTabs.BAD_HABITS_TAB);
		
		InitItems.ITEMS.add(this);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		entityLiving.clearActivePotions();
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
