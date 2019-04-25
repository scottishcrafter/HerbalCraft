package com.scottishcrafter.herbalcraft.rendering;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.entity.EntityStonedChicken;
import com.scottishcrafter.herbalcraft.rendering.models.entities.ModelStonedChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderStonedChicken extends RenderLiving<EntityStonedChicken>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/stoned_chicken.png");
	
	public RenderStonedChicken(RenderManager manager) 
	{
		super(manager, new ModelStonedChicken(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityStonedChicken entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityStonedChicken entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
