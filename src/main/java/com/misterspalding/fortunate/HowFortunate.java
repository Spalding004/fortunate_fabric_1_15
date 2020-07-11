package com.misterspalding.fortunate;

import com.misterspalding.fortunate.inits.ItemDec;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class HowFortunate implements ModInitializer {
	
	public static String MOD_ID = "fortunate";
	
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("fortunate", "mod_creative_tab"),
			() -> new ItemStack(ItemDec.IRON_CHUNK));
	
	@Override
	public void onInitialize() {
		ItemDec.registerItems();

	
	}
}
