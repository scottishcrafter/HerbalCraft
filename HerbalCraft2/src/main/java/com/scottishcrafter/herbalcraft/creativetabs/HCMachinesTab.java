package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HCMachinesTab extends CreativeTabs
{
	public HCMachinesTab() 
	{
		super("hcmachines");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.RESIN);
	}
}
