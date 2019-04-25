package com.scottishcrafter.herbalcraft.util.handlers;

import com.scottishcrafter.herbalcraft.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation STONED_COW = LootTableList.register(new ResourceLocation(Reference.MODID, "stoned_cow"));
	public static final ResourceLocation STONED_CHICKEN = LootTableList.register(new ResourceLocation(Reference.MODID, "stoned_chicken"));
	public static final ResourceLocation STONED_PIG = LootTableList.register(new ResourceLocation(Reference.MODID, "stoned_pig"));
	public static final ResourceLocation STONED_SHEEP = LootTableList.register(new ResourceLocation(Reference.MODID, "stoned_sheep"));
	public static final ResourceLocation STONED_SHEEP_SHORN = LootTableList.register(new ResourceLocation(Reference.MODID, "stoned_sheep_shorn"));
}
