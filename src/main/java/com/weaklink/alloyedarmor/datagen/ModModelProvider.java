package com.weaklink.alloyedarmor.datagen;

import com.weaklink.alloyedarmor.block.ModBlocks;
import com.weaklink.alloyedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ELECTRUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELECTRUM_BLOCK, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELECTRUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELECTRUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELECTRUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ELECTRUM_BOOTS));

        itemModelGenerator.register(ModItems.STRATOSPHITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRATOSPHITE_BLOCK, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_BLOCK, Models.GENERATED);

        itemModelGenerator.register(ModItems.LUXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUXITE_BLOCK, Models.GENERATED);

        itemModelGenerator.register(ModItems.MAGMITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGMITE_BLOCK, Models.GENERATED);
    }
}
