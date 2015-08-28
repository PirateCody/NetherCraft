package com.piratecody.nethercraft;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;

import com.piratecody.nethercraft.generation.BiomeGenNether;
import com.piratecody.nethercraft.generation.NCWorldGeneration;
import com.piratecody.nethercraft.init.NCBlocks;
import com.piratecody.nethercraft.proxies.CommonProxy;
import com.piratecody.nethercraft.Reference;

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
	public static BiomeGenBase NetherBiome = new BiomeGenNether(52).setBiomeName("Nether");
	
	//inits
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		NCBlocks.registerBlocks();
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		BiomeManager.addSpawnBiome(NetherBiome);

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}
