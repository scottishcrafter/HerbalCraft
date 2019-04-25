package com.scottishcrafter.herbalcraft.util.handlers;

import com.scottishcrafter.herbalcraft.entity.EntityStonedChicken;
import com.scottishcrafter.herbalcraft.entity.EntityStonedCow;
import com.scottishcrafter.herbalcraft.entity.EntityStonedPig;
import com.scottishcrafter.herbalcraft.rendering.RenderStonedChicken;
import com.scottishcrafter.herbalcraft.rendering.RenderStonedCow;
import com.scottishcrafter.herbalcraft.rendering.RenderStonedPig;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RenderHandler 
{
	
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityStonedCow.class, new IRenderFactory<EntityStonedCow>()
		{   @SideOnly(Side.CLIENT)
			@Override
			public Render<? super EntityStonedCow> createRenderFor(RenderManager manager) 
			{
				return new RenderStonedCow(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityStonedChicken.class, new IRenderFactory<EntityStonedChicken>() {
			
			@SideOnly(Side.CLIENT)
			@Override
			public Render<? super EntityStonedChicken> createRenderFor(RenderManager manager) 
			{
				return new RenderStonedChicken(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityStonedPig.class, new IRenderFactory<EntityStonedPig>() {
			
			@SideOnly(Side.CLIENT)
			@Override
			public Render<? super EntityStonedPig> createRenderFor(RenderManager manager) 
			{
				return new RenderStonedPig(manager);
			}
		});
	}
	
	}
