package com.scottishcrafter.herbalcraft.blocks.crops;

import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.item.Item;

public class MedicinalBush extends HCBush {
	
	public MedicinalBush(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		
		
	}
	
	
	@Override
	protected Item getSeed()
	{
		return ItemInit.SEEDS_MEDICINAL;
	}

	@Override
	protected Item getCrop()
	{
		return ItemInit.CROPDROP_MEDICINAL;
	}
	       

}