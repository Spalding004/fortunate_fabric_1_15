package com.misterspalding.fortunate;

import com.misterspalding.fortunate.inits.ItemDec;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;

public class HowFortunate implements ModInitializer {
	
	public static String MOD_ID = "fortunate";
	
	
	@Override
	public void onInitialize() {
		ItemDec.registerItems();

	
	}
}
