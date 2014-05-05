
package com.absurdg130.mody.worldgen;
 
import java.util.Random;

import com.absurdg130.mody.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
 
public class ModyWorldGenOre implements IWorldGenerator
{

	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case 0: generateSurface(random, chunkX*16, chunkZ*16, world); break;
            case 1: generateEnd(random, chunkX*16, chunkZ*16, world); break;
            case -1: generateNether(random, chunkX*16, chunkZ*16, world); break;
            default:;
        }
    }

	public void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		
		
	}

	public void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		
		
	}

	public void generateNether(Random random, int chunkX, int chunkZ, World world) {
		
		
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVainSize, int maxVainSize, int chancesToSpawn, int minY, int maxY )
	    {
	        for(int i = 0; i<chancesToSpawn; i++)
	        {
	            int posX = blockXPos + random.nextInt(16);
	            int posY = minY + random.nextInt(maxY - minY);
	            int posZ = blockZPos + random.nextInt(16);
	            new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize)), Blocks.stone).generate(world, random, posX, posY, posZ);
	            
	        }
	       
	    }

	
 
}
