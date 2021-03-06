package com.CCraze.ThunderAndLightning.items;

import com.CCraze.ThunderAndLightning.setup.ModVals;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ElectrumCoil extends Item {
    private final int abilityMod;

    public ElectrumCoil() {
        super(new Item.Properties().group(ModVals.modGroup));
        setRegistryName("electrumcoil");
        abilityMod=100;
    }
    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if(this.isInGroup(group)){
            ItemStack itemStack = new ItemStack(this);
            CompoundNBT nbt = new CompoundNBT();
            nbt.putInt("ability", abilityMod);
            itemStack.setTag(nbt);
            items.add(itemStack);
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (stack.getTag() != null && stack.getTag().contains("ability")){
            tooltip.add(new StringTextComponent("Modifier: " +stack.getTag().getInt("ability")+"%").applyTextStyle(TextFormatting.GRAY));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);

    }
}
