package com.scottishcrafter.herbalcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.Reference;
import com.scottishcrafter.herbalcraft.items.*;
import com.scottishcrafter.herbalcraft.items.armour.ArmourModel;
import com.scottishcrafter.herbalcraft.items.food.*;
import com.scottishcrafter.herbalcraft.items.seeds.*;
import com.scottishcrafter.herbalcraft.items.tools.ToolAxeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolHoeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolPickaxeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolShovelBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolSwordBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
			
	//Armour Materials                                                                                                                                     {Helmet,Chest,Legs,Boots}           
	public static final ArmorMaterial RESIN_MATERIAL = EnumHelper.addArmorMaterial("resin_model", Reference.MODID + ":resin_model", 20, new int[] {2, 6, 5, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
	public static final ArmorMaterial SUPER_RESIN_MATERIAL = EnumHelper.addArmorMaterial("super_resin_model", Reference.MODID + ":super_resin_model", 20, new int[] {4, 9, 7, 4}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
	
	//Tool Materials
	public static final ToolMaterial RESIN_TOOL = EnumHelper.addToolMaterial("resin_tool", 2, 400, 3.0f, 5.0f, 20);
	public static final ToolMaterial SUPER_RESIN_TOOL = EnumHelper.addToolMaterial("super_resin_tool", 2, 400, 3.0f, 5.0f, 20);
	
	//Items
	public static final Item RESIN = new ItemBase("resin",Main.HERBALCRAFT);
	public static final Item HEMP_INGOT_RAW = new ItemBase("hemp_ingot_raw",Main.HERBALCRAFT);
	public static final Item HEMP_INGOT = new ItemBase("hemp_ingot",Main.HERBALCRAFT);
	public static final Item SUPER_RESIN = new ItemBase("super_resin", Main.HERBALCRAFT);
	public static final Item RIZLAZ_SINGLE = new ItemBase("rizlaz_single", Main.HERBALCRAFT);
	public static final Item HEMP_MULCH = new ItemBase("hemp_mulch", Main.HERBALCRAFT);
	public static final Item HEMP_PAPER = new ItemBase("hemp_paper", Main.HERBALCRAFT);
	//Buds
	public static final Item BUD_HEMP = new ItemBase ("bud_hemp", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_SI = new ItemBase ("bud_hybrid_si", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_SM = new ItemBase ("bud_hybrid_sm", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_IM = new ItemBase ("bud_hybrid_im", Main.HERBALCRAFT);
	public static final Item BUD_INDICA = new ItemBase ("bud_indica", Main.HERBALCRAFT);
	public static final Item BUD_MEDICINAL = new ItemBase ("bud_medicinal", Main.HERBALCRAFT);
	public static final Item BUD_SATIVA = new ItemBase ("bud_sativa", Main.HERBALCRAFT);
	//Crushed Buds
	public static final Item CRUSHED_BUD_HEMP = new ItemBase ("crushed_bud_hemp", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_SI = new ItemBase ("crushed_bud_hybrid_si", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_SM = new ItemBase ("crushed_bud_hybrid_sm", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_IM = new ItemBase ("crushed_bud_hybrid_im", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_INDICA = new ItemBase ("crushed_bud_indica", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_MEDICINAL = new ItemBase ("crushed_bud_medicinal", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_SATIVA = new ItemBase ("crushed_bud_sativa", Main.HERBALCRAFT);

	
	//Herb Grinder
	public static final Item HERB_GRINDER = new ItemHerbGrinder ("herb_grinder", Main.HERBALCRAFT);
	//Joints
	public static final Item JOINT_HYBRID_SI = new JointHybridIS("joint_hybrid_si", 1, false);
	public static final Item JOINT_HYBRID_IM = new JointHybridIM("joint_hybrid_im", 1, false);
	public static final Item JOINT_HYBRID_SM = new JointHybridSM("joint_hybrid_sm", 1, false);
	public static final Item JOINT_INDICA = new JointIndica("joint_indica", 1, false);
	public static final Item JOINT_MEDICINAL = new JointMedicinal("joint_medicinal", 1, false);
	public static final Item JOINT_SATIVA = new JointSativa("joint_sativa", 1, false);
	
	
	public static final Item ROACH_HYBRID_SI = new Roach ("roach_hybrid_si");
	public static final Item ROACH_HYBRID_IM = new Roach ("roach_hybrid_im");
	public static final Item ROACH_HYBRID_SM = new Roach ("roach_hybrid_sm");
	public static final Item ROACH_INDICA = new Roach ("roach_indica");
	public static final Item ROACH_MEDICINAL = new Roach ("roach_medicinal");
	public static final Item ROACH_SATIVA = new Roach ("roach_sativa");
	
	//Seeds
	public static final Item SEEDS_HEMP = new SeedsHemp("seeds_hemp", 1, false);
	public static final Item SEEDS_HYBRID_IM = new SeedsHybridIM("seeds_hybrid_im", 1, false);
	public static final Item SEEDS_HYBRID_SI = new SeedsHybridSI("seeds_hybrid_si", 1, false);
	public static final Item SEEDS_HYBRID_SM = new SeedsHybridSM("seeds_hybrid_sm", 1, false);
	public static final Item SEEDS_INDICA = new SeedsIndica("seeds_indica", 1, false);
	public static final Item SEEDS_MEDICINAL = new SeedsMedicinal("seeds_medicinal", 1, false);
	public static final Item SEEDS_SATIVA = new SeedsSativa("seeds_sativa", 1, false);
	
	//Toasted Seeds
	public static final Item SEEDS_TOASTED_HEMP = new ToastedSeeds("seeds_toasted_hemp", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_IM = new ToastedSeedsIM("seeds_toasted_hybrid_im", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_SI = new ToastedSeedsIS("seeds_toasted_hybrid_si", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_SM = new ToastedSeedsSM("seeds_toasted_hybrid_sm", 2, false);
	public static final Item SEEDS_TOASTED_INDICA = new ToastedSeeds("seeds_toasted_indica", 2, false);
	public static final Item SEEDS_TOASTED_MEDICINAL = new ToastedSeeds("seeds_toasted_medicinal", 2, false);
	public static final Item SEEDS_TOASTED_SATIVA = new ToastedSeeds("seeds_toasted_sativa", 2, false);
	
	
	//Edibles
	public static final Item COOKIE_CBD = new CookieCBD("cookie_cbd", 3, false);
	public static final Item COOKIE_HYBRID_SI = new CookieHybrid("cookie_hybrid_si", 3, false);
	public static final Item COOKIE_INDICA = new CookieIndica("cookie_indica", 3, false);
	public static final Item COOKIE_MEDICINAL = new CookieMedicinal("cookie_medicinal", 3, false);
	public static final Item COOKIE_SATIVA = new CookieSativa("cookie_sativa", 3, false);
	public static final Item GUMMIES_CBD = new GummiesCBD ("gummies_cbd", Main.HCEDIBLES);
	public static final Item GUMMIES_INDICA = new GummiesIndica ("gummies_indica", Main.HCEDIBLES);
	public static final Item GUMMIES_MEDICINAL = new GummiesMedicinal ("gummies_medicinal", Main.HCEDIBLES);
	public static final Item GUMMIES_SATIVA = new GummiesSativa ("gummies_sativa", Main.HCEDIBLES);
	public static final Item GUMMY_CBD = new CookieCBD("gummy_cbd", 5, false);
	public static final Item GUMMY_INDICA = new CookieIndica("gummy_indica", 5, false);
	public static final Item GUMMY_MEDICINAL = new CookieMedicinal("gummy_medicinal", 5, false);
	public static final Item GUMMY_SATIVA = new CookieSativa("gummy_sativa", 5, false);
	public static final Item GELATIN = new ItemBase("gelatin", Main.HCEDIBLES);
	public static final Item CANNA_MILK = new ItemBase("canna_milk", Main.HCEDIBLES);
	public static final Item CANNA_EGG = new ItemBase("canna_egg", Main.HCEDIBLES);
	
	//Crop Drops
	public static final Item CROPDROP_HEMP = new CropDropHemp ("cropdrop_hemp", Main.HERBALCRAFT);
	public static final Item CROPDROP_HYBRID_SI = new CropDropSIHybrid ("cropdrop_hybrid_si", Main.HERBALCRAFT);
	public static final Item CROPDROP_HYBRID_SM = new CropDropSMHybrid ("cropdrop_hybrid_sm", Main.HERBALCRAFT);
	public static final Item CROPDROP_HYBRID_IM = new CropDropIMHybrid ("cropdrop_hybrid_im", Main.HERBALCRAFT);
	public static final Item CROPDROP_INDICA = new CropDropIndica ("cropdrop_indica", Main.HERBALCRAFT);
	public static final Item CROPDROP_MEDICINAL = new CropDropMedicinal ("cropdrop_medicinal", Main.HERBALCRAFT);
	public static final Item CROPDROP_SATIVA = new CropDropSativa ("cropdrop_sativa", Main.HERBALCRAFT);
	
	//Tree Drops
	public static final Item TREEDROP_HEMP = new TreeDropHemp ("treedrop_hemp", Main.HCTREES);
	public static final Item TREEDROP_HYBRID = new TreeDropHybrid ("treedrop_hybrid", Main.HCTREES);
	public static final Item TREEDROP_INDICA = new TreeDropIndica ("treedrop_indica", Main.HCTREES);
	public static final Item TREEDROP_MEDICINAL = new TreeDropMedicinal ("treedrop_medicinal", Main.HCTREES);
	public static final Item TREEDROP_SATIVA = new TreeDropSativa ("treedrop_sativa", Main.HCTREES);
	
	//Items:Raw Hemps
	public static final Item HEMP_RAW = new ItemBase("hemp_raw", Main.HERBALCRAFT);
	public static final Item HEMP_RAW_HYBRID = new ItemBase("hemp_raw_hybrid", Main.HERBALCRAFT);
	public static final Item HEMP_RAW_INDICA = new ItemBase("hemp_raw_indica", Main.HERBALCRAFT);
	public static final Item HEMP_RAW_MEDICINAL = new ItemBase("hemp_raw_medicinal", Main.HERBALCRAFT);
	public static final Item HEMP_RAW_SATIVA = new ItemBase("hemp_raw_sativa", Main.HERBALCRAFT);
	//Items:Dried Hemps
	public static final Item HEMP_DRIED = new ItemBase("hemp_dried", Main.HERBALCRAFT);
	public static final Item HEMP_DRIED_HYBRID = new ItemBase("hemp_dried_hybrid", Main.HERBALCRAFT);
	public static final Item HEMP_DRIED_INDICA = new ItemBase("hemp_dried_indica", Main.HERBALCRAFT);
	public static final Item HEMP_DRIED_MEDICINAL = new ItemBase("hemp_dried_medicinal", Main.HERBALCRAFT);
	public static final Item HEMP_DRIED_SATIVA = new ItemBase("hemp_dried_sativa", Main.HERBALCRAFT);
	
	//Resin Armour
	public static final Item RESIN_HELMET = new ArmourModel("resin_helmet", Main.HCARMOURY, RESIN_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item RESIN_CHESTPLATE = new ArmourModel("resin_chestplate", Main.HCARMOURY, RESIN_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item RESINT_LEGGINGS = new ArmourModel("resin_leggings", Main.HCARMOURY, RESIN_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item RESIN_BOOTS = new ArmourModel("resin_boots", Main.HCARMOURY, RESIN_MATERIAL, EntityEquipmentSlot.FEET);
	
	//Super Resin Armour
	public static final Item SUPER_RESIN_HELMET = new ArmourModel("super_resin_helmet", Main.HCARMOURY, SUPER_RESIN_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item SUPER_RESIN_CHESTPLATE = new ArmourModel("super_resin_chestplate", Main.HCARMOURY, SUPER_RESIN_MATERIAL, EntityEquipmentSlot.CHEST);
	public static final Item SUPER_RESINT_LEGGINGS = new ArmourModel("super_resin_leggings", Main.HCARMOURY, SUPER_RESIN_MATERIAL, EntityEquipmentSlot.LEGS);
	public static final Item SUPER_RESIN_BOOTS = new ArmourModel("super_resin_boots", Main.HCARMOURY, SUPER_RESIN_MATERIAL, EntityEquipmentSlot.FEET);
	
	//Resin Tools
		public static final Item RESIN_AXE = new ToolAxeBase("resin_axe", RESIN_TOOL, Main.HCTOOLS);
		public static final Item RESIN_HOE = new ToolHoeBase("resin_hoe", RESIN_TOOL, Main.HCTOOLS);
		public static final Item RESIN_PICKAXE = new ToolPickaxeBase("resin_pickaxe", RESIN_TOOL, Main.HCTOOLS);
		public static final Item RESIN_SHOVEL = new ToolShovelBase("resin_shovel", RESIN_TOOL, Main.HCTOOLS);
		public static final Item RESIN_SWORD = new ToolSwordBase("resin_sword", RESIN_TOOL, Main.HCTOOLS);
		
		
   //Resin Tools
		public static final Item SUPER_RESIN_AXE = new ToolAxeBase("super_resin_axe", SUPER_RESIN_TOOL, Main.HCTOOLS);
		public static final Item SUPER_RESIN_HOE = new ToolHoeBase("super_resin_hoe", SUPER_RESIN_TOOL, Main.HCTOOLS);
		public static final Item SUPER_RESIN_PICKAXE = new ToolPickaxeBase("super_resin_pickaxe", SUPER_RESIN_TOOL, Main.HCTOOLS);
		public static final Item SUPER_RESIN_SHOVEL = new ToolShovelBase("super_resin_shovel", SUPER_RESIN_TOOL, Main.HCTOOLS);
		public static final Item SUPER_RESIN_SWORD = new ToolSwordBase("super_resin_sword", SUPER_RESIN_TOOL, Main.HCTOOLS);	
		
}
