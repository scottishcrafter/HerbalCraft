package com.scottishcrafter.herbalcraft.items.used;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;

public class HerbGrinderUsed  {

	public HerbGrinderUsed(Main instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure HerbGrinderUsed!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				ItemInit.BUD_SATIVA, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_BUD_SATIVA, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.BUD_SATIVA, (int) (1)).getItem(), -1, (int) 1,
						null);
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				ItemInit.BUD_INDICA, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_BUD_INDICA, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.BUD_INDICA, (int) (1)).getItem(), -1, (int) 1,
						null);
		
	} 
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				ItemInit.BUD_MEDICINAL, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_BUD_MEDICINAL, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.BUD_MEDICINAL, (int) (1)).getItem(), -1, (int) 1,
						null);
		
	}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				ItemInit.BUD_HYBRID, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_BUD_HYBRID, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.BUD_HYBRID, (int) (1)).getItem(), -1, (int) 1,
						null);
			
		
		
	}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				ItemInit.BUD_HEMP, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_BUD_HEMP, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.BUD_HEMP, (int) (1)).getItem(), -1, (int) 1,
						null);
		}
		
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				Items.REDSTONE, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_REDSTONE, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.REDSTONE, (int) (1)).getItem(), -1, (int) 1,
						null);
		
	}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : null).getItem() == new ItemStack(
				Items.DIAMOND, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.CRUSHED_DIAMOND, (int) (3)));
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.DIAMOND, (int) (1)).getItem(), -1, (int) 1,
						null);
		
	} 
}}
