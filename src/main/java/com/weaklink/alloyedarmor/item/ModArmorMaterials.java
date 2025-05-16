package com.weaklink.alloyedarmor.item;

import com.weaklink.alloyedarmor.AlloyedArmor;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> ELECTRUM_ARMOR_MATERIAL = registerArmorMaterial("electrum",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, () -> Ingredient.ofItems(ModItems.ELECTRUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AlloyedArmor.MOD_ID, "electrum_ingot"))),
                    0, 0));

    public static final RegistryEntry<ArmorMaterial> STRATOSPHITE_ARMOR_MATERIAL = registerArmorMaterial("stratosphite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 9);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.STRATOSPHITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AlloyedArmor.MOD_ID, "stratosphite_ingot"))),
                    2, 0));

    public static final RegistryEntry<ArmorMaterial> TITANIUM_ARMOR_MATERIAL = registerArmorMaterial("titanium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 14);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(AlloyedArmor.MOD_ID, "titanium_ingot"))),
                    3, 1));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(AlloyedArmor.MOD_ID, name), material.get());
    }
}
