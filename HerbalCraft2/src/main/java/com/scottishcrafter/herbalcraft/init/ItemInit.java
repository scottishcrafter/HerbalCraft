package com.scottishcrafter.herbalcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.items.*;
import com.scottishcrafter.herbalcraft.items.food.*;
import com.scottishcrafter.herbalcraft.items.seeds.*;
import com.scottishcrafter.herbalcraft.items.joints.*;
import com.scottishcrafter.herbalcraft.items.tools.ToolAxeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolHoeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolPickaxeBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolShovelBase;
import com.scottishcrafter.herbalcraft.items.tools.ToolSwordBase;
import com.scottishcrafter.herbalcraft.items.vapes.Vape;
import com.scottishcrafter.herbalcraft.items.vapes.VapeHybridIM;
import com.scottishcrafter.herbalcraft.items.vapes.VapeHybridSI;
import com.scottishcrafter.herbalcraft.items.vapes.VapeHybridSM;
import com.scottishcrafter.herbalcraft.items.vapes.VapeIndica;
import com.scottishcrafter.herbalcraft.items.vapes.VapeMedicinal;
import com.scottishcrafter.herbalcraft.items.vapes.VapeSativa;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
			
	//Seeds
	public static final Item SEEDS_HEMP = new SeedsHempBush("seeds_hemp", 1, false);
	public static final Item SEEDS_INDICA = new SeedsIndicaBush("seeds_indica", 1, false);
	public static final Item SEEDS_MEDICINAL = new SeedsMedicinalBush("seeds_medicinal", 1, false);
	public static final Item SEEDS_SATIVA = new SeedsSativaBush("seeds_sativa", 1, false);
	public static final Item SEEDS_HYBRID_IM = new SeedsHybridIMBush("seeds_hybrid_im", 1, false);
	public static final Item SEEDS_HYBRID_SI = new SeedsHybridSIBush("seeds_hybrid_si", 1, false);
	public static final Item SEEDS_HYBRID_SM = new SeedsHybridSMBush("seeds_hybrid_sm", 1, false);
	public static final Item FERTILIZER = new Fertilizer("herbal_fertilizer", Main.HERBALCRAFT);
		
	
	
	
	//Items
	public static final Item WEED_LEAF = new ItemBase("weed_leaf",Main.HERBALCRAFT);
	public static final Item RESIN = new ItemBase("resin",Main.HERBALCRAFT);
	public static final Item HEMP_INGOT_RAW = new ItemBase("hemp_ingot_raw",Main.HERBALCRAFT);
	public static final Item HEMP_INGOT = new ItemBase("hemp_ingot",Main.HERBALCRAFT);
	public static final Item SUPER_RESIN = new ItemBase("super_resin", Main.HERBALCRAFT);
	public static final Item RIZLAZ_SINGLE = new ItemBase("rizlaz_single", Main.HERBALCRAFT);
	public static final Item HEMP_MULCH = new ItemBase("hemp_mulch", Main.HERBALCRAFT);
	public static final Item HEMP_PAPER = new ItemBase("hemp_paper", Main.HERBALCRAFT);
	public static final Item HEMP_STRING = new ItemBase("hemp_string", Main.HERBALCRAFT);
	public static final Item HEMP_CLOTH = new ItemBase("hemp_cloth", Main.HERBALCRAFT);
	
	//Buds
	public static final Item BUD_HEMP = new ItemBase ("bud_hemp", Main.HERBALCRAFT);
	public static final Item BUD_INDICA = new ItemBase ("bud_indica", Main.HERBALCRAFT);
	public static final Item BUD_MEDICINAL = new ItemBase ("bud_medicinal", Main.HERBALCRAFT);
	public static final Item BUD_SATIVA = new ItemBase ("bud_sativa", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_SI = new ItemBase ("bud_hybrid_si", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_SM = new ItemBase ("bud_hybrid_sm", Main.HERBALCRAFT);
	public static final Item BUD_HYBRID_IM = new ItemBase ("bud_hybrid_im", Main.HERBALCRAFT);
	//Crushed Buds
	public static final Item CRUSHED_BUD_HEMP = new ItemBase ("crushed_bud_hemp", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_INDICA = new ItemBase ("crushed_bud_indica", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_MEDICINAL = new ItemBase ("crushed_bud_medicinal", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_SATIVA = new ItemBase ("crushed_bud_sativa", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_SI = new ItemBase ("crushed_bud_hybrid_si", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_SM = new ItemBase ("crushed_bud_hybrid_sm", Main.HERBALCRAFT);
	public static final Item CRUSHED_BUD_HYBRID_IM = new ItemBase ("crushed_bud_hybrid_im", Main.HERBALCRAFT);

	//Herb Grinder
	public static final Item HERB_GRINDER = new ItemHerbGrinder ("herb_grinder", Main.HERBALCRAFT);
	//Joints
	public static final Item JOINT_INDICA = new JointIndica("joint_indica", 1, false);
	public static final Item JOINT_MEDICINAL = new JointMedicinal("joint_medicinal", 1, false);
	public static final Item JOINT_SATIVA = new JointSativa("joint_sativa", 1, false);
	public static final Item JOINT_HYBRID_SI = new JointHybridIS("joint_hybrid_si", 1, false);
	public static final Item JOINT_HYBRID_IM = new JointHybridIM("joint_hybrid_im", 1, false);
	public static final Item JOINT_HYBRID_SM = new JointHybridSM("joint_hybrid_sm", 1, false);
	
	//Vape
	public static final Item VAPE_EMPTY = new Vape("vape_empty", Main.HERBALCRAFT);
	public static final Item VAPE_INDICA = new VapeIndica("vape_indica", 1, false);
	public static final Item VAPE_MEDICINAL = new VapeMedicinal("vape_medicinal", 1, false);
	public static final Item VAPE_SATIVA = new VapeSativa("vape_sativa", 1, false);
	public static final Item VAPE_HYBRID_SI = new VapeHybridSI("vape_hybrid_si", 1, false);
	public static final Item VAPE_HYBRID_IM = new VapeHybridIM("vape_hybrid_im", 1, false);
	public static final Item VAPE_HYBRID_SM = new VapeHybridSM("vape_hybrid_sm", 1, false);
	
	//Roach
	public static final Item ROACH_HYBRID_SI = new Roach ("roach_hybrid_si");
	public static final Item ROACH_HYBRID_IM = new Roach ("roach_hybrid_im");
	public static final Item ROACH_HYBRID_SM = new Roach ("roach_hybrid_sm");
	public static final Item ROACH_INDICA = new Roach ("roach_indica");
	public static final Item ROACH_MEDICINAL = new Roach ("roach_medicinal");
	public static final Item ROACH_SATIVA = new Roach ("roach_sativa");
	
	
	//Toasted Seeds
	public static final Item SEEDS_TOASTED_HEMP = new HCFood("seeds_toasted_hemp", 2, false);
	public static final Item SEEDS_TOASTED_INDICA = new HCFood("seeds_toasted_indica", 2, false);
	public static final Item SEEDS_TOASTED_MEDICINAL = new HCFood("seeds_toasted_medicinal", 2, false);
	public static final Item SEEDS_TOASTED_SATIVA = new HCFood("seeds_toasted_sativa", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_IM = new ToastedSeedsIM("seeds_toasted_hybrid_im", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_SI = new ToastedSeedsIS("seeds_toasted_hybrid_si", 2, false);
	public static final Item SEEDS_TOASTED_HYBRID_SM = new ToastedSeedsSM("seeds_toasted_hybrid_sm", 2, false);
	
	
	//Edibles
	public static final Item COOKIE_CBD = new CookieCBD("cookie_cbd", 3, false);
	public static final Item COOKIE_HYBRID_SI = new CookieHybridIS("cookie_hybrid_si", 3, false);
	public static final Item COOKIE_HYBRID_SM = new CookieHybridSM("cookie_hybrid_sm", 3, false);
	public static final Item COOKIE_HYBRID_IM = new CookieHybridIM("cookie_hybrid_im", 3, false);
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
	public static final Item BROWNIE = new HCFood("brownie", 5, false);
	public static final Item BROWNIE_INDICA = new BrownieIndica ("brownie_indica", 5, false);
	public static final Item BROWNIE_MEDICINAL = new BrownieMedicinal ("brownie_medicinal", 5, false);
	public static final Item BROWNIE_SATIVA = new BrownieSativa ("brownie_sativa", 5, false);
	public static final Item BROWNIE_HYBRID_SM = new BrownieHybridSM ("brownie_hybrid_sm", 5, false);
	public static final Item BROWNIE_HYBRID_SI = new BrownieHybridSI("brownie_hybrid_si", 5, false);
	public static final Item BROWNIE_HYBRID_IM = new BrownieHybridIM("brownie_hybrid_im", 5, false);
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
	
			
	//Tool Materials
	public static final ToolMaterial RESIN_TOOL = EnumHelper.addToolMaterial("resin_tool", 2, 400, 3.0f, 5.0f, 20);
	public static final ToolMaterial SUPER_RESIN_TOOL = EnumHelper.addToolMaterial("super_resin_tool", 2, 400, 3.0f, 5.0f, 20);
		
	
	
	//Resin Tools
	public static final Item RESIN_AXE = new ToolAxeBase("resin_axe", RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item RESIN_HOE = new ToolHoeBase("resin_hoe", RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item RESIN_PICKAXE = new ToolPickaxeBase("resin_pickaxe", RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item RESIN_SHOVEL = new ToolShovelBase("resin_shovel", RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item RESIN_SWORD = new ToolSwordBase("resin_sword", RESIN_TOOL, Main.HERBALCRAFT);
		
		
   //Resin Tools
	public static final Item SUPER_RESIN_AXE = new ToolAxeBase("super_resin_axe", SUPER_RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item SUPER_RESIN_HOE = new ToolHoeBase("super_resin_hoe", SUPER_RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item SUPER_RESIN_PICKAXE = new ToolPickaxeBase("super_resin_pickaxe", SUPER_RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item SUPER_RESIN_SHOVEL = new ToolShovelBase("super_resin_shovel", SUPER_RESIN_TOOL, Main.HERBALCRAFT);
	public static final Item SUPER_RESIN_SWORD = new ToolSwordBase("super_resin_sword", SUPER_RESIN_TOOL, Main.HERBALCRAFT);	
		
			
		
}
