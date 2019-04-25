package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HerbalCraftTab extends CreativeTabs
{
	public HerbalCraftTab() 
	{
		super("herbalcraft");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.HEMP_RAW);
	}
}
