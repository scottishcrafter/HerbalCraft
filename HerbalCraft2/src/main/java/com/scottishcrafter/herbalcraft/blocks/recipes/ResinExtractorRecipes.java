package com.scottishcrafter.herbalcraft.blocks.recipes;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.item.ItemStack;

public class ResinExtractorRecipes 
{	
	private static final ResinExtractorRecipes INSTANCE = new ResinExtractorRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static ResinExtractorRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private ResinExtractorRecipes() 
	{
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_REDSTONE), new ItemStack(ItemInit.HEMP_RAW), new ItemStack(ItemInit.RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_REDSTONE), new ItemStack(ItemInit.HEMP_RAW_HYBRID), new ItemStack(ItemInit.RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_REDSTONE), new ItemStack(ItemInit.HEMP_RAW_INDICA), new ItemStack(ItemInit.RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_REDSTONE), new ItemStack(ItemInit.HEMP_RAW_MEDICINAL), new ItemStack(ItemInit.RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_REDSTONE), new ItemStack(ItemInit.HEMP_RAW_SATIVA), new ItemStack(ItemInit.RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_DIAMOND), new ItemStack(ItemInit.HEMP_RAW), new ItemStack(ItemInit.SUPER_RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_DIAMOND), new ItemStack(ItemInit.HEMP_RAW_HYBRID), new ItemStack(ItemInit.SUPER_RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_DIAMOND), new ItemStack(ItemInit.HEMP_RAW_INDICA), new ItemStack(ItemInit.SUPER_RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_DIAMOND), new ItemStack(ItemInit.HEMP_RAW_MEDICINAL), new ItemStack(ItemInit.SUPER_RESIN), 5.0F);
		addResinExtractorRecipe(new ItemStack(ItemInit.CRUSHED_DIAMOND), new ItemStack(ItemInit.HEMP_RAW_SATIVA), new ItemStack(ItemInit.SUPER_RESIN), 5.0F);
		
		
	}

	
	public void addResinExtractorRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getExtractingResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getExtractingResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getExtractingExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}
