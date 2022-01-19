package com.ordana.rust.registry.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

public class WeatheredBlock extends ExposedBlock{
    public WeatheredBlock(RustLevel rustLevel, Settings settings) {
        super(rustLevel, settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random){
        for (Direction direction : Direction.values()) {
            if (world.getBlockState(pos.offset(direction)).isOf(Blocks.WATER)) {
                this.tickDegradation(state, world, pos, random);
            }
            if (world.getBlockState(pos.offset(direction)).isOf(Blocks.BUBBLE_COLUMN)) {
                float f = 0.07f;
                if (random.nextFloat() > 0.07f) {
                    this.tryDegrade(state, world, pos, random);
                }
            }
        }
    }
}
