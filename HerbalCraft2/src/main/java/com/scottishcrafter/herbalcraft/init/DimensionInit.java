package com.scottishcrafter.herbalcraft.init;

import com.scottishcrafter.herbalcraft.util.ModConfiguration;
import com.scottishcrafter.herbalcraft.world.dimensions.DimensionLibrary;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType CANNALAND = DimensionType.register("Cannaland", "_cannaland", ModConfiguration.DIMENSION_CANNALAND_ID, DimensionLibrary.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(ModConfiguration.DIMENSION_CANNALAND_ID, CANNALAND);
	}
}
