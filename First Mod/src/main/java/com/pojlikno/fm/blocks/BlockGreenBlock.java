package com.pojlikno.fm.blocks;

import com.pojlikno.fm.FirstMod;
import com.pojlikno.fm.init.InitBlocks;
import com.pojlikno.fm.init.InitItems;
import com.pojlikno.fm.init.InitTabs;
import com.pojlikno.fm.utils.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockGreenBlock extends Block implements IHasModel {
	
	public BlockGreenBlock(String name, Material materialIn) {
		super(materialIn);
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(InitTabs.GREEN_MISC_TAB);
		this.setHardness(3);
		this.setResistance(3);
		this.setSoundType(SoundType.METAL);
		
		InitBlocks.BLOCKS.add(this);
		InitItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		FirstMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
