package com.piratecody.nethercraft.blocks;

import java.util.Random;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCBlocks;
import com.piratecody.nethercraft.init.NCItems;
import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockNC extends Block{
	
	
	
	
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
	
	public BlockNC(String name, Material material, float hardness, float resistance, float lightLevel, String toolClass, int level) {
		
		super(material);
		this.setBlockName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		this.setHarvestLevel(toolClass, level);
		this.setBlockTextureName(Reference.MODID + ":" + name);
		this.setCreativeTab(NCTabs.tabNC);
	
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		if(this == NCBlocks.oreCorruptObsidian || (this == NCBlocks.oreObsidian))
			return NCItems.dustObsidian;
		else if(this == NCBlocks.oreCorruptDiamond)
			return NCItems.gemCorruptDiamond;
		else
			return Item.getItemFromBlock(this);
    }

	
}

	

		
	




