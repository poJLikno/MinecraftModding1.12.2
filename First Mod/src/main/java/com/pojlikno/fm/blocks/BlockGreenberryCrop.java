package com.pojlikno.fm.blocks;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.utils.interfaces.IHasModel;

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

public class BlockGreenberryCrop extends BlockCrops implements IHasModel {
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
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			if (this.isMaxAge(state)) {
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(InitItems.GREENBERRY, 2)));
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(InitItems.GREENBERRY_SEED, 3)));
			}
			else {
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(InitItems.GREENBERRY_SEED, 1)));
			}
		}
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
	public void registerModels() {
		FirstMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
