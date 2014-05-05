package com.absurdg130.mody.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.items.ModItems;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

public class BlockManganeseOre extends Block
{
	public BlockManganeseOre()
	{
		super(Material.rock);
		setBlockName("ManganeseOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
		setStepSound(soundTypeStone);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
	}
//drop
    

    public int quantityDropped(Random p_149745_1_)
    {

    	double r = Math.random();

    	if (r < 0.25){

    	return 3;

    	}else if (r < 0.5){

    	return 4;

    	}else if (r < 0.75){
    	return 5;
    	}else{
    	return 6;
    	}
    	}

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ModItems.ManganeseShard;
    }
		
    }
