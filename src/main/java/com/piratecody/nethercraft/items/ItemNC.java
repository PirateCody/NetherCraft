package com.piratecody.nethercraft.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCTabs;

public class ItemNC extends Item{
	
	public ItemNC(String name){
		
		super();
		this.setCreativeTab(NCTabs.tabNC);
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MODID + ":" + name);
		
		
	}
	
	
	public float getSmeltingExperience(ItemStack item)
    {
        return 1;
    }
	
	
	
}
