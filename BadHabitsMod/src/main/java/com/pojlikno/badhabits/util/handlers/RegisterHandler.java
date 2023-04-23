package com.pojlikno.badhabits.util.handlers;

import com.pojlikno.badhabits.BadHabits;
import com.pojlikno.badhabits.init.InitBlocks;
import com.pojlikno.badhabits.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegisterHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(InitItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(InitBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : InitItems.ITEMS) {
			BadHabits.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for (Block block : InitBlocks.BLOCKS) {
			BadHabits.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
	
	@SubscribeEvent
	public static void onFarmlandTrampleEvent(BlockEvent.FarmlandTrampleEvent event) {
		Iterable<ItemStack> armorInventoryList;
		armorInventoryList = event.getEntity().getArmorInventoryList();
        for (ItemStack itemStack : armorInventoryList) {
        	if (itemStack.getItem() instanceof ItemArmor) {
        		ItemArmor amourItem = (ItemArmor)itemStack.getItem();
        		if (amourItem.getEquipmentSlot() == EntityEquipmentSlot.FEET && amourItem == Items.LEATHER_BOOTS) {
        			event.setCanceled(true);
        		}
        	} 
        } 
	}
	
	public static void preInitRegistries() {}
	
	public static void initRegistries() {}
	
	public static void postInitRegistries() {}
	
	public static void serverRegistries(FMLServerStartingEvent event) {}
}
