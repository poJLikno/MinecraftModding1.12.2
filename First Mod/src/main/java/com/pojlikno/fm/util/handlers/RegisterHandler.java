package com.pojlikno.fm.util.handlers;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.recipes.SmeltingRecipes;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
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
			FirstMod.proxy.registerItemRenderer(item, 0, "inventory");
		}
		
		for (Block block : InitBlocks.BLOCKS) {
			FirstMod.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
		}
	}
	
	public static void preInitRegistries() {}
	
	public static void initRegistries() {}
	
	public static void postInitRegistries() {}
	
	public static void serverRegistries(FMLServerStartingEvent event) {}
}
