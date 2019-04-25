package com.scottishcrafter.herbalcraft.blocks.slabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSlabDoubleBase extends BlockSlabBase
{
	public BlockSlabDoubleBase(String name, Material materialIn, CreativeTabs tab, BlockSlab half) 
	{
		super(name, materialIn, tab, half);
	}

	@Override
	public boolean isDouble() 
	{	
		return true;
	}
}
