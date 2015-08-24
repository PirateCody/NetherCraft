package com.piratecody.nethercraft.blocks;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockNCOre extends Block{
	
	
	
	
	/**
	 * Creates a block.
	 * @param name = The name of the block.
	 * @param material = The material of the block. 
	 * @param hardness = The hardness of the block.
	 * @param resistance = The blast resistance of the block.
	 * @param lightLevel = The amount of light the block emits.
	 * @param toolClass = The type of tool the block can be harvested with (Pickaxe, Axe, etc.)
	 * @param level = The level of tool the block can be harvested with (Diamond = 3, Iron = 2, Stone = 1, Wood = 0)
	 */
	
	public BlockNCOre(String name, Material material, float hardness, float resistance, float lightLevel, String toolClass, int level) {
		
		super(material);
		this.setBlockName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(toolClass, level);
		this.setBlockTextureName(Reference.MODID + ":" + name);
		this.setCreativeTab(NCTabs.tabNC);
	
	if(name == "CorruptIronOre"){
		this.setHardness(10F);
	}

}

}
