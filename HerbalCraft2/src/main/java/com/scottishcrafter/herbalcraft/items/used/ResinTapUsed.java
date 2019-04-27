package com.scottishcrafter.herbalcraft.items.used;

import java.util.Random;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class ResinTapUsed {

	public ResinTapUsed(Main instance) {
		super();
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure resinExtractorRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockInit.HEMP_LOG.getStateFromMeta(0)))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.RESIN, (int) (2)));
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
		}
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockInit.INDICA_LOG.getStateFromMeta(0)))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.RESIN, (int) (2)));
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
		}
		
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockInit.MEDICINAL_LOG.getStateFromMeta(0)))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.RESIN, (int) (2)));
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
		}
		
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockInit.SATIVA_LOG.getStateFromMeta(0)))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.RESIN, (int) (2)));
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
		}
		
		if ((new Object() {

			public boolean blockEquals(IBlockState a, IBlockState b) {
				try {
					return (a.getBlock() == b.getBlock()) && (a.getBlock().getMetaFromState(a) == b.getBlock().getMetaFromState(b));
				} catch (Exception e) {
					return (a.getBlock() == b.getBlock());
				}
			}
		}.blockEquals((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))), BlockInit.HYBRID_LOG.getStateFromMeta(0)))) {
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SUPER_RESIN, (int) (3)));
			if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
				itemstack.shrink(1);
				itemstack.setItemDamage(0);
			}
		}
	}
}
