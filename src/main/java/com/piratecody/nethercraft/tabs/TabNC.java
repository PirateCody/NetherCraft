package com.piratecody.nethercraft.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TabNC extends CreativeTabs {
	
	public String name;

	public TabNC(int i, String name) {
		super(i, name);
		this.name = name;
	}

	@Override
	public Item getTabIconItem() {
		
		if(this.name == "tabNC"){
			return Items.boat;
		}
		return null;
	}

}
