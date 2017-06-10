package com.piratecody.nethercraft;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

import com.piratecody.nethercraft.generation.BiomeGenNether;
import com.piratecody.nethercraft.generation.BiomeGenNetherEdge;
import com.piratecody.nethercraft.generation.NCWorldGeneration;
import com.piratecody.nethercraft.init.NCArmory;
import com.piratecody.nethercraft.init.NCBlocks;
import com.piratecody.nethercraft.init.NCItems;
import com.piratecody.nethercraft.proxies.CommonProxy;
import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.crafting.Recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class Nethercraft {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@Instance(Reference.MODID)
	public static Nethercraft instance;
	
	NCWorldGeneration eventWorldGen = new NCWorldGeneration();
	public static BiomeGenBase NetherBiome = new BiomeGenNether(60).setBiomeName("Nether");
	public static BiomeGenBase NetherEdgeBiome = new BiomeGenNetherEdge(61);
	//public static BiomeGenBase LavaRiver = new BiomeGenLavaRiver(62).setBiomeName("Lava River");
	//Seed: -1139501490318387308
	//inits
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		NCBlocks.registerBlocks();
		NCItems.registerItems();
		NCArmory.registerArmory();
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(NetherBiome, 50));
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(NetherEdgeBiome, 50));
		//BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(LavaRiver, 50));
		
		BiomeManager.addSpawnBiome(NetherBiome);
		BiomeManager.addSpawnBiome(NetherEdgeBiome);
		//BiomeManager.addSpawnBiome(LavaRiver);
		

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		Recipes.registerRecipes();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}
