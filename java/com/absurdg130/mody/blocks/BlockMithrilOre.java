package com.absurdg130.mody.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Random;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

public class BlockMithrilOre extends Block
{
	public BlockMithrilOre()
	{
		super(Material.rock);
		setBlockName("MithrilOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.addTab());
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
		return ModBlocks.MithrilOre;
    }
}