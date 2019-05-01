package com.scottishcrafter.herbalcraft.items.food;

import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.util.interfaces.IHasModel;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CookieHybridIM extends ItemFood implements IHasModel {
	
	public CookieHybridIM(String name, int amount, boolean isWolfFood)
	{
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.HCEDIBLES);
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
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 2400, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 600, 1, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 2400, 1, false, true));
		}

	
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Indica and Medicinal Hybrid");
	}
}
