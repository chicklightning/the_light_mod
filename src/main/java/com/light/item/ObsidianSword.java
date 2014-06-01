package com.light.item;

import java.util.List;
import java.util.Random;

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
import net.minecraft.world.World;

import com.light.lib.StringLibrary;

public class ObsidianSword extends ItemSword {

	private int ID;
	
	public ObsidianSword(ToolMaterial p_i45356_1_, int swordID) {
		super(p_i45356_1_);
		ID = swordID;
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(StringLibrary.MODID + ":obsidian_sword");
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
		if(this.ID == 1)
		{
			par1ItemStack.damageItem(1, par3EntityLiving);
		    par3EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 60, 2));
			par2EntityLiving.setFire(2);
		}
		return true;
    }
	
//	@Override
//	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
//	    if(this.ID == 1){
//	    	int level = 30; //pretend the player has 20 levels to spend
//		    par1ItemStack = EnchantmentHelper.addRandomEnchantment(new Random(), par1ItemStack, level);
//	    }
//	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){ //Additional info
		if(this.ID == 1)
			l.add("This sword has an ominous aura...");
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
		return Items.emerald == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
}
