package com.piratecody.nethercraft.init;

import com.piratecody.nethercraft.helpers.RegisterHelper;
import com.piratecody.nethercraft.items.AxeNC;
import com.piratecody.nethercraft.items.NCArmor;
import com.piratecody.nethercraft.items.PickaxeNC;
import com.piratecody.nethercraft.items.SpadeNC;
import com.piratecody.nethercraft.items.SwordNC;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class NCArmory {

	
	//Tool Materials - Still need tweaking and balancing
	static ToolMaterial CORRUPT_IRON = EnumHelper.addToolMaterial("CORRUPT_IRON", 2, 750, 2.0F, 2.0F, 14);
	static ToolMaterial CORRUPT_DIAMOND = EnumHelper.addToolMaterial("CORRUPT_DIAMOND", 4, 1250, 4, 5F, 14);
	static ToolMaterial OBSIDIAN = EnumHelper.addToolMaterial("OBSIDIAN", 3, 1500, 3.5F, 5F, 14);
	
	//Armor Materials
	static ArmorMaterial CORRUPT_IRON_AR = EnumHelper.addArmorMaterial("CORRUPT_IRON_AR", 2, new int[] {0,0,0,0}, 14);
	static ArmorMaterial CORRUPT_DIAMOND_AR = EnumHelper.addArmorMaterial("CORRUPT_IRON_AR", 2, new int[] {0,0,0,0}, 14);
	static ArmorMaterial OBSIDIAN_AR = EnumHelper.addArmorMaterial("CORRUPT_IRON_AR", 2, new int[] {0,0,0,0}, 14);
	
	/*Armour*/
	
	//Corrupt Iron Armor
	public static ItemArmor corruptIronHelm = new NCArmor(CORRUPT_IRON_AR, 0, "CorruptIronHelm");
	public static ItemArmor corruptIronChestplate = new NCArmor(CORRUPT_IRON_AR, 1, "CorruptIronChestplate");
	public static ItemArmor corruptIronLeggings = new NCArmor(CORRUPT_IRON_AR, 2, "CorruptIronLeggings");
	public static ItemArmor corruptIronBoots = new NCArmor(CORRUPT_IRON_AR, 3, "CorruptIronBoots");
	
	//Corrupt Diamond Armor
	public static ItemArmor corruptDiamondHelm = new NCArmor(CORRUPT_DIAMOND_AR, 0, "CorruptDiamondHelm");
	public static ItemArmor corruptDiamonChestplate = new NCArmor(CORRUPT_DIAMOND_AR, 1, "CorruptDiamondChestplate");
	public static ItemArmor corruptDiamondLeggings = new NCArmor(CORRUPT_DIAMOND_AR, 2, "CorruptDiamondLeggings");
	public static ItemArmor corruptDiamondBoots = new NCArmor(CORRUPT_DIAMOND_AR, 3, "CorruptDiamondBoots");
	
	//Obsidian Armor
	public static ItemArmor obsidianHelm = new NCArmor(OBSIDIAN_AR, 0, "ObsidianHelm");
	public static ItemArmor obsidianChestplate = new NCArmor(OBSIDIAN_AR, 1, "ObsidianChestplate");
	public static ItemArmor obsidianLeggings = new NCArmor(OBSIDIAN_AR, 2, "ObsidianLeggings");
	public static ItemArmor obsidianBoots = new NCArmor(OBSIDIAN_AR, 3, "ObsidianBoots");
	
	
	/* Tools */
	
	//Swords
	public static Item swordCorruptIron = new SwordNC(CORRUPT_IRON, "CorruptIronSword");
	public static Item swordCorruptDiamond = new SwordNC(CORRUPT_DIAMOND, "CorruptDiamondSword");
	public static Item swordObsidian = new SwordNC(OBSIDIAN, "ObsidianSword");
	
	//Pickaxe
	public static Item pickaxeCorruptIron = new PickaxeNC(CORRUPT_IRON, "CorruptIronPick");
	public static Item pickaxeCorruptDiamond = new PickaxeNC(CORRUPT_DIAMOND, "CorruptDiamondPick");
	public static Item pickaxeObsidian = new PickaxeNC(OBSIDIAN, "ObsidianPick");
	
	//Axe
	public static Item axeCorruptIron = new AxeNC(CORRUPT_IRON, "CorruptIronAxe");
	public static Item axeCorruptDiamond = new AxeNC(CORRUPT_DIAMOND, "CorruptDiamondAxe");
	public static Item axeObsidian = new AxeNC(OBSIDIAN, "ObsidianAxe");
	
	//Spade
	public static Item spadeCorruptIron = new SpadeNC(CORRUPT_IRON, "CorruptIronShovel");
	public static Item spadeCorruptDiamond = new SpadeNC(CORRUPT_DIAMOND, "CorruptDiamondShovel");
	public static Item spadeObsidian = new SpadeNC(OBSIDIAN, "ObsidianShovel");
	
	public static void registerArmory()
	{
		
		RegisterHelper.registerItem(axeCorruptDiamond);
		RegisterHelper.registerItem(swordCorruptDiamond);
		RegisterHelper.registerItem(pickaxeCorruptDiamond);
		RegisterHelper.registerItem(spadeCorruptDiamond);
		
		RegisterHelper.registerItem(axeCorruptIron);
		RegisterHelper.registerItem(swordCorruptIron);
		RegisterHelper.registerItem(pickaxeCorruptIron);
		RegisterHelper.registerItem(spadeCorruptIron);

		
	}
		
}



