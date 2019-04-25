package com.scottishcrafter.herbalcraft.rendering;

import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.entity.EntityStonedCow;
import com.scottishcrafter.herbalcraft.rendering.models.entities.ModelStonedCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class RenderStonedCow extends RenderLiving<EntityStonedCow>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/stoned_cow.png");
	
	public RenderStonedCow(RenderManager manager) 
	{
		super(manager, new ModelStonedCow(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityStonedCow entity) 
	{
		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityStonedCow entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
