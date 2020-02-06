package io.peachapps.magnetized.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LoadStoneOre extends Block {
    public LoadStoneOre() {
        super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(3.0f, 3.0f)
        );
    }
}
