package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class ItemManganeseshard extends Item 
{
	public ItemManganeseshard()
	{
		super();
		setUnlocalizedName("ManganeseShard");
		
		setMaxStackSize(64);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabMaterials);
		setCreativeTab(ModCreativeTabs.modyTab);
	}
}