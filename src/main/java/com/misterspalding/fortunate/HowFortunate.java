package com.misterspalding.fortunate;

import java.util.ArrayList;
import java.util.List;

import com.misterspalding.fortunate.inits.ItemDec;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplier;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.LootConditions;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.LootFunction;
import net.minecraft.util.Identifier;

public class HowFortunate implements ModInitializer {

	public static String MOD_ID = "fortunate";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
			.build(new Identifier("fortunate", "mod_creative_tab"), () -> new ItemStack(ItemDec.IRON_CHUNK));

	@Override
	public void onInitialize() {
		ItemDec.registerItems();

		

	}

}
