package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.blocks.BlockNC;
import com.piratecody.nethercraft.helpers.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NCBlocks {
	
	//Block parameters need tweaking and balancing
	public static Block oreCorruptIron = new BlockNC("CorruptIronOre", Material.rock, 2.0F, 4.0F, 0.2F, "pickaxe", 2);
	public static Block oreCorruptDiamond = new BlockNC("CorruptDiamondOre", Material.rock, 4.0F, 4.32F, 0.4F, "pickaxe", 3);
	public static Block oreObsidian = new BlockNC("ObsidianOre", Material.rock, 5.0F, 20.0F, 0F, "pickaxe", 3);
	public static Block oreEbony = new BlockNC("EbonyOre", Material.rock, 5.0F, 20.0F, 0F, "pickaxe", 3);
	
	public static Block blockCorruptIron = new BlockNC("CorruptIronBlock", Material.iron, 3.0F, 7.0F, 0F, "pickaxe", 2);
	public static Block blockCorruptDiamond = new BlockNC("CorruptDiamondBlock", Material.coral, 4.0F, 7.1F, 0F, "pickaxe", 2);
	public static Block blockEbony = new BlockNC("EbonyBlock", Material.coral, 4.0F, 7.1F, 0F, "pickaxe", 2);
	
	
	public static void registerBlocks(){
		
		RegisterHelper.registerBlock(oreCorruptIron);
		RegisterHelper.registerBlock(oreCorruptDiamond);
		RegisterHelper.registerBlock(oreObsidian);
		RegisterHelper.registerBlock(oreEbony);
		RegisterHelper.registerBlock(blockEbony);
		RegisterHelper.registerBlock(blockCorruptIron);
		RegisterHelper.registerBlock(blockCorruptDiamond);
		
	}

}
