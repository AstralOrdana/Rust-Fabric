package com.ordana.rust.registry.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

public class ExposedStairsBlock extends CleanStairsBlock{
    public ExposedStairsBlock(RustLevel rustLevel, BlockState baseBlockState, Settings settings) {
        super(rustLevel, baseBlockState, settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random){
        for (Direction direction : Direction.values()) {
            if (world.hasRain(pos.up())) {
                this.tickDegradation(state, world, pos, random);
            }
        }
    }
}
