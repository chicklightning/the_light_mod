package com.light.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;


public class LesserBlessing extends ItemFood {

	private int ID;

	public LesserBlessing(int p_i45339_1_, float p_i45339_2_,
			boolean p_i45339_3_, int blessingID) {
		super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
		this.setAlwaysEdible();
		this.setMaxStackSize(4);
		ID = blessingID;
		this.setCreativeTab(CreativeTabs.tabMisc);
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(this), 1, 2, 15));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(this),1, 2, 25));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(this),1, 2, 10));
	}
	
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		super.onFoodEaten(stack, world, player);
		
		//creates a potion effect upon consumption; "isRemote" is used to make sure
		//actions are not duplicated client AND server side
		if(!world.isRemote)
		{
			//first arg: gets specific potion ID, 2: duration in ticks of the potion (20 ticks/sec)
			//third arg: potion amplifier, how strong the potion is
			if(this.ID == 1)
			{
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 360, 2));
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 360, 2));
			}
			
			else if(this.ID == 2)
			{
				player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 60, 1));
				player.addExperience(15);
			}
			
			else if(this.ID == 3)
			{
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 6000, 2));
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 500, 2));
			}
			
			else if(this.ID == 4)
			{
				player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 4000, 2));
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 4400, 3));
			}
			
			else if(this.ID == 5)
			{
				player.setFire(19);
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 4400, 3));
			}
			
			else if(this.ID == 6)
			{
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 5000, 3));
				player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 80, 1));
			}
			
			else if(this.ID == 7)
			{
				player.addPotionEffect(new PotionEffect(Potion.heal.getId(), 1, 4));
				player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 400, 2));
			}
			
			else if(this.ID == 8)
			{
				player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 10000, 3));
				player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 80, 3));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 4000, 3));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 4000, 3));
				player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 1000, 3));
				player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), 1, 3));
			}
		}
	}
	
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 6;
    }
	
    /**
     * Return an item rarity from EnumRarity
     */
	//change text color!!! mad cool
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.rare;
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
    
	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){ //Additional info
		if(this.ID == 6)
			l.add("This has a f*cking long name.");
		
		else if(this.ID == 5)
			l.add("Tastes better on a full stomach.");
	}
    
}
