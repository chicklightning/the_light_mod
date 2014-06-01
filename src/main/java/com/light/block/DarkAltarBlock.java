package com.light.block;

import java.util.Random;

import com.light.entity.AltarBook;
import com.light.item.ItemManager;
import com.light.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class DarkAltarBlock extends BlockContainer {

    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon bottom;
	
	protected DarkAltarBlock(Material material) {
		super(material);
		this.setLightOpacity(10);
		this.setResistance(100);
		this.setBlockUnbreakable();
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setStepSound(Block.soundTypeGravel);
        this.setBlockName("DarkAltarBlock");
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
        this.blockIcon = iconReg.registerIcon(StringLibrary.MODID + ":dark_altar_side");
        this.top = iconReg.registerIcon(StringLibrary.MODID + ":dark_altar_top");
        this.bottom = iconReg.registerIcon(StringLibrary.MODID + ":dark_altar_bottom");
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
        	
    		if(random == 1 || random == 2)
            {
				player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 4000, 2));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 4400, 3));
            }
            
            else if(random == 3 || random == 4)
            {
				player.setFire(19);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 4400, 3));
            }
            
            else if(random == 5 || random == 6)
            {
				player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 1, 4));
				player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 400, 2));
            }
            
            else if(random == 7 || random == 8)
            {
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 1000, 3));
				player.addPotionEffect(new PotionEffect(Potion.wither.getId(), 100, 3));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 4000, 3));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 4000, 3));
				player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 4000, 3));
				player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), 1, 6));
            }
            
            else if(random == 33)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lcAversion, 1)));
            }
            
            else if(random == 34)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lcConflagration, 1)));
            }
            
            else if(random == 35)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lcFervor, 1)));
            }
            
            else if(random == 36)
            {
            	world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(ItemManager.lcReckoning, 1)));
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
