package com.badmodstudios.mmech.item;

import com.badmodstudios.mmech.MagicalMechs;
import com.badmodstudios.mmech.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MMECH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MagicalMechs.MOD_ID, "magicalmechs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mmech"))
                    .icon(() -> new ItemStack(ModItems.KNOWLEDGE_COMPENDIUM1)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KNOWLEDGE_COMPENDIUM1);
                        entries.add(ModBlocks.MANA_ORE);
                        entries.add(ModBlocks.MANA_ORE_DEEPSLATE);
                        entries.add(ModItems.MANA_CRYSTAL);
                        entries.add(ModItems.SPELL_BOOK);
                        entries.add(ModItems.CHARGED_MANA_CRYSTAL);
                        entries.add(ModItems.CUT_MANA_CRYSTAL);

                    }).build());

    public static void registerItemGroups(){
        MagicalMechs.LOGGER.info("Registering Item Groups for " + MagicalMechs.MOD_ID + "[1/1]");
    }
}
