package com.scottishcrafter.herbalcraft.init;

import com.scottishcrafter.herbalcraft.fluids.FluidLiquid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidInit
{
	public static final Fluid MOLTEN_COPPER_FLUID = new FluidLiquid("molten_copper", new ResourceLocation("tutorial:blocks/molten_copper_still"), new ResourceLocation("tutorial:blocks/molten_copper_flow"));

	public static void registerFluids()
	{
		registerFluid(MOLTEN_COPPER_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
