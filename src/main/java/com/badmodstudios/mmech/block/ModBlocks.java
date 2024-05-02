package com.badmodstudios.mmech.block;

import com.badmodstudios.mmech.MagicalMechs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MANA_ORE = registerBlock("mana_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    public static final Block MANA_ORE_DEEPSLATE = registerBlock("mana_ore_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MagicalMechs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MagicalMechs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        MagicalMechs.LOGGER.info("Registering Mod Blocks for " + MagicalMechs.MOD_ID);
    }
}
