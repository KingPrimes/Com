package com.github.computer.item;

import com.github.computer.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;

public class ItemTin extends Item{
	
	public ItemTin(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabsLoader.ctabFMLComputer);
	}

}
