package com.absurdg130.mody.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import com.absurdg130.mody.blocks.ModBlocks;
import com.absurdg130.mody.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void addRecipes() {
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.TinyWoodPiece, 3),
				new Object[]{"IIW",'I', Blocks.planks, 'W',
			new ItemStack (ModItems.WoodSmallAxe, 1, OreDictionary.WILDCARD_VALUE)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.TinyWoodPiece, 4), new Object[]{
			Blocks.planks, 
			Blocks.planks, 
			Blocks.planks});

		GameRegistry.addRecipe(new ItemStack(ModItems.MithrilPickaxe),
				new Object[] { "XXX", " Y ", " Y ", 'X', ModItems.MithrilIngot,
						'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.MithrilAxe),
				new Object[] { "XX", "XY", " Y", 'X', ModItems.MithrilIngot,
						'Y', Items.stick });
		GameRegistry.addRecipe(new ItemStack(ModItems.MithrilAxe),
				new Object[] { 
			"XX",
			"YX",
		    "Y ",
			'X', ModItems.MithrilIngot,
					'Y', Items.stick });
	
		GameRegistry.addSmelting((new ItemStack(ModBlocks.MithrilOre)),
				(new ItemStack(ModItems.MithrilIngot)), 100000);
		;
	GameRegistry.addRecipe(new ItemStack(ModBlocks.MithrilBlock),
		new Object[] {
			"XXX",
			"XXX",
			"XXX",'X', ModItems.MithrilIngot
	});
	GameRegistry.addRecipe(new ItemStack(ModItems.MithrilHelmet),
			new Object[] {
	"XXX",
	"X X",
	"   ", 'X', ModItems.MithrilIngot});
	GameRegistry.addRecipe(new ItemStack(ModItems.MithrilHelmet),
			new Object[] {
	"   ",
	"XXX",
	"X X", 'X', ModItems.MithrilIngot});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.MithrilIngot, 9), new ItemStack(ModBlocks.MithrilBlock));
	} 	
	
}