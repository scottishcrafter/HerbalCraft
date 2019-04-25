package com.scottishcrafter.herbalcraft.util.handlers;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.blocks.containers.ContainerCannaChest;
import com.scottishcrafter.herbalcraft.blocks.containers.ContainerResinExtractor;
import com.scottishcrafter.herbalcraft.blocks.guis.GuiCannaChest;
import com.scottishcrafter.herbalcraft.blocks.guis.GuiResinExtractor;
import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityCannaChest;
import com.scottishcrafter.herbalcraft.blocks.tileentities.TileEntityResinExtractor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_RESIN_EXTRACTOR) return new ContainerResinExtractor(player.inventory, (TileEntityResinExtractor)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_CANNA_CHEST) return new ContainerCannaChest(player.inventory, (TileEntityCannaChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_RESIN_EXTRACTOR) return new GuiResinExtractor(player.inventory, (TileEntityResinExtractor)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_CANNA_CHEST) return new GuiCannaChest(player.inventory, (TileEntityCannaChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		return null;
	}
}
