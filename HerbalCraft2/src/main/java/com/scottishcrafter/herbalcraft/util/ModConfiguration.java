package com.scottishcrafter.herbalcraft.util;

import java.io.File;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration 
{
	public static Configuration config;
	
	public static int ENTITY_STONED_COW_ID = 201;
	public static int ENTITY_STONED_CHICKEN_ID = 202;
	public static int ENTITY_STONED_PIG_ID = 203;
	//public static int ENTITY_STONED_SHEEP_ID = 204;
	public static int GUI_CANNA_CHEST_ID = 2;
	public static int DIMENSION_CANNALAND_ID = 2;
	
	public static boolean spawnCustomBiomesInOverworld = true;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		ENTITY_STONED_COW_ID = config.getInt("ENTITY_STONED_COW_ID", category, 201, 201, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_STONED_CHICKEN_ID = config.getInt("ENTITY_STONED_CHICKEN_ID", category, 202, 202, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_STONED_PIG_ID = config.getInt("ENTITY_STONED_PIG_ID", category, 203, 203, 999, "Entity IDs below 201 are used by Minecraft");
		//ENTITY_STONED_SHEEP_ID = config.getInt("ENTITY_STONED_SHEEP_ID", category, 203, 203, 999, "Entity IDs below 201 are used by Minecraft");
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		GUI_CANNA_CHEST_ID = config.getInt("GUI_CANNA_CHEST_ID", category, 4, 1, 999, "Set the ID for the Copper Chest");

		
		category = "Dimension IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the dimensions to ensure that they don't clash with other mod's ids");
		DIMENSION_CANNALAND_ID = config.getInt("DIMENSION_CANNALAND_ID", category, 2, 2, 999, "Set the ID for the Canna Dimension");
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");	
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MODID + ".cfg"));
	}
} 
