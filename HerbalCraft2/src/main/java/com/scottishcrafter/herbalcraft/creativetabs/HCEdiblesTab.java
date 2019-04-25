package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HCEdiblesTab extends CreativeTabs
{
	public HCEdiblesTab() 
	{
		super("hcedibles");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.COOKIE_CBD);
	}
}
