package com.scottishcrafter.herbalcraft.proxy;

import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityCannaChest;
import com.scottishcrafter.herbalcraft.rendering.RenderCannaChest;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerModel(Item item, int metadata) 
	{
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCannaChest.class, new RenderCannaChest());
	}
	


}
