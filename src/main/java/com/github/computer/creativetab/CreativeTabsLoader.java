package com.github.computer.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {

	public static CreativeTabs ctabFMLComputer;
	
	public CreativeTabsLoader(FMLPreInitializationEvent event) {
		ctabFMLComputer = new CreativeTabsFMLComputer();
	}
	
}
