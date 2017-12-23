package com.thefuturemarine.minecraftadditions.init;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AdditionsTab extends CreativeTabs
{

    public AdditionsTab(int index, String label)
    {
        super(index, label);
        this.setBackgroundImageName("additions.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(BlockInit.DarkOakBookshelf));
    }
}
