package com.thefuturemarine.minecraftadditions.init;

import com.thefuturemarine.minecraftadditions.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DarkOakBookshelf = new BlockDarkOakBookshelf("darkoak_bookshelf", Material.WOOD);
    public static final Block BirchBookshelf = new BlockBirchBookshelf("birch_bookshelf", Material.WOOD);
    public static final Block JungleBookshelf = new BlockJungleBookshelf("jungle_bookshelf", Material.WOOD);
    public static final Block SpruceBookshelf = new BlockSpruceBookshelf("spruce_bookshelf", Material.WOOD);
    public static final Block AcaciaBookshelf = new BlockAcaciaBookshelf("acacia_bookshelf", Material.WOOD);
}
