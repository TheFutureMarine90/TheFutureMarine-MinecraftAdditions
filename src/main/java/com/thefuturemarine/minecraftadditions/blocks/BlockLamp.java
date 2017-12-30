package com.thefuturemarine.minecraftadditions.blocks;

import com.thefuturemarine.minecraftadditions.Main;
import com.thefuturemarine.minecraftadditions.init.BlockInit;
import com.thefuturemarine.minecraftadditions.init.ItemInit;
import com.thefuturemarine.minecraftadditions.util.Colorable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockLamp extends Block {

    private static final AxisAlignedBB BOUDING_BOX = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 30, 0.0625 * 14);

    public BlockLamp(String name, Material material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabAdditions);
        setSoundType(SoundType.CLOTH);
        this.setLightLevel(3.0F);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return BOUDING_BOX;
    }

    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
        super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUDING_BOX);
    }
}
