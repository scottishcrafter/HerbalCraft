package com.scottishcrafter.herbalcraft.init;
import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

    public static void init() {
    	
        OreDictionary.registerOre("logWood", BlockInit.HEMP_LOG);
        OreDictionary.registerOre("logWood", BlockInit.INDICA_LOG);
        OreDictionary.registerOre("logWood", BlockInit.MEDICINAL_LOG);
        OreDictionary.registerOre("logWood", BlockInit.SATIVA_LOG);
        OreDictionary.registerOre("logWood", BlockInit.HYBRID_LOG);
    	OreDictionary.registerOre("plankWood", BlockInit.HEMP_PLANKS);
        OreDictionary.registerOre("plankWood", BlockInit.INDICA_PLANKS);
        OreDictionary.registerOre("plankWood", BlockInit.MEDICINAL_PLANKS);
        OreDictionary.registerOre("plankWood", BlockInit.SATIVA_PLANKS);
        OreDictionary.registerOre("plankWood", BlockInit.HYBRID_PLANKS);
        OreDictionary.registerOre("treeLeaves", BlockInit.HEMP_LEAVES);
        OreDictionary.registerOre("treeLeaves", BlockInit.INDICA_LEAVES);
        OreDictionary.registerOre("treeLeaves", BlockInit.MEDICINAL_LEAVES);
        OreDictionary.registerOre("treeLeaves", BlockInit.SATIVA_LEAVES);
        OreDictionary.registerOre("treeLeaves", BlockInit.HYBRID_LEAVES);
        OreDictionary.registerOre("treeSapling", BlockInit.HEMP_SAPLING);
        OreDictionary.registerOre("treeSapling", BlockInit.HYBRID_SAPLING);
        OreDictionary.registerOre("treeSapling", BlockInit.INDICA_SAPLING);
        OreDictionary.registerOre("treeSapling", BlockInit.MEDICINAL_SAPLING);
        OreDictionary.registerOre("treeSapling", BlockInit.SATIVA_SAPLING);
        OreDictionary.registerOre("ingotIron", ItemInit.HEMP_INGOT);
        OreDictionary.registerOre("paper", ItemInit.HEMP_PAPER);
        OreDictionary.registerOre("slimeball", ItemInit.RESIN);
        OreDictionary.registerOre("chest", BlockInit.CANNA_CHEST);
        OreDictionary.registerOre("string", ItemInit.HEMP_STRING);
        System.out.println("Ore dictionary elements added!");
    }
}