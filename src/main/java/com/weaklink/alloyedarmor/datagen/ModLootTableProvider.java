package com.weaklink.alloyedarmor.datagen;

import com.weaklink.alloyedarmor.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
//  ***THIS MUST BE PUBLIC***
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ELECTRUM_BLOCK);
        addDrop(ModBlocks.STRATOSPHITE_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.LUXITE_BLOCK);
        addDrop(ModBlocks.MAGMITE_BLOCK);
    }
}
