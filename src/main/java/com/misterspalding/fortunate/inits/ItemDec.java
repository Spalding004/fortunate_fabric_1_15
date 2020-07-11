package com.misterspalding.fortunate.inits;

import java.util.ArrayList;
import java.util.List;

import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.items.ChunkItem;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemDec {

	public static List<ChunkItem> CHUNK_ITEMS = new ArrayList<ChunkItem>();
	public static final Item IRON_CHUNK = new ChunkItem("iron");
	public static final Item GOLD_CHUNK = new ChunkItem("gold");
	
	public static void registerItems() {
		for (ChunkItem item : CHUNK_ITEMS) {
			Registry.register(Registry.ITEM, new Identifier(HowFortunate.MOD_ID, item.getItemName()), item);
		}
		
		
	}
}


