package com.thefuturemarine.minecraftadditions.blocks;

import com.thefuturemarine.minecraftadditions.Main;
import com.thefuturemarine.minecraftadditions.init.BlockInit;
import com.thefuturemarine.minecraftadditions.init.ItemInit;
import com.thefuturemarine.minecraftadditions.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDarkOakBookshelf extends Block implements IHasModel
{

    public BlockDarkOakBookshelf(String name, Material material)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        setHardness(1.0F);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    public int quantityDropped(Random random)
    {
        return 3;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.BOOK;
    }

    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        super.randomDisplayTick(stateIn, worldIn, pos, rand);
    }

    @Override
    public float getEnchantPowerBonus(World world, BlockPos pos) {
        {
            return this == BlockInit.DarkOakBookshelf ? 1 : 0;
        }
    }
}