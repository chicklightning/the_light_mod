package com.light.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.light.block.BlockManager;
import com.light.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;


public class RecipeManager {

	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}//end mainRegistry
		 
	public static void addCraftingRecipes() {
		ItemStack ironBootsLE = new ItemStack(Items.iron_boots);
		ironBootsLE.addEnchantment(Enchantment.thorns, 1);
		ironBootsLE.addEnchantment(Enchantment.featherFalling, 2);
		ItemStack diamondBootsLE = new ItemStack(Items.diamond_boots);
		diamondBootsLE.addEnchantment(Enchantment.thorns, 3);
		diamondBootsLE.addEnchantment(Enchantment.featherFalling, 4);
		ItemStack quartzBootsLE = new ItemStack(ItemManager.quartzBoots);
		quartzBootsLE.addEnchantment(Enchantment.thorns, 3);
		quartzBootsLE.addEnchantment(Enchantment.featherFalling, 4);
		
		ItemStack ironHelmIL = new ItemStack(Items.iron_helmet);
		ironHelmIL.addEnchantment(Enchantment.respiration, 1);
		ironHelmIL.addEnchantment(Enchantment.fireProtection, 2);
		ItemStack diamondHelmIL = new ItemStack(Items.diamond_helmet);
		diamondHelmIL.addEnchantment(Enchantment.respiration, 3);
		diamondHelmIL.addEnchantment(Enchantment.fireProtection, 4);
		ItemStack quartzHelmIL = new ItemStack(ItemManager.quartzHelmet);
		quartzHelmIL.addEnchantment(Enchantment.respiration, 3);
		quartzHelmIL.addEnchantment(Enchantment.fireProtection, 4);
		
		ItemStack ironChestIC = new ItemStack(Items.iron_chestplate);
		ironChestIC.addEnchantment(Enchantment.protection, 2);
		ironChestIC.addEnchantment(Enchantment.unbreaking, 1);
		ItemStack diamondChestIC = new ItemStack(Items.diamond_chestplate);
		diamondChestIC.addEnchantment(Enchantment.protection, 4);
		diamondChestIC.addEnchantment(Enchantment.unbreaking, 3);
		ItemStack quartzChestIC = new ItemStack(ItemManager.quartzChest);
		quartzChestIC.addEnchantment(Enchantment.protection, 4);
		quartzChestIC.addEnchantment(Enchantment.unbreaking, 3);
		
		ItemStack diamondSwordAV = new ItemStack(Items.diamond_sword);
		diamondSwordAV.addEnchantment(Enchantment.fireAspect, 2);
		diamondSwordAV.addEnchantment(Enchantment.looting, 3);
		ItemStack ironSwordAV = new ItemStack(Items.iron_sword);
		ironSwordAV.addEnchantment(Enchantment.fireAspect, 1);
		ironSwordAV.addEnchantment(Enchantment.looting, 1);
		ItemStack quartzSwordAV = new ItemStack(ItemManager.quartzSword);
		quartzSwordAV.addEnchantment(Enchantment.fireAspect, 2);
		quartzSwordAV.addEnchantment(Enchantment.looting, 3);
		ItemStack obsidianSwordAV = new ItemStack(ItemManager.obsidianSword);
		obsidianSwordAV.addEnchantment(Enchantment.fireAspect, 2);
		obsidianSwordAV.addEnchantment(Enchantment.looting, 2);
		
		ItemStack bowCON = new ItemStack(Items.bow);
		bowCON.addEnchantment(Enchantment.infinity, 1);
		bowCON.addEnchantment(Enchantment.flame, 1);
		
		ItemStack ironSwordAE = new ItemStack(Items.iron_sword);
		ironSwordAE.addEnchantment(Enchantment.knockback, 1);
		ironSwordAE.addEnchantment(Enchantment.sharpness, 3);
		ItemStack diamondSwordAE = new ItemStack(Items.diamond_sword);
		diamondSwordAE.addEnchantment(Enchantment.knockback, 2);
		diamondSwordAE.addEnchantment(Enchantment.sharpness, 5);
		ItemStack quartzSwordAE = new ItemStack(ItemManager.quartzSword);
		quartzSwordAE.addEnchantment(Enchantment.knockback, 2);
		quartzSwordAE.addEnchantment(Enchantment.sharpness, 5);
		ItemStack obsidianSwordAE = new ItemStack(ItemManager.obsidianSword);
		obsidianSwordAE.addEnchantment(Enchantment.knockback, 2);
		obsidianSwordAE.addEnchantment(Enchantment.sharpness, 4);
		
		ItemStack bowFERV = new ItemStack(Items.bow);
		bowFERV.addEnchantment(Enchantment.infinity, 1);
		bowFERV.addEnchantment(Enchantment.punch, 2);
		
		ItemStack ironAxeRECK = new ItemStack(Items.iron_pickaxe);
		ironAxeRECK.addEnchantment(Enchantment.silkTouch, 1);
		ironAxeRECK.addEnchantment(Enchantment.fortune, 2);
		ItemStack diamondAxeRECK = new ItemStack(Items.diamond_pickaxe);
		diamondAxeRECK.addEnchantment(Enchantment.unbreaking, 3);
		diamondAxeRECK.addEnchantment(Enchantment.fortune, 3);
		
		//guess that this shapeless recipe (one where order doesn't matter) does this shit
		//creates a new ItemStack (versus an Item) from one block of dirt ugh
		//takes an unlimited number of Object "items"
		GameRegistry.addShapelessRecipe(ironBootsLE, ItemManager.gbLightsEmbrace, Items.iron_boots);
		GameRegistry.addShapelessRecipe(diamondBootsLE, ItemManager.gbLightsEmbrace, Items.diamond_boots);
		GameRegistry.addShapelessRecipe(quartzBootsLE, ItemManager.gbLightsEmbrace, ItemManager.quartzBoots);
		GameRegistry.addShapelessRecipe(diamondSwordAV, ItemManager.gcAversion, Items.diamond_sword);
		GameRegistry.addShapelessRecipe(ironSwordAV, ItemManager.gcAversion, Items.iron_sword);
		GameRegistry.addShapelessRecipe(quartzSwordAV, ItemManager.gcAversion, ItemManager.quartzSword);
		GameRegistry.addShapelessRecipe(obsidianSwordAV, ItemManager.gcAversion, ItemManager.obsidianSword);
		GameRegistry.addShapelessRecipe(ironHelmIL, ItemManager.gbIllumination, Items.iron_helmet);
		GameRegistry.addShapelessRecipe(diamondHelmIL, ItemManager.gbIllumination, Items.diamond_helmet);
		GameRegistry.addShapelessRecipe(quartzHelmIL, ItemManager.gbIllumination, ItemManager.quartzHelmet);
		GameRegistry.addShapelessRecipe(ironChestIC, ItemManager.gbIncandescence, Items.iron_chestplate);
		GameRegistry.addShapelessRecipe(diamondChestIC, ItemManager.gbIncandescence, Items.diamond_chestplate);
		GameRegistry.addShapelessRecipe(quartzChestIC, ItemManager.gbIncandescence, ItemManager.quartzChest);
		GameRegistry.addShapelessRecipe(bowCON, ItemManager.gcConflagration, Items.bow);
		GameRegistry.addShapelessRecipe(ironSwordAE, ItemManager.gbAether, Items.iron_sword);
		GameRegistry.addShapelessRecipe(diamondSwordAE, ItemManager.gbAether, Items.diamond_sword);
		GameRegistry.addShapelessRecipe(quartzSwordAE, ItemManager.gbAether, ItemManager.quartzSword);
		GameRegistry.addShapelessRecipe(obsidianSwordAE, ItemManager.gbAether, ItemManager.obsidianSword);
		GameRegistry.addShapelessRecipe(bowFERV, ItemManager.gcFervor, Items.bow);
		GameRegistry.addShapelessRecipe(ironAxeRECK, ItemManager.gcReckoning, Items.iron_pickaxe);
		GameRegistry.addShapelessRecipe(diamondAxeRECK, ItemManager.gcReckoning, Items.diamond_pickaxe);
		
		//Shaped recipe on a 2x2 square (personal inventory), where square is like row 1: x y and row 2: y x
		//here the x's are stone blocks and the y's are gravel
		
		//here it's a 3x3 square, with each row listed respectively; add as many variables as needed in whatever combination
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzHelmet), "xxx", "xyx", 'x', ItemManager.quartzBar, 'y', Items.blaze_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzChest), "x x", "xyx", "xxx", 'x', ItemManager.quartzBar, 'y', Items.blaze_powder);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzLegs), "xxx", "x x", "x x", 'x', ItemManager.quartzBar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzBoots), "x x", "x x", 'x', ItemManager.quartzBar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blessedHelm), "aba", "bcd", "ede", 'a', ItemManager.lbAether, 'b', ItemManager.lbIllumination, 'c', ItemManager.quartzHelmet, 'd', ItemManager.lbIncandescence, 'e', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blessedChest), "aba", "bcd", "ede", 'a', ItemManager.lbAether, 'b', ItemManager.lbIllumination, 'c', ItemManager.quartzChest, 'd', ItemManager.lbIncandescence, 'e', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blessedLegs), "aba", "bcd", "ede", 'a', ItemManager.lbAether, 'b', ItemManager.lbIllumination, 'c', ItemManager.quartzLegs, 'd', ItemManager.lbIncandescence, 'e', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blessedBoots), "aba", "bcd", "ede", 'a', ItemManager.lbAether, 'b', ItemManager.lbIllumination, 'c', ItemManager.quartzBoots, 'd', ItemManager.lbIncandescence, 'e', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianHelmet), "xxx", "xyx", 'x', ItemManager.obsidianBar, 'y', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianChest), "x x", "xyx", "xxx", 'x', ItemManager.obsidianBar, 'y', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianLegs), "xxx", "x x", "x x", 'x', ItemManager.obsidianBar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianBoots), "x x", "x x", 'x', ItemManager.obsidianBar);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cursedHelm), "aba", "bcd", "ede", 'a', ItemManager.lcAversion, 'b', ItemManager.lcConflagration, 'c', ItemManager.obsidianHelmet, 'd', ItemManager.lcFervor, 'e', ItemManager.lcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cursedChest), "aba", "bcd", "ede", 'a', ItemManager.lcAversion, 'b', ItemManager.lcConflagration, 'c', ItemManager.obsidianChest, 'd', ItemManager.lcFervor, 'e', ItemManager.lcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cursedLegs), "aba", "bcd", "ede", 'a', ItemManager.lcAversion, 'b', ItemManager.lcConflagration, 'c', ItemManager.obsidianLegs, 'd', ItemManager.lcFervor, 'e', ItemManager.lcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cursedBoots), "aba", "bcd", "ede", 'a', ItemManager.lcAversion, 'b', ItemManager.lcConflagration, 'c', ItemManager.obsidianBoots, 'd', ItemManager.lcFervor, 'e', ItemManager.lcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzSword), "  x", " z ", "y  ", 'x', ItemManager.quartzBar, 'y', Items.stick, 'z', Items.blaze_rod);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianSword), "  x", " z ", "y  ", 'x', ItemManager.obsidianBar, 'y', Items.stick, 'z', Items.emerald);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blessedQuartzSword), "aba", "bcd", "ede", 'a', ItemManager.gbAether, 'b', ItemManager.gbIllumination, 'c', ItemManager.quartzSword, 'd', ItemManager.gbIncandescence, 'e', ItemManager.gbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.cursedObsidianSword), "aba", "bcd", "ede", 'a', ItemManager.gcAversion, 'b', ItemManager.gcConflagration, 'c', ItemManager.obsidianSword, 'd', ItemManager.gcFervor, 'e', ItemManager.gcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbAether, 2), "xxx", "x x", "xxx", 'x', ItemManager.lbAether);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbIllumination, 2), "xxx", "x x", "xxx", 'x', ItemManager.lbIllumination);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbIncandescence, 2), "xxx", "x x", "xxx", 'x', ItemManager.lbIncandescence);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbLightsEmbrace, 2), "xxx", "x x", "xxx", 'x', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcAversion, 2), "xxx", "x x", "xxx", 'x', ItemManager.lcAversion);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcConflagration, 2), "xxx", "x x", "xxx", 'x', ItemManager.lcConflagration);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcFervor, 2), "xxx", "x x", "xxx", 'x', ItemManager.lcFervor);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcReckoning, 2), "xxx", "x x", "xxx", 'x', ItemManager.lcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.altarBlock), " a ", "bcb", "ccc", 'a', Items.book, 'b', Items.gold_ingot, 'c', Blocks.quartz_block);
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.darkAltar), " a ", "bcb", "ccc", 'a', Items.book, 'b', Items.emerald, 'c', Blocks.obsidian);
	}//end addCraftingRecipes
		  
		 
	public static void addSmeltingRecipes() {//   <>gui butts> print type.yes
		//input, then output, then a number showing how much experience is gained from this action
		GameRegistry.addSmelting(new ItemStack(Blocks.obsidian), new ItemStack(ItemManager.obsidianBar), 0.3f);
		GameRegistry.addSmelting(new ItemStack(Items.quartz), new ItemStack(ItemManager.quartzBar), 0.3f); 
	}
}
