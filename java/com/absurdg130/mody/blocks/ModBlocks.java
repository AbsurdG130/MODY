package com.absurdg130.mody.blocks;

import com.absurdg130.mody.help.RegisterHelper;

import net.minecraft.block.Block;



public class ModBlocks 
{
	public static Block MithrilOre;

public static Block MithrilBlock;

	public static Block ManganeseOre;
	public static Block ManganeseBlock;
	public static void loadBlocks()
	{
		MithrilOre = new BlockMithrilOre();
		MithrilBlock = new BlockMithrilBlock();
	
	ManganeseOre = new BlockManganeseOre();
	ManganeseBlock = new BlockManganeseBlock();
	}
public static void Register(){
	
		RegisterHelper.registerBlock(MithrilOre);
		RegisterHelper.registerBlock(MithrilBlock);
		
		RegisterHelper.registerBlock(ManganeseOre);
		RegisterHelper.registerBlock(ManganeseBlock);
	}

}