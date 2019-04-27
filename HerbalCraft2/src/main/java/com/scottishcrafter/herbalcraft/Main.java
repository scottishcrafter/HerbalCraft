package com.scottishcrafter.herbalcraft;

import java.io.File;

import com.scottishcrafter.herbalcraft.creativetabs.*;
import com.scottishcrafter.herbalcraft.proxy.CommonProxy;
import com.scottishcrafter.herbalcraft.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, updateJSON = Reference.UPDATE_JSON, useMetadata = true)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	//public static final CreativeTabs TUTORIAL = new TutorialTab();
	public static final CreativeTabs HERBALCRAFT = new HerbalCraftTab();
	public static final CreativeTabs HCEDIBLES = new HCEdiblesTab();
	public static final CreativeTabs HCARMOURY = new HCArmouryTab();
	public static final CreativeTabs HCTOOLS = new HCToolsTab();
	public static final CreativeTabs HCTREES = new HCTreesTab();
	public static File config;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{	
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}
}
