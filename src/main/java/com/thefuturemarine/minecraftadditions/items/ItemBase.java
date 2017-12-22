package com.thefuturemarine.minecraftadditions.items;

import com.thefuturemarine.minecraftadditions.Main;
import com.thefuturemarine.minecraftadditions.init.ItemInit;
import com.thefuturemarine.minecraftadditions.proxy.ClientProxy;
import com.thefuturemarine.minecraftadditions.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);
    }

    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
