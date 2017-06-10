package com.piratecody.nethercraft.generation;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

public class BiomeGenNether extends BiomeGenBase{

	
	public final Material blockMaterial;
	@SuppressWarnings("unchecked")
	public BiomeGenNether(int par1)
	{
		super(par1);
		this.blockMaterial = Material.lava;
		this.rootHeight = 0.1F;
		this.heightVariation = 0.6F;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
		this.topBlock = Blocks.netherrack;
		this.fillerBlock = Blocks.netherrack;
		this.setBiomeName("Nether");
		this.setColor(16711680);
		this.setTemperatureRainfall(2.0F, 0.0F);
		this.setDisableRain();
		
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityGhast.class, 50, 4, 4));
	    this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityPigZombie.class, 100, 4, 4));
	    this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityMagmaCube.class, 1, 4, 4));
	
	
		/** this changes the water color, its set to red now but google the java colors **/
		this.waterColorMultiplier = 0xE42D17;
		
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.grassPerChunk = -999;
		this.theBiomeDecorator.mushroomsPerChunk = 10;
		
	}
	
	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		super.decorate(par1World, par2Random, par3, par4);
		
		if(par2Random.nextInt(50) > 25)
		{
			int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
		}
		
	}
	
	
	 

}
