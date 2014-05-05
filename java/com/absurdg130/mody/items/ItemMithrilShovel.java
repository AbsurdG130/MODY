package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.ItemSpade;

public class ItemMithrilShovel extends ItemSpade
{
	public ItemMithrilShovel(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("MithrilShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
	}
}
