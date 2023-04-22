package com.pojlikno.badhabits.init;

import java.util.ArrayList;
import java.util.List;

import com.pojlikno.badhabits.blocks.BlockTobacco;

import net.minecraft.block.Block;

public class InitBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Crops
	public static final Block TOBACCO = new BlockTobacco("tobacco");
}
