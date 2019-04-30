package com.github.computer;

import com.github.computer.proxy.CommonProxy;
import com.github.computer.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.NAME,version = Reference.MOD_VERSION,acceptedMinecraftVersions = Reference.MINECRAFT_VERSION)
public class Computer {
	
	
	@Instance(Reference.MOD_ID)
	public static Computer instance;
	
	@SidedProxy(clientSide = Reference.CLIENTSIDE_CLASS,serverSide = Reference.SERVERSIDE_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);

	}
	

}
