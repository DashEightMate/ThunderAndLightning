package com.CCraze.LightningCraft.blocks.lightningattractors;

import com.CCraze.LightningCraft.blocks.LightningAttractorBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DiamondLightningAttractor extends LightningAttractorBlock {
    public DiamondLightningAttractor(){
        super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(2.5f),0.7,
                600,40000, true,"diamondlightningattractor");
    }
}
