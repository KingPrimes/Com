package com.github.computer.crafting;

import com.github.computer.loader.BlockLoader;
import com.github.computer.register.ItemRegister;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingLoader {

	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
		
	}
	
	/**
	 * 添加合成
	 */
	private static void registerRecipe() {
		
		/*
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.goldenEgg), new Object[]
        {
                "###", "#*#", "###", '#', Items.gold_ingot, '*', Items.egg
        });
        GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.grassBlock), new Object[]
        {
                "##", "##", '#', Blocks.vine
        });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.vine, 4), BlockLoader.grassBlock);
		 */
		
		
	}
	
	/**
	 * 添加熔炼
	 */
	private static void registerSmelting() {
		GameRegistry.addSmelting(BlockLoader.copper , new ItemStack(ItemRegister.copper), 0F);
		GameRegistry.addSmelting(BlockLoader.tin , new ItemStack(ItemRegister.tin), 0F);
	}
	
	/**
	 * 添加燃料
	 */
	private static void registerFuel() {
		/*
		 GameRegistry.registerFuelHandler(new IFuelHandler()
	        {
	            @Override
	            public int getBurnTime(ItemStack fuel)
	            {
	                return Items.diamond != fuel.getItem() ? 0 : 12800;
	            }
	        });
	      */
		
	}
	
	
}
