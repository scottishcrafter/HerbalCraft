package com.scottishcrafter.herbalcraft;

import net.minecraft.block.properties.PropertyInteger;

public class Reference 
{
	public static final String MODID = "herbalcraft";
	public static final String MODNAME = "Herbal Craft";
	public static final String VERSION = "0.0.13";
	public static final String UPDATE_JSON = "https://updates.scottishcrafter.com/herbalcraft/version.json";
	
	public static final String CLIENT = "com.scottishcrafter.herbalcraft.proxy.ClientProxy";
	public static final String SERVER = "com.scottishcrafter.herbalcraft.proxy.CommonProxy";
	
	public static final int GUI_RESIN_EXTRACTOR = 1;
	public static final int GUI_CANNA_CHEST = 2;
	public static final int GUI_GLOWSTONE_GENERATOR = 3;
	public static final int GUI_ELECTRIC_SINTERING_FURNACE = 4;
	public static final int GUI_ENERGY_STORAGE = 5;
	public static final int GUI_BACKPACK = 6;
	public static final int GUI_GIANT_FURNACE = 7;
	
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 4);
}
