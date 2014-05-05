package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.Item;

public class ItemTinyWoodPiece extends Item {
	public ItemTinyWoodPiece() {
		super();
		setUnlocalizedName("TinyWoodPiece");

		setTextureName(Reference.MODID + ":"
				+ getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
	}
}
