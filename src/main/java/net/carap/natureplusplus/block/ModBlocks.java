package net.carap.natureplusplus.block;

import net.carap.natureplusplus.NaturePlusPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(NaturePlusPlus.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(NaturePlusPlus.MOD_ID, name),
                new BlockItem(block, new Item.Properties()));
    }

    public static final Block KARAPITE_BLOCK = registerBlock("karapite_block",
            new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block ILIEORITE_BLOCK = registerBlock("ilieorite_block",
            new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block TAVIOZULI_BLOCK = registerBlock("taviozuli_block",
            new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block DUDUONITE_BLOCK = registerBlock("duduonite_block",
            new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block CIUFLUORITE_BLOCK = registerBlock("ciufluorite_block",
            new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static void registerModBlocks() {
        NaturePlusPlus.LOGGER.info("Registering mod blocks for " + NaturePlusPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.accept(ModBlocks.KARAPITE_BLOCK);
                    itemGroup.accept(ModBlocks.ILIEORITE_BLOCK);
                    itemGroup.accept(ModBlocks.TAVIOZULI_BLOCK);
                    itemGroup.accept(ModBlocks.DUDUONITE_BLOCK);
                    itemGroup.accept(ModBlocks.CIUFLUORITE_BLOCK);
                });
    }
}
