package com.light.item;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.light.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class QuartzArmor extends ItemArmor {

	int ID;
	
	public QuartzArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, int identity) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.ID = identity;
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(slot == 0 || slot == 1 || slot == 3)
			return StringLibrary.MODID + ":textures/models/armor/quartz_armor_1.png";
		else if(slot == 2)
			return StringLibrary.MODID + ":textures/models/armor/quartz_armor_2.png";
		else
			return null;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return Items.blaze_powder == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
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