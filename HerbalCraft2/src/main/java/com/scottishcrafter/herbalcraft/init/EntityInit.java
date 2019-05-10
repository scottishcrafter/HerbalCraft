package com.scottishcrafter.herbalcraft.init;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.entity.*;
import com.scottishcrafter.herbalcraft.util.ModConfiguration;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	
	public static void registerEntities()
	{
		registerEntity("stonedcow", EntityStonedCow.class, ModConfiguration.ENTITY_STONED_COW_ID, 50, 	2771239, 8289918);
		//EntityRegistry.addSpawn(EntityStonedCow.class, 1, 1, 4, EnumCreatureType.AMBIENT,BiomeDictionary.getBiomes(Type.PLAINS).toArray(new Biome[0]));
		registerEntity("stonedchicken", EntityStonedChicken.class, ModConfiguration.ENTITY_STONED_CHICKEN_ID, 50, 	2771239, 8650752);
		//EntityRegistry.addSpawn(EntityStonedChicken.class, 1, 1, 4, EnumCreatureType.AMBIENT,BiomeDictionary.getBiomes(Type.PLAINS).toArray(new Biome[0]));
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
