package com.pojlikno.fm.items;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;
import com.pojlikno.fm.utils.interfaces.IHasModel;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemGreenberrySeed extends Item implements IHasModel, IPlantable {
	public ItemGreenberrySeed(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_MISC_TAB);
		
		InitItems.ITEMS.add(this);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, 
			World worldIn, 
			BlockPos pos, 
			EnumHand hand, 
			EnumFacing facing, 
			float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		if (facing == EnumFacing.UP && 
				player.canPlayerEdit(pos.offset(facing), facing, stack) && 
				state.getBlock().canSustainPlant(state, worldIn, pos, facing, this) && 
				worldIn.isAirBlock(pos.up())) {
			worldIn.setBlockState(pos.up(), InitBlocks.GREENBERRY_CROP.getDefaultState());
			stack.shrink(1);
			return EnumActionResult.SUCCESS;
		}
		else return EnumActionResult.FAIL;
	}
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Crop;
	}
	
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return InitBlocks.GREENBERRY_CROP.getDefaultState();
	}
	
	@Override
	public void registerModels() {
		FirstMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
