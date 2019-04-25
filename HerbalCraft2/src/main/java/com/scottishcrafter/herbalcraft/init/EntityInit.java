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
		registerEntity("stoned_cow", EntityStonedCow.class, ModConfiguration.ENTITY_STONED_COW_ID, 50, 	2771239, 8289918);
		registerEntity("stoned_chicken", EntityStonedChicken.class, ModConfiguration.ENTITY_STONED_CHICKEN_ID, 50, 	2771239, 8650752);
		registerEntity("stoned_pig", EntityStonedPig.class, ModConfiguration.ENTITY_STONED_PIG_ID, 50, 	2771239, 12605267);
		//registerEntity("stoned_sheep", EntityStonedSheep.class, ModConfiguration.ENTITY_STONED_SHEEP_ID, 50, 	2771239, 12605267);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
