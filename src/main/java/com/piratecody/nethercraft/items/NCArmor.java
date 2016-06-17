package com.piratecody.nethercraft.items;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCArmory;
import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class NCArmor extends ItemArmor{

	/*
	 * @param material = the material of armor, NC materials defined in NCArmory
	 * @param armorType = Type of Armor, 0 = helmet, 1 = chest, 2 = leggings, 3 = boots
	 * @param name = unlocalized name
	 */
	public NCArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.setCreativeTab(NCTabs.tabNC);
		//System.out.println(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public  String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		
		if (stack.getItem() instanceof NCArmor)
		{
			if(stack.getItem() == NCArmory.corruptDiamondChestplate || stack.getItem() == NCArmory.corruptDiamondHelm
					|| stack.getItem() == NCArmory.corruptDiamondBoots)
				return Reference.MODID + ":textures/armor/Cdiamond_1.png";
			else if(stack.getItem() == NCArmory.corruptDiamondLeggings)
				return Reference.MODID + ":textures/armor/Cdiamond_2.png";
			else if(stack.getItem() == NCArmory.corruptIronChestplate || stack.getItem() == NCArmory.corruptIronHelm
					|| stack.getItem() == NCArmory.corruptIronBoots)
				return Reference.MODID + ":textures/armor/CorruptIronArmor_1.png";
			else if(stack.getItem() == NCArmory.corruptIronLeggings)
				return Reference.MODID + ":textures/armor/CorruptIronArmor_2.png";
			else if(stack.getItem() == NCArmory.obsidianHelm || stack.getItem() == NCArmory.obsidianChestplate
					|| stack.getItem() == NCArmory.obsidianBoots)
				return Reference.MODID + ":textures/armor/obsidian_layer_1.png";
			else if(stack.getItem() == NCArmory.obsidianLeggings)
				return Reference.MODID + ":textures/armor/obsidian_layer_2.png";
			else if(stack.getItem() == NCArmory.ebonyHelm || stack.getItem() == NCArmory.ebonyChestplate
					|| stack.getItem() == NCArmory.ebonyBoots)
				return Reference.MODID + ":textures/armor/ebony_layer_1.png";
			else if(stack.getItem() == NCArmory.ebonyLeggings)
				return Reference.MODID + ":textures/armor/ebony_layer_2.png";
			else
				return null;
			
			
		}
		else 
			return null;
		
	}
	

}
