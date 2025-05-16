package com.weaklink.alloyedarmor.datagen;

import com.weaklink.alloyedarmor.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ELECTRUM_BLOCK)
                .add(ModBlocks.STRATOSPHITE_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.LUXITE_BLOCK)
                .add(ModBlocks.MAGMITE_BLOCK);

    }
}
