package com.scottishcrafter.herbalcraft.util.handlers;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityCannaChest;
import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityResinExtractor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityHandler
{
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityCannaChest.class, new ResourceLocation(Reference.MODID + ":canna_chest"));
		GameRegistry.registerTileEntity(TileEntityResinExtractor.class, new ResourceLocation(Reference.MODID + ":resin_extractor"));
	}
}
