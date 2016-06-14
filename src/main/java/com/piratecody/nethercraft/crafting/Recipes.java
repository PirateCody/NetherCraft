package com.piratecody.nethercraft.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

import com.piratecody.nethercraft.init.*;

public class Recipes {
	
	public static void addShapedRecipes()
	{
		
	}
	
	public static void addShaplessRecipes()
	{
		
	}
	
	public static void addSmeltingRecipes()
	{
		GameRegistry.addSmelting(NCBlocks.oreCorruptIron, new ItemStack(NCItems.ingotCorruptIron, 2), 2.5F);
	}
	
	public static void registerRecipes()
	{
		addShapedRecipes();
		addShaplessRecipes();
		addSmeltingRecipes();
		
	}

}
