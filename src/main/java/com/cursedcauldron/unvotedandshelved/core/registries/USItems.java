package com.cursedcauldron.unvotedandshelved.core.registries;

import com.cursedcauldron.unvotedandshelved.api.CoreRegistry;
import com.cursedcauldron.unvotedandshelved.common.blocks.GlowberryDustBlockItem;
import com.cursedcauldron.unvotedandshelved.common.items.FrozenCopperGolemItem;
import com.cursedcauldron.unvotedandshelved.core.UnvotedAndShelved;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

// Item Registry

public class USItems {
    public static final CoreRegistry<Item> ITEMS = CoreRegistry.create(Registry.ITEM_REGISTRY, UnvotedAndShelved.MODID);

    public static final Item GLARE_SPAWN_EGG = register("glare_spawn_egg", new SpawnEggItem(USEntities.GLARE, 7837492, 5204011, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final Item GLOWBERRY_DUST_BOTTLE = register("glowberry_dust_bottle", new GlowberryDustBlockItem(USBlocks.GLOWBERRY_DUST, new FabricItemSettings().tab(CreativeModeTab.TAB_DECORATIONS)));
    public static final Item FROZEN_COPPER_GOLEM_ITEM = register("oxidized_copper_golem", new FrozenCopperGolemItem(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_REDSTONE)));
    public static final Item MOOBLOOM_SPAWN_EGG = register("moobloom_spawn_egg", new SpawnEggItem(USEntities.MOOBLOOM, 16700985, 16777215, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static Item register(String id, Item item) {
        return ITEMS.register(id, item);
    }

    public static Item register(String id, Item item, CreativeModeTab tab) {
        return register(id, item);
    }
}