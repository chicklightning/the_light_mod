package com.light.item;

import java.util.List;

import com.light.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {

	public ObsidianSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		this.setUnlocalizedName("ObsidianSword");
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(StringLibrary.MODID + ":obsidian_sword");
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
