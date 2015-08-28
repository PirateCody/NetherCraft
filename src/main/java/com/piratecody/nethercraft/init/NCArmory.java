package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.helpers.RegisterHelper;
import com.piratecody.nethercraft.items.AxeNC;
import com.piratecody.nethercraft.items.PickaxeNC;
import com.piratecody.nethercraft.items.SpadeNC;
import com.piratecody.nethercraft.items.SwordNC;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class NCArmory {

	
	//Tool Materials - Still need tweaking and balancing
	static ToolMaterial CORRUPT_IRON = EnumHelper.addToolMaterial("CORRUPT_IRON", 2, 750, 2.0F, 2.0F, 14);
	static ToolMaterial CORRUPT_DIAMOND = EnumHelper.addToolMaterial("CORRUPT_DIAMOND", 4, 1250, 4, 5F, 14);
	static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 1500, 3.5F, 5F, 14);
	
	//Armor Materials
	
	
	//Swords
	public static Item swordCorruptIron = new SwordNC(CORRUPT_IRON, "CorruptIronSword");
	public static Item swordCorruptDiamond = new SwordNC(CORRUPT_DIAMOND, "CorruptDiamondSword");
	public static Item swordObsidian = new SwordNC(OBSIDIAN, "ObsidianSword");
	
	//Pickaxe
	public static Item pickaxeCorruptIron = new PickaxeNC(CORRUPT_IRON, "CorruptIronSword");
	public static Item pickaxeCorruptDiamond = new PickaxeNC(CORRUPT_DIAMOND, "CorruptDiamondSword");
	public static Item pickaxeObsidian = new PickaxeNC(OBSIDIAN, "ObsidianSword");
	
	//Axe
	public static Item axeCorruptIron = new AxeNC(CORRUPT_IRON, "CorruptIronSword");
	public static Item axeCorruptDiamond = new AxeNC(CORRUPT_DIAMOND, "CorruptDiamondSword");
	public static Item axeObsidian = new AxeNC(OBSIDIAN, "ObsidianSword");
	
	//Spade
	public static Item spadeCorruptIron = new SpadeNC(CORRUPT_IRON, "CorruptIronSword");
	public static Item spadeCorruptDiamond = new SpadeNC(CORRUPT_DIAMOND, "CorruptDiamondSword");
	public static Item spadeObsidian = new SpadeNC(OBSIDIAN, "ObsidianSword");
		
	
	public static void registerArmory(){
		
		RegisterHelper.registerItem(swordCorruptDiamond);
		RegisterHelper.registerItem(swordCorruptIron);
		RegisterHelper.registerItem(swordObsidian);
		
		RegisterHelper.registerItem(pickaxeCorruptDiamond);
		RegisterHelper.registerItem(pickaxeCorruptIron);
		RegisterHelper.registerItem(pickaxeObsidian);
		
		RegisterHelper.registerItem(axeCorruptDiamond);
		RegisterHelper.registerItem(axeCorruptIron);
		RegisterHelper.registerItem(axeObsidian);
		
		RegisterHelper.registerItem(spadeCorruptDiamond);
		RegisterHelper.registerItem(spadeCorruptIron);
		RegisterHelper.registerItem(spadeObsidian);

		
	}
}
