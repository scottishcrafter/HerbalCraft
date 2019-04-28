package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HCArmouryTab extends CreativeTabs
{
	public HCArmouryTab() 
	{
		super("hcarmoury");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SUPER_RESIN_CHESTPLATE);
	}
}
