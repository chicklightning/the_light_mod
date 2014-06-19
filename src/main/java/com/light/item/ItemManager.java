package com.light.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
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
    public static Item obsidianHelmet;
    public static Item obsidianChest;
    public static Item obsidianLegs;
    public static Item obsidianBoots;
    public static Item obsidianSword;
    public static Item lbLightsEmbrace;
    public static Item lbIllumination;
    public static Item lbIncandescence;
    public static Item lcAversion;
    public static Item lcConflagration;
    public static Item lbAether;
    public static Item lcFervor;
    public static Item lcReckoning;
    public static Item quartzSword;
    public static Item gbLightsEmbrace;
    public static Item gbIllumination;
    public static Item gbIncandescence;
    public static Item gbAether;
    public static Item gcAversion;
    public static Item gcConflagration;
    public static Item gcFervor;
    public static Item gcReckoning;
    public static Item blessedQuartzSword;
    public static Item cursedObsidianSword;
    
    //level of material the tool can harvest, between 0 and 3 (number greater than 3 is three, less than 0 is 0)
    //max uses: wood is 59, stone 131, iron 250, diamond 1561, gold 32
    //efficiency: strength of tool; wood 2, stone 4, iron 6, diamond 8, gold 12
    //damage: wood 0 (as if it wasn't there), stone 1, iron 2, diamond 3, gold 0
    //enchantability (natural enchantability factor): wood 15, stone 5, iron 14, diamond 10, gold 22
    public static ToolMaterial obsidian = EnumHelper.addToolMaterial("Obsidian", 1, 1947, 1, 5, 16);
    public static ToolMaterial moreQuartz = EnumHelper.addToolMaterial("Quartz", 1, 1811, 1, 5, 19);
    
    //durability: maximum damage factor for material; leather 5, gold 7, chainmail 15, iron 15, diamond 33
    //reduction amounts: damage reduction (1 point is half a shield) for each armor piece
    //leather {1 3 2 1}, gold {2 5 3 1}, chainmail = {2 5 4 1}, iron {2 6 5 2}, diamond {3 8 6 3}
    public static ArmorMaterial quartz = EnumHelper.addArmorMaterial("Quartz", 25, new int[]{4, 9, 7, 4}, 15);
    public static ArmorMaterial moreObsidian = EnumHelper.addArmorMaterial("Obsidian", 36, new int[]{2, 7, 6, 2}, 15);
    
    public static void initializeItem() {
    	//last number is armor slot: 0 is helmet, 1 is chestplate, 2 is leggings, 3 is boots
    	quartzHelmet = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzHelmet"), 0).setUnlocalizedName("QuartzHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_helmet_alt");
    	quartzChest = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzChest"), 1).setUnlocalizedName("QuartzChest").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_chest_alt");
    	quartzLegs = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzLegs"), 2).setUnlocalizedName("QuartzLegs").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_leggings");
    	quartzBoots = new QuartzArmor(quartz, MainRegistry.proxy.addArmor("QuartzBoots"), 3).setUnlocalizedName("QuartzBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":quartz_boots");
    	obsidianHelmet = new ObsidianArmor(moreObsidian, MainRegistry.proxy.addArmor("ObsidianHelmet"), 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":obsidian_helm");
    	obsidianChest = new ObsidianArmor(moreObsidian, MainRegistry.proxy.addArmor("ObsidianChest"), 1).setUnlocalizedName("ObsidianChest").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":obsidian_chest");
    	obsidianLegs = new ObsidianArmor(moreObsidian, MainRegistry.proxy.addArmor("ObsidianLegs"), 2).setUnlocalizedName("ObsidianLegs").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":obsidian_leggings");
    	obsidianBoots = new ObsidianArmor(moreObsidian, MainRegistry.proxy.addArmor("ObsidianBoots"), 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":obsidian_boots");
    	obsidianSword = new ObsidianSword(obsidian, 0).setUnlocalizedName("ObsidianSword");
    	cursedObsidianSword = new ObsidianSword(obsidian, 1).setUnlocalizedName("CursedObsidianSword");
    	blessedQuartzSword = new QuartzSword(moreQuartz, 1).setUnlocalizedName("BlessedQuartzSword");
    	quartzSword = new QuartzSword(moreQuartz, 0).setUnlocalizedName("QuartzSword");
    	lbLightsEmbrace = new LesserBlessing(0, 0.0F, false, 1).setUnlocalizedName("LBLightsEmbrace").setTextureName(StringLibrary.MODID + ":lights_embrace");
    	lbIllumination = new LesserBlessing(0, 0.0F, false, 2).setUnlocalizedName("LBIllumination").setTextureName(StringLibrary.MODID + ":illumination");
    	lbIncandescence = new LesserBlessing(0, 0.0F, false, 3).setUnlocalizedName("LBIncandescence").setTextureName(StringLibrary.MODID + ":incandescence");
    	lbAether = new LesserBlessing(0, 0.0F, false, 6).setUnlocalizedName("LBAether").setTextureName(StringLibrary.MODID + ":aether");
    	lcAversion = new LesserBlessing(0, 0.0F, false, 4).setUnlocalizedName("LCAversion").setTextureName(StringLibrary.MODID + ":lc_aversion");
    	lcConflagration = new LesserBlessing(0, 0.0F, false, 5).setUnlocalizedName("LCConflagration").setTextureName(StringLibrary.MODID + ":conflagration");
    	lcFervor = new LesserBlessing(0, 0.0F, false, 7).setUnlocalizedName("LCFervor").setTextureName(StringLibrary.MODID + ":fervor");
    	lcReckoning = new LesserBlessing(0, 0.0F, false, 8).setUnlocalizedName("LCReckoning").setTextureName(StringLibrary.MODID + ":reckoning");
    	gbLightsEmbrace = new GreaterBlessing(1).setUnlocalizedName("GBLightsEmbrace").setTextureName(StringLibrary.MODID + ":greater_lights_embrace");
    	gbIllumination = new GreaterBlessing(2).setUnlocalizedName("GBIllumination").setTextureName(StringLibrary.MODID + ":greater_illumination");
    	gbIncandescence = new GreaterBlessing(3).setUnlocalizedName("GBIncandescence").setTextureName(StringLibrary.MODID + ":greater_incandescence");
    	gcAversion = new GreaterBlessing(4).setUnlocalizedName("GCAversion").setTextureName(StringLibrary.MODID + ":greater_aversion");
    	gcConflagration = new GreaterBlessing(5).setUnlocalizedName("GCConflagration").setTextureName(StringLibrary.MODID + ":greater_conflagration");
    	gbAether = new GreaterBlessing(6).setUnlocalizedName("GBAether").setTextureName(StringLibrary.MODID + ":greater_aether");
    	gcFervor = new GreaterBlessing(7).setUnlocalizedName("GCFervor").setTextureName(StringLibrary.MODID + ":greater_fervor");
    	gcReckoning = new GreaterBlessing(8).setUnlocalizedName("GCReckoning").setTextureName(StringLibrary.MODID + ":greater_reckoning");
    }
 
    public static void registerItem() {
    	GameRegistry.registerItem(quartzHelmet, quartzHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(quartzChest, quartzChest.getUnlocalizedName());
    	GameRegistry.registerItem(quartzLegs, quartzLegs.getUnlocalizedName());
    	GameRegistry.registerItem(quartzBoots, quartzBoots.getUnlocalizedName());
    	GameRegistry.registerItem(quartzSword, quartzSword.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianSword, obsidianSword.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianHelmet, obsidianHelmet.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianChest, obsidianChest.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianLegs, obsidianLegs.getUnlocalizedName());
    	GameRegistry.registerItem(obsidianBoots, obsidianBoots.getUnlocalizedName());
    	GameRegistry.registerItem(cursedObsidianSword, cursedObsidianSword.getUnlocalizedName());
    	GameRegistry.registerItem(blessedQuartzSword, blessedQuartzSword.getUnlocalizedName());
    	GameRegistry.registerItem(lbLightsEmbrace, lbLightsEmbrace.getUnlocalizedName());
    	GameRegistry.registerItem(lbIllumination, lbIllumination.getUnlocalizedName());
    	GameRegistry.registerItem(lbIncandescence, lbIncandescence.getUnlocalizedName());
    	GameRegistry.registerItem(lbAether, lbAether.getUnlocalizedName());
    	GameRegistry.registerItem(lcAversion, lcAversion.getUnlocalizedName());
    	GameRegistry.registerItem(lcConflagration, lcConflagration.getUnlocalizedName());
    	GameRegistry.registerItem(lcFervor, lcFervor.getUnlocalizedName());
    	GameRegistry.registerItem(lcReckoning, lcReckoning.getUnlocalizedName());
    	GameRegistry.registerItem(gbLightsEmbrace, gbLightsEmbrace.getUnlocalizedName());
    	GameRegistry.registerItem(gbIllumination, gbIllumination.getUnlocalizedName());
    	GameRegistry.registerItem(gbIncandescence, gbIncandescence.getUnlocalizedName());
    	GameRegistry.registerItem(gcAversion, gcAversion.getUnlocalizedName());
    	GameRegistry.registerItem(gcConflagration, gcConflagration.getUnlocalizedName());
    	GameRegistry.registerItem(gbAether, gbAether.getUnlocalizedName());
    	GameRegistry.registerItem(gcFervor, gcFervor.getUnlocalizedName());
    	GameRegistry.registerItem(gcReckoning, gcReckoning.getUnlocalizedName());
    }
 
}
