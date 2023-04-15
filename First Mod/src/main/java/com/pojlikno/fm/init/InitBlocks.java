package com.pojlikno.fm.init;

import java.util.ArrayList;
import java.util.List;

import com.pojlikno.fm.blocks.BlockGreenBlock;
import com.pojlikno.fm.blocks.BlockGreenberryCrop;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InitBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block GREEN_BLOCK = new BlockGreenBlock("green_block", Material.IRON);
	
	//Crops
	public static final Block GREENBERRY_CROP = new BlockGreenberryCrop("greenberry_crop");
}
