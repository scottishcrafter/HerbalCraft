package com.scottishcrafter.herbalcraft.items;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.items.used.ResinTapUsed;
import com.scottishcrafter.herbalcraft.util.interfaces.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemResinTap extends Item implements IHasModel
{
	public ItemResinTap(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 25;
	}


	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
		boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("itemstack", itemstack);
			$_dependencies.put("world", world);
			ResinTapUsed.executeProcedure($_dependencies);
		}

		return true;
	}

}
