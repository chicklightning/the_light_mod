package com.light.main;

import net.minecraft.client.model.ModelBiped;

import com.light.entity.AltarBook;
import com.light.render.RenderAltar;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;



public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
        //add a new rendering handler for every entity that needs to be rendered
		ClientRegistry.bindTileEntitySpecialRenderer(AltarBook.class, new RenderAltar());
    }

	public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
}
