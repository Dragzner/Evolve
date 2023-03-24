package com.hivemind.evolve.block;

import com.hivemind.evolve.Evolve;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> Blocks =  DeferredRegister.create(ForgeRegistries.BLOCKS, Evolve.MOD_ID);

    public static final RegistryObject<Block> CREEP = Blocks.register("creep", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
}
