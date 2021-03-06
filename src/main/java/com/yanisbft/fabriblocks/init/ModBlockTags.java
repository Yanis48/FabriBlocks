package com.yanisbft.fabriblocks.init;

import com.yanisbft.fabriblocks.FabriBlocks;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModBlockTags {
	
	public static final Tag<Block> LEAF_CARPETS = register("leaf_carpets");
	public static final Tag<Block> BOOKSHELVES = register("bookshelves");
	public static final Tag<Block> LECTERNS = register("lecterns");
	
	public static Tag<Block> register(String id) {
		return TagRegistry.block(new Identifier(FabriBlocks.COMMON_NAMESPACE, id));
	}
}
