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
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon bottom;
	
	protected AltarBlock(Material material)
    {
		super(material);
		this.setLightLevel(1);
		this.setResistance(100);
		this.setBlockUnbreakable();
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
    public void registerBlockIcons(IIconRegister iconReg)
    {
        this.blockIcon = iconReg.registerIcon(StringLibrary.MODID + ":altar_side");
        this.top = iconReg.registerIcon(StringLibrary.MODID + ":altar_top");
        this.bottom = iconReg.registerIcon(StringLibrary.MODID + ":altar_bottom");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int p_149691_2_)
    {
        return side == 0 ? this.bottom : (side == 1 ? this.top : this.blockIcon);
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        Random rand = new Random();
    	
    	if (!world.isRemote)
        {
    		int random = rand.nextInt(128) + 1;
            
        	player.clearActivePotions();
        	
    		if(random == 1 || random == 2)
            {
            	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 360, 2));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 360, 2));
            }
            
            else if(random == 3 || random == 4)
            {
            	player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 60, 1));
				player.addExperience(20);
            }
            
            else if(random == 5 || random == 6)
            {
            	player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 6000, 2));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 500, 2));
            }
            
            else if(random == 7 || random == 8)
            {
            	player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5000, 3));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 80, 1));
            }
            
            else if(random == 33)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lbAether, 1)));
            }
            
            else if(random == 34)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lbIllumination, 1)));
            }
            
            else if(random == 35)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lbIncandescence, 1)));
            }
            
            else if(random == 36)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lbLightsEmbrace, 1)));
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
