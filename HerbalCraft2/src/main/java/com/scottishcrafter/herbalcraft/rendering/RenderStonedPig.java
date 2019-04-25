package com.scottishcrafter.herbalcraft.rendering;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.entity.EntityStonedPig;
import com.scottishcrafter.herbalcraft.rendering.models.entities.ModelStonedPig;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderStonedPig extends RenderLiving<EntityStonedPig>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/stoned_pig.png");
	
	public RenderStonedPig(RenderManager manager) 
	{
		super(manager, new ModelStonedPig(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityStonedPig entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityStonedPig entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
