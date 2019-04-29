package com.scottishcrafter.herbalcraft.world.generation;

import java.util.Random;

import com.scottishcrafter.herbalcraft.blocks.crops.HempCrop;
import com.scottishcrafter.herbalcraft.blocks.crops.IndicaCrop;
import com.scottishcrafter.herbalcraft.blocks.crops.MedicinalCrop;
import com.scottishcrafter.herbalcraft.blocks.crops.SativaCrop;
import com.scottishcrafter.herbalcraft.init.BlockInit;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenHerbalCrops implements IWorldGenerator
{
	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		
		 // check the Biome
		 Chunk chunk = world.getChunkFromChunkCoords(chunkX, chunkZ);
		 
       	int addBush = random.nextInt(1);
       	if(addBush == 0) {
			 int cX = random.nextInt(16);
			 int cZ = random.nextInt(16);

			 int x = chunkX + random.nextInt(16);
			 int z = chunkZ + random.nextInt(16);
			 int y = chunk.getHeightValue(cX, cZ);
			 int bushType = random.nextInt(4);
			 if(world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.GRASS)  {
				 if(bushType == 1){
					 world.setBlockState(new BlockPos(x, y + 1, z), BlockInit.HEMP_PLANT.getDefaultState().
							 withProperty(HempCrop.AGE, Integer.valueOf(4)), 2);
				 } else if(bushType == 0) {
					 world.setBlockState(new BlockPos(x, y + 1, z), BlockInit.SATIVA_PLANT.getDefaultState().
							 withProperty(SativaCrop.AGE, Integer.valueOf(4)), 2);
				 } else if(bushType == 2) {
					 world.setBlockState(new BlockPos(x, y + 1, z), BlockInit.INDICA_PLANT.getDefaultState().
							 withProperty(IndicaCrop.AGE, Integer.valueOf(4)), 2);
				 } else if(bushType == 3) {
					 world.setBlockState(new BlockPos(x, y + 1, z), BlockInit.MEDICINAL_PLANT.getDefaultState().
							 withProperty(MedicinalCrop.AGE, Integer.valueOf(4)), 2);
				 }
			 }
       	 }
        }
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimensionType() == DimensionType.OVERWORLD) {
		    generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
	}
}