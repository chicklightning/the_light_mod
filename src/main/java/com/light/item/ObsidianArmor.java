package com.light.item;

import com.light.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ObsidianArmor extends ItemArmor {

	int ID;
	
	public ObsidianArmor(ArmorMaterial material, int integer1,
			int integer2, int identity) {
		super(material, integer1, integer2);
		this.ID = identity;
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(slot == 0 || slot == 1 || slot == 3)
			return StringLibrary.MODID + ":textures/models/armor/obsidian_armor_1.png";
		else if(slot == 2)
			return StringLibrary.MODID + ":textures/models/armor/obsidian_armor_2.png";
		else
			return null;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return Items.emerald == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
	    if(this.ID == 1)
	    	return true;
	    else
	    	return false;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        if(this.ID == 1)
        	return EnumRarity.rare;
        else
        	return EnumRarity.common;
    }

}
