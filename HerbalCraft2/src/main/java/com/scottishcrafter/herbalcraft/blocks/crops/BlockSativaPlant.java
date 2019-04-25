package com.scottishcrafter.herbalcraft.blocks.crops;
import net.minecraft.block.BlockCrops;
import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockSativaPlant extends BlockCrops {
	 
	public BlockSativaPlant(String name)
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
		return ItemInit.SEEDS_SATIVA;
	}

	@Override
	protected Item getCrop()
	{
		return ItemInit.CROPDROP_SATIVA;
	
	}
	
	
}