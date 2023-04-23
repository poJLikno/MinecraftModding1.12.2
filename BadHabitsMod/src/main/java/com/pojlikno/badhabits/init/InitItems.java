package com.pojlikno.badhabits.init;

import java.util.ArrayList;
import java.util.List;

import com.pojlikno.badhabits.items.ItemDryTobaccoLeaves;
import com.pojlikno.badhabits.items.ItemActivatedCarbon;
import com.pojlikno.badhabits.items.ItemCigarette;
import com.pojlikno.badhabits.items.ItemCigaretteButt;
import com.pojlikno.badhabits.items.ItemCigarettePack;
import com.pojlikno.badhabits.items.ItemTobaccoLeaves;
import com.pojlikno.badhabits.items.ItemTobaccoSeeds;

import net.minecraft.item.Item;

public class InitItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Items
	public static final Item CIGARETTE_PACK = new ItemCigarettePack("cigarette_pack");//
	
	// Ingredients
	public static final Item DRY_TOBACCO_LEAVES = new ItemDryTobaccoLeaves("dry_tobacco_leaves");
	
	// Food
	public static final Item TOBACCO_LEAVES = new ItemTobaccoLeaves("tobacco_leaves", 1, false);
	public static final Item CIGARETTE = new ItemCigarette("cigarette", 0, false);
	public static final Item ACTIVATED_CARBON = new ItemActivatedCarbon("activated_carbon", 0, false);//
	
	// Seeds
	public static final Item TOBACCO_SEEDS = new ItemTobaccoSeeds("tobacco_seeds");
	
	// Trash
	public static final Item CIGARETTE_BUTT = new ItemCigaretteButt("cigarette_butt");//
}
