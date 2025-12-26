package net.legacyfabric.example

import net.fabricmc.api.ModInitializer

object ExampleMod : ModInitializer {
	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		println("Hello Fabric world!")
	}
}
