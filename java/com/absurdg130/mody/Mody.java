package com.absurdg130.mody;

import com.absurdg130.mody.blocks.ModBlocks;
import com.absurdg130.mody.handler.ModRecipes;
import com.absurdg130.mody.handler.handleCrafting;
import com.absurdg130.mody.help.*;
import com.absurdg130.mody.items.ModItems;
import com.absurdg130.mody.worldgen.ModyWorldGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Mody {

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Block handlers, handles all blocks
		ModBlocks.loadBlocks();
		ModBlocks.Register();
		
		ModyWorldGen.RegisterGeneration();

		// Item handlers, handles all items
		ModItems.loadItems();
		
		// Register handler, adds all the recipes
		ModRecipes.addRecipes();
		//WorldGen
		ModyWorldGen.generate();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		FuelRegisterHelper.Register();
		
		handleCrafting.handleSpecialCrafting();
		
	}
}