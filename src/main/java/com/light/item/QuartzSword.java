package com.light.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.light.lib.StringLibrary;


public class QuartzSword extends ItemSword {

	private int ID;
	
	public QuartzSword(ToolMaterial p_i45356_1_, int swordID) {
		super(p_i45356_1_);
		ID = swordID;
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(StringLibrary.MODID + ":quartz_sword");
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
           if(this.ID == 1)
           {
        	   par1ItemStack.damageItem(1, par3EntityLiving);
        	   par2EntityLiving.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 100, 3));
        	   par2EntityLiving.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 100, 2));
           }
           
           return true;
    }
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        if(this.ID == 1)
        	return EnumRarity.epic;
        else
        	return EnumRarity.common;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return Items.blaze_powder == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){ //Additional info
		if(this.ID == 1)
			l.add("Righteousness eminates from this sword.");
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        if(this.ID == 1)
        	return true;
        else
        	return false;
    }

}
