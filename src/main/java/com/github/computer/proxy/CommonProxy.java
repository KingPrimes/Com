package com.github.computer.proxy;




import com.github.computer.crafting.CraftingLoader;
import com.github.computer.creativetab.CreativeTabsLoader;
import com.github.computer.loader.BlockLoader;
import com.github.computer.register.ItemRegister;
import com.github.computer.worldgen.WorldGeneratorGlowstone;
import com.github.computer.worldgen.WorldGeneratorLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	
	
	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsLoader(event);
		new ItemRegister(event);
		new BlockLoader(event);
		new CraftingLoader();
		WorldGeneratorGlowstone.init();
		//new WorldGeneratorLoader();
	}
	
	
	
	public void init(FMLInitializationEvent event) {
		

	}
	
	
	public void postInit(FMLPostInitializationEvent event) {
		

	}
	
	
	
}
