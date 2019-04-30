package com.github.computer.loader;

import com.github.computer.block.BlockCopper;
import com.github.computer.block.BlockTin;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * 作用:注册方块类
 * @author KingPreims
 *
 */
@Mod.EventBusSubscriber
public class BlockLoader {
	
	public static BlockCopper copper = new BlockCopper("copper_ore");
	public static BlockTin tin = new BlockTin("tin_ore");
	
	/**
	 * 注册方块与物体(方块)ALL
	 * @param block	
	 */
	public BlockLoader (FMLPreInitializationEvent event) {
		register(copper);
		register(tin);
		

	}
	
	/**
	 * 给所有方块物体添加模型贴图
	 */
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(copper);
        registerRender(tin);
    }
	
	
	/**
	 * 注册方块与物体(方块)
	 * @param block	
	 */
	@SideOnly(Side.CLIENT)
    public static void register(Block block)
    {
		//注册方块实体
		 ForgeRegistries.BLOCKS.register(block);
		//注册方块拿在手上的物品实体
		 ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		 //添加矿物词典
		// OreDictionary.registerOre(block.getUnlocalizedName(), block);
		// OreDictionary.registerOre(block.getUnlocalizedName(), new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
	
	
	
	/**
	 * 给方块物体添加模型贴图
	 * @param block
	 */
	 @SideOnly(Side.CLIENT)
	    private static void registerRender(Block block)
	    {
		 		   ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "inventory");
		 		   ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, model);
		 	       
	    }

}
