package com.scottishcrafter.herbalcraft.blocks.crops;

import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class HempCrop extends CropBase {
	
	
	public HempCrop(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
		
		
	}
	
	
	@Override
	protected Item getSeed()
	{
		return ItemInit.SEEDS_HEMP;
	}

	@Override
	protected Item getCrop()
	{
		return ItemInit.CROPDROP_HEMP;
	}


}