package com.absurdg130.mody.worldgen;

import java.util.Random;

import net.minecraft.world.World;

import com.absurdg130.mody.blocks.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModyWorldGen {
	
public static void RegisterGeneration(){
	GameRegistry.registerWorldGenerator(new ModyWorldGenOre(), 1);
}
public static void generate() {
	

	
	
	
}
}
