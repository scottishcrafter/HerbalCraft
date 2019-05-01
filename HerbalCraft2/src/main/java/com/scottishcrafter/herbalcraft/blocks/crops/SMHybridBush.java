package com.scottishcrafter.herbalcraft.blocks.crops;


import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;

public class SMHybridBush extends BlockCrops {
	
	public SMHybridBush(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		
		
	}
	
	@Override
	protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }

	@Override
	protected Item getSeed()
	{
	return ItemInit.SEEDS_HYBRID_SM;
	}

	@Override
	protected Item getCrop()
	{
		return ItemInit.CROPDROP_HYBRID_SM;
	}
	
	@Override
	public int getMaxAge()
    {
        return 4;
    }
}