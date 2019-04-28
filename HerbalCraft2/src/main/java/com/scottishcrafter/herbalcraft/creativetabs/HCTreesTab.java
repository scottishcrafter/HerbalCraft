package com.scottishcrafter.herbalcraft.creativetabs;

import com.scottishcrafter.herbalcraft.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HCTreesTab extends CreativeTabs
{
	public HCTreesTab() 
	{
		super("hctrees");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.HEMP_SAPLING));
	}
}
