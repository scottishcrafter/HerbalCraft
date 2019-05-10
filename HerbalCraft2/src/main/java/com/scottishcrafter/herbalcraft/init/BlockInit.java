package com.scottishcrafter.herbalcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.blocks.*;
import com.scottishcrafter.herbalcraft.blocks.crops.*;
import com.scottishcrafter.herbalcraft.blocks.trees.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Crops
	public static final Block BUSH_HYBRID_IM = new IMHybridBush("bush_hybrid_im");
	public static final Block BUSH_HYBRID_SI = new SIHybridBush("bush_hybrid_si");
	public static final Block BUSH_HYBRID_SM = new SMHybridBush("bush_hybrid_sm");
	public static final Block BUSH_HEMP = new HempBush("bush_hemp");
	public static final Block BUSH_INDICA = new IndicaBush("bush_indica");
	public static final Block BUSH_MEDICINAL = new MedicinalBush("bush_medicinal");
	public static final Block BUSH_SATIVA = new SativaBush("bush_sativa");
	
	//Hemp Blocks
	public static final Block HEMP_BLOCK = new BlockBase("hemp_block", Material.WOOD, Main.HERBALCRAFT);
	public static final Block HEMP_BLOCK_HYBRID = new BlockBase("hemp_block_hybrid", Material.WOOD, Main.HERBALCRAFT);
	public static final Block HEMP_BLOCK_INDICA = new BlockBase("hemp_block_indica", Material.WOOD, Main.HERBALCRAFT);
	public static final Block HEMP_BLOCK_MEDICINAL = new BlockBase("hemp_block_medicinal", Material.WOOD, Main.HERBALCRAFT);
	public static final Block HEMP_BLOCK_SATIVA = new BlockBase("hemp_block_sativa", Material.WOOD, Main.HERBALCRAFT);
	
	//Custom Models
	public static final Block CANNA_CHEST = new BlockCannaChest("canna_chest");
	
	//Tree Stuff
	public static final Block HEMP_LEAVES = new HempLeaves("hemp_leaves");
	public static final Block HEMP_LOG = new BlockLogBase("hemp_log");
	public static final Block HEMP_PLANKS = new BlockBase("hemp_planks", Material.WOOD, Main.HCTREES);
	public static final Block HEMP_SAPLING = new HempSapling("hemp_sapling");
	
	public static final Block INDICA_LEAVES = new IndicaLeaves("indica_leaves");
	public static final Block INDICA_LOG = new BlockLogBase("indica_log");
	public static final Block INDICA_PLANKS = new BlockBase("indica_planks", Material.WOOD, Main.HCTREES);
	public static final Block INDICA_SAPLING = new IndicaSapling("indica_sapling");
	
	public static final Block MEDICINAL_LEAVES = new MedicinalLeaves("medicinal_leaves");
	public static final Block MEDICINAL_LOG = new BlockLogBase("medicinal_log");
	public static final Block MEDICINAL_PLANKS = new BlockBase("medicinal_planks", Material.WOOD, Main.HCTREES);
	public static final Block MEDICINAL_SAPLING = new MedicinalSapling("medicinal_sapling");
	
	public static final Block SATIVA_LEAVES = new SativaLeaves("sativa_leaves");
	public static final Block SATIVA_LOG = new BlockLogBase("sativa_log");
	public static final Block SATIVA_PLANKS = new BlockBase("sativa_planks", Material.WOOD, Main.HCTREES);
	public static final Block SATIVA_SAPLING = new SativaSapling("sativa_sapling");
	
}
