package com.github.computer.register;


import com.github.computer.loader.BlockLoader;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ItemRenderLoader {
	
	

	public ItemRenderLoader(FMLPreInitializationEvent event)
    {
        ItemRegister.registerRenders();
        BlockLoader.registerRenders();
    }
	
}
