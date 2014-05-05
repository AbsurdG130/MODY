package com.absurdg130.mody.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.Random;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

public class BlockManganeseBlock extends Block {
	public BlockManganeseBlock() {
		super(Material.rock);
		setBlockName("ManganeseBlock");
		setBlockTextureName(Reference.MODID + ":"
				+ getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
		setStepSound(soundTypeStone);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
	}

	/**
	 * Determines what item is dropped when broken
	 * */
	public Block getBlockDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.ManganeseOre;
	}
}