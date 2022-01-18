package com.ordana.rust;

import com.ordana.rust.registry.blocks.ModBlocks;
import com.ordana.rust.registry.items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class Rust implements ModInitializer {

    public static final String MOD_ID = "rust";

    @Override
    public void onInitialize() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.PLATE_IRON, ModBlocks.WAXED_PLATE_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_PLATE_IRON, ModBlocks.WAXED_EXPOSED_PLATE_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_PLATE_IRON, ModBlocks.WAXED_WEATHERED_PLATE_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_PLATE_IRON, ModBlocks.WAXED_RUSTED_PLATE_IRON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.PLATE_IRON_STAIRS, ModBlocks.WAXED_PLATE_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_PLATE_IRON_STAIRS, ModBlocks.WAXED_EXPOSED_PLATE_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_PLATE_IRON_STAIRS, ModBlocks.WAXED_WEATHERED_PLATE_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_PLATE_IRON_STAIRS, ModBlocks.WAXED_RUSTED_PLATE_IRON_STAIRS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.PLATE_IRON_SLAB, ModBlocks.WAXED_PLATE_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_PLATE_IRON_SLAB, ModBlocks.WAXED_EXPOSED_PLATE_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_PLATE_IRON_SLAB, ModBlocks.WAXED_WEATHERED_PLATE_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_PLATE_IRON_SLAB, ModBlocks.WAXED_RUSTED_PLATE_IRON_SLAB);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_IRON, ModBlocks.WAXED_CUT_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_IRON, ModBlocks.WAXED_EXPOSED_CUT_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_IRON, ModBlocks.WAXED_WEATHERED_CUT_IRON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CUT_IRON, ModBlocks.WAXED_RUSTED_CUT_IRON);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_IRON_STAIRS, ModBlocks.WAXED_CUT_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_IRON_STAIRS, ModBlocks.WAXED_EXPOSED_CUT_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_IRON_STAIRS, ModBlocks.WAXED_WEATHERED_CUT_IRON_STAIRS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CUT_IRON_STAIRS, ModBlocks.WAXED_RUSTED_CUT_IRON_STAIRS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CUT_IRON_SLAB, ModBlocks.WAXED_CUT_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_CUT_IRON_SLAB, ModBlocks.WAXED_EXPOSED_CUT_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_CUT_IRON_SLAB, ModBlocks.WAXED_WEATHERED_CUT_IRON_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CUT_IRON_SLAB, ModBlocks.WAXED_RUSTED_CUT_IRON_SLAB);

        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
