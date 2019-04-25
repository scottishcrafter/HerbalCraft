package com.scottishcrafter.herbalcraft.entity;

import java.util.Set;

import com.google.common.collect.Sets;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.util.handlers.LootTableHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityStonedCow extends EntityCow
{	
	private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ItemInit.BUD_HEMP, ItemInit.BUD_HYBRID, ItemInit.BUD_INDICA, ItemInit.BUD_MEDICINAL, ItemInit.BUD_SATIVA);
	public EntityStonedCow(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.9F, 2.8F);
	}
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, false, TEMPTATION_ITEMS));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
	}
	
	
	
	@Override
	public EntityCow createChild(EntityAgeable ageable) 
	{
		return new EntityStonedCow(world);
	}
	
	@Override
	protected ResourceLocation getLootTable() 
	{
		return LootTableHandler.STONED_COW;
	}
	@Override
	 public boolean processInteract(EntityPlayer player, EnumHand hand)
	    {
	        ItemStack itemstack = player.getHeldItem(hand);

	        if (itemstack.getItem() == Items.BUCKET && !player.capabilities.isCreativeMode && !this.isChild())
	        {
	            player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
	            itemstack.shrink(1);

	            if (itemstack.isEmpty())
	            {
	                player.setHeldItem(hand, new ItemStack(ItemInit.CANNA_MILK));
	            }
	            else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemInit.CANNA_MILK)))
	            {
	                player.dropItem(new ItemStack(ItemInit.CANNA_MILK), false);
	            }

	            return true;
	        }
	        else
	        {
	            return super.processInteract(player, hand);
	        }
	    }
	
	@Override
	public float getEyeHeight()
    {
        return this.isChild() ? this.height : 1.3F;
    }

}
