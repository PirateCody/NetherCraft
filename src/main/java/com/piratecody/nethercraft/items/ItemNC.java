package com.piratecody.nethercraft.items;

import com.piratecody.nethercraft.Reference;
import com.piratecody.nethercraft.init.NCTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

	
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World world, EntityPlayer player)
	{
		return p_77659_1_ ;
		
	}
	
	
	
}
