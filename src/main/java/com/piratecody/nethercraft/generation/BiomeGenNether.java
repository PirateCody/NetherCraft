package com.piratecody.nethercraft.generation;

import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenNether extends BiomeGenBase{

	
	public final Material blockMaterial;
	@SuppressWarnings("unchecked")
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
	
	this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityGhast.class, 50, 4, 4));
    this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityPigZombie.class, 100, 4, 4));
    this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityMagmaCube.class, 1, 4, 4));


	/** this changes the water colour, its set to red now but ggole the java colours **/
	this.waterColorMultiplier = 0xE42D17;
	}

}
