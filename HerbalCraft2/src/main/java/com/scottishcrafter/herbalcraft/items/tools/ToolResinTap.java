package com.scottishcrafter.herbalcraft.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import com.scottishcrafter.herbalcraft.Main;
import com.scottishcrafter.herbalcraft.init.BlockInit;
import com.scottishcrafter.herbalcraft.init.ItemInit;
import com.scottishcrafter.herbalcraft.items.used.ResinTapUsed;
import com.scottishcrafter.herbalcraft.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ToolResinTap extends ItemTool implements IHasModel
{
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(BlockInit.HEMP_LOG, BlockInit.HYBRID_LOG, BlockInit.INDICA_LOG, BlockInit.MEDICINAL_LOG, BlockInit.SATIVA_LOG);

    public ToolResinTap(String name, ToolMaterial material, CreativeTabs tab)
    {
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        
        ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }
    
    
    @Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, IBlockState bl, BlockPos pos, EntityLivingBase entity) {
		boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		{
			java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
			$_dependencies.put("entity", entity);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("itemstack", itemstack);
			$_dependencies.put("world", world);
			ResinTapUsed.executeProcedure($_dependencies);
		}
		return retval;
	}

    @Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
