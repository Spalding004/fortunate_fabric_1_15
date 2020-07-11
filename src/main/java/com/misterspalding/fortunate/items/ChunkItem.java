package com.misterspalding.fortunate.items;

import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ChunkItem extends Item {

	private String name;

	public ChunkItem(String ore) {
		super(new Item.Settings().group(HowFortunate.ITEM_GROUP));
		// TODO Auto-generated constructor stub
		this.name = ore;
		ItemDec.CHUNK_ITEMS.add(this);
	}

	public String getItemName() {
		return this.name+"_chunk";
	}
}
