package com.absurdg130.mody.items;



import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.item.ItemPickaxe;

public class ItemMithrilPickaxe extends ItemPickaxe
{
	public ItemMithrilPickaxe(ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName("MithrilPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModCreativeTabs.modyTab);
	}
}