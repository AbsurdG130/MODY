package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.ItemAxe;

public class ItemMithrilAxe extends ItemAxe 
{
	public ItemMithrilAxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("MithrilAxe");
		setCreativeTab(ModCreativeTabs.modyTab);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		
	}
}