package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.ItemSword;

public class ItemMithrilSword extends ItemSword
{
	public ItemMithrilSword(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("MithrilSword");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
	}
}
