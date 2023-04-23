package com.pojlikno.badhabits.blocks;

import java.util.Random;

import com.pojlikno.badhabits.init.InitBlocks;
import com.pojlikno.badhabits.init.InitItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTobacco extends BlockCrops {
    public static final PropertyInteger TOBACCO_AGE = PropertyInteger.create("age", 0, 3);
	private static final AxisAlignedBB[] TOBACCO_AABB = new AxisAlignedBB[] {
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D),
			new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
	
	public BlockTobacco(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(this.getAgeProperty(), Integer.valueOf(0)));
        this.setTickRandomly(true);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
        this.disableStats();
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
    protected PropertyInteger getAgeProperty()
    {
        return TOBACCO_AGE;
    }

	@Override
    public int getMaxAge()
    {
        return 3;
    }
	
	@Override
	protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {TOBACCO_AGE});
    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return TOBACCO_AABB[(state.getValue(this.getAgeProperty())).intValue()];
	}
	
	@Override
	protected Item getSeed() {
		return InitItems.TOBACCO_SEEDS;
	}
	
	@Override
	protected Item getCrop() {
		return InitItems.TOBACCO_LEAVES;
	}
}
