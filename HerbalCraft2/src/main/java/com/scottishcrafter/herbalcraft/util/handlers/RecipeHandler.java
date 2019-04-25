package com.scottishcrafter.herbalcraft.util.handlers;


import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerSmelting()
	{
		//Hemp Dried
		GameRegistry.addSmelting(ItemInit.HEMP_RAW, new ItemStack(ItemInit.HEMP_DRIED), 0F);
		GameRegistry.addSmelting(ItemInit.HEMP_RAW_INDICA, new ItemStack(ItemInit.HEMP_DRIED_INDICA), 0F);
		GameRegistry.addSmelting(ItemInit.HEMP_RAW_SATIVA, new ItemStack(ItemInit.HEMP_DRIED_SATIVA), 0F);
		GameRegistry.addSmelting(ItemInit.HEMP_RAW_MEDICINAL, new ItemStack(ItemInit.HEMP_DRIED_MEDICINAL), 0F);
		GameRegistry.addSmelting(ItemInit.HEMP_RAW_HYBRID, new ItemStack(ItemInit.HEMP_DRIED_HYBRID), 0F);
		GameRegistry.addSmelting(ItemInit.HEMP_MULCH, new ItemStack(ItemInit.HEMP_PAPER), 0F);
		
		//Hemp Ingot
		GameRegistry.addSmelting(ItemInit.HEMP_INGOT_RAW, new ItemStack(ItemInit.HEMP_INGOT), 1F);
		
		//Toasted Seeds
		GameRegistry.addSmelting(ItemInit.SEEDS_HEMP, new ItemStack(ItemInit.SEEDS_TOASTED_HEMP), 0F);
		GameRegistry.addSmelting(ItemInit.SEEDS_HYBRID, new ItemStack(ItemInit.SEEDS_TOASTED_HYBRID), 0F);
		GameRegistry.addSmelting(ItemInit.SEEDS_INDICA, new ItemStack(ItemInit.SEEDS_TOASTED_INDICA), 0F);
		GameRegistry.addSmelting(ItemInit.SEEDS_MEDICINAL, new ItemStack(ItemInit.SEEDS_TOASTED_MEDICINAL), 0F);
		GameRegistry.addSmelting(ItemInit.SEEDS_SATIVA, new ItemStack(ItemInit.SEEDS_TOASTED_SATIVA), 0F);
		
		//Gelatin
		GameRegistry.addSmelting(new ItemStack(Items.DYE, (int) (1), 15), new ItemStack(ItemInit.GELATIN, (int) (1)), 0F);
	}

}
