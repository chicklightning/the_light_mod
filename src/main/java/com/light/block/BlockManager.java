package com.light.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockManager {

	public static void mainRegistry() {
        intializeBlock();
        registerBlock();
    }
	
	public static Block altarBlock;
 
    public static void intializeBlock() {
    	//change the material based on how you want the block to break: by hand, pickaxe, etc.
    	altarBlock = new AltarBlock(Material.rock);
    }
 
    public static void registerBlock() {
    	GameRegistry.registerBlock(altarBlock, altarBlock.getUnlocalizedName());
    }
    
}
