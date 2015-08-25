package com.piratecody.nethercraft.items;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.item.ItemAxe;

public class AxeNC extends ItemAxe{

	public AxeNC(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + name);
		this.setCreativeTab(NCTabs.tabNC);
	}

}