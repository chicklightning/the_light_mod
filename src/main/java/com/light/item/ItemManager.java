package com.light.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.light.lib.StringLibrary;
import com.light.main.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;


public class ItemManager {
	 
    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }
    
    public static Item quartzHelmet;
    public static Item quartzChest;
    public static Item quartzLegs;
    public static Item quartzBoots;
    public static Item obsidianSword;
    
    //level of material the tool can harvest, between 0 and 3 (number greater than 3 is three, less than 0 is 0)
    //max uses: wood is 59, stone 131, iron 250, diamond 1561, gold 32
    //efficiency: strength of tool; wood 2, stone 4, iron 6, diamond 8, gold 12
    //damage: wood 0 (as if it wasn't there), stone 1, iron 2, diamond 3, gold 0
    //enchantability (natural enchantability factor): wood 15, stone 5, iron 14, diamond 10, gold 22
    public static ToolMaterial obsidian = EnumHelper.addToolMaterial("Obsidian", 0, 1947, 1, 5, 15);
    
    //durability: maximum damage factor for material; leather 5, gold 7, chainmail 15, iron 15, diamond 33
    //reduction amounts: damage reduction (1 point is half a shield) for each armor piece
    //leather {1 3 2 1}, gold {2 5 3 1}, chainmail = {2 5 4 1}, iron {2 6 5 2}, diamond {3 8 6 3}
    public static ArmorMaterial quartz = EnumHelper.addArmorMaterial("Quartz", 25, new int[]{4, 9, 7, 4}, 15);
    
    public static void initializeItem() {
    	//last number is armor slot: 0 is helmet, 1 is chestplate, 2 is leggings, 3 is boots
    	quartzHelmet = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzHelmet"), 0).setUnlocalizedName("QuartzHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_helmet");
    	quartzChest = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzChest"), 1).setUnlocalizedName("QuartzChest").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_chest");
    	quartzLegs = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzLegs"), 2).setUnlocalizedName("QuartzLegs").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_leggings");
    	quartzBoots = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzBoots"), 3).setUnlocalizedName("QuartzBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_boots");
    	obsidianSword = new ObsidianSword(obsidian);
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(quartzHelmet, quartzHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(quartzChest, quartzChest.getUnlocalizedName());
    	GameRegistry.registerItem(quartzLegs, quartzLegs.getUnlocalizedName());
    	GameRegistry.registerItem(quartzBoots, quartzBoots.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianSword, obsidianSword.getUnlocalizedName());
    }
 
}
