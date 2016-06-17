package com.piratecody.nethercraft.helpers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RecipeHelper {
	
	public static void createNewArmorCrafting(Item ingot, ItemArmor helmet, ItemArmor chest, ItemArmor leggings, ItemArmor boots)
	{
		GameRegistry.addShapedRecipe(new ItemStack(helmet), new Object[] {"AAA", "A A", "   ", 'A', ingot});   //Helmet
		GameRegistry.addShapedRecipe(new ItemStack(chest), new Object[] {"A A", "AAA", "AAA", 'A', ingot});    //Chestplate
		GameRegistry.addShapedRecipe(new ItemStack(leggings), new Object[] {"AAA", "A A", "A A", 'A', ingot}); //Leggings
		GameRegistry.addShapedRecipe(new ItemStack(boots), new Object[] {"   ", "A A", "A A", 'A', ingot});    //Boots
		
	}

}
