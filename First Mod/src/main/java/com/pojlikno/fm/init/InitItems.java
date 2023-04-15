package com.pojlikno.fm.init;

import java.util.ArrayList;
import java.util.List;

import com.pojlikno.fm.FirstModReference;
import com.pojlikno.fm.items.ItemGreenCoal;
import com.pojlikno.fm.items.ItemGreenIngot;
import com.pojlikno.fm.items.ItemGreenberry;
import com.pojlikno.fm.items.ItemGreenberrySeed;
import com.pojlikno.fm.items.armor.ItemGreenArmor;
import com.pojlikno.fm.items.tools.ItemGreenAxe;
import com.pojlikno.fm.items.tools.ItemGreenHoe;
import com.pojlikno.fm.items.tools.ItemGreenPickaxe;
import com.pojlikno.fm.items.tools.ItemGreenShovel;
import com.pojlikno.fm.items.tools.ItemGreenSword;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class InitItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item GREEN_INGOT = new ItemGreenIngot("green_ingot");
	public static final Item GREEN_COAL = new ItemGreenCoal("green_coal");
	
	//Foods
	public static final Item GREENBERRY = new ItemGreenberry("greenberry", 8, false);
	
	//Seeds
	public static final Item GREENBERRY_SEED = new ItemGreenberrySeed("greenberry_seed");

	//Materials
	public static final ToolMaterial GREEN_TOOL =
			EnumHelper.addToolMaterial("green_tool", 3, 3000, 24.f, 5.f, 15).setRepairItem(new ItemStack(GREEN_INGOT));
	public static final ArmorMaterial GREEN_ARMOR =
			EnumHelper.addArmorMaterial("green_armor", FirstModReference.MOD_ID + ":green",
					40, new int[] { 7, 10, 12, 7 }, 15, 
					SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.f).setRepairItem(new ItemStack(GREEN_INGOT));
	
	//Tools
	public static final Item 
			GREEN_PICKAXE = new ItemGreenPickaxe("green_pickaxe", GREEN_TOOL),
			GREEN_SWORD = new ItemGreenSword("green_sword", GREEN_TOOL),
			GREEN_AXE = new ItemGreenAxe("green_axe", GREEN_TOOL, 11.f, 1.f),
			GREEN_SHOVEL = new ItemGreenShovel("green_shovel", GREEN_TOOL),
			GREEN_HOE = new ItemGreenHoe("green_hoe", GREEN_TOOL);
	
	//Armor
	public static final Item 
			GREEN_HEAD = new ItemGreenArmor("green_head", GREEN_ARMOR, 1, EntityEquipmentSlot.HEAD),
			GREEN_CHESTPLATE = new ItemGreenArmor("green_chestplate", GREEN_ARMOR, 1, EntityEquipmentSlot.CHEST),
			GREEN_LEGS = new ItemGreenArmor("green_legs", GREEN_ARMOR, 2, EntityEquipmentSlot.LEGS),
			GREEN_BOOTS = new ItemGreenArmor("green_boots", GREEN_ARMOR, 1, EntityEquipmentSlot.FEET);
}
