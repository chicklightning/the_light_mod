package com.light.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import com.light.entity.AltarBook;
import com.light.item.ItemManager;
import com.light.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class AltarBlock extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon field_149950_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_149949_b;
	
	protected AltarBlock(Material material)
    {
		super(material);
		this.setLightLevel(3);
		this.setResistance(100);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setStepSound(Block.soundTypeAnvil);
        this.setBlockName("AltarBlock");
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
    }
	
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
	
    public boolean isOpaqueCube()
    {
        return false;
    }
	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(StringLibrary.MODID + ":altar_side");
        this.field_149950_a = p_149651_1_.registerIcon(StringLibrary.MODID + ":altar_top");
        this.field_149949_b = p_149651_1_.registerIcon(StringLibrary.MODID + ":altar_bottom");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 0 ? this.field_149949_b : (p_149691_1_ == 1 ? this.field_149950_a : this.blockIcon);
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        Random rand = new Random();
    	
    	if (!world.isRemote)
        {
    		int random = rand.nextInt(512) + 1;
            
        	player.clearActivePotions();
        	
    		if(random >= 1 && random <= 8)
            {
            	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 360, 2));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 360, 2));
            }
            
            else if(random >= 9 && random <= 16)
            {
            	player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 60, 1));
				player.addExperience(20);
            }
            
            else if(random >= 17 && random <= 24)
            {
            	player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 6000, 2));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 500, 2));
            }
            
            else if(random >= 25 && random <= 32)
            {
            	player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5000, 3));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 80, 1));
            }
            
            else if(random == 33)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.gbAether, 1)));
            }
            
            else if(random == 34)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.gbIllumination, 1)));
            }
            
            else if(random == 35)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.gbIncandescence, 1)));
            }
            
            else if(random == 36)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.gbLightsEmbrace, 1)));
            }

        	return true;
        }
        else
        	return false;
    }

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new AltarBook();
	}
	
}
