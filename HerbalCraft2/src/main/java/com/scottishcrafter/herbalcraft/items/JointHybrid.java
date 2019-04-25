package com.scottishcrafter.herbalcraft.items;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.util.interfaces.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class JointHybrid extends ItemFood implements IHasModel {
	
	public JointHybrid(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.HERBALCRAFT);
		setAlwaysEdible();
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 10*20, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 2400, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 30*20, 1, false, true));
		}

	
	}

}
