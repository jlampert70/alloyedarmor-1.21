package com.weaklink.alloyedarmor.item;

import com.weaklink.alloyedarmor.AlloyedArmor;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STRATOSPHITE_INGOT = registerItem("stratosphite_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AlloyedArmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlloyedArmor.LOGGER.info("registering dem mod items for alloyed armor");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STRATOSPHITE_INGOT);
        });
    }
}
