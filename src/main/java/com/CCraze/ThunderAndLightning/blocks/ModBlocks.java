package com.CCraze.ThunderAndLightning.blocks;

import com.CCraze.ThunderAndLightning.blocks.lightningattractors.CreativeLightningAttractor;
import com.CCraze.ThunderAndLightning.blocks.lightningattractors.DiamondLightningAttractor;
import com.CCraze.ThunderAndLightning.blocks.lightningattractors.IronLightningAttractor;
import com.CCraze.ThunderAndLightning.blocks.lightningattractors.WoolLightningAttractor;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("thunderandlightning:creativelightningattractor")
    public static CreativeLightningAttractor CREATIVELIGHTNINGATTRACTOR;
    @ObjectHolder("thunderandlightning:ironlightningattractor")
    public static IronLightningAttractor IRONLIGHTNINGATTRACTOR;
    @ObjectHolder("thunderandlightning:diamondlightningattractor")
    public static DiamondLightningAttractor DIAMONDLIGHTNINGATTRACTOR;
    @ObjectHolder("thunderandlightning:woollightningattractor")
    public static WoolLightningAttractor WOOLLIGHTNINGATTRACTOR;

    @ObjectHolder("thunderandlightning:lightningattractortile")
    public static TileEntityType<LightningAttractorTile> LIGHTNINGATTRACTOR_TILE;
}
