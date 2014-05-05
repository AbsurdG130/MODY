package com.absurdg130.mody.worldgen;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import com.absurdg130.mody.blocks.ModBlocks;

import scala.util.Random;

public class generateOverworld {

public void generateSurface(Random random, int chunkX, int chunkZ, World world)
    {
        addOreSpawn(ModBlocks.MithrilOre, world, random, chunkX, chunkZ, 2, 9, 10, 0, 60);
    }


}
