package com.absurdg130.mody.handler;

import cpw.mods.fml.common.FMLCommonHandler;

public class handleCrafting {
public static void handleSpecialCrafting(){
	FMLCommonHandler.instance().bus().register(new CraftingHandler());
}
}
