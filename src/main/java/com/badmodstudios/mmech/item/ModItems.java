package com.badmodstudios.mmech.item;

import com.badmodstudios.mmech.MagicalMechs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    /* Actual item registering */
    public static final Item KNOWLEDGE_COMPENDIUM1 = registerItem("kcompendium_1", new Item(new FabricItemSettings()));
    public static final Item SPELL_BOOK = registerItem("spell_book", new Item(new FabricItemSettings()));
    public static final Item MANA_CRYSTAL = registerItem("mana_crystal", new Item(new FabricItemSettings()));
    public static final Item CHARGED_MANA_CRYSTAL = registerItem("charged_mana_crystal", new Item(new FabricItemSettings()));
    public static final Item CUT_MANA_CRYSTAL = registerItem("cut_mana_crystal", new Item(new FabricItemSettings()));

    /* Item register function */
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MagicalMechs.MOD_ID,name), item);
    }

    /* function for main class */
    public static void RegisterModItems(){
        int loaded;
        int total = 5;
        for (loaded = 0; loaded < total; loaded++){
            MagicalMechs.LOGGER.info("Registering Mod Items for " + MagicalMechs.MOD_ID + ", [" + loaded + "/" + "total" + "]"); //more useless counters
        }
    }
}
