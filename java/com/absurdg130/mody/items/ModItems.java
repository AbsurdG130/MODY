package com.absurdg130.mody.items;

import java.util.Random;

import com.absurdg130.mody.blocks.ModBlocks;
import com.absurdg130.mody.help.RegisterHelper;
import com.absurdg130.mody.worldgen.ModyWorldGenOre;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	// non-functional items.
	public static Item MithrilIngot;
	public static Item ManganeseShard;

	// Tools
	public static Item MithrilPickaxe;
	public static Item MithrilAxe;
	public static Item MithrilShovel;
	public static Item MagicMithrilStaff;
	public static Item WoodSmallAxe;
	public static Item MithrilSword;

	// Armor
	public static Item MithrilHelmet;

	// materials
	public static ToolMaterial MithrilToolMaterial = EnumHelper.addToolMaterial(
			"MythrylToolMaterial", 2000, 2000, 100, 1.0F, 100);
	public static ToolMaterial MithrilToolShovelMaterial = EnumHelper.addToolMaterial(
			"MithrilToolShovelMaterial", 2000, 2000, 100, 1.0F, 100);
	public static ToolMaterial MithrilSwordMaterial = EnumHelper.addToolMaterial(
			"MithrilSwordShovelMaterial", 2000, 2000, 3000, 1.0F, 100);
	public static ArmorMaterial MithrilArmorMaterial = EnumHelper.addArmorMaterial(
			"MythrylArmorMaterial", 20, new int[] { 2, 6, 5, 2 }, 20);
	// fuel
	public static Item TinyWoodPiece;

	/**
	 * We call this in our main mod file. We add all items here to the game.
	 */
	public static void loadItems() {
		MithrilIngot = new ItemMithrilIngot();
		ManganeseShard = new ItemManganeseshard();
	
		RegisterHelper.registerItem(MithrilIngot);

		RegisterHelper.registerItem(ManganeseShard);
		

		// Tools
		MithrilPickaxe = new ItemMithrilPickaxe(MithrilToolMaterial);
		
		MithrilAxe = new ItemMithrilAxe(MithrilToolMaterial);
		
		MithrilShovel = new ItemMithrilShovel(MithrilToolShovelMaterial);
		
		MagicMithrilStaff = new ItemMagicMithrilStaff();
	
		WoodSmallAxe = new ItemWoodSmallAxe();
		
		MithrilSword = new ItemMithrilSword(MithrilToolMaterial);


		RegisterHelper.registerItem(MithrilPickaxe);
	
		RegisterHelper.registerItem(MithrilAxe);
		
		RegisterHelper.registerItem(MithrilShovel);
	
		RegisterHelper.registerItem(MagicMithrilStaff);

		RegisterHelper.registerItem(WoodSmallAxe);
		
		RegisterHelper.registerItem(MithrilSword);

		// Armor
		MithrilHelmet = new ItemMithrilArmor(MithrilArmorMaterial, 0,
				"MithrilHelmet");
	

		RegisterHelper.registerItem(MithrilHelmet);

		// fuel
		TinyWoodPiece = new ItemTinyWoodPiece();

		RegisterHelper.registerItem(TinyWoodPiece);
	
	}
	
}