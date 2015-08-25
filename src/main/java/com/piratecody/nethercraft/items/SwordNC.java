package com.piratecody.nethercraft.items;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCTabs;

import net.minecraft.item.ItemSword;

public class SwordNC extends ItemSword {

	public SwordNC(ToolMaterial material, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + name);
		this.setCreativeTab(NCTabs.tabNC);
	}

}
