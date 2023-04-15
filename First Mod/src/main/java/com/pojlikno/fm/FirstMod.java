package com.pojlikno.fm;

import com.pojlikno.fm.FirstModReference;
import com.pojlikno.fm.proxy.CommonProxy;
import com.pojlikno.fm.utils.handlers.RegisterHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FirstModReference.MOD_ID, 
	name = FirstModReference.MOD_NAME, 
	version = FirstModReference.VERSION, 
	acceptedMinecraftVersions = FirstModReference.ACCEPTED_VERSIONS)
public class FirstMod {
	@Instance(FirstModReference.MOD_ID)
	public static FirstMod instance;
	
	@SidedProxy(clientSide = FirstModReference.CLIENT_PROXY_CLASS, serverSide = FirstModReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RegisterHandler.otherRegister();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
