package com.CCraze.ThunderAndLightning.blocks.lightningattractors;

import com.CCraze.ThunderAndLightning.blocks.LightningAttractorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CreativeLightningAttractor extends LightningAttractorBlock {
    public CreativeLightningAttractor() {
        super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3.0f),
                "Creative","creativelightningattractor");
    }
}
