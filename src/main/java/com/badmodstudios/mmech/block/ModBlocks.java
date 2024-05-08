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
    /* Registering the blocks */
    public static final Block MANA_ORE = registerBlock("mana_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block MANA_ORE_DEEPSLATE = registerBlock("mana_ore_deepslate",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    /* Block register function */
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MagicalMechs.MOD_ID, name), block);
    }
    /* Block item register function */
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(MagicalMechs.MOD_ID, name), //isa mod_id inside my city
                new BlockItem(block, new FabricItemSettings()));
    }

    /* Simple function to call in main class */
    public static void registerModBlocks(){
        int loaded;
        int total = 2;
        for (loaded = 0; loaded < total; loaded++){ //for loop my beloved
            MagicalMechs.LOGGER.info("Registering Mod Blocks for " + MagicalMechs.MOD_NAME + ", [" + loaded + "/" + "total" + "]"); //yay, unnecessary counters
        }
    }
}
