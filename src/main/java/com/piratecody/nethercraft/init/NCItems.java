package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.helpers.RegisterHelper;
import com.piratecody.nethercraft.items.ItemNC;

import net.minecraft.item.Item;

public class NCItems {
	
	
	public static Item gemCorruptDiamond = new ItemNC("CorruptDiamond");
	public static Item ingotCorruptIron = new ItemNC("CorruptIronIngot");
	public static Item dustObsidian = new ItemNC("ObsidianDust");
	public static Item ingotObsidian  = new ItemNC("ObsidianIngot");
	public static Item ingotEbony = new ItemNC("EbonyIngot");
	
	public static void registerItems(){
		
		RegisterHelper.registerItem(gemCorruptDiamond);
		RegisterHelper.registerItem(ingotCorruptIron);
		RegisterHelper.registerItem(dustObsidian);
		RegisterHelper.registerItem(ingotObsidian);
		RegisterHelper.registerItem(ingotEbony);
		
	}

}
