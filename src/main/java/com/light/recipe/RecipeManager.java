package com.light.recipe;

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
		//guess that this shapeless recipe (one where order doesn't matter) does this shit
		//creates a new ItemStack (versus an Item) from one block of dirt ugh
		//takes an unlimited number of Object "items"
		
		//Shaped recipe on a 2x2 square (personal inventory), where square is like row 1: x y and row 2: y x
		//here the x's are stone blocks and the y's are gravel
		
		//here it's a 3x3 square, with each row listed respectively; add as many variables as needed in whatever combination
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzHelmet), "   ", "xxx", "x x", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzChest), "x x", "xxx", "xxx", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzLegs), "xxx", "x x", "x x", 'x', Items.quartz);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.quartzBoots), "   ", "x x", "x x", 'x', Items.quartz);
	}//end addCraftingRecipes    
		  
		 
	public static void addSmeltingRecipes() {   
		//input, then output, then a number showing how much experience is gained from this action
	}
}
