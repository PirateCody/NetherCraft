package com.piratecody.nethercraft.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.piratecody.nethercraft.helpers.RecipeHelper;
import com.piratecody.nethercraft.init.*;

public class Recipes {
	
	public static void addShapedRecipes()
	{
		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.obsidian), new Object[]
				{"AAA", "AAA", "AAA", 'A', NCItems.ingotObsidian});
		GameRegistry.addShapedRecipe(new ItemStack(NCBlocks.blockCorruptDiamond), new Object[]
				{"AAA", "AAA", "AAA", 'A', NCItems.gemCorruptDiamond});
		GameRegistry.addShapedRecipe(new ItemStack(NCBlocks.blockCorruptIron), new Object[]
				{"AAA", "AAA", "AAA", 'A', NCItems.ingotCorruptIron});
		GameRegistry.addShapedRecipe(new ItemStack(NCBlocks.blockEbony), new Object[]
				{"AAA", "AAA", "AAA", 'A', NCItems.ingotEbony});
		
		//Armors
		RecipeHelper.createNewArmorCrafting(NCItems.ingotObsidian, NCArmory.obsidianHelm, 
				NCArmory.obsidianChestplate, NCArmory.obsidianLeggings, NCArmory.obsidianBoots);                   //Obsidian Armor
		
		RecipeHelper.createNewArmorCrafting(NCItems.ingotCorruptIron, NCArmory.corruptIronHelm, 
				NCArmory.corruptIronChestplate, NCArmory.corruptIronLeggings, NCArmory.corruptIronBoots);          //Corrupt Iron Armor
		
		RecipeHelper.createNewArmorCrafting(NCItems.gemCorruptDiamond, NCArmory.corruptDiamondHelm, 
				NCArmory.corruptDiamondChestplate, NCArmory.corruptDiamondLeggings, NCArmory.corruptDiamondBoots); //Corrupt Diamond Armor
		
		RecipeHelper.createNewArmorCrafting(NCItems.ingotEbony, NCArmory.ebonyHelm, 
				NCArmory.ebonyChestplate, NCArmory.ebonyLeggings, NCArmory.ebonyBoots);                            //Ebony Armor
		
		
	}
	
	public static void addShaplessRecipes()
	{
		
	}
	
	public static void addSmeltingRecipes()
	{
		GameRegistry.addSmelting(NCBlocks.oreCorruptIron, new ItemStack(NCItems.ingotCorruptIron, 2), 2.5F);
		GameRegistry.addSmelting(NCItems.dustObsidian, new ItemStack(NCItems.ingotObsidian), 1.0F);
		GameRegistry.addSmelting(NCBlocks.oreEbony, new ItemStack(NCItems.ingotEbony), 1.5F);
		GameRegistry.addSmelting(NCBlocks.oreCorruptEbony, new ItemStack(NCItems.ingotEbony), 1.5f);
	}
	
	public static void registerRecipes()
	{
		addShapedRecipes();
		addShaplessRecipes();
		addSmeltingRecipes();
		
	}

}
