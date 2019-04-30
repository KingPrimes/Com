package com.github.computer.creativetab;

import com.github.computer.register.ItemRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsFMLComputer extends CreativeTabs{

	public CreativeTabsFMLComputer() {
		super("computer");
		this.setBackgroundImageName("tab_items");
	}

	@Override
	public ItemStack getTabIconItem() {
		 return new ItemStack(ItemRegister.rudder, 1);
	}

}
