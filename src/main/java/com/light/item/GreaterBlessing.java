package com.light.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.light.lib.StringLibrary;


public class GreaterBlessing extends Item {
	
	private int ID;
	
	public GreaterBlessing(int identity){
	    this.setCreativeTab(CreativeTabs.tabMisc);
	    this.setMaxStackSize(4);
	    this.setMaxDamage(0);
	    ID = identity;
	    ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(this), 1, 2, 2));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(this),1, 2, 2));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(this),1, 2, 2));
	}
	
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){ //Additional info
		
		//light's embrace
		if(this.ID == 1)
			l.add("Adds blessings of Thorns and Feather Falling to boots.");
		
		//illumination
		if(this.ID == 2)
			l.add("Adds blessings of Respiration and Fire Protection to head.");
		
		//incandescence
		if(this.ID == 3)
			l.add("Adds blessings of Protection and Unbreaking to chest.");
		
		//aversion
		if(this.ID == 4)
			l.add("Adds curses of Fire Aspect and Looting to sword.");
		
		//conflagration
		if(this.ID == 5)
			l.add("Adds curses of Infinity and Flame to bow.");
		
		//aether
		if(this.ID == 6)
			l.add("Adds blessings of Knockback and Sharpness to sword.");
		
		//fervor
		if(this.ID == 7)
			l.add("Adds curses of Infinity and Punch to bow.");
		
		//reckoning
		if(this.ID == 8)
		{
			l.add("It glows.");
		}
		
	}
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }

}
