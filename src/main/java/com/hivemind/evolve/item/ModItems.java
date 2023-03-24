package com.hivemind.evolve.item;

import com.hivemind.evolve.Evolve;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Evolve.MOD_ID);
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item(new Item.Properties().tab(com.hivemind.evolve.item.EvolveCreativeModeTab.EVOLVE_TAB)) {
                // Additional item properties and methods can be added here
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
