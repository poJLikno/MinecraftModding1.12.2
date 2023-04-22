package com.pojlikno.fm.blocks;

import java.util.Random;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockGreenberryCrop extends BlockCrops {
	private static final AxisAlignedBB[] GREENBERRY_CROP_STATES = new AxisAlignedBB[] {
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), 
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)
			};
	
	public BlockGreenberryCrop(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return GREENBERRY_CROP_STATES[(state.getValue(this.getAgeProperty())).intValue()];
	}
	
	@Override
	protected Item getSeed() {
		return InitItems.GREENBERRY_SEED;
	}
	
	@Override
	protected Item getCrop() {
		return InitItems.GREENBERRY;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (rand.nextInt(7) == 0)
        {
            this.checkAndDropBlock(worldIn, pos, state);
        }
        else
        {
            super.updateTick(worldIn, pos, state, rand);
        }
    }
}
