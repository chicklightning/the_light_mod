package com.light.main;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy {

	public void registerRenderThings() {
        //add a new rendering handler for every entity that needs to be rendered
    }

	public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}
