package com.scottishcrafter.herbalcraft.init;

import java.util.ArrayList;
import java.util.List;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.blocks.BlockBase;
import com.scottishcrafter.herbalcraft.blocks.BlockCannaChest;
import com.scottishcrafter.herbalcraft.blocks.BlockDoorBase;
import com.scottishcrafter.herbalcraft.blocks.crops.BlockHempPlant;
import com.scottishcrafter.herbalcraft.blocks.crops.BlockHybridPlant;
import com.scottishcrafter.herbalcraft.blocks.crops.BlockIndicaPlant;
import com.scottishcrafter.herbalcraft.blocks.crops.BlockMedicinalPlant;
import com.scottishcrafter.herbalcraft.blocks.crops.BlockSativaPlant;
import com.scottishcrafter.herbalcraft.blocks.machines.BlockResinExtractor;
import com.scottishcrafter.herbalcraft.blocks.slabs.BlockSlabDoubleBase;
import com.scottishcrafter.herbalcraft.blocks.slabs.BlockSlabHalfBase;
import com.scottishcrafter.herbalcraft.blocks.trees.BlockLeavesBase;
import com.scottishcrafter.herbalcraft.blocks.trees.BlockLogBase;
import com.scottishcrafter.herbalcraft.blocks.trees.BlockSaplingBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;

public class BlockInit 
{	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Crops
	public static final Block HEMP_PLANT = new BlockHempPlant("plant_hemp");
	public static final Block HYBRID_PLANT = new BlockHybridPlant("plant_hybrid");
	public static final Block INDICA_PLANT = new BlockIndicaPlant("plant_indica");
	public static final Block MEDICINAL_PLANT = new BlockMedicinalPlant("plant_medicinal");
	public static final Block SATIVA_PLANT = new BlockSativaPlant("plant_sativa");
	
	//Blocks
	public static final Block HEMPINGOT_BLOCK = new BlockBase("hempingot_block", Material.IRON, Main.HERBALCRAFT);
	public static final Block HEMP_WOOL = new BlockBase("hemp_wool", Material.CARPET, Main.HERBALCRAFT);
	public static final Block CANNA_LEAVES = new BlockLeavesBase("canna_leaves");
	public static final Block CANNA_LOG = new BlockLogBase("canna_log");
	public static final Block CANNA_PLANKS = new BlockBase("canna_planks", Material.WOOD, Main.HERBALCRAFT);
	public static final Block CANNA_SAPLING = new BlockSaplingBase("canna_sapling");
	public static final BlockSlab HEMPINGOT_SLAB_DOUBLE = new BlockSlabDoubleBase("hempingot_slab_double", Material.IRON, Main.HERBALCRAFT, BlockInit.HEMPINGOT_SLAB_HALF);
	public static final BlockSlab HEMPINGOT_SLAB_HALF = new BlockSlabHalfBase("hempingot_slab_half", Material.IRON, Main.HERBALCRAFT, BlockInit.HEMPINGOT_SLAB_HALF, BlockInit.HEMPINGOT_SLAB_DOUBLE);
	public static final BlockSlab HEMP_WOOD_SLAB_DOUBLE = new BlockSlabDoubleBase("hemp_wood_slab_double", Material.WOOD, Main.HERBALCRAFT, BlockInit.HEMP_WOOD_SLAB_HALF);
	public static final BlockSlab HEMP_WOOD_SLAB_HALF = new BlockSlabHalfBase("hemp_wood_slab_half", Material.WOOD, Main.HERBALCRAFT, BlockInit.HEMP_WOOD_SLAB_HALF, BlockInit.HEMP_WOOD_SLAB_DOUBLE);
	//Custom Models
	public static final Block CANNA_CHEST = new BlockCannaChest("canna_chest");
	//public static final Block HEMPINGOT__DOOR = new BlockDoorBase("hempingot_door", Material.ANVIL, Main.HERBALCRAFT);
	
	
	//Machines
	public static final Block RESIN_EXTRACTOR = new BlockResinExtractor("resin_extractor");
	
	
	
	
}
