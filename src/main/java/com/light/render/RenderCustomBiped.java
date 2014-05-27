package com.light.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.light.lib.StringLibrary;

public class RenderCustomBiped extends RenderBiped {

	public RenderCustomBiped(ModelBiped par1ModelBiped, float par2) {
		super(par1ModelBiped, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return new ResourceLocation(StringLibrary.MODID + ":textures/entity/guilain_texture.png");
	}
}
