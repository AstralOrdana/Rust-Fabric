package com.ordana.rust.registry.blocks;

import com.ordana.rust.Rust;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //cut iron
    public static final Block CUT_IRON = new CleanBlock(Rustable.RustLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_CUT_IRON = new ExposedBlock(Rustable.RustLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_CUT_IRON = new WeatheredBlock(Rustable.RustLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_CUT_IRON = new RustedBlock(Rustable.RustLevel.RUSTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block CUT_IRON_STAIRS = new CleanStairsBlock(Rustable.RustLevel.UNAFFECTED, CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_CUT_IRON_STAIRS = new ExposedStairsBlock(Rustable.RustLevel.EXPOSED, EXPOSED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_CUT_IRON_STAIRS = new WeatheredStairsBlock(Rustable.RustLevel.WEATHERED, WEATHERED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_CUT_IRON_STAIRS = new RustedStairsBlock(Rustable.RustLevel.RUSTED, RUSTED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block CUT_IRON_SLAB = new CleanSlabBlock(Rustable.RustLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_CUT_IRON_SLAB = new ExposedSlabBlock(Rustable.RustLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_CUT_IRON_SLAB = new WeatheredSlabBlock(Rustable.RustLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_CUT_IRON_SLAB = new RustedSlabBlock(Rustable.RustLevel.RUSTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_CUT_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_CUT_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_CUT_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_CUT_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_CUT_IRON_STAIRS = new ModStairs(WAXED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_CUT_IRON_STAIRS = new ModStairs(WAXED_EXPOSED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_CUT_IRON_STAIRS = new ModStairs(WAXED_WEATHERED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_CUT_IRON_STAIRS = new ModStairs(WAXED_RUSTED_CUT_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_CUT_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_CUT_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_CUT_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_CUT_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));


    //plate iron
    public static final Block PLATE_IRON = new CleanBlock(Rustable.RustLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_PLATE_IRON = new ExposedBlock(Rustable.RustLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_PLATE_IRON = new WeatheredBlock(Rustable.RustLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_PLATE_IRON = new RustedBlock(Rustable.RustLevel.RUSTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block PLATE_IRON_STAIRS = new CleanStairsBlock(Rustable.RustLevel.UNAFFECTED, PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_PLATE_IRON_STAIRS = new ExposedStairsBlock(Rustable.RustLevel.EXPOSED, EXPOSED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_PLATE_IRON_STAIRS = new WeatheredStairsBlock(Rustable.RustLevel.WEATHERED, WEATHERED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_PLATE_IRON_STAIRS = new RustedStairsBlock(Rustable.RustLevel.RUSTED, RUSTED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block PLATE_IRON_SLAB = new CleanSlabBlock(Rustable.RustLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block EXPOSED_PLATE_IRON_SLAB = new ExposedSlabBlock(Rustable.RustLevel.EXPOSED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WEATHERED_PLATE_IRON_SLAB = new WeatheredSlabBlock(Rustable.RustLevel.WEATHERED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block RUSTED_PLATE_IRON_SLAB = new RustedSlabBlock(Rustable.RustLevel.RUSTED, FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_PLATE_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_PLATE_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_PLATE_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_PLATE_IRON = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_PLATE_IRON_STAIRS = new ModStairs(WAXED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_PLATE_IRON_STAIRS = new ModStairs(WAXED_EXPOSED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_PLATE_IRON_STAIRS = new ModStairs(WAXED_WEATHERED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_PLATE_IRON_STAIRS = new ModStairs(WAXED_RUSTED_PLATE_IRON.getDefaultState(), FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static final Block WAXED_PLATE_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_EXPOSED_PLATE_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_WEATHERED_PLATE_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));
    public static final Block WAXED_RUSTED_PLATE_IRON_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5f, 6f).sounds(BlockSoundGroup.COPPER));

    public static void registerBlocks() {

        //cut iron
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "cut_iron"), CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_cut_iron"), EXPOSED_CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_cut_iron"), WEATHERED_CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_cut_iron"), RUSTED_CUT_IRON);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "cut_iron_stairs"), CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_cut_iron_stairs"), EXPOSED_CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_cut_iron_stairs"), WEATHERED_CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_cut_iron_stairs"), RUSTED_CUT_IRON_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "cut_iron_slab"), CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_cut_iron_slab"), EXPOSED_CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_cut_iron_slab"), WEATHERED_CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_cut_iron_slab"), RUSTED_CUT_IRON_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_cut_iron"), WAXED_CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_cut_iron"), WAXED_EXPOSED_CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_cut_iron"), WAXED_WEATHERED_CUT_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_cut_iron"), WAXED_RUSTED_CUT_IRON);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_cut_iron_stairs"), WAXED_CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_cut_iron_stairs"), WAXED_EXPOSED_CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_cut_iron_stairs"), WAXED_WEATHERED_CUT_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_cut_iron_stairs"), WAXED_RUSTED_CUT_IRON_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_cut_iron_slab"), WAXED_CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_cut_iron_slab"), WAXED_EXPOSED_CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_cut_iron_slab"), WAXED_WEATHERED_CUT_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_cut_iron_slab"), WAXED_RUSTED_CUT_IRON_SLAB);

        //plate iron
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "plate_iron"), PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_plate_iron"), EXPOSED_PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_plate_iron"), WEATHERED_PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_plate_iron"), RUSTED_PLATE_IRON);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "plate_iron_stairs"), PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_plate_iron_stairs"), EXPOSED_PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_plate_iron_stairs"), WEATHERED_PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_plate_iron_stairs"), RUSTED_PLATE_IRON_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "plate_iron_slab"), PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "exposed_plate_iron_slab"), EXPOSED_PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "weathered_plate_iron_slab"), WEATHERED_PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "rusted_plate_iron_slab"), RUSTED_PLATE_IRON_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_plate_iron"), WAXED_PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_plate_iron"), WAXED_EXPOSED_PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_plate_iron"), WAXED_WEATHERED_PLATE_IRON);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_plate_iron"), WAXED_RUSTED_PLATE_IRON);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_plate_iron_stairs"), WAXED_PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_plate_iron_stairs"), WAXED_EXPOSED_PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_plate_iron_stairs"), WAXED_WEATHERED_PLATE_IRON_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_plate_iron_stairs"), WAXED_RUSTED_PLATE_IRON_STAIRS);

        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_plate_iron_slab"), WAXED_PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_exposed_plate_iron_slab"), WAXED_EXPOSED_PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_weathered_plate_iron_slab"), WAXED_WEATHERED_PLATE_IRON_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Rust.MOD_ID, "waxed_rusted_plate_iron_slab"), WAXED_RUSTED_PLATE_IRON_SLAB);

    }
}
