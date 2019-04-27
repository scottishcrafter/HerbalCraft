package com.scottishcrafter.herbalcraft.util.handlers;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityCannaChest;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCannaChest.class, new ResourceLocation(Reference.MODID + ":canna_chest"));
		
	}
}
