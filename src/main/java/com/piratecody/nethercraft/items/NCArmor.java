package com.piratecody.nethercraft.items;

import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.item.ItemArmor;

public class NCArmor extends ItemArmor{

	/*
	 * @param material = the material of armor, NC materials defined in NCArmory
	 * @param armorType = Type of Armor, 0 = helmet, 1 = chest, 2 = leggings, 3 = boots
	 * @param name = unlocalized name
	 */
	public NCArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		this.setUnlocalizedName(name);
		this.setCreativeTab(NCTabs.tabNC);
		
	}

}
