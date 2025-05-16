package com.weaklink.alloyedarmor.item;

import com.weaklink.alloyedarmor.AlloyedArmor;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //electrum
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new Item.Settings()));
    public static final Item ELECTRUM_BLOCK = registerItem("electrum_block", new Item(new Item.Settings()));
    public static final Item ELECTRUM_HELMET = registerItem("electrum_helmet", new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(13))));
    public static final Item ELECTRUM_CHESTPLATE = registerItem("electrum_chestplate", new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(13))));
    public static final Item ELECTRUM_LEGGINGS = registerItem("electrum_leggings", new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
            .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(13))));
    public static final Item ELECTRUM_BOOTS = registerItem("electrum_boots", new ArmorItem(ModArmorMaterials.ELECTRUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(13))));

    public static final Item STRATOSPHITE_INGOT = registerItem("stratosphite_ingot", new Item(new Item.Settings()));
    public static final Item STRATOSPHITE_BLOCK = registerItem("stratosphite_block", new Item(new Item.Settings()));

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));
    public static final Item TITANIUM_BLOCK = registerItem("titanium_block", new Item(new Item.Settings()));

    public static final Item LUXITE_INGOT = registerItem("luxite_ingot", new Item(new Item.Settings()));
    public static final Item LUXITE_BLOCK = registerItem("luxite_block", new Item(new Item.Settings()));

    public static final Item MAGMITE_INGOT = registerItem("magmite_ingot", new Item(new Item.Settings()));
    public static final Item MAGMITE_BLOCK = registerItem("magmite_block", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AlloyedArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlloyedArmor.LOGGER.info("registering dem mod items for alloyed armor");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ELECTRUM_INGOT);
            fabricItemGroupEntries.add(ELECTRUM_BLOCK);

            fabricItemGroupEntries.add(STRATOSPHITE_INGOT);
            fabricItemGroupEntries.add(STRATOSPHITE_BLOCK);

            fabricItemGroupEntries.add(TITANIUM_INGOT);
            fabricItemGroupEntries.add(TITANIUM_BLOCK);

            fabricItemGroupEntries.add(LUXITE_INGOT);
            fabricItemGroupEntries.add(LUXITE_BLOCK);

            fabricItemGroupEntries.add(MAGMITE_INGOT);
            fabricItemGroupEntries.add(MAGMITE_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ELECTRUM_HELMET);
            fabricItemGroupEntries.add(ELECTRUM_CHESTPLATE);
            fabricItemGroupEntries.add(ELECTRUM_LEGGINGS);
            fabricItemGroupEntries.add(ELECTRUM_BOOTS);
        });
    }
}
