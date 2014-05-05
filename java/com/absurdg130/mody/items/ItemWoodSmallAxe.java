package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.Item;

public class ItemWoodSmallAxe extends Item {
	public ItemWoodSmallAxe() {
		super();
		setUnlocalizedName("WoodSmallAxe");
		
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		this.maxStackSize = 1;
		this.setMaxDamage(10);
		this.setNoRepair();
		this.setCreativeTab(ModCreativeTabs.modyTab);
	}
	
}
