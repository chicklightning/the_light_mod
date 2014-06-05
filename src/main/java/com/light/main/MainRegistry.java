package com.light.main;

import com.light.block.BlockManager;
import com.light.entity.EntityManager;
import com.light.item.ItemManager;
import com.light.lib.StringLibrary;
import com.light.recipe.RecipeManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)

public class MainRegistry {

	@SidedProxy(clientSide = "com.light.main.ClientProxy", serverSide = "com.light.main.CommonProxy")
	public static ClientProxy proxy;
	
    /**
    * Loads before
    * @param PreEvent
    */
    @EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
    	//registers and creates new instances of stuff in each manager
    	ItemManager.mainRegistry();
    	BlockManager.mainRegistry();
    	EntityManager.mainRegistry();
    	RecipeManager.mainRegistry();
    	proxy.registerRenderThings();
    }
 
    /**
    * Loads during
    * @param Event
    */
    @EventHandler
    public static void Load(FMLInitializationEvent Event) {    
 
    }   
 
    /**
    * Loads after
    * @param PostEvent
    */
    @EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
 
    }
    
}
