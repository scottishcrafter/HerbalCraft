package com.scottishcrafter.herbalcraft.items.vapes;

import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.util.interfaces.IHasModel;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class VapeHybridSM extends ItemFood implements IHasModel {
	
	public VapeHybridSM(String name, int amount, boolean isWolfFood)
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
			player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 2400, 2, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 2, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 2400, 2, false, true));
		}

	
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;
    }
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(this, stack);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));

            if (entityplayer instanceof EntityPlayerMP)
            {
                CriteriaTriggers.CONSUME_ITEM.trigger((EntityPlayerMP)entityplayer, stack);
                ItemHandlerHelper.giveItemToPlayer(((EntityPlayerMP) entityplayer), new ItemStack(ItemInit.VAPE_EMPTY, (int) (1)));
            }
        }

        stack.shrink(1);
        return stack;
    }
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Sativa and Medicinal Hybrid");
	}
}
