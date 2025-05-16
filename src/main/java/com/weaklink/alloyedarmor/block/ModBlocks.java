package com.weaklink.alloyedarmor.block;

import com.weaklink.alloyedarmor.AlloyedArmor;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static Block STRATOSPHITE_BLOCK = registerBlock("stratosphite_block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(AbstractBlock.Settings.create().strength(50f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static Block LUXITE_BLOCK = registerBlock("luxite_block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static Block MAGMITE_BLOCK = registerBlock("magmite_block",
            new Block(AbstractBlock.Settings.create().strength(50f).requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AlloyedArmor.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AlloyedArmor.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AlloyedArmor.LOGGER.info("registering dem blocks for alloyed armor");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ELECTRUM_BLOCK);
            fabricItemGroupEntries.add(STRATOSPHITE_BLOCK);
            fabricItemGroupEntries.add(TITANIUM_BLOCK);
            fabricItemGroupEntries.add(LUXITE_BLOCK);
            fabricItemGroupEntries.add(MAGMITE_BLOCK);
        });
    }
}
