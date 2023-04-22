package com.pojlikno.badhabits.items;

import com.pojlikno.badhabits.init.InitItems;
import com.pojlikno.badhabits.init.InitTabs;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemCigarette extends ItemFood {
	public ItemCigarette(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setMaxDamage(3-1);
		this.setAlwaysEdible();
		this.setCreativeTab(InitTabs.BAD_HABITS_TAB);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(this, stack);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));

            if (entityplayer instanceof EntityPlayerMP)
            {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
            }
        }

		entityLiving.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 0, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, 400, 2, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.HASTE, 400, 2, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 400, 2, false, false));
		stack.damageItem(1, entityLiving);
		
        return stack;
	}
}
