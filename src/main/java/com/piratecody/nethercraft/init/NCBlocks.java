package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.blocks.BlockNCOre;
import com.piratecody.nethercraft.helpers.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NCBlocks {
	
	public static Block corruptIronOre = new BlockNCOre("CorruptIronOre", Material.rock, 2.0F, 4.0F, 0.2F, "pickaxe", 2);
	public static Block corruptDiamondOre = new BlockNCOre("CorruptDiamondOre", Material.rock, 4.0F, 4.32F, 0.4F, "pickaxe", 3);
	public static Block obsidianOre = new BlockNCOre("ObsidianOre", Material.rock, 5.0F, 20.0F, 0F, "pickaxe", 3);
	
	public static void registerBlocks(){
		
		RegisterHelper.registerBlock(corruptIronOre);
		RegisterHelper.registerBlock(corruptDiamondOre);
		RegisterHelper.registerBlock(obsidianOre);
		
	}

}
