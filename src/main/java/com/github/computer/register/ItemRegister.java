package com.github.computer.register;


import com.github.computer.item.ItemBronze;
import com.github.computer.item.ItemCopper;
import com.github.computer.item.ItemRudder;
import com.github.computer.item.ItemTin;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * 
 * 作用:注册物品类
 * @author KingPreims
 *
 */
@Mod.EventBusSubscriber
public class ItemRegister {
	
	public static Item rudder = new ItemRudder("rudder_item");
	public static Item copper = new ItemCopper("copper_item");
	public static Item tin = new ItemTin("tin_item");
	public static Item bronze = new ItemBronze("bronze_item");
	
	
	/**
	 * 注册物品实例
	 * @param event
	 */
	public ItemRegister(FMLPreInitializationEvent event) {
		registerItem(rudder);
		registerItem(copper);
		registerItem(tin);
		registerItem(bronze);
	}
	
	/**
	 * 注册物品模型贴图
	 */
	@SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(rudder);
        registerRender(copper);
        registerRender(tin);
        registerRender(bronze);
    }
	
	 @SideOnly(Side.CLIENT)
	 private static void registerRender(Item item){
	        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
	        ModelLoader.setCustomModelResourceLocation(item, 0, model);
	         
	 }
	
	 @SideOnly(Side.CLIENT)
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		 //OreDictionary.registerOre(item.getUnlocalizedName(), item);
	}


}
