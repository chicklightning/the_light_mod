package com.light.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBook;
import net.minecraft.client.renderer.entity.RenderEnchantmentTable;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnchantmentTable;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import com.light.entity.AltarBook;
import com.light.lib.StringLibrary;




public class RenderAltar extends TileEntitySpecialRenderer {

	private AltarBookModel altarBook = new AltarBookModel();
	private static final ResourceLocation bookTexture = new ResourceLocation(StringLibrary.MODID + ":textures/tileentity/altar_book.png");
	
	public void renderTileEntityAt(AltarBook tileentity, double x, double y, double z, float f)
	    {
	        GL11.glPushMatrix();
	        GL11.glTranslatef((float)x + 0.5F, (float)y + 0.75F, (float)z + 0.5F);
	        float f1 = (float)tileentity.field_145926_a + f;
	        GL11.glTranslatef(0.0F, 0.1F + MathHelper.sin(f1 * 0.1F) * 0.01F, 0.0F);
	        float f2;

	        for (f2 = tileentity.field_145928_o - tileentity.field_145925_p; f2 >= (float)Math.PI; f2 -= ((float)Math.PI * 2F))
	        {
	            ;
	        }

	        while (f2 < -(float)Math.PI)
	        {
	            f2 += ((float)Math.PI * 2F);
	        }

	        float f3 = tileentity.field_145925_p + f2 * f;
	        GL11.glRotatef(-f3 * 180.0F / (float)Math.PI, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
	        this.bindTexture(bookTexture);
//	        bindTextureByName(StringLibrary.MODID + ":enchanting_table_book");
	        float f4 = tileentity.field_145931_j + (tileentity.field_145933_i - tileentity.field_145931_j) * f + 0.25F;
	        float f5 = tileentity.field_145931_j + (tileentity.field_145933_i - tileentity.field_145931_j) * f + 0.75F;
	        f4 = (f4 - (float)MathHelper.truncateDoubleToInt((double)f4)) * 1.6F - 0.3F;
	        f5 = (f5 - (float)MathHelper.truncateDoubleToInt((double)f5)) * 1.6F - 0.3F;

	        if (f4 < 0.0F)
	        {
	            f4 = 0.0F;
	        }

	        if (f5 < 0.0F)
	        {
	            f5 = 0.0F;
	        }

	        if (f4 > 1.0F)
	        {
	            f4 = 1.0F;
	        }

	        if (f5 > 1.0F)
	        {
	            f5 = 1.0F;
	        }

	        float f6 = tileentity.field_145927_n + (tileentity.field_145930_m - tileentity.field_145927_n) * f;
	        GL11.glEnable(GL11.GL_CULL_FACE);
	        this.altarBook.render((Entity)null, f1, f4, f5, f6, 0.0F, 0.0625F);
	        GL11.glPopMatrix();
	    }

    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
        this.renderTileEntityAt((AltarBook)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }

}
