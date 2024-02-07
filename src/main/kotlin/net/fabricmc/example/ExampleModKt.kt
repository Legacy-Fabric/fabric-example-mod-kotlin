package net.fabricmc.example

import net.fabricmc.api.ModInitializer


// if you wish for a different type of entrypoint, check the documentation here: https://github.com/FabricMC/fabric-language-kotlin?tab=readme-ov-file#entrypoint-samples

class ExampleModKt : ModInitializer {
    override fun onInitialize() {
        println("Hello Fabric world!")
    }
}
