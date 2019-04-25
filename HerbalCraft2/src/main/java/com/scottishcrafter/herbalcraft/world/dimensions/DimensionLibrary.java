package com.scottishcrafter.herbalcraft.world.dimensions;

import com.scottishcrafter.herbalcraft.init.BiomeInit;
import com.scottishcrafter.herbalcraft.init.DimensionInit;
import com.scottishcrafter.herbalcraft.world.generation.chunks.ChunkGeneratorNetherTemplate;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionLibrary extends WorldProvider
{
	public DimensionLibrary() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.CANNALAND);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.CANNALAND;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorNetherTemplate(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
