package com.scottishcrafter.herbalcraft.entity;

import java.util.Set;

import com.google.common.collect.Sets;
import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.util.handlers.LootTableHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class EntityStonedSheep extends EntitySheep implements IShearable {

	 private int sheepTimer;
	    private EntityAIEatGrass entityAIEatGrass;
	    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(ItemInit.BUD_HEMP, ItemInit.BUD_HYBRID, ItemInit.BUD_INDICA, ItemInit.BUD_MEDICINAL, ItemInit.BUD_SATIVA);
	
	
	 public EntityStonedSheep(World worldIn)
	    {
	        super(worldIn);
	        this.setSize(0.9F, 1.3F);
	    }
	 
	 @Override
	 protected void initEntityAI()
	    {
	        this.entityAIEatGrass = new EntityAIEatGrass(this);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
	        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, false, TEMPTATION_ITEMS));
	        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.1D));
	        this.tasks.addTask(5, this.entityAIEatGrass);
	        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	    }
	 
	 @Override
		public EntityStonedSheep createChild(EntityAgeable ageable) 
		{
			return new EntityStonedSheep(world);
		}
		
		@Override
		protected ResourceLocation getLootTable() 
		{
			 if (this.getSheared())
		        {
				 	return LootTableHandler.STONED_SHEEP_SHORN;
		        }
		        else
		        {
		        	return LootTableHandler.STONED_SHEEP;
		        }
		}
		
	 
	 
	 
	 @Override
	 public void onLivingUpdate()
	    {
	        if (this.world.isRemote)
	        {
	            this.sheepTimer = Math.max(0, this.sheepTimer - 1);
	        }

	        super.onLivingUpdate();
	    }
	 @Override
	    protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20);
	    }
	 
	 @Override
	    public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
	    {
	        this.setSheared(true);
	        int i = 1 + this.rand.nextInt(3);

	        java.util.List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
	        for (int j = 0; j < i; ++j)
	            ret.add(new ItemStack(Item.getItemFromBlock(BlockInit.HEMP_WOOL), 1));

	        this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
	        return ret;
	    }
	 
	 
	 
}
