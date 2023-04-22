package com.pojlikno.fm.items;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGreenberry extends ItemFood {
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
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		//entityLiving.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 1200/*1 minute*/, 15, false, false));
		
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
