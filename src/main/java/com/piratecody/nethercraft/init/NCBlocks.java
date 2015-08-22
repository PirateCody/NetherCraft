package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.blocks.BlockNCOre;
import com.piratecody.nethercraft.helpers.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NCBlocks {
	
	public static Block corruptIronOre = new BlockNCOre("CorruptIronOre", Material.rock, 2.0F, 4.0F, 0.2F, "pickaxe", 2);
	
	public static void registerBlocks(){
		
		RegisterHelper.registerBlock(corruptIronOre);
		
	}

}
