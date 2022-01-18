package com.ordana.rust.registry.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

public class CleanStairsBlock extends RustableStairsBlock{
    public CleanStairsBlock(RustLevel rustLevel, BlockState baseBlockState, Settings settings) {
        super(rustLevel, baseBlockState, settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random){
        for (Direction direction : Direction.values()) {
            if (world.getBlockState(pos.offset(direction)).isOf(Blocks.AIR) || world.getBlockState(pos.offset(direction)).isOf(Blocks.WATER)) {
                this.tickDegradation(state, world, pos, random);
            }
        }
    }
}
