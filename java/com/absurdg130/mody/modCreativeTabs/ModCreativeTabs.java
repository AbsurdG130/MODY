package com.absurdg130.mody.modCreativeTabs;

import com.absurdg130.mody.items.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.*;
import net.minecraft.item.Item;

public class ModCreativeTabs {
public static CreativeTabs modyTab;	
	
	public static CreativeTabs addTab(){
		return modyTab = new CreativeTabs ("Mody") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return ModItems.MithrilIngot;
			
			}
			
		};
	}

}
