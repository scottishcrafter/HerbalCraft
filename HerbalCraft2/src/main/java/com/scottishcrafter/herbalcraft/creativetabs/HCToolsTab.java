package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HCToolsTab extends CreativeTabs
{
	public HCToolsTab() 
	{
		super("hctools");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SUPER_RESIN_SWORD);
	}
}
