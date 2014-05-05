   package com.absurdg130.mody.items;

import com.absurdg130.mody.help.Reference;
import com.absurdg130.mody.modCreativeTabs.ModCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemMithrilArmor extends ItemArmor
{
	public ItemMithrilArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setCreativeTab(ModCreativeTabs.modyTab);
		setCreativeTab(CreativeTabs.tabCombat);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

    
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.MithrilHelmet)
		{
			return Reference.MODID + ":models/armor/Mithrilarmor1.png";
		}else
		{
			System.out.println("Invalid Item ItemMithrilArmor");
			return null;
		}
		
	}
}