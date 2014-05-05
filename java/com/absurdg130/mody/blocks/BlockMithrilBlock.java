package com.absurdg130.mody.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

public class BlockMithrilBlock extends Block
{
	public BlockMithrilBlock()
	{
		super(Material.rock);
		setBlockName("MithrilBlock");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
		setStepSound(soundTypeMetal);
		setHardness(20.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(100);
		
	}

    /**
     * Determines what item is dropped when broken
     * */
	public Block getBlockDropped(int metadata, Random rand, int fortune)
    {
		return ModBlocks.MithrilBlock;
    }
}
    
