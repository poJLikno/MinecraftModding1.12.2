package com.pojlikno.badhabits;

import com.pojlikno.badhabits.proxy.CommonProxy;
import com.pojlikno.badhabits.recipes.SmeltingRecipes;
import com.pojlikno.badhabits.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, 
	name = Reference.MOD_NAME, 
	version = Reference.VERSION, 
	acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class BadHabits {
	@Instance(Reference.MOD_ID)
	public static BadHabits instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		SmeltingRecipes.registerRecipes();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {
		
	}
}
