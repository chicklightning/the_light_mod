package com.light.recipe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


import com.light.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;


public class RecipeManager {

	public static void mainRegistry(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}//end mainRegistry
		 
	public static void addCraftingRecipes() {
		ItemStack ironBootsLE = new ItemStack(Items.iron_boots);
		ironBootsLE.addEnchantment(Enchantment.thorns, 2);
		ironBootsLE.addEnchantment(Enchantment.featherFalling, 2);
		ItemStack diamondBootsLE = new ItemStack(Items.diamond_boots);
		diamondBootsLE.addEnchantment(Enchantment.thorns, 3);
		diamondBootsLE.addEnchantment(Enchantment.featherFalling, 3);
		
		ItemStack ironHelmIL = new ItemStack(Items.iron_helmet);
		ironHelmIL.addEnchantment(Enchantment.respiration, 2);
		ironHelmIL.addEnchantment(Enchantment.fireProtection, 2);
		ItemStack diamondHelmIL = new ItemStack(Items.diamond_helmet);
		diamondHelmIL.addEnchantment(Enchantment.respiration, 3);
		diamondHelmIL.addEnchantment(Enchantment.fireProtection, 3);
		
		ItemStack ironChestIC = new ItemStack(Items.iron_chestplate);
		ironChestIC.addEnchantment(Enchantment.protection, 2);
		ironChestIC.addEnchantment(Enchantment.unbreaking, 2);
		ItemStack diamondChestIC = new ItemStack(Items.diamond_chestplate);
		diamondChestIC.addEnchantment(Enchantment.protection, 3);
		diamondChestIC.addEnchantment(Enchantment.unbreaking, 3);
		
		ItemStack diamondSwordAV = new ItemStack(Items.diamond_sword);
		diamondSwordAV.addEnchantment(Enchantment.fireAspect, 3);
		diamondSwordAV.addEnchantment(Enchantment.looting, 3);
		ItemStack ironSwordAV = new ItemStack(Items.iron_sword);
		ironSwordAV.addEnchantment(Enchantment.fireAspect, 2);
		ironSwordAV.addEnchantment(Enchantment.looting, 2);
		
		ItemStack bowCON = new ItemStack(Items.bow);
		bowCON.addEnchantment(Enchantment.infinity, 3);
		bowCON.addEnchantment(Enchantment.flame, 3);
		
		ItemStack ironSwordAE = new ItemStack(Items.iron_sword);
		ironSwordAE.addEnchantment(Enchantment.knockback, 2);
		ironSwordAE.addEnchantment(Enchantment.sharpness, 2);
		ItemStack diamondSwordAE = new ItemStack(Items.diamond_sword);
		diamondSwordAE.addEnchantment(Enchantment.knockback, 3);
		diamondSwordAE.addEnchantment(Enchantment.sharpness, 3);
		
		ItemStack bowFERV = new ItemStack(Items.bow);
		bowFERV.addEnchantment(Enchantment.infinity, 3);
		bowFERV.addEnchantment(Enchantment.punch, 3);
		
		ItemStack ironAxeRECK = new ItemStack(Items.iron_pickaxe);
		ironAxeRECK.addEnchantment(Enchantment.silkTouch, 2);
		ironAxeRECK.addEnchantment(Enchantment.fortune, 2);
		ItemStack diamondAxeRECK = new ItemStack(Items.diamond_pickaxe);
		diamondAxeRECK.addEnchantment(Enchantment.silkTouch, 3);
		diamondAxeRECK.addEnchantment(Enchantment.fortune, 3);
		
		//guess that this shapeless recipe (one where order doesn't matter) does this shit
		//creates a new ItemStack (versus an Item) from one block of dirt ugh
		//takes an unlimited number of Object "items"
		GameRegistry.addShapelessRecipe(ironBootsLE, ItemManager.gbLightsEmbrace, Items.iron_boots);
		GameRegistry.addShapelessRecipe(diamondBootsLE, ItemManager.gbLightsEmbrace, Items.diamond_boots);
		GameRegistry.addShapelessRecipe(diamondSwordAV, ItemManager.gcAversion, Items.diamond_sword);
		GameRegistry.addShapelessRecipe(ironSwordAV, ItemManager.gcAversion, Items.iron_sword);
		GameRegistry.addShapelessRecipe(ironHelmIL, ItemManager.gbIllumination, Items.iron_helmet);
		GameRegistry.addShapelessRecipe(diamondHelmIL, ItemManager.gbIllumination, Items.diamond_helmet);
		GameRegistry.addShapelessRecipe(ironChestIC, ItemManager.gbIncandescence, Items.iron_chestplate);
		GameRegistry.addShapelessRecipe(diamondChestIC, ItemManager.gbIncandescence, Items.diamond_chestplate);
		GameRegistry.addShapelessRecipe(bowCON, ItemManager.gcConflagration, Items.bow);
		GameRegistry.addShapelessRecipe(ironSwordAE, ItemManager.gbAether, Items.iron_sword);
		GameRegistry.addShapelessRecipe(diamondSwordAE, ItemManager.gbAether, Items.diamond_sword);
		GameRegistry.addShapelessRecipe(bowFERV, ItemManager.gcFervor, Items.bow);
		GameRegistry.addShapelessRecipe(ironAxeRECK, ItemManager.gcReckoning, Items.iron_pickaxe);
		GameRegistry.addShapelessRecipe(diamondAxeRECK, ItemManager.gcReckoning, Items.diamond_pickaxe);
		
		//Shaped recipe on a 2x2 square (personal inventory), where square is like row 1: x y and row 2: y x
		//here the x's are stone blocks and the y's are gravel
		
		//here it's a 3x3 square, with each row listed respectively; add as many variables as needed in whatever combination
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzHelmet), "   ", "xxx", "x x", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzChest), "x x", "xxx", "xxx", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzLegs), "xxx", "x x", "x x", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzBoots), "   ", "x x", "x x", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzSword), "aba", "bcd", "ede", 'a', ItemManager.gbAether, 'b', ItemManager.gbIllumination, 'c', Blocks.quartz_block, 'd', ItemManager.gbIncandescence, 'e', ItemManager.gbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.obsidianSword), "aba", "bcd", "ede", 'a', ItemManager.gcAversion, 'b', ItemManager.gcConflagration, 'c', Blocks.obsidian, 'd', ItemManager.gcFervor, 'e', ItemManager.gcReckoning);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbAether), "x x", "x x", "x x", 'x', ItemManager.lbAether);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbIllumination), "x x", "x x", "x x", 'x', ItemManager.lbIllumination);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbIncandescence), "x x", "x x", "x x", 'x', ItemManager.lbIncandescence);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gbLightsEmbrace), "x x", "x x", "x x", 'x', ItemManager.lbLightsEmbrace);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcAversion), "x x", "x x", "x x", 'x', ItemManager.lcAversion);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcConflagration), "x x", "x x", "x x", 'x', ItemManager.lcConflagration);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcFervor), "x x", "x x", "x x", 'x', ItemManager.lcFervor);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.gcReckoning), "x x", "x x", "x x", 'x', ItemManager.lcReckoning);
	}//end addCraftingRecipes
		  
		 
	public static void addSmeltingRecipes() {   
		//input, then output, then a number showing how much experience is gained from this action
		
	}
}
