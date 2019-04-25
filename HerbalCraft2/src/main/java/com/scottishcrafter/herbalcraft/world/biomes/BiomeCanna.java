package com.scottishcrafter.herbalcraft.world.biomes;

import com.scottishcrafter.herbalcraft.entity.EntityStonedCow;
import com.scottishcrafter.herbalcraft.entity.EntityStonedPig;
import com.scottishcrafter.herbalcraft.world.generation.WorldGenCustomTrees;
import com.scottishcrafter.herbalcraft.entity.EntityStonedChicken;
import net.minecraft.world.biome.Biome;

public class BiomeCanna extends Biome 
{
	public BiomeCanna() 
	{
		super(new BiomeProperties("Canna").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		
		//topBlock = BlockInit.COPPER_DIRT.getDefaultState();
		//fillerBlock = BlockInit.COPPER_ORE.getDefaultState();	
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityStonedCow.class, 5, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityStonedPig.class, 5, 1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityStonedChicken.class, 5, 1, 5));
	}
	
	protected static final WorldGenCustomTrees TREE_FEATURE = new WorldGenCustomTrees();
	 @Override
	 public float getSpawningChance()
	    {
	        return 0.4F;
	    }

}
