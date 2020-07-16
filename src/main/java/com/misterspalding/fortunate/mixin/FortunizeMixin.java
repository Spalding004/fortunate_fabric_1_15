package com.misterspalding.fortunate.mixin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

@Mixin(Block.class)
public class FortunizeMixin {
	@Inject(method = "net/minecraft/block/Block.getDroppedStacks(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/item/ItemStack;)Ljava/util/List;", at = @At("HEAD"), cancellable = true)
	private static void getDroppedStacks(BlockState state, ServerWorld world, BlockPos pos, BlockEntity blockEntity,
			Entity entity, ItemStack stack, CallbackInfoReturnable<List<ItemStack>> cb) {
		//System.out.println(state.getBlock().getName().toString());
		List<ItemStack> return_stack = new ArrayList<ItemStack>();
		int fortune = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack);
		Random random = new Random();
		
		if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
			
			if (state.getBlock().getName().toString().contains("iron_ore")) {
				return_stack.add(new ItemStack(ItemDec.IRON_CHUNK, 1 + random.nextInt(1 + fortune)));
				cb.setReturnValue(return_stack);
			}
			
			if (state.getBlock().getName().toString().contains("gold_ore")) {
				return_stack.add(new ItemStack(ItemDec.GOLD_CHUNK, 1 + random.nextInt(1 + fortune)));
				cb.setReturnValue(return_stack);
			}
			
		}
	}
}