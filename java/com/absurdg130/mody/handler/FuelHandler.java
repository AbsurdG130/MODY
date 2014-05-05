package com.absurdg130.mody.handler;

import com.absurdg130.mody.items.ModItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.TinyWoodPiece) return 50;
		return 0;
	}

}
