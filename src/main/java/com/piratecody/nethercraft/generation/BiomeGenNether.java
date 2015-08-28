package com.piratecody.nethercraft.generation;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenNether extends BiomeGenBase{

	
	public final Material blockMaterial;
	public BiomeGenNether(int par1)
	{
	super(par1);
	this.blockMaterial = Material.water;
	this.rootHeight = 0.1F;
	this.heightVariation = 0.6F;
	this.spawnableMonsterList.clear();
	this.spawnableCreatureList.clear();
	this.topBlock = Blocks.netherrack;
	this.fillerBlock = Blocks.netherrack;
	this.setBiomeName("Tutorial");

	/** this changes the water colour, its set to red now but ggole the java colours **/
	this.waterColorMultiplier = 0xE42D17;
	}

}
