package com.scottishcrafter.herbalcraft.blocks.crops;

import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockMedicinalPlant extends BlockCrops {
	
	public BlockMedicinalPlant(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		
		
	}
	
	@Override
	protected PropertyInteger getAgeProperty()
    {
        return AGE;
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
	       
	@Override
	public int getMaxAge()
    {
        return 4;
    }

}