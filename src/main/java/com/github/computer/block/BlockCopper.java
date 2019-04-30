package com.github.computer.block;


import com.github.computer.creativetab.CreativeTabsLoader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {

	public BlockCopper(String name) {
		super(Material.ROCK);

		//设置注册名称
		this.setRegistryName(name);
		
		//设置非本地话ID用于内部识别
		this.setUnlocalizedName(name);
		
	    //方法用于设定方块的硬度，如黑曜石是50，铁块5，金块3，圆石2，石头1.5，南瓜1，泥土0.5，甘蔗0，基岩-1。
		this.setHardness(1.5F);
		
		//pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）
		this.setHarvestLevel("pickaxe",1);
		
		//方法用于设定方块的光照，其周围的光照为设定值x15，如岩浆1.0，对应15，红石火把0.5，对应7.5。 
		//this.setLightLevel(15);
		  
		//方法用于设定方块的透光率，数值越大透光率越低，如树叶和蜘蛛网是1，水和冰3。 
		//this.setLightOpacity(1);
		  
		//方法用于设定方块的爆炸抗性，如木头的抗性为4，石头为10，黑曜石为2000，基岩为6000000。 
		//this.setResistance(2000);

		// 该物品在哪一个创造物品栏
	    this.setCreativeTab(CreativeTabsLoader.ctabFMLComputer);
	}


}
