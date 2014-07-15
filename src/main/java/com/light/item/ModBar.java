package com.light.item;

import com.light.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBar extends Item {

		public ModBar(){
		    this.setCreativeTab(CreativeTabs.tabMaterials);
		    this.setMaxStackSize(64);
		    this.setMaxDamage(3);
		}
		
}
