package com.scottishcrafter.herbalcraft.world.type;

import com.scottishcrafter.herbalcraft.init.BiomeInit;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class WorldTypeCanna extends WorldType
{
	public WorldTypeCanna() 
	{
		super("Cannaland");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		BiomeProvider provider = new BiomeProviderSingle(BiomeInit.CANNALAND);
		return provider;
	}
}
