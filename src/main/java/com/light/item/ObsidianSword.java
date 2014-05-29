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
import net.minecraft.world.World;

import com.light.lib.StringLibrary;

public class ObsidianSword extends ItemSword {

	public ObsidianSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("ObsidianSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(StringLibrary.MODID + ":obsidian_sword");
	}
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
            par2EntityLiving.dismountEntity(par2EntityLiving);
            return true;
    }
	
	@Override
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
	    int level = 30; //pretend the player has 20 levels to spend
	    par1ItemStack = EnchantmentHelper.addRandomEnchantment(new Random(), par1ItemStack, level);
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){ //Additional info
		l.add("This sword has an ominous aura...");
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return Items.emerald == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	} 
	
}
