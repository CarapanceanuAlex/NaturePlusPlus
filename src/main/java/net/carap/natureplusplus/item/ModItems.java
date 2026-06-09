package net.carap.natureplusplus.item;

import net.carap.natureplusplus.NaturePlusPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(NaturePlusPlus.MOD_ID, name), item);
    }

    public static final Item KARAPITE_GEM = registerItem("karapite_gem", new Item(new Item.Properties()));
    public static final Item ILIEORITE_GEM = registerItem("ilieorite_gem", new Item(new Item.Properties()));
    public static final Item TAVIOZULI_GEM = registerItem("taviozuli_gem", new Item(new Item.Properties()));
    public static final Item DUDUONITE_GEM = registerItem("duduonite_gem", new Item(new Item.Properties()));
    public static final Item CIUFLUORITE_GEM = registerItem("ciufluorite_gem", new Item(new Item.Properties()));

    public static void registerModItems(){
        NaturePlusPlus.LOGGER.info("Registering mod items for " + NaturePlusPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register((itemGroup) -> {
            itemGroup.accept(ModItems.KARAPITE_GEM);
            itemGroup.accept(ModItems.ILIEORITE_GEM);
            itemGroup.accept(ModItems.TAVIOZULI_GEM);
            itemGroup.accept(ModItems.DUDUONITE_GEM);
            itemGroup.accept(ModItems.CIUFLUORITE_GEM);
        });
    }
}