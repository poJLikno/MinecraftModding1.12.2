package com.pojlikno.badhabits.items;

import com.pojlikno.badhabits.init.InitItems;
import com.pojlikno.badhabits.init.InitTabs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTobaccoLeaves extends ItemFood {

	public ItemTobaccoLeaves(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.BAD_HABITS_TAB);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 20, 0, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 0, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, 100, 0, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.HASTE, 100, 0, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 100, 0, false, false));
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
}
