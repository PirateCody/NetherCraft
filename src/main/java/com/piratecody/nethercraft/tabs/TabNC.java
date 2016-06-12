package com.piratecody.nethercraft.tabs;

import com.piratecody.nethercraft.init.NCItems;

import net.minecraft.creativetab.CreativeTabs;
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
			return NCItems.gemCorruptDiamond;
		}
		return null;
	}

}
