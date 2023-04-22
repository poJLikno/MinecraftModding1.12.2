package com.pojlikno.fm.items;

import com.google.common.collect.ImmutableMap;
import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.animation.ITimeValue;

public class ItemGreenCoal extends ItemFood {
	public ItemGreenCoal(String name) {
		super(0, false);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_MISC_TAB);
		this.setMaxDamage(3 - 1);
		this.setAlwaysEdible();
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 2400;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		stack.damageItem(1, entityLiving);
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, 400, 3, false, false));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 0, false, false));
		stack.grow(1);
		//stack.setCount(stack.getCount() + 1);
		return super.onItemUseFinish(stack, worldIn, entityLiving);
	}
	
	/*public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.EAT;
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        itemstack.damageItem(1, playerIn);
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 400, 3, false, false));
        playerIn.addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 1, 0, false, false));
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }*/
}
