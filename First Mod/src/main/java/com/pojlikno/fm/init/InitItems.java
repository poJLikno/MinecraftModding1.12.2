package com.pojlikno.fm.init;

import java.util.ArrayList;
import java.util.List;

import com.pojlikno.fm.items.ItemGreenIngot;
import com.pojlikno.fm.items.ItemGreenberry;
import com.pojlikno.fm.items.ItemGreenberrySeed;
import com.pojlikno.fm.items.tools.ItemGreenAxe;
import com.pojlikno.fm.items.tools.ItemGreenHoe;
import com.pojlikno.fm.items.tools.ItemGreenPickaxe;
import com.pojlikno.fm.items.tools.ItemGreenShovel;
import com.pojlikno.fm.items.tools.ItemGreenSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class InitItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial GREEN_TOOL = EnumHelper.addToolMaterial("green_tool", 3, 3000, 24.f, 5.f, 15);
	
	//Items
	public static final Item GREEN_INGOT = new ItemGreenIngot("green_ingot");
	
	//Foods
	public static final Item GREENBERRY = new ItemGreenberry("greenberry", 8, false);
	
	//Seeds
	public static final Item GREENBERRY_SEED = new ItemGreenberrySeed("greenberry_seed");
	
	//Tools
	public static final Item GREEN_PICKAXE = new ItemGreenPickaxe("green_pickaxe", GREEN_TOOL);
	public static final Item GREEN_SWORD = new ItemGreenSword("green_sword", GREEN_TOOL);
	public static final Item GREEN_AXE = new ItemGreenAxe("green_axe", GREEN_TOOL, 11.f, 1.f);
	public static final Item GREEN_SHOVEL = new ItemGreenShovel("green_shovel", GREEN_TOOL);
	public static final Item GREEN_HOE = new ItemGreenHoe("green_hoe", GREEN_TOOL);
}
