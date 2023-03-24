package com.hivemind.evolve.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class EvolveCreativeModeTab {
    public static final CreativeModeTab EVOLVE_TAB = new CreativeModeTab(CreativeModeTab.TABS.length, "evolve_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(com.hivemind.evolve.item.ModItems.MERCURY.get());
        }
    };
}
