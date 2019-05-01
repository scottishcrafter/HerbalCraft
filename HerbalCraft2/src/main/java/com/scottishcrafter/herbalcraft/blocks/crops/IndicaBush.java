package com.scottishcrafter.herbalcraft.blocks.crops;

import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;

public class IndicaBush extends BlockCrops {
	
	
	
	public IndicaBush(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		
		
	}
	
	
	@Override
	protected Item getSeed()
	{
		return ItemInit.SEEDS_INDICA;
	}

	@Override
	protected Item getCrop()
	{
		return ItemInit.CROPDROP_INDICA;
	}
	
	


	@Override
	protected PropertyInteger getAgeProperty()
	    {
	        return AGE;
	    }
	
	@Override
	public int getMaxAge()
	    {
	        return 4;
	    }


}