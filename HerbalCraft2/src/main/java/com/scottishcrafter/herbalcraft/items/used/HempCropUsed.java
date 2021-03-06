package com.scottishcrafter.herbalcraft.items.used;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;

public class HempCropUsed {

	public HempCropUsed(Main instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure sativacropUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.HEMP_RAW, (int) (3)));
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(Items.STICK, (int) (1)));
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.WEED_LEAF, (int) (2)));
		if (entity instanceof EntityPlayer)
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.BUD_HEMP, (int) (3)));
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.CROPDROP_HEMP, (int) (1)).getItem(), -1, (int) 1, null);
		
	}
}
