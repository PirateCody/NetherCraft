package com.piratecody.nethercraft.generation;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import com.piratecody.nethercraft.init.NCBlocks;

@SuppressWarnings("unused")
public class NCWorldGeneration implements IWorldGenerator{
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
    		case 0:
    			generateSurface(world, random, chunkX * 16, chunkZ * 16);
    		case -1:
    			generateNether(world, random, chunkX * 16, chunkZ * 16);
    		case 1:
    			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}

	}

		private void generateSurface(World world, Random random, int x, int z)
		{
			
		}

		private void generateNether(World world, Random random, int x, int z)
		{
			addOreSpawn(NCBlocks.oreCorruptIron, world, random, x, z, 16, 16, 2 + random.nextInt(3), 80, 5, 120, Blocks.netherrack);
			addOreSpawn(NCBlocks.oreCorruptDiamond, world, random, x, z, 16, 16, 1 + random.nextInt(2), 50, 5, 120, Blocks.netherrack);
			addOreSpawn(NCBlocks.oreCorruptObsidian, world, random, x, z, 16, 16, 3+ random.nextInt(2), 75, 5, 120, Blocks.netherrack);
			addOreSpawn(NCBlocks.oreCorruptEbony, world, random, x, z, 16, 16, 3+ random.nextInt(2), 60, 5, 120, Blocks.netherrack);

		}

		private void generateEnd(World world, Random random, int x, int z)
		{
		
		}
		
		
		
		private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY, Block target)
		{
			for (int i = 0; i < chanceToSpawn; i++)
			{
				int posX = blockXPos + random.nextInt(maxX);
				int posY = minY + random.nextInt(maxY - minY);
				int posZ = blockZPos + random.nextInt(maxZ);
				new NetherMineable(block, maxVeinSize, target).generate(world, random, posX, posY, posZ);
			}
		}
		
		

}
