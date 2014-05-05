package com.absurdg130.mody.help;

import com.absurdg130.mody.handler.FuelHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class FuelRegisterHelper {
	public static void Register() {
GameRegistry.registerFuelHandler(new FuelHandler());
	}
}
