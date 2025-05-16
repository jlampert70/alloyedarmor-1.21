package com.weaklink.alloyedarmor.datagen;

import com.weaklink.alloyedarmor.block.ModBlocks;
import com.weaklink.alloyedarmor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.ELECTRUM_INGOT, RecipeCategory.MISC, ModBlocks.ELECTRUM_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.STRATOSPHITE_INGOT, RecipeCategory.MISC, ModBlocks.STRATOSPHITE_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.TITANIUM_INGOT, RecipeCategory.MISC, ModBlocks.TITANIUM_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.LUXITE_INGOT, RecipeCategory.MISC, ModBlocks.LUXITE_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS,
                ModItems.MAGMITE_INGOT, RecipeCategory.MISC, ModBlocks.MAGMITE_BLOCK);

//        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STRATOSPHITE_HELMET, 1)
//                .pattern("XXX")
//                .pattern("X X")
//                .pattern("   ")
//                .input('X', ModItems.STRATOSPHITE_INGOT)
//                .criterion(hasItem(ModItems.STRATOSPHITE_INGOT), conditionsFromItem(ModItems.STRATOSPHITE_INGOT))
//                .offerTo(recipeExporter);
    }
}
