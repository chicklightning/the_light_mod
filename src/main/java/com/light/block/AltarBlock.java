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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

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
        //1 in 16 chance of getting a random blessing
		int random = rand.nextInt(128) + 1;
    	
    	if (!world.isRemote)
        {
            if(random == 1 || random == 2)
            {
            	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 360, 2));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 360, 2));
            	return true;
            }
            
            if(random == 3 || random == 4)
            {
            	player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 60, 1));
				player.addExperience(20);
            	return true;
            }
            
            if(random == 5 || random == 6)
            {
            	player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 6000, 2));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 500, 2));
				return true;
            }
            
            if(random == 7 || random == 8)
            {
            	player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5000, 3));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 80, 1));
				return true;
            }
            
            if(random == 9)
            {
            	EntityItem gbLightsEmbrace = new EntityItem(world, x, y, x, new ItemStack(ItemManager.gbLightsEmbrace));
            	world.spawnEntityInWorld(gbLightsEmbrace);
            	return true;
            }
            
            if(random == 10)
            {
            	EntityItem gbAether = new EntityItem(world, x, y, x, new ItemStack(ItemManager.gbAether));
            	world.spawnEntityInWorld(gbAether);
            	return true;
            }
            
            if(random == 11)
            {
            	EntityItem gbIllumination = new EntityItem(world, x, y, x, new ItemStack(ItemManager.gbIllumination));
            	world.spawnEntityInWorld(gbIllumination);
            	return true;
            }
            
            if(random == 12)
            {
            	EntityItem gbIncandescence = new EntityItem(world, x, y, x, new ItemStack(ItemManager.gbIncandescence));
            	world.spawnEntityInWorld(gbIncandescence);
            	return true;
            }
              
        	return false;
        }
        else
        	return false;
    }

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new AltarBook();
	}
	
}