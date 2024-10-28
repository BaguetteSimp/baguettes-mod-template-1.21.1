package net.baguette.baguettesmod.item;

import net.baguette.baguettesmod.BaguettesMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ABYSSITE = registerItem("abyssite", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BaguettesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BaguettesMod.LOGGER.info("Registering Mod Items for " + BaguettesMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ABYSSITE);
        });
    }
}
